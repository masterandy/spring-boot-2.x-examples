package com.yi.memcached;

import com.yi.memcached.annotation.EnableMemcached;
import net.spy.memcached.MemcachedClient;
import net.spy.memcached.internal.OperationFuture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableMemcached
public class SpringBootMemcachedApplicationTests {

    @Autowired
    private MemcachedClient memcachedClient;

    @Test
    public void testCUD() throws Exception {
        String key = "memcached_key";
        OperationFuture<Boolean> set = this.memcachedClient.set(key, 10, System.currentTimeMillis());

        Object object = this.memcachedClient.get(key);
        System.err.println(object + "");
    }

}
