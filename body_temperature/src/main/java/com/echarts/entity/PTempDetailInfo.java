package com.echarts.entity;

/**
 * Created by Wuxiang on 2017/7/14.
 */
public class PTempDetailInfo {

    // 住院号
    private String inpNo;

    // 测量周
    private String theDate;

    //测量时间点
    private int time ;

    //体温
    private Double temperature ;

    //体温类型 (1:口温;2:腋温;3:肛温;4:体温不升)
    private Integer temperatureType ;

    //降温后的体温
    private Double reductionTemperature;

    //脉搏
    private Integer pulse ;

    //脉搏短绌   1：是;  0:否
    private Integer pulseDeficit ;

    //心率
    private Integer heartRate ;

    //心率检测类型 1:使用心脏搏起器2：补测心率
    private Integer rateInspectionType ;

    //呼吸
    private Integer breathe ;

    //是否使用呼吸机 使用呼吸机(1:是 ; 0:否)
    private Integer breatheType ;

    /**
     * 上注释
     */
    private String comment1 ;

    /**
     * 上注释说明 1:入院; 2：出院;3:转入;4:手术;5:转院;6:死亡;7:分娩 ;0:其他;
     */
    private String comment1Type;
    /**
     * 下注释
     */
    private String comment2 ;

    /**
     * 下注释说明  1:拒测; 2:外出; 3:请假
     */
    private String comment2ype;

    public String getInpNo() {
        return inpNo;
    }

    public void setInpNo(String inpNo) {
        this.inpNo = inpNo;
    }

    public String getTheDate() {
        return theDate;
    }

    public void setTheDate(String theDate) {
        this.theDate = theDate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getTemperatureType() {
        return temperatureType;
    }

    public void setTemperatureType(Integer temperatureType) {
        this.temperatureType = temperatureType;
    }

    public Double getReductionTemperature() {
        return reductionTemperature;
    }

    public void setReductionTemperature(Double reductionTemperature) {
        this.reductionTemperature = reductionTemperature;
    }

    public Integer getPulse() {
        return pulse;
    }

    public void setPulse(Integer pulse) {
        this.pulse = pulse;
    }

    public Integer getPulseDeficit() {
        return pulseDeficit;
    }

    public void setPulseDeficit(Integer pulseDeficit) {
        this.pulseDeficit = pulseDeficit;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Integer getRateInspectionType() {
        return rateInspectionType;
    }

    public void setRateInspectionType(Integer rateInspectionType) {
        this.rateInspectionType = rateInspectionType;
    }


    public Integer getBreathe() {
        return breathe;
    }

    public void setBreathe(Integer breathe) {
        this.breathe = breathe;
    }

    public Integer getBreatheType() {
        return breatheType;
    }

    public void setBreatheType(Integer breatheType) {
        this.breatheType = breatheType;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getComment1Type() {
        return comment1Type;
    }

    public void setComment1Type(String comment1Type) {
        this.comment1Type = comment1Type;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getComment2ype() {
        return comment2ype;
    }

    public void setComment2ype(String comment2ype) {
        this.comment2ype = comment2ype;
    }

    @Override
    public String toString() {
        return "PTempDetailInfo{" +
                "inpNo='" + inpNo + '\'' +
                ", theDate='" + theDate + '\'' +
                ", time=" + time +
                ", temperature=" + temperature +
                ", temperatureType=" + temperatureType +
                ", reductionTemperature=" + reductionTemperature +
                ", pulse=" + pulse +
                ", pulseDeficit=" + pulseDeficit +
                ", heartRate=" + heartRate +
                ", rateInspectionType=" + rateInspectionType +
                ", breathe=" + breathe +
                ", breatheType=" + breatheType +
                ", comment1='" + comment1 + '\'' +
                ", comment1Type='" + comment1Type + '\'' +
                ", comment2='" + comment2 + '\'' +
                ", comment2ype='" + comment2ype + '\'' +
                '}';
    }
}
