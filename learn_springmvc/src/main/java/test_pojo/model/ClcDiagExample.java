package test_pojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClcDiagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClcDiagExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDiagidIsNull() {
            addCriterion("DIAGID is null");
            return (Criteria) this;
        }

        public Criteria andDiagidIsNotNull() {
            addCriterion("DIAGID is not null");
            return (Criteria) this;
        }

        public Criteria andDiagidEqualTo(String value) {
            addCriterion("DIAGID =", value, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidNotEqualTo(String value) {
            addCriterion("DIAGID <>", value, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidGreaterThan(String value) {
            addCriterion("DIAGID >", value, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGID >=", value, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidLessThan(String value) {
            addCriterion("DIAGID <", value, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidLessThanOrEqualTo(String value) {
            addCriterion("DIAGID <=", value, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidLike(String value) {
            addCriterion("DIAGID like", value, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidNotLike(String value) {
            addCriterion("DIAGID not like", value, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidIn(List<String> values) {
            addCriterion("DIAGID in", values, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidNotIn(List<String> values) {
            addCriterion("DIAGID not in", values, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidBetween(String value1, String value2) {
            addCriterion("DIAGID between", value1, value2, "diagid");
            return (Criteria) this;
        }

        public Criteria andDiagidNotBetween(String value1, String value2) {
            addCriterion("DIAGID not between", value1, value2, "diagid");
            return (Criteria) this;
        }

        public Criteria andHosnumIsNull() {
            addCriterion("HOSNUM is null");
            return (Criteria) this;
        }

        public Criteria andHosnumIsNotNull() {
            addCriterion("HOSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andHosnumEqualTo(String value) {
            addCriterion("HOSNUM =", value, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumNotEqualTo(String value) {
            addCriterion("HOSNUM <>", value, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumGreaterThan(String value) {
            addCriterion("HOSNUM >", value, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumGreaterThanOrEqualTo(String value) {
            addCriterion("HOSNUM >=", value, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumLessThan(String value) {
            addCriterion("HOSNUM <", value, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumLessThanOrEqualTo(String value) {
            addCriterion("HOSNUM <=", value, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumLike(String value) {
            addCriterion("HOSNUM like", value, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumNotLike(String value) {
            addCriterion("HOSNUM not like", value, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumIn(List<String> values) {
            addCriterion("HOSNUM in", values, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumNotIn(List<String> values) {
            addCriterion("HOSNUM not in", values, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumBetween(String value1, String value2) {
            addCriterion("HOSNUM between", value1, value2, "hosnum");
            return (Criteria) this;
        }

        public Criteria andHosnumNotBetween(String value1, String value2) {
            addCriterion("HOSNUM not between", value1, value2, "hosnum");
            return (Criteria) this;
        }

        public Criteria andDtmainidIsNull() {
            addCriterion("DTMAINID is null");
            return (Criteria) this;
        }

        public Criteria andDtmainidIsNotNull() {
            addCriterion("DTMAINID is not null");
            return (Criteria) this;
        }

        public Criteria andDtmainidEqualTo(String value) {
            addCriterion("DTMAINID =", value, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidNotEqualTo(String value) {
            addCriterion("DTMAINID <>", value, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidGreaterThan(String value) {
            addCriterion("DTMAINID >", value, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidGreaterThanOrEqualTo(String value) {
            addCriterion("DTMAINID >=", value, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidLessThan(String value) {
            addCriterion("DTMAINID <", value, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidLessThanOrEqualTo(String value) {
            addCriterion("DTMAINID <=", value, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidLike(String value) {
            addCriterion("DTMAINID like", value, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidNotLike(String value) {
            addCriterion("DTMAINID not like", value, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidIn(List<String> values) {
            addCriterion("DTMAINID in", values, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidNotIn(List<String> values) {
            addCriterion("DTMAINID not in", values, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidBetween(String value1, String value2) {
            addCriterion("DTMAINID between", value1, value2, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andDtmainidNotBetween(String value1, String value2) {
            addCriterion("DTMAINID not between", value1, value2, "dtmainid");
            return (Criteria) this;
        }

        public Criteria andRsheetnoIsNull() {
            addCriterion("RSHEETNO is null");
            return (Criteria) this;
        }

        public Criteria andRsheetnoIsNotNull() {
            addCriterion("RSHEETNO is not null");
            return (Criteria) this;
        }

        public Criteria andRsheetnoEqualTo(String value) {
            addCriterion("RSHEETNO =", value, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoNotEqualTo(String value) {
            addCriterion("RSHEETNO <>", value, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoGreaterThan(String value) {
            addCriterion("RSHEETNO >", value, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoGreaterThanOrEqualTo(String value) {
            addCriterion("RSHEETNO >=", value, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoLessThan(String value) {
            addCriterion("RSHEETNO <", value, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoLessThanOrEqualTo(String value) {
            addCriterion("RSHEETNO <=", value, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoLike(String value) {
            addCriterion("RSHEETNO like", value, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoNotLike(String value) {
            addCriterion("RSHEETNO not like", value, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoIn(List<String> values) {
            addCriterion("RSHEETNO in", values, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoNotIn(List<String> values) {
            addCriterion("RSHEETNO not in", values, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoBetween(String value1, String value2) {
            addCriterion("RSHEETNO between", value1, value2, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andRsheetnoNotBetween(String value1, String value2) {
            addCriterion("RSHEETNO not between", value1, value2, "rsheetno");
            return (Criteria) this;
        }

        public Criteria andDiagnoIsNull() {
            addCriterion("DIAGNO is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoIsNotNull() {
            addCriterion("DIAGNO is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoEqualTo(String value) {
            addCriterion("DIAGNO =", value, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoNotEqualTo(String value) {
            addCriterion("DIAGNO <>", value, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoGreaterThan(String value) {
            addCriterion("DIAGNO >", value, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNO >=", value, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoLessThan(String value) {
            addCriterion("DIAGNO <", value, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoLessThanOrEqualTo(String value) {
            addCriterion("DIAGNO <=", value, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoLike(String value) {
            addCriterion("DIAGNO like", value, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoNotLike(String value) {
            addCriterion("DIAGNO not like", value, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoIn(List<String> values) {
            addCriterion("DIAGNO in", values, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoNotIn(List<String> values) {
            addCriterion("DIAGNO not in", values, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoBetween(String value1, String value2) {
            addCriterion("DIAGNO between", value1, value2, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnoNotBetween(String value1, String value2) {
            addCriterion("DIAGNO not between", value1, value2, "diagno");
            return (Criteria) this;
        }

        public Criteria andDiagnameIsNull() {
            addCriterion("DIAGNAME is null");
            return (Criteria) this;
        }

        public Criteria andDiagnameIsNotNull() {
            addCriterion("DIAGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnameEqualTo(String value) {
            addCriterion("DIAGNAME =", value, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameNotEqualTo(String value) {
            addCriterion("DIAGNAME <>", value, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameGreaterThan(String value) {
            addCriterion("DIAGNAME >", value, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGNAME >=", value, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameLessThan(String value) {
            addCriterion("DIAGNAME <", value, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameLessThanOrEqualTo(String value) {
            addCriterion("DIAGNAME <=", value, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameLike(String value) {
            addCriterion("DIAGNAME like", value, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameNotLike(String value) {
            addCriterion("DIAGNAME not like", value, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameIn(List<String> values) {
            addCriterion("DIAGNAME in", values, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameNotIn(List<String> values) {
            addCriterion("DIAGNAME not in", values, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameBetween(String value1, String value2) {
            addCriterion("DIAGNAME between", value1, value2, "diagname");
            return (Criteria) this;
        }

        public Criteria andDiagnameNotBetween(String value1, String value2) {
            addCriterion("DIAGNAME not between", value1, value2, "diagname");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNull() {
            addCriterion("DEPTCODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNotNull() {
            addCriterion("DEPTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeEqualTo(String value) {
            addCriterion("DEPTCODE =", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotEqualTo(String value) {
            addCriterion("DEPTCODE <>", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThan(String value) {
            addCriterion("DEPTCODE >", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTCODE >=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThan(String value) {
            addCriterion("DEPTCODE <", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("DEPTCODE <=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLike(String value) {
            addCriterion("DEPTCODE like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotLike(String value) {
            addCriterion("DEPTCODE not like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIn(List<String> values) {
            addCriterion("DEPTCODE in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotIn(List<String> values) {
            addCriterion("DEPTCODE not in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeBetween(String value1, String value2) {
            addCriterion("DEPTCODE between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotBetween(String value1, String value2) {
            addCriterion("DEPTCODE not between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("DEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DEPTNAME =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DEPTNAME <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DEPTNAME >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTNAME >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DEPTNAME <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DEPTNAME <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DEPTNAME like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DEPTNAME not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DEPTNAME in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DEPTNAME not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DEPTNAME between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DEPTNAME not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("DOCTORID is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("DOCTORID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(String value) {
            addCriterion("DOCTORID =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(String value) {
            addCriterion("DOCTORID <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(String value) {
            addCriterion("DOCTORID >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(String value) {
            addCriterion("DOCTORID >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(String value) {
            addCriterion("DOCTORID <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(String value) {
            addCriterion("DOCTORID <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLike(String value) {
            addCriterion("DOCTORID like", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotLike(String value) {
            addCriterion("DOCTORID not like", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<String> values) {
            addCriterion("DOCTORID in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<String> values) {
            addCriterion("DOCTORID not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(String value1, String value2) {
            addCriterion("DOCTORID between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(String value1, String value2) {
            addCriterion("DOCTORID not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNull() {
            addCriterion("DOCTORNAME is null");
            return (Criteria) this;
        }

        public Criteria andDoctornameIsNotNull() {
            addCriterion("DOCTORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDoctornameEqualTo(String value) {
            addCriterion("DOCTORNAME =", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotEqualTo(String value) {
            addCriterion("DOCTORNAME <>", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThan(String value) {
            addCriterion("DOCTORNAME >", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameGreaterThanOrEqualTo(String value) {
            addCriterion("DOCTORNAME >=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThan(String value) {
            addCriterion("DOCTORNAME <", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLessThanOrEqualTo(String value) {
            addCriterion("DOCTORNAME <=", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameLike(String value) {
            addCriterion("DOCTORNAME like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotLike(String value) {
            addCriterion("DOCTORNAME not like", value, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameIn(List<String> values) {
            addCriterion("DOCTORNAME in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotIn(List<String> values) {
            addCriterion("DOCTORNAME not in", values, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameBetween(String value1, String value2) {
            addCriterion("DOCTORNAME between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDoctornameNotBetween(String value1, String value2) {
            addCriterion("DOCTORNAME not between", value1, value2, "doctorname");
            return (Criteria) this;
        }

        public Criteria andDiagtypeIsNull() {
            addCriterion("DIAGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDiagtypeIsNotNull() {
            addCriterion("DIAGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDiagtypeEqualTo(String value) {
            addCriterion("DIAGTYPE =", value, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeNotEqualTo(String value) {
            addCriterion("DIAGTYPE <>", value, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeGreaterThan(String value) {
            addCriterion("DIAGTYPE >", value, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGTYPE >=", value, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeLessThan(String value) {
            addCriterion("DIAGTYPE <", value, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeLessThanOrEqualTo(String value) {
            addCriterion("DIAGTYPE <=", value, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeLike(String value) {
            addCriterion("DIAGTYPE like", value, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeNotLike(String value) {
            addCriterion("DIAGTYPE not like", value, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeIn(List<String> values) {
            addCriterion("DIAGTYPE in", values, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeNotIn(List<String> values) {
            addCriterion("DIAGTYPE not in", values, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeBetween(String value1, String value2) {
            addCriterion("DIAGTYPE between", value1, value2, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagtypeNotBetween(String value1, String value2) {
            addCriterion("DIAGTYPE not between", value1, value2, "diagtype");
            return (Criteria) this;
        }

        public Criteria andDiagclassIsNull() {
            addCriterion("DIAGCLASS is null");
            return (Criteria) this;
        }

        public Criteria andDiagclassIsNotNull() {
            addCriterion("DIAGCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andDiagclassEqualTo(String value) {
            addCriterion("DIAGCLASS =", value, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassNotEqualTo(String value) {
            addCriterion("DIAGCLASS <>", value, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassGreaterThan(String value) {
            addCriterion("DIAGCLASS >", value, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassGreaterThanOrEqualTo(String value) {
            addCriterion("DIAGCLASS >=", value, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassLessThan(String value) {
            addCriterion("DIAGCLASS <", value, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassLessThanOrEqualTo(String value) {
            addCriterion("DIAGCLASS <=", value, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassLike(String value) {
            addCriterion("DIAGCLASS like", value, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassNotLike(String value) {
            addCriterion("DIAGCLASS not like", value, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassIn(List<String> values) {
            addCriterion("DIAGCLASS in", values, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassNotIn(List<String> values) {
            addCriterion("DIAGCLASS not in", values, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassBetween(String value1, String value2) {
            addCriterion("DIAGCLASS between", value1, value2, "diagclass");
            return (Criteria) this;
        }

        public Criteria andDiagclassNotBetween(String value1, String value2) {
            addCriterion("DIAGCLASS not between", value1, value2, "diagclass");
            return (Criteria) this;
        }

        public Criteria andSurestatusIsNull() {
            addCriterion("SURESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSurestatusIsNotNull() {
            addCriterion("SURESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSurestatusEqualTo(String value) {
            addCriterion("SURESTATUS =", value, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusNotEqualTo(String value) {
            addCriterion("SURESTATUS <>", value, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusGreaterThan(String value) {
            addCriterion("SURESTATUS >", value, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusGreaterThanOrEqualTo(String value) {
            addCriterion("SURESTATUS >=", value, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusLessThan(String value) {
            addCriterion("SURESTATUS <", value, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusLessThanOrEqualTo(String value) {
            addCriterion("SURESTATUS <=", value, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusLike(String value) {
            addCriterion("SURESTATUS like", value, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusNotLike(String value) {
            addCriterion("SURESTATUS not like", value, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusIn(List<String> values) {
            addCriterion("SURESTATUS in", values, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusNotIn(List<String> values) {
            addCriterion("SURESTATUS not in", values, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusBetween(String value1, String value2) {
            addCriterion("SURESTATUS between", value1, value2, "surestatus");
            return (Criteria) this;
        }

        public Criteria andSurestatusNotBetween(String value1, String value2) {
            addCriterion("SURESTATUS not between", value1, value2, "surestatus");
            return (Criteria) this;
        }

        public Criteria andCmedflagIsNull() {
            addCriterion("CMEDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCmedflagIsNotNull() {
            addCriterion("CMEDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCmedflagEqualTo(String value) {
            addCriterion("CMEDFLAG =", value, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagNotEqualTo(String value) {
            addCriterion("CMEDFLAG <>", value, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagGreaterThan(String value) {
            addCriterion("CMEDFLAG >", value, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagGreaterThanOrEqualTo(String value) {
            addCriterion("CMEDFLAG >=", value, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagLessThan(String value) {
            addCriterion("CMEDFLAG <", value, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagLessThanOrEqualTo(String value) {
            addCriterion("CMEDFLAG <=", value, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagLike(String value) {
            addCriterion("CMEDFLAG like", value, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagNotLike(String value) {
            addCriterion("CMEDFLAG not like", value, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagIn(List<String> values) {
            addCriterion("CMEDFLAG in", values, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagNotIn(List<String> values) {
            addCriterion("CMEDFLAG not in", values, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagBetween(String value1, String value2) {
            addCriterion("CMEDFLAG between", value1, value2, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andCmedflagNotBetween(String value1, String value2) {
            addCriterion("CMEDFLAG not between", value1, value2, "cmedflag");
            return (Criteria) this;
        }

        public Criteria andDiagdateIsNull() {
            addCriterion("DIAGDATE is null");
            return (Criteria) this;
        }

        public Criteria andDiagdateIsNotNull() {
            addCriterion("DIAGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDiagdateEqualTo(Date value) {
            addCriterion("DIAGDATE =", value, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateNotEqualTo(Date value) {
            addCriterion("DIAGDATE <>", value, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateGreaterThan(Date value) {
            addCriterion("DIAGDATE >", value, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DIAGDATE >=", value, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateLessThan(Date value) {
            addCriterion("DIAGDATE <", value, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateLessThanOrEqualTo(Date value) {
            addCriterion("DIAGDATE <=", value, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateIn(List<Date> values) {
            addCriterion("DIAGDATE in", values, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateNotIn(List<Date> values) {
            addCriterion("DIAGDATE not in", values, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateBetween(Date value1, Date value2) {
            addCriterion("DIAGDATE between", value1, value2, "diagdate");
            return (Criteria) this;
        }

        public Criteria andDiagdateNotBetween(Date value1, Date value2) {
            addCriterion("DIAGDATE not between", value1, value2, "diagdate");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andNodecodeIsNull() {
            addCriterion("NODECODE is null");
            return (Criteria) this;
        }

        public Criteria andNodecodeIsNotNull() {
            addCriterion("NODECODE is not null");
            return (Criteria) this;
        }

        public Criteria andNodecodeEqualTo(String value) {
            addCriterion("NODECODE =", value, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeNotEqualTo(String value) {
            addCriterion("NODECODE <>", value, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeGreaterThan(String value) {
            addCriterion("NODECODE >", value, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeGreaterThanOrEqualTo(String value) {
            addCriterion("NODECODE >=", value, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeLessThan(String value) {
            addCriterion("NODECODE <", value, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeLessThanOrEqualTo(String value) {
            addCriterion("NODECODE <=", value, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeLike(String value) {
            addCriterion("NODECODE like", value, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeNotLike(String value) {
            addCriterion("NODECODE not like", value, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeIn(List<String> values) {
            addCriterion("NODECODE in", values, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeNotIn(List<String> values) {
            addCriterion("NODECODE not in", values, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeBetween(String value1, String value2) {
            addCriterion("NODECODE between", value1, value2, "nodecode");
            return (Criteria) this;
        }

        public Criteria andNodecodeNotBetween(String value1, String value2) {
            addCriterion("NODECODE not between", value1, value2, "nodecode");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("BEGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("BEGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Date value) {
            addCriterion("BEGINDATE =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Date value) {
            addCriterion("BEGINDATE <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Date value) {
            addCriterion("BEGINDATE >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGINDATE >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Date value) {
            addCriterion("BEGINDATE <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Date value) {
            addCriterion("BEGINDATE <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Date> values) {
            addCriterion("BEGINDATE in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Date> values) {
            addCriterion("BEGINDATE not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Date value1, Date value2) {
            addCriterion("BEGINDATE between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Date value1, Date value2) {
            addCriterion("BEGINDATE not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andIcd10IsNull() {
            addCriterion("ICD10 is null");
            return (Criteria) this;
        }

        public Criteria andIcd10IsNotNull() {
            addCriterion("ICD10 is not null");
            return (Criteria) this;
        }

        public Criteria andIcd10EqualTo(String value) {
            addCriterion("ICD10 =", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotEqualTo(String value) {
            addCriterion("ICD10 <>", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10GreaterThan(String value) {
            addCriterion("ICD10 >", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10GreaterThanOrEqualTo(String value) {
            addCriterion("ICD10 >=", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10LessThan(String value) {
            addCriterion("ICD10 <", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10LessThanOrEqualTo(String value) {
            addCriterion("ICD10 <=", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10Like(String value) {
            addCriterion("ICD10 like", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotLike(String value) {
            addCriterion("ICD10 not like", value, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10In(List<String> values) {
            addCriterion("ICD10 in", values, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotIn(List<String> values) {
            addCriterion("ICD10 not in", values, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10Between(String value1, String value2) {
            addCriterion("ICD10 between", value1, value2, "icd10");
            return (Criteria) this;
        }

        public Criteria andIcd10NotBetween(String value1, String value2) {
            addCriterion("ICD10 not between", value1, value2, "icd10");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}