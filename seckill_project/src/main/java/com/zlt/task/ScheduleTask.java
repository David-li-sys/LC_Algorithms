package com.zlt.task;

import com.zlt.domain.Good;
import com.zlt.domain.MiaoshaGood;
import com.zlt.domain.User;
import com.zlt.service.GoodService;
import com.zlt.service.MiaoshaGoodsService;
import com.zlt.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ScheduleTask {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    UserService userService;
    @Autowired
    MiaoshaGoodsService miaoshaGoodsService;

    @Scheduled(fixedRate = 50000)
    public void run(){

        List<User> allUser = userService.findAllUser();
        BoundHashOperations boundHash=redisTemplate.boundHashOps("users");
        for (User user : allUser) {
            String userId=new Integer(user.getUserId()).toString();
            boundHash.put(userId,user);
        }

        BoundHashOperations boundHash2=redisTemplate.boundHashOps("goods");
        List<Good> goods = miaoshaGoodsService.findAllMiaoshaGoods();

        for (Good good : goods) {
            String goodId=new Integer(good.getGoodsId()).toString();
            boundHash2.put(goodId,good);
        }



    }
    @Test
    public void test(){



    }
}
