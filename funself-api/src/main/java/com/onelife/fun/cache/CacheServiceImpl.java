package com.onelife.fun.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;

/**
 * Created by wudi.
 * Descreption:服务实现.
 * Date:2017/1/10
 */
@Service("cacheService")
public class CacheServiceImpl implements CacheService {

    @Autowired
    private RedisTemplate<String, byte[]> redisTemplate;

    RedisSerializer<String> serializer = getRedisSerializer();

    public void put(String key, String value) {
        doPut(key, serializer.serialize(value), null);
    }

    public void put(String key, String value, long expireTime) {
        doPut(key, serializer.serialize(value), expireTime);
    }

    public void del(String key) {
        redisTemplate.delete(key);
    }

    public String get(String key) {
        return serializer.deserialize(doGet(key));
    }


    private void doPut(final String key, final byte[] value, final Long expireSec) {
        final byte[] keyBytes = serializeString(key);
        redisTemplate.execute(new RedisCallback<Object>() {
            public String doInRedis(final RedisConnection connection)
                    throws DataAccessException {
                connection.set(keyBytes, value);
                if (expireSec != null) {
                    connection.expire(keyBytes, expireSec);
                }
                return null;
            }
        });
    }

    private byte[] doGet(final String key) {
        return redisTemplate.execute(new RedisCallback<byte[]>() {
            public byte[] doInRedis(RedisConnection connection)
                    throws DataAccessException {
                return connection.get(serializeString(key));
            }
        });
    }

    private byte[] serializeString(String value) {
        return value == null ? null : value.getBytes(Charset.forName("UTF8"));
    }

    protected RedisSerializer<String> getRedisSerializer() {
        return redisTemplate.getStringSerializer();
    }

}
