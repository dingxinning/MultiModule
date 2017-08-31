package com.echarts.service;

import com.echarts.dao.PTempDetailInfoDao;
import com.echarts.dao.PTempInfoDao;
import com.echarts.entity.PTempDetailInfo;
import com.echarts.entity.PTempInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Created by Wuxiang on 2017/7/14.
 */
@Service
public class SignEntryService {
    @Autowired
    private PTempDetailInfoDao pTempDetailInfoDao;
    @Autowired
    private PTempInfoDao pTempInfoDao;

    // 保存 脉搏心率体温和呼吸的数据
    public void saveDetailInfo(PTempDetailInfo pTempDetailInfo){

        // 用户没有输入的input，不保存
        if (pTempDetailInfo.getPulse() != null
                || pTempDetailInfo.getHeartRate() != null
                || pTempDetailInfo.getTemperature() != null
                || pTempDetailInfo.getReductionTemperature() != null
                || pTempDetailInfo.getBreathe() != null
                || !Objects.equals(pTempDetailInfo.getComment1Type(), "0")) {
            List<PTempDetailInfo> info = pTempDetailInfoDao.getDetailInfo(pTempDetailInfo.getInpNo(), pTempDetailInfo.getTheDate(),pTempDetailInfo.getTime(), "pTempDetailInfos");

            // db没有对应的数据，新增，否则，修改
            if (info.size()==0) {
//                System.out.println("新增数据");
//                System.out.println(pTempDetailInfo.toString());
                pTempDetailInfoDao.saveSignInfo(pTempDetailInfo, "pTempDetailInfos");
            } else {
                // 新填入的数据保存不变，为空的用数据库的旧值
                if (pTempDetailInfo.getTemperature() == null) {
                    pTempDetailInfo.setTemperature(info.get(0).getTemperature());
                    pTempDetailInfo.setTemperatureType(info.get(0).getTemperatureType());
                }
                if (pTempDetailInfo.getPulse() == null) {
                    pTempDetailInfo.setPulse(info.get(0).getPulse());
                }
                if (pTempDetailInfo.getHeartRate() == null) {
                    pTempDetailInfo.setHeartRate(info.get(0).getHeartRate());
                }
                if (pTempDetailInfo.getReductionTemperature() == null) {
                    pTempDetailInfo.setReductionTemperature(info.get(0).getReductionTemperature());
                }
                if (pTempDetailInfo.getBreathe() == null) {
                    pTempDetailInfo.setBreathe(info.get(0).getBreathe());
                    pTempDetailInfo.setBreatheType(info.get(0).getBreatheType());
                }
                if (Objects.equals(pTempDetailInfo.getComment1Type(), "0")) {
                    pTempDetailInfo.setComment1(info.get(0).getComment1());
                    pTempDetailInfo.setComment1Type(info.get(0).getComment1Type());
                }
//                System.out.println("修改数据");
//                System.out.println(pTempDetailInfo.toString());
                pTempDetailInfoDao.updateDetailInfo(pTempDetailInfo,"pTempDetailInfos");
            }
        }
    }

    // 保存 血压 入量出量 身高体重皮试的数据
    public void savePTempInfo(PTempInfo pTempInfo) {
        if (!Objects.equals(pTempInfo.getDbp1(), "")
                || !Objects.equals(pTempInfo.getDbp2(), "")
                || !Objects.equals(pTempInfo.getSbp1(), "")
                || !Objects.equals(pTempInfo.getSbp2(), "")
                || !Objects.equals(pTempInfo.getSbp2(), "")
                || !Objects.equals(pTempInfo.getPoopInfo(), "")
                || !Objects.equals(pTempInfo.getUrinateInfo(), "")
                || !Objects.equals(pTempInfo.getSkinTest(), "")
                || pTempInfo.getIntake() != null
                || pTempInfo.getOutput() != null
                || pTempInfo.getWeight() != null
                || pTempInfo.getHeight() != null) {
            List<PTempInfo> pTempInfos = pTempInfoDao.getPTempInfoByDate(pTempInfo.getInpNo(), pTempInfo.getTheDate(), "pTempInfos");
            if (pTempInfos.size() == 0) {
                pTempInfoDao.savePTempInfo(pTempInfo,"pTempInfos");
            }else {
                if (Objects.equals(pTempInfo.getDbp1(), "")) {
                    pTempInfo.setDbp1(pTempInfos.get(0).getDbp1());
                }
                if (Objects.equals(pTempInfo.getDbp2(), "")) {
                    pTempInfo.setDbp2(pTempInfos.get(0).getDbp2());
                }
                if (Objects.equals(pTempInfo.getSbp1(), "")) {
                    pTempInfo.setSbp1(pTempInfos.get(0).getSbp1());
                }
                if (Objects.equals(pTempInfo.getSbp2(), "")) {
                    pTempInfo.setSbp2(pTempInfos.get(0).getSbp2());
                }
                if (Objects.equals(pTempInfo.getPoopInfo(), "")) {
                    pTempInfo.setPoopInfo(pTempInfos.get(0).getPoopInfo());
                }
                if (Objects.equals(pTempInfo.getUrinateInfo(), "")) {
                    pTempInfo.setUrinateInfo(pTempInfos.get(0).getUrinateInfo());
                }
                if (Objects.equals(pTempInfo.getSkinTest(), "")) {
                    pTempInfo.setSkinTest(pTempInfos.get(0).getSkinTest());
                }
                if (pTempInfo.getIntake() == null) {
                    pTempInfo.setIntake(pTempInfos.get(0).getIntake());
                }
                if (pTempInfo.getOutput() == null) {
                    pTempInfo.setOutput(pTempInfos.get(0).getOutput());
                }
                if (pTempInfo.getWeight() == null) {
                    pTempInfo.setWeight(pTempInfos.get(0).getWeight());
                    pTempInfo.setWeightType(pTempInfos.get(0).getWeightType());
                }
                if (pTempInfo.getHeight() == null) {
                    pTempInfo.setHeight(pTempInfos.get(0).getHeight());
                    pTempInfo.setHeightType(pTempInfos.get(0).getHeightType());
                }
                pTempInfoDao.updatePTempInfo(pTempInfo,"pTempInfos");
            }
        }
    }

    public List<PTempDetailInfo> getDetailInfoByInpno(String inpno) {
        return pTempDetailInfoDao.getDetailInfoByInpno(inpno, "pTempDetailInfos");
    }

    public List<PTempInfo> getPTempInfoByInpno(String inpno) {
        return pTempInfoDao.getPTempInfoByInpno(inpno, "pTempInfos");
    }

    public List<PTempDetailInfo> getDetailInfoByDate(String inpno, String thedate) {
        return pTempDetailInfoDao.getDetailInfoByDate(inpno, thedate, "pTempDetailInfos");
    }
}
