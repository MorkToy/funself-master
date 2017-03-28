package com.onelife.fun;

import com.onelife.fun.cache.CacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wudi.
 * Descreption:TODO..
 * Date:2017/1/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/*.xml")
public class ApiTest {

    @Autowired
    private CacheService cacheService;

    @Test
    public void testReds() {
        cacheService.put("name", "wudi");
        System.out.println(cacheService.get("name"));
    }

}
