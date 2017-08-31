package com.echarts.dao;

import com.echarts.entity.PTempDetailInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wuxiang on 2017/7/14.
 */
@Repository
public class PTempDetailInfoDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    // 保存 某用户 的体征信息
    public void saveSignInfo(PTempDetailInfo pTempDetailInfo,String collectionName) {
        mongoTemplate.save(pTempDetailInfo, collectionName);
    }

    // 查询 某用户 的所有体征信息
    public List<PTempDetailInfo> getDetailInfoByInpno(String inpno, String collectionName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("inpNo").is(inpno));
        List<PTempDetailInfo> infos = mongoTemplate.find(query, PTempDetailInfo.class, collectionName);
        return infos;
    }

    // 查询 某用户 某周 的体征信息
    public List<PTempDetailInfo> getDetailInfoByDate(String inpno,String thedate, String collectionName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("inpNo").is(inpno));
        query.addCriteria(Criteria.where("theDate").is(thedate));
        List<PTempDetailInfo> infos = mongoTemplate.find(query, PTempDetailInfo.class, collectionName);
        return infos;
    }

    // 获取 某周 某时间的体征信息
    public List<PTempDetailInfo> getDetailInfo(String inpno, String thedate, int time, String collectionName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("inpNo").is(inpno));
        query.addCriteria(Criteria.where("theDate").is(thedate));
        query.addCriteria(Criteria.where("time").is(time));
        List<PTempDetailInfo> infos = mongoTemplate.find(query, PTempDetailInfo.class, collectionName);
        return infos;
    }

    // 更新用户 某周 某时间的体征信息
    public void updateDetailInfo(PTempDetailInfo pTempDetailInfo, String collectionName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("inpNo").is(pTempDetailInfo.getInpNo()));
        query.addCriteria(Criteria.where("theDate").is(pTempDetailInfo.getTheDate()));
        query.addCriteria(Criteria.where("time").is(pTempDetailInfo.getTime()));

        Update update = new Update();
        // 防止数据库 出现null数据
        if (pTempDetailInfo.getTemperature() != null) {
            update.set("temperature", pTempDetailInfo.getTemperature());
            update.set("temperatureType", pTempDetailInfo.getTemperatureType());
        }
        if (pTempDetailInfo.getPulse() != null) {
            update.set("pulse", pTempDetailInfo.getPulse());
        }
        if (pTempDetailInfo.getHeartRate() != null) {
            update.set("heartRate", pTempDetailInfo.getHeartRate());
        }
        if (pTempDetailInfo.getReductionTemperature() != null) {
            update.set("reductionTemperature", pTempDetailInfo.getReductionTemperature());
        }
        if (pTempDetailInfo.getBreathe() != null) {
            update.set("breathe", pTempDetailInfo.getBreathe());
            update.set("breatheType", pTempDetailInfo.getBreatheType());
        }
        update.set("comment1", pTempDetailInfo.getComment1());
        update.set("comment1Type", pTempDetailInfo.getComment1Type());

        mongoTemplate.updateFirst(query, update, collectionName);
    }


}
