package com.dp.redis_tool;

import com.dianping.squirrel.client.StoreClientFactory;
import com.dianping.squirrel.client.StoreKey;
import com.dianping.squirrel.client.impl.redis.RedisStoreClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Map;

/**
 * Created by zhen.huaz on 2016/2/1.
 */
public class RedisUserquWriter {
    public static void main(String args[]) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
        RedisStoreClient storeClient = StoreClientFactory.getStoreClientByCategory("ShopFeature");
        StoreKey storeKey = new StoreKey("ShopFeature","1_大上海_17");
        Map<String,Object> map = storeClient.hgetAll(storeKey);

        System.out.println("###########################################");
        for (Map.Entry<String, Object> entry: map.entrySet()){
            System.out.print(entry.getValue() + "\t");
        }
    }
}
