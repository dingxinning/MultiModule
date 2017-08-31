package test_pojo.model;

import java.util.Date;

public class ClcDiag {
    private String diagid;

    private String hosnum;

    private String dtmainid;

    private String rsheetno;

    private String diagno;

    private String diagname;

    private String deptcode;

    private String deptname;

    private String doctorid;

    private String doctorname;

    private String diagtype;

    private String diagclass;

    private String surestatus;

    private String cmedflag;

    private Date diagdate;

    private String comments;

    private String nodecode;

    private Date begindate;

    private String icd10;

    public String getDiagid() {
        return diagid;
    }

    public void setDiagid(String diagid) {
        this.diagid = diagid == null ? null : diagid.trim();
    }

    public String getHosnum() {
        return hosnum;
    }

    public void setHosnum(String hosnum) {
        this.hosnum = hosnum == null ? null : hosnum.trim();
    }

    public String getDtmainid() {
        return dtmainid;
    }

    public void setDtmainid(String dtmainid) {
        this.dtmainid = dtmainid == null ? null : dtmainid.trim();
    }

    public String getRsheetno() {
        return rsheetno;
    }

    public void setRsheetno(String rsheetno) {
        this.rsheetno = rsheetno == null ? null : rsheetno.trim();
    }

    public String getDiagno() {
        return diagno;
    }

    public void setDiagno(String diagno) {
        this.diagno = diagno == null ? null : diagno.trim();
    }

    public String getDiagname() {
        return diagname;
    }

    public void setDiagname(String diagname) {
        this.diagname = diagname == null ? null : diagname.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid == null ? null : doctorid.trim();
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname == null ? null : doctorname.trim();
    }

    public String getDiagtype() {
        return diagtype;
    }

    public void setDiagtype(String diagtype) {
        this.diagtype = diagtype == null ? null : diagtype.trim();
    }

    public String getDiagclass() {
        return diagclass;
    }

    public void setDiagclass(String diagclass) {
        this.diagclass = diagclass == null ? null : diagclass.trim();
    }

    public String getSurestatus() {
        return surestatus;
    }

    public void setSurestatus(String surestatus) {
        this.surestatus = surestatus == null ? null : surestatus.trim();
    }

    public String getCmedflag() {
        return cmedflag;
    }

    public void setCmedflag(String cmedflag) {
        this.cmedflag = cmedflag == null ? null : cmedflag.trim();
    }

    public Date getDiagdate() {
        return diagdate;
    }

    public void setDiagdate(Date diagdate) {
        this.diagdate = diagdate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getNodecode() {
        return nodecode;
    }

    public void setNodecode(String nodecode) {
        this.nodecode = nodecode == null ? null : nodecode.trim();
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public String getIcd10() {
        return icd10;
    }

    public void setIcd10(String icd10) {
        this.icd10 = icd10 == null ? null : icd10.trim();
    }
}