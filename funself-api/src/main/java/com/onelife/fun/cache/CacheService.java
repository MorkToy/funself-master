package com.onelife.fun.cache;

/**
 * Created by wudi.
 * Descreption:TODO..
 * Date:2017/1/11
 */
public interface CacheService {

    /**
     * 新增或更新缓存(非list).
     *
     * @param key   k
     * @param value v
     */
    void put(String key, String value);

    /**
     * 新增或更新缓存.
     *
     * @param key        k
     * @param value      v
     * @param expireTime 有效时间
     */
    void put(String key, String value, long expireTime);

    /**
     * 删除缓存.
     *
     * @param key k
     */
    void del(String key);

    /**
     * 查询缓存.
     *
     * @param key k
     * @return obj
     */

    /**
     * 查询缓存(非list).
     *
     * @param key   k
     * @return 结果
     */
    String get(String key);
}
