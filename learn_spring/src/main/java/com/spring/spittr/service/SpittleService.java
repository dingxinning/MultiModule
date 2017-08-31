package com.spring.spittr.service;

import com.spring.spittr.repository.Spittle;
import com.spring.spittr.repository.SpittleInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Wuxiang on 2017/4/2.
 */
@Service
public class SpittleService {

    public List<Spittle> createSpittleList(int count) {
        List<Spittle> list = new ArrayList<>();
        Random r=new Random();
        for (int i = 1; i <= count; i++) {
            list.add(new Spittle((long) i,"Spittle" + i, new Date(), r.nextDouble(), r.nextDouble()));
        }
        return list;
    }

    public SpittleInfo findOne(Long id) {
        SpittleInfo spittleInfo = new SpittleInfo();
        spittleInfo.setId(id);
        spittleInfo.setFirstName("unnamed");
        spittleInfo.setLastName("unnamed");
        spittleInfo.setUsername("unnamed");
        spittleInfo.setPassword("null");
        spittleInfo.setEmail("abc@163.com");
        return spittleInfo;
    }

    public SpittleInfo register(SpittleInfo spittleInfo) {
        //随机生成一个id
        Random r=new Random();
        spittleInfo.setId(Math.abs(r.nextLong()));
        return spittleInfo;
    }
}
