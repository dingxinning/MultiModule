package com.echarts.dao;

import com.echarts.entity.PTempInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Wuxiang on 2017/7/19.
 */
@Repository
public class PTempInfoDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    // 保存体征信息
    public void savePTempInfo(PTempInfo pTempInfo, String collectionName) {
        mongoTemplate.save(pTempInfo, collectionName);
    }

    // 查询 某用户 某周 的体征信息
    public List<PTempInfo> getPTempInfoByDate(String inpno, String thedate, String collectionName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("inpNo").is(inpno));
        query.addCriteria(Criteria.where("theDate").is(thedate));
        List<PTempInfo> infos = mongoTemplate.find(query, PTempInfo.class, collectionName);
        return infos;
    }

    // 查询 某用户 的体征信息
    public List<PTempInfo> getPTempInfoByInpno(String inpno, String collectionName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("inpNo").is(inpno));
        List<PTempInfo> infos = mongoTemplate.find(query, PTempInfo.class, collectionName);
        return infos;
    }

    // 更新体征信息
    public void updatePTempInfo(PTempInfo pTempInfo, String collectionName) {
        Query query = new Query();
        query.addCriteria(Criteria.where("inpNo").is(pTempInfo.getInpNo()));
        query.addCriteria(Criteria.where("theDate").is(pTempInfo.getTheDate()));

        Update update = new Update();
        update.set("sbp1", pTempInfo.getSbp1());
        update.set("dbp1", pTempInfo.getDbp1());
        update.set("sbp2", pTempInfo.getSbp2());
        update.set("dbp2", pTempInfo.getDbp2());
        update.set("poopInfo", pTempInfo.getPoopInfo());
        update.set("urinateInfo", pTempInfo.getUrinateInfo());
        update.set("skinTest", pTempInfo.getSkinTest());
        if (pTempInfo.getIntake() != null) {
            update.set("intake", pTempInfo.getIntake());
        }
        if (pTempInfo.getOutput() != null) {
            update.set("output", pTempInfo.getOutput());
        }
        if (pTempInfo.getWeight() != null) {
            update.set("weight", pTempInfo.getWeight());
            update.set("weightType", pTempInfo.getWeightType());
        }
        if (pTempInfo.getHeight() != null) {
            update.set("height", pTempInfo.getHeight());
            update.set("heightType", pTempInfo.getHeightType());
        }

        mongoTemplate.updateFirst(query, update, collectionName);
    }


}
