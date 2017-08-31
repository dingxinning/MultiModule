package com.echarts.entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PTempInfo 
{
	// 住院号
	private String inpNo;

	// 测量周
	private String theDate;

    // 大便次数
	private Integer poopCount ;

    /**
     * 大便特殊情况 患者无大便，以“0”表示；灌肠后大便以“E”表示，分子记录大便次数，例：1/E表示灌肠后大便1次；0/E表示灌肠后无排便；11/E表示自行排便1次
     */
    private String poopInfo;

    private String poopOtherInfo;

    // 尿量
    private Integer urineVolume;

    // 小便
    private String urinateInfo;
	
	
	/**收缩压,舒张压*/
	private String sbp1 ;
	private String dbp1 ;
	private String sbp2 ;
	private String dbp2 ;
	
	// 入量
	private Integer intake;
	
	// 出量
	private Integer output ;
	
	// 体重数值
	private Double weight;

	// 体重类型   '1':'数值','2':'平车','3':'卧床','4':'抱入','5':'轮椅'
	private Integer weightType;
	
	// 身高
	private Double height;
	
	// 身高类型
	private Integer heightType ;
	
	// 皮试
	private String skinTest ;

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

    public Integer getPoopCount() {
        return poopCount;
    }

    public void setPoopCount(Integer poopCount) {
        this.poopCount = poopCount;
    }

    public String getPoopInfo() {
        return poopInfo;
    }

    public void setPoopInfo(String poopInfo) {
        this.poopInfo = poopInfo;
    }

    public String getPoopOtherInfo() {
        return poopOtherInfo;
    }

    public void setPoopOtherInfo(String poopOtherInfo) {
        this.poopOtherInfo = poopOtherInfo;
    }

    public Integer getUrineVolume() {
        return urineVolume;
    }

    public void setUrineVolume(Integer urineVolume) {
        this.urineVolume = urineVolume;
    }

    public String getUrinateInfo() {
        return urinateInfo;
    }

    public void setUrinateInfo(String urinateInfo) {
        this.urinateInfo = urinateInfo;
    }

    public String getSbp1() {
        return sbp1;
    }

    public void setSbp1(String sbp1) {
        this.sbp1 = sbp1;
    }

    public String getDbp1() {
        return dbp1;
    }

    public void setDbp1(String dbp1) {
        this.dbp1 = dbp1;
    }

    public String getSbp2() {
        return sbp2;
    }

    public void setSbp2(String sbp2) {
        this.sbp2 = sbp2;
    }

    public String getDbp2() {
        return dbp2;
    }

    public void setDbp2(String dbp2) {
        this.dbp2 = dbp2;
    }

    public Integer getIntake() {
        return intake;
    }

    public void setIntake(Integer intake) {
        this.intake = intake;
    }

    public Integer getOutput() {
        return output;
    }

    public void setOutput(Integer output) {
        this.output = output;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getWeightType() {
        return weightType;
    }

    public void setWeightType(Integer weightType) {
        this.weightType = weightType;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getHeightType() {
        return heightType;
    }

    public void setHeightType(Integer heightType) {
        this.heightType = heightType;
    }

    public String getSkinTest() {
        return skinTest;
    }

    public void setSkinTest(String skinTest) {
        this.skinTest = skinTest;
    }

    @Override
    public String toString() {
        return "PTempInfo{" +
                "inpNo='" + inpNo + '\'' +
                ", theDate='" + theDate + '\'' +
                ", poopCount=" + poopCount +
                ", poopInfo='" + poopInfo + '\'' +
                ", poopOtherInfo='" + poopOtherInfo + '\'' +
                ", urineVolume=" + urineVolume +
                ", urinateInfo='" + urinateInfo + '\'' +
                ", sbp1='" + sbp1 + '\'' +
                ", dbp1='" + dbp1 + '\'' +
                ", sbp2='" + sbp2 + '\'' +
                ", dbp2='" + dbp2 + '\'' +
                ", intake=" + intake +
                ", output=" + output +
                ", weight=" + weight +
                ", weightType=" + weightType +
                ", height=" + height +
                ", heightType=" + heightType +
                ", skinTest='" + skinTest + '\'' +
                '}';
    }
}
