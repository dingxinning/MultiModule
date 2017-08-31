package com.echarts.controller;

import com.alibaba.fastjson.JSON;
import com.echarts.entity.PTempDetailInfo;
import com.echarts.entity.PTempInfo;
import com.echarts.service.SignEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Wuxiang on 2017/7/8.
 * 体征录入
 */
@Controller
@RequestMapping("/sign")
public class SignEntryController {

    @Autowired
    private SignEntryService signEntryService;

    // HIS的页面
    @RequestMapping("/emr")
    public String emr(){
        return "emr_temperature";
    }

    // 新的调整过的页面
    @RequestMapping("/show")
    public String showPage() {
        return "sign_entry";
    }

    // 保存体征录入的信息
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public String save(HttpServletRequest request,
                       @RequestParam("inpno") String inpno,
                       @RequestParam("thedate") String thedate) {
        String mb_2 = request.getParameter("mb_2");
        String mb_6 = request.getParameter("mb_6");
        String mb_10 = request.getParameter("mb_10");
        String mb_14 = request.getParameter("mb_14");
        String mb_18 = request.getParameter("mb_18");
        String mb_22 = request.getParameter("mb_22");

        String xl_2 = request.getParameter("xl_2");
        String xl_6 = request.getParameter("xl_6");
        String xl_10 = request.getParameter("xl_10");
        String xl_14 = request.getParameter("xl_14");
        String xl_18 = request.getParameter("xl_18");
        String xl_22 = request.getParameter("xl_22");

        String twlx_2 = request.getParameter("twlx_2");
        String twlx_6 = request.getParameter("twlx_6");
        String twlx_10 = request.getParameter("twlx_10");
        String twlx_14 = request.getParameter("twlx_14");
        String twlx_18 = request.getParameter("twlx_18");
        String twlx_22 = request.getParameter("twlx_22");

        String tw_2 = request.getParameter("tw_2");
        String tw_6 = request.getParameter("tw_6");
        String tw_10 = request.getParameter("tw_10");
        String tw_14 = request.getParameter("tw_14");
        String tw_18 = request.getParameter("tw_18");
        String tw_22 = request.getParameter("tw_22");

        String jw_2 = request.getParameter("jw_2");
        String jw_6 = request.getParameter("jw_6");
        String jw_10 = request.getParameter("jw_10");
        String jw_14 = request.getParameter("jw_14");
        String jw_18 = request.getParameter("jw_18");
        String jw_22 = request.getParameter("jw_22");

        String sjlx_2 = request.getParameter("sjlx_2");
        String sjlx_6 = request.getParameter("sjlx_6");
        String sjlx_10 = request.getParameter("sjlx_10");
        String sjlx_14 = request.getParameter("sjlx_14");
        String sjlx_18 = request.getParameter("sjlx_18");
        String sjlx_22 = request.getParameter("sjlx_22");

        String sjms_2 = request.getParameter("sjms_2");
        String sjms_6 = request.getParameter("sjms_6");
        String sjms_10 = request.getParameter("sjms_10");
        String sjms_14 = request.getParameter("sjms_14");
        String sjms_18 = request.getParameter("sjms_18");
        String sjms_22 = request.getParameter("sjms_22");

        String hxj_2 = request.getParameter("hxj_2");
        String hxj_6 = request.getParameter("hxj_6");
        String hxj_10 = request.getParameter("hxj_10");
        String hxj_14 = request.getParameter("hxj_14");
        String hxj_18 = request.getParameter("hxj_18");
        String hxj_22 = request.getParameter("hxj_22");

        String hx_2 = request.getParameter("hx_2");
        String hx_6 = request.getParameter("hx_6");
        String hx_10 = request.getParameter("hx_10");
        String hx_14 = request.getParameter("hx_14");
        String hx_18 = request.getParameter("hx_18");
        String hx_22 = request.getParameter("hx_22");

        String swssy = request.getParameter("swssy");
        String swszy = request.getParameter("swszy");
        String xwssy = request.getParameter("xwssy");
        String xwszy = request.getParameter("xwszy");

        String ssy3 = request.getParameter("ssy3");
        String szy3 = request.getParameter("szy3");

        String rl = request.getParameter("rl");
        String cl = request.getParameter("cl");

        String dbcs = request.getParameter("dbcs");
        String xbcs = request.getParameter("xbcs");
        String tzlx = request.getParameter("tzlx");
        String tz = request.getParameter("tz");
        String sglx = request.getParameter("sglx");
        String sg = request.getParameter("sg");
        String ps = request.getParameter("ps");

        String qtxmc1 = request.getParameter("qtxmc1");
        String qtx1 = request.getParameter("qtx1");
        String qtxmc2 = request.getParameter("qtxmc2");
        String qtx2 = request.getParameter("qtx2");
        String qtxmc3 = request.getParameter("qtxmc3");
        String qtx3 = request.getParameter("qtx3");

        PTempInfo pTempInfo = new PTempInfo();
        pTempInfo.setInpNo(inpno);
        pTempInfo.setTheDate(thedate);
        pTempInfo.setSbp1(swssy);
        pTempInfo.setDbp1(swszy);
        pTempInfo.setSbp2(xwssy);
        pTempInfo.setDbp2(xwszy);

        pTempInfo.setIntake(rl.equals("") ? null : Integer.parseInt(rl));
        pTempInfo.setOutput(cl.equals("") ? null : Integer.parseInt(cl));

        pTempInfo.setPoopInfo(dbcs);
        pTempInfo.setUrinateInfo(xbcs);
        pTempInfo.setWeightType(Integer.parseInt(tzlx));
        pTempInfo.setWeight(tz.equals("") ? null : Double.parseDouble(tz));
        pTempInfo.setHeightType(Integer.parseInt(sglx));
        pTempInfo.setHeight(sg.equals("") ? null : Double.parseDouble(sg));
        pTempInfo.setSkinTest(ps);

        signEntryService.savePTempInfo(pTempInfo);

        PTempDetailInfo pdi2 = new PTempDetailInfo();
        pdi2.setInpNo(inpno);
        pdi2.setTheDate(thedate);
        pdi2.setTime(2);
        pdi2.setPulse(mb_2.equals("") ? null : Integer.parseInt(mb_2));
        pdi2.setHeartRate(xl_2.equals("") ? null : Integer.parseInt(xl_2));
        pdi2.setTemperature(tw_2.equals("") ? null : Double.parseDouble(tw_2));
        pdi2.setTemperatureType(Integer.parseInt(twlx_2));
        pdi2.setReductionTemperature(jw_2.equals("") ? null : Double.parseDouble(jw_2));
        pdi2.setComment1Type(sjlx_2);
        pdi2.setComment1(sjms_2);
        pdi2.setBreatheType(Integer.parseInt(hxj_2));
        pdi2.setBreathe(hx_2.equals("") ? null : Integer.parseInt(hx_2));

        PTempDetailInfo pdi6 = new PTempDetailInfo();
        pdi6.setInpNo(inpno);
        pdi6.setTheDate(thedate);
        pdi6.setTime(6);
        pdi6.setPulse(mb_6.equals("") ? null : Integer.parseInt(mb_6));
        pdi6.setHeartRate(xl_6.equals("") ? null : Integer.parseInt(xl_6));
        pdi6.setTemperature(tw_6.equals("") ? null : Double.parseDouble(tw_6));
        pdi6.setTemperatureType(Integer.parseInt(twlx_6));
        pdi6.setReductionTemperature(jw_6.equals("") ? null : Double.parseDouble(jw_6));
        pdi6.setComment1Type(sjlx_6);
        pdi6.setComment1(sjms_6);
        pdi6.setBreatheType(Integer.parseInt(hxj_6));
        pdi6.setBreathe(hx_6.equals("") ? null : Integer.parseInt(hx_6));

        PTempDetailInfo pdi10 = new PTempDetailInfo();
        pdi10.setInpNo(inpno);
        pdi10.setTheDate(thedate);
        pdi10.setTime(10);
        pdi10.setPulse(mb_10.equals("") ? null : Integer.parseInt(mb_10));
        pdi10.setHeartRate(xl_10.equals("") ? null : Integer.parseInt(xl_10));
        pdi10.setTemperature(tw_10.equals("") ? null : Double.parseDouble(tw_10));
        pdi10.setTemperatureType(Integer.parseInt(twlx_10));
        pdi10.setReductionTemperature(jw_10.equals("") ? null : Double.parseDouble(jw_10));
        pdi10.setComment1Type(sjlx_10);
        pdi10.setComment1(sjms_10);
        pdi10.setBreatheType(Integer.parseInt(hxj_10));
        pdi10.setBreathe(hx_10.equals("") ? null : Integer.parseInt(hx_10));

        PTempDetailInfo pdi14 = new PTempDetailInfo();
        pdi14.setInpNo(inpno);
        pdi14.setTheDate(thedate);
        pdi14.setTime(14);
        pdi14.setPulse(mb_14.equals("") ? null : Integer.parseInt(mb_14));
        pdi14.setHeartRate(xl_14.equals("") ? null : Integer.parseInt(xl_14));
        pdi14.setTemperature(tw_14.equals("") ? null : Double.parseDouble(tw_14));
        pdi14.setTemperatureType(Integer.parseInt(twlx_14));
        pdi14.setReductionTemperature(jw_14.equals("") ? null : Double.parseDouble(jw_14));
        pdi14.setComment1Type(sjlx_14);
        pdi14.setComment1(sjms_14);
        pdi14.setBreatheType(Integer.parseInt(hxj_14));
        pdi14.setBreathe(hx_14.equals("") ? null : Integer.parseInt(hx_14));

        PTempDetailInfo pdi18 = new PTempDetailInfo();
        pdi18.setInpNo(inpno);
        pdi18.setTheDate(thedate);
        pdi18.setTime(18);
        pdi18.setPulse(mb_18.equals("") ? null : Integer.parseInt(mb_18));
        pdi18.setHeartRate(xl_18.equals("") ? null : Integer.parseInt(xl_18));
        pdi18.setTemperature(tw_18.equals("") ? null : Double.parseDouble(tw_18));
        pdi18.setTemperatureType(Integer.parseInt(twlx_18));
        pdi18.setReductionTemperature(jw_18.equals("") ? null : Double.parseDouble(jw_18));
        pdi18.setComment1Type(sjlx_18);
        pdi18.setComment1(sjms_18);
        pdi18.setBreatheType(Integer.parseInt(hxj_18));
        pdi18.setBreathe(hx_18.equals("") ? null : Integer.parseInt(hx_18));

        PTempDetailInfo pdi22 = new PTempDetailInfo();
        pdi22.setInpNo(inpno);
        pdi22.setTheDate(thedate);
        pdi22.setTime(22);
        pdi22.setPulse(mb_22.equals("") ? null : Integer.parseInt(mb_22));
        pdi22.setHeartRate(xl_22.equals("") ? null : Integer.parseInt(xl_22));
        pdi22.setTemperature(tw_22.equals("") ? null : Double.parseDouble(tw_22));
        pdi22.setTemperatureType(Integer.parseInt(twlx_22));
        pdi22.setReductionTemperature(jw_22.equals("") ? null : Double.parseDouble(jw_22));
        pdi22.setComment1Type(sjlx_22);
        pdi22.setComment1(sjms_22);
        pdi22.setBreatheType(Integer.parseInt(hxj_22));
        pdi22.setBreathe(hx_22.equals("") ? null : Integer.parseInt(hx_22));

        signEntryService.saveDetailInfo(pdi2);
        signEntryService.saveDetailInfo(pdi6);
        signEntryService.saveDetailInfo(pdi10);
        signEntryService.saveDetailInfo(pdi14);
        signEntryService.saveDetailInfo(pdi18);
        signEntryService.saveDetailInfo(pdi22);

        return "success";
    }

    // 根据inpno 查询体征信息
    @RequestMapping(value = "/getDetailInfoByInpno", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getDetailInfoByInpno(@RequestParam("inpno") String inpno) {
        List<PTempDetailInfo> infos = signEntryService.getDetailInfoByInpno(inpno);
        return JSON.toJSONString(infos);
    }

    @RequestMapping(value = "/getPTempInfoByInpno", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getPTempInfoByInpno(@RequestParam("inpno") String inpno) {
        List<PTempInfo> infos = signEntryService.getPTempInfoByInpno(inpno);
        return JSON.toJSONString(infos);
    }
}
