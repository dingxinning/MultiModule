package test_pojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasUserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobNoIsNull() {
            addCriterion("JOB_NO is null");
            return (Criteria) this;
        }

        public Criteria andJobNoIsNotNull() {
            addCriterion("JOB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andJobNoEqualTo(String value) {
            addCriterion("JOB_NO =", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoNotEqualTo(String value) {
            addCriterion("JOB_NO <>", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoGreaterThan(String value) {
            addCriterion("JOB_NO >", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_NO >=", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoLessThan(String value) {
            addCriterion("JOB_NO <", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoLessThanOrEqualTo(String value) {
            addCriterion("JOB_NO <=", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoLike(String value) {
            addCriterion("JOB_NO like", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoNotLike(String value) {
            addCriterion("JOB_NO not like", value, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoIn(List<String> values) {
            addCriterion("JOB_NO in", values, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoNotIn(List<String> values) {
            addCriterion("JOB_NO not in", values, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoBetween(String value1, String value2) {
            addCriterion("JOB_NO between", value1, value2, "jobNo");
            return (Criteria) this;
        }

        public Criteria andJobNoNotBetween(String value1, String value2) {
            addCriterion("JOB_NO not between", value1, value2, "jobNo");
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

        public Criteria andUserKeyIsNull() {
            addCriterion("USER_KEY is null");
            return (Criteria) this;
        }

        public Criteria andUserKeyIsNotNull() {
            addCriterion("USER_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andUserKeyEqualTo(String value) {
            addCriterion("USER_KEY =", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotEqualTo(String value) {
            addCriterion("USER_KEY <>", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThan(String value) {
            addCriterion("USER_KEY >", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyGreaterThanOrEqualTo(String value) {
            addCriterion("USER_KEY >=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThan(String value) {
            addCriterion("USER_KEY <", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLessThanOrEqualTo(String value) {
            addCriterion("USER_KEY <=", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyLike(String value) {
            addCriterion("USER_KEY like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotLike(String value) {
            addCriterion("USER_KEY not like", value, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyIn(List<String> values) {
            addCriterion("USER_KEY in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotIn(List<String> values) {
            addCriterion("USER_KEY not in", values, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyBetween(String value1, String value2) {
            addCriterion("USER_KEY between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andUserKeyNotBetween(String value1, String value2) {
            addCriterion("USER_KEY not between", value1, value2, "userKey");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("BIRTHDATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("BIRTHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(Date value) {
            addCriterion("BIRTHDATE =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(Date value) {
            addCriterion("BIRTHDATE <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(Date value) {
            addCriterion("BIRTHDATE >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDATE >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(Date value) {
            addCriterion("BIRTHDATE <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDATE <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<Date> values) {
            addCriterion("BIRTHDATE in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<Date> values) {
            addCriterion("BIRTHDATE not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(Date value1, Date value2) {
            addCriterion("BIRTHDATE between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDATE not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileIsNull() {
            addCriterion("SHORT_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andShortMobileIsNotNull() {
            addCriterion("SHORT_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andShortMobileEqualTo(String value) {
            addCriterion("SHORT_MOBILE =", value, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileNotEqualTo(String value) {
            addCriterion("SHORT_MOBILE <>", value, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileGreaterThan(String value) {
            addCriterion("SHORT_MOBILE >", value, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_MOBILE >=", value, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileLessThan(String value) {
            addCriterion("SHORT_MOBILE <", value, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileLessThanOrEqualTo(String value) {
            addCriterion("SHORT_MOBILE <=", value, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileLike(String value) {
            addCriterion("SHORT_MOBILE like", value, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileNotLike(String value) {
            addCriterion("SHORT_MOBILE not like", value, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileIn(List<String> values) {
            addCriterion("SHORT_MOBILE in", values, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileNotIn(List<String> values) {
            addCriterion("SHORT_MOBILE not in", values, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileBetween(String value1, String value2) {
            addCriterion("SHORT_MOBILE between", value1, value2, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andShortMobileNotBetween(String value1, String value2) {
            addCriterion("SHORT_MOBILE not between", value1, value2, "shortMobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andIndexNoIsNull() {
            addCriterion("INDEX_NO is null");
            return (Criteria) this;
        }

        public Criteria andIndexNoIsNotNull() {
            addCriterion("INDEX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNoEqualTo(Short value) {
            addCriterion("INDEX_NO =", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoNotEqualTo(Short value) {
            addCriterion("INDEX_NO <>", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoGreaterThan(Short value) {
            addCriterion("INDEX_NO >", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoGreaterThanOrEqualTo(Short value) {
            addCriterion("INDEX_NO >=", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoLessThan(Short value) {
            addCriterion("INDEX_NO <", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoLessThanOrEqualTo(Short value) {
            addCriterion("INDEX_NO <=", value, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoIn(List<Short> values) {
            addCriterion("INDEX_NO in", values, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoNotIn(List<Short> values) {
            addCriterion("INDEX_NO not in", values, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoBetween(Short value1, Short value2) {
            addCriterion("INDEX_NO between", value1, value2, "indexNo");
            return (Criteria) this;
        }

        public Criteria andIndexNoNotBetween(Short value1, Short value2) {
            addCriterion("INDEX_NO not between", value1, value2, "indexNo");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("REG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("REG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("REG_DATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("REG_DATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("REG_DATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_DATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("REG_DATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("REG_DATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("REG_DATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("REG_DATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("REG_DATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("REG_DATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andStopSignIsNull() {
            addCriterion("STOP_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andStopSignIsNotNull() {
            addCriterion("STOP_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andStopSignEqualTo(String value) {
            addCriterion("STOP_SIGN =", value, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignNotEqualTo(String value) {
            addCriterion("STOP_SIGN <>", value, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignGreaterThan(String value) {
            addCriterion("STOP_SIGN >", value, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignGreaterThanOrEqualTo(String value) {
            addCriterion("STOP_SIGN >=", value, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignLessThan(String value) {
            addCriterion("STOP_SIGN <", value, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignLessThanOrEqualTo(String value) {
            addCriterion("STOP_SIGN <=", value, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignLike(String value) {
            addCriterion("STOP_SIGN like", value, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignNotLike(String value) {
            addCriterion("STOP_SIGN not like", value, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignIn(List<String> values) {
            addCriterion("STOP_SIGN in", values, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignNotIn(List<String> values) {
            addCriterion("STOP_SIGN not in", values, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignBetween(String value1, String value2) {
            addCriterion("STOP_SIGN between", value1, value2, "stopSign");
            return (Criteria) this;
        }

        public Criteria andStopSignNotBetween(String value1, String value2) {
            addCriterion("STOP_SIGN not between", value1, value2, "stopSign");
            return (Criteria) this;
        }

        public Criteria andDelSignIsNull() {
            addCriterion("DEL_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andDelSignIsNotNull() {
            addCriterion("DEL_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andDelSignEqualTo(String value) {
            addCriterion("DEL_SIGN =", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignNotEqualTo(String value) {
            addCriterion("DEL_SIGN <>", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignGreaterThan(String value) {
            addCriterion("DEL_SIGN >", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignGreaterThanOrEqualTo(String value) {
            addCriterion("DEL_SIGN >=", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignLessThan(String value) {
            addCriterion("DEL_SIGN <", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignLessThanOrEqualTo(String value) {
            addCriterion("DEL_SIGN <=", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignLike(String value) {
            addCriterion("DEL_SIGN like", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignNotLike(String value) {
            addCriterion("DEL_SIGN not like", value, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignIn(List<String> values) {
            addCriterion("DEL_SIGN in", values, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignNotIn(List<String> values) {
            addCriterion("DEL_SIGN not in", values, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignBetween(String value1, String value2) {
            addCriterion("DEL_SIGN between", value1, value2, "delSign");
            return (Criteria) this;
        }

        public Criteria andDelSignNotBetween(String value1, String value2) {
            addCriterion("DEL_SIGN not between", value1, value2, "delSign");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andInputCpyIsNull() {
            addCriterion("INPUT_CPY is null");
            return (Criteria) this;
        }

        public Criteria andInputCpyIsNotNull() {
            addCriterion("INPUT_CPY is not null");
            return (Criteria) this;
        }

        public Criteria andInputCpyEqualTo(String value) {
            addCriterion("INPUT_CPY =", value, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyNotEqualTo(String value) {
            addCriterion("INPUT_CPY <>", value, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyGreaterThan(String value) {
            addCriterion("INPUT_CPY >", value, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_CPY >=", value, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyLessThan(String value) {
            addCriterion("INPUT_CPY <", value, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyLessThanOrEqualTo(String value) {
            addCriterion("INPUT_CPY <=", value, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyLike(String value) {
            addCriterion("INPUT_CPY like", value, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyNotLike(String value) {
            addCriterion("INPUT_CPY not like", value, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyIn(List<String> values) {
            addCriterion("INPUT_CPY in", values, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyNotIn(List<String> values) {
            addCriterion("INPUT_CPY not in", values, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyBetween(String value1, String value2) {
            addCriterion("INPUT_CPY between", value1, value2, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCpyNotBetween(String value1, String value2) {
            addCriterion("INPUT_CPY not between", value1, value2, "inputCpy");
            return (Criteria) this;
        }

        public Criteria andInputCwbIsNull() {
            addCriterion("INPUT_CWB is null");
            return (Criteria) this;
        }

        public Criteria andInputCwbIsNotNull() {
            addCriterion("INPUT_CWB is not null");
            return (Criteria) this;
        }

        public Criteria andInputCwbEqualTo(String value) {
            addCriterion("INPUT_CWB =", value, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbNotEqualTo(String value) {
            addCriterion("INPUT_CWB <>", value, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbGreaterThan(String value) {
            addCriterion("INPUT_CWB >", value, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_CWB >=", value, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbLessThan(String value) {
            addCriterion("INPUT_CWB <", value, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbLessThanOrEqualTo(String value) {
            addCriterion("INPUT_CWB <=", value, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbLike(String value) {
            addCriterion("INPUT_CWB like", value, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbNotLike(String value) {
            addCriterion("INPUT_CWB not like", value, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbIn(List<String> values) {
            addCriterion("INPUT_CWB in", values, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbNotIn(List<String> values) {
            addCriterion("INPUT_CWB not in", values, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbBetween(String value1, String value2) {
            addCriterion("INPUT_CWB between", value1, value2, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCwbNotBetween(String value1, String value2) {
            addCriterion("INPUT_CWB not between", value1, value2, "inputCwb");
            return (Criteria) this;
        }

        public Criteria andInputCustomIsNull() {
            addCriterion("INPUT_CUSTOM is null");
            return (Criteria) this;
        }

        public Criteria andInputCustomIsNotNull() {
            addCriterion("INPUT_CUSTOM is not null");
            return (Criteria) this;
        }

        public Criteria andInputCustomEqualTo(String value) {
            addCriterion("INPUT_CUSTOM =", value, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomNotEqualTo(String value) {
            addCriterion("INPUT_CUSTOM <>", value, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomGreaterThan(String value) {
            addCriterion("INPUT_CUSTOM >", value, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_CUSTOM >=", value, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomLessThan(String value) {
            addCriterion("INPUT_CUSTOM <", value, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomLessThanOrEqualTo(String value) {
            addCriterion("INPUT_CUSTOM <=", value, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomLike(String value) {
            addCriterion("INPUT_CUSTOM like", value, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomNotLike(String value) {
            addCriterion("INPUT_CUSTOM not like", value, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomIn(List<String> values) {
            addCriterion("INPUT_CUSTOM in", values, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomNotIn(List<String> values) {
            addCriterion("INPUT_CUSTOM not in", values, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomBetween(String value1, String value2) {
            addCriterion("INPUT_CUSTOM between", value1, value2, "inputCustom");
            return (Criteria) this;
        }

        public Criteria andInputCustomNotBetween(String value1, String value2) {
            addCriterion("INPUT_CUSTOM not between", value1, value2, "inputCustom");
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

        public Criteria andPersonDeptIsNull() {
            addCriterion("PERSON_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andPersonDeptIsNotNull() {
            addCriterion("PERSON_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPersonDeptEqualTo(String value) {
            addCriterion("PERSON_DEPT =", value, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptNotEqualTo(String value) {
            addCriterion("PERSON_DEPT <>", value, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptGreaterThan(String value) {
            addCriterion("PERSON_DEPT >", value, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_DEPT >=", value, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptLessThan(String value) {
            addCriterion("PERSON_DEPT <", value, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptLessThanOrEqualTo(String value) {
            addCriterion("PERSON_DEPT <=", value, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptLike(String value) {
            addCriterion("PERSON_DEPT like", value, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptNotLike(String value) {
            addCriterion("PERSON_DEPT not like", value, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptIn(List<String> values) {
            addCriterion("PERSON_DEPT in", values, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptNotIn(List<String> values) {
            addCriterion("PERSON_DEPT not in", values, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptBetween(String value1, String value2) {
            addCriterion("PERSON_DEPT between", value1, value2, "personDept");
            return (Criteria) this;
        }

        public Criteria andPersonDeptNotBetween(String value1, String value2) {
            addCriterion("PERSON_DEPT not between", value1, value2, "personDept");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyIsNull() {
            addCriterion("EHRUSER_KEY is null");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyIsNotNull() {
            addCriterion("EHRUSER_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyEqualTo(String value) {
            addCriterion("EHRUSER_KEY =", value, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyNotEqualTo(String value) {
            addCriterion("EHRUSER_KEY <>", value, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyGreaterThan(String value) {
            addCriterion("EHRUSER_KEY >", value, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyGreaterThanOrEqualTo(String value) {
            addCriterion("EHRUSER_KEY >=", value, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyLessThan(String value) {
            addCriterion("EHRUSER_KEY <", value, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyLessThanOrEqualTo(String value) {
            addCriterion("EHRUSER_KEY <=", value, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyLike(String value) {
            addCriterion("EHRUSER_KEY like", value, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyNotLike(String value) {
            addCriterion("EHRUSER_KEY not like", value, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyIn(List<String> values) {
            addCriterion("EHRUSER_KEY in", values, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyNotIn(List<String> values) {
            addCriterion("EHRUSER_KEY not in", values, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyBetween(String value1, String value2) {
            addCriterion("EHRUSER_KEY between", value1, value2, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhruserKeyNotBetween(String value1, String value2) {
            addCriterion("EHRUSER_KEY not between", value1, value2, "ehruserKey");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordIsNull() {
            addCriterion("EHRPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordIsNotNull() {
            addCriterion("EHRPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordEqualTo(String value) {
            addCriterion("EHRPASSWORD =", value, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordNotEqualTo(String value) {
            addCriterion("EHRPASSWORD <>", value, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordGreaterThan(String value) {
            addCriterion("EHRPASSWORD >", value, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("EHRPASSWORD >=", value, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordLessThan(String value) {
            addCriterion("EHRPASSWORD <", value, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordLessThanOrEqualTo(String value) {
            addCriterion("EHRPASSWORD <=", value, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordLike(String value) {
            addCriterion("EHRPASSWORD like", value, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordNotLike(String value) {
            addCriterion("EHRPASSWORD not like", value, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordIn(List<String> values) {
            addCriterion("EHRPASSWORD in", values, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordNotIn(List<String> values) {
            addCriterion("EHRPASSWORD not in", values, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordBetween(String value1, String value2) {
            addCriterion("EHRPASSWORD between", value1, value2, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrpasswordNotBetween(String value1, String value2) {
            addCriterion("EHRPASSWORD not between", value1, value2, "ehrpassword");
            return (Criteria) this;
        }

        public Criteria andEhrroleIsNull() {
            addCriterion("EHRROLE is null");
            return (Criteria) this;
        }

        public Criteria andEhrroleIsNotNull() {
            addCriterion("EHRROLE is not null");
            return (Criteria) this;
        }

        public Criteria andEhrroleEqualTo(String value) {
            addCriterion("EHRROLE =", value, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleNotEqualTo(String value) {
            addCriterion("EHRROLE <>", value, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleGreaterThan(String value) {
            addCriterion("EHRROLE >", value, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleGreaterThanOrEqualTo(String value) {
            addCriterion("EHRROLE >=", value, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleLessThan(String value) {
            addCriterion("EHRROLE <", value, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleLessThanOrEqualTo(String value) {
            addCriterion("EHRROLE <=", value, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleLike(String value) {
            addCriterion("EHRROLE like", value, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleNotLike(String value) {
            addCriterion("EHRROLE not like", value, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleIn(List<String> values) {
            addCriterion("EHRROLE in", values, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleNotIn(List<String> values) {
            addCriterion("EHRROLE not in", values, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleBetween(String value1, String value2) {
            addCriterion("EHRROLE between", value1, value2, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andEhrroleNotBetween(String value1, String value2) {
            addCriterion("EHRROLE not between", value1, value2, "ehrrole");
            return (Criteria) this;
        }

        public Criteria andClcpowerIsNull() {
            addCriterion("CLCPOWER is null");
            return (Criteria) this;
        }

        public Criteria andClcpowerIsNotNull() {
            addCriterion("CLCPOWER is not null");
            return (Criteria) this;
        }

        public Criteria andClcpowerEqualTo(String value) {
            addCriterion("CLCPOWER =", value, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerNotEqualTo(String value) {
            addCriterion("CLCPOWER <>", value, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerGreaterThan(String value) {
            addCriterion("CLCPOWER >", value, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerGreaterThanOrEqualTo(String value) {
            addCriterion("CLCPOWER >=", value, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerLessThan(String value) {
            addCriterion("CLCPOWER <", value, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerLessThanOrEqualTo(String value) {
            addCriterion("CLCPOWER <=", value, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerLike(String value) {
            addCriterion("CLCPOWER like", value, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerNotLike(String value) {
            addCriterion("CLCPOWER not like", value, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerIn(List<String> values) {
            addCriterion("CLCPOWER in", values, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerNotIn(List<String> values) {
            addCriterion("CLCPOWER not in", values, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerBetween(String value1, String value2) {
            addCriterion("CLCPOWER between", value1, value2, "clcpower");
            return (Criteria) this;
        }

        public Criteria andClcpowerNotBetween(String value1, String value2) {
            addCriterion("CLCPOWER not between", value1, value2, "clcpower");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNull() {
            addCriterion("ISONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsonlineIsNotNull() {
            addCriterion("ISONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlineEqualTo(String value) {
            addCriterion("ISONLINE =", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotEqualTo(String value) {
            addCriterion("ISONLINE <>", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThan(String value) {
            addCriterion("ISONLINE >", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineGreaterThanOrEqualTo(String value) {
            addCriterion("ISONLINE >=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThan(String value) {
            addCriterion("ISONLINE <", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLessThanOrEqualTo(String value) {
            addCriterion("ISONLINE <=", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineLike(String value) {
            addCriterion("ISONLINE like", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotLike(String value) {
            addCriterion("ISONLINE not like", value, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineIn(List<String> values) {
            addCriterion("ISONLINE in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotIn(List<String> values) {
            addCriterion("ISONLINE not in", values, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineBetween(String value1, String value2) {
            addCriterion("ISONLINE between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andIsonlineNotBetween(String value1, String value2) {
            addCriterion("ISONLINE not between", value1, value2, "isonline");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillIsNull() {
            addCriterion("SPECIAL_SKILL is null");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillIsNotNull() {
            addCriterion("SPECIAL_SKILL is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillEqualTo(String value) {
            addCriterion("SPECIAL_SKILL =", value, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillNotEqualTo(String value) {
            addCriterion("SPECIAL_SKILL <>", value, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillGreaterThan(String value) {
            addCriterion("SPECIAL_SKILL >", value, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIAL_SKILL >=", value, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillLessThan(String value) {
            addCriterion("SPECIAL_SKILL <", value, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillLessThanOrEqualTo(String value) {
            addCriterion("SPECIAL_SKILL <=", value, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillLike(String value) {
            addCriterion("SPECIAL_SKILL like", value, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillNotLike(String value) {
            addCriterion("SPECIAL_SKILL not like", value, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillIn(List<String> values) {
            addCriterion("SPECIAL_SKILL in", values, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillNotIn(List<String> values) {
            addCriterion("SPECIAL_SKILL not in", values, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillBetween(String value1, String value2) {
            addCriterion("SPECIAL_SKILL between", value1, value2, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andSpecialSkillNotBetween(String value1, String value2) {
            addCriterion("SPECIAL_SKILL not between", value1, value2, "specialSkill");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("IMAGE =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("IMAGE <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("IMAGE >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("IMAGE <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("IMAGE <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("IMAGE like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("IMAGE not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("IMAGE in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("IMAGE not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("IMAGE between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("IMAGE not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andInsNameIsNull() {
            addCriterion("INS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInsNameIsNotNull() {
            addCriterion("INS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsNameEqualTo(String value) {
            addCriterion("INS_NAME =", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotEqualTo(String value) {
            addCriterion("INS_NAME <>", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameGreaterThan(String value) {
            addCriterion("INS_NAME >", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameGreaterThanOrEqualTo(String value) {
            addCriterion("INS_NAME >=", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLessThan(String value) {
            addCriterion("INS_NAME <", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLessThanOrEqualTo(String value) {
            addCriterion("INS_NAME <=", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameLike(String value) {
            addCriterion("INS_NAME like", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotLike(String value) {
            addCriterion("INS_NAME not like", value, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameIn(List<String> values) {
            addCriterion("INS_NAME in", values, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotIn(List<String> values) {
            addCriterion("INS_NAME not in", values, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameBetween(String value1, String value2) {
            addCriterion("INS_NAME between", value1, value2, "insName");
            return (Criteria) this;
        }

        public Criteria andInsNameNotBetween(String value1, String value2) {
            addCriterion("INS_NAME not between", value1, value2, "insName");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagIsNull() {
            addCriterion("TUIFEI_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagIsNotNull() {
            addCriterion("TUIFEI_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagEqualTo(String value) {
            addCriterion("TUIFEI_FLAG =", value, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagNotEqualTo(String value) {
            addCriterion("TUIFEI_FLAG <>", value, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagGreaterThan(String value) {
            addCriterion("TUIFEI_FLAG >", value, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TUIFEI_FLAG >=", value, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagLessThan(String value) {
            addCriterion("TUIFEI_FLAG <", value, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagLessThanOrEqualTo(String value) {
            addCriterion("TUIFEI_FLAG <=", value, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagLike(String value) {
            addCriterion("TUIFEI_FLAG like", value, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagNotLike(String value) {
            addCriterion("TUIFEI_FLAG not like", value, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagIn(List<String> values) {
            addCriterion("TUIFEI_FLAG in", values, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagNotIn(List<String> values) {
            addCriterion("TUIFEI_FLAG not in", values, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagBetween(String value1, String value2) {
            addCriterion("TUIFEI_FLAG between", value1, value2, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andTuifeiFlagNotBetween(String value1, String value2) {
            addCriterion("TUIFEI_FLAG not between", value1, value2, "tuifeiFlag");
            return (Criteria) this;
        }

        public Criteria andOptsignidIsNull() {
            addCriterion("OPTSIGNID is null");
            return (Criteria) this;
        }

        public Criteria andOptsignidIsNotNull() {
            addCriterion("OPTSIGNID is not null");
            return (Criteria) this;
        }

        public Criteria andOptsignidEqualTo(String value) {
            addCriterion("OPTSIGNID =", value, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidNotEqualTo(String value) {
            addCriterion("OPTSIGNID <>", value, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidGreaterThan(String value) {
            addCriterion("OPTSIGNID >", value, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidGreaterThanOrEqualTo(String value) {
            addCriterion("OPTSIGNID >=", value, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidLessThan(String value) {
            addCriterion("OPTSIGNID <", value, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidLessThanOrEqualTo(String value) {
            addCriterion("OPTSIGNID <=", value, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidLike(String value) {
            addCriterion("OPTSIGNID like", value, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidNotLike(String value) {
            addCriterion("OPTSIGNID not like", value, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidIn(List<String> values) {
            addCriterion("OPTSIGNID in", values, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidNotIn(List<String> values) {
            addCriterion("OPTSIGNID not in", values, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidBetween(String value1, String value2) {
            addCriterion("OPTSIGNID between", value1, value2, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOptsignidNotBetween(String value1, String value2) {
            addCriterion("OPTSIGNID not between", value1, value2, "optsignid");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNull() {
            addCriterion("OPERATETIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIsNotNull() {
            addCriterion("OPERATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetimeEqualTo(Date value) {
            addCriterion("OPERATETIME =", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotEqualTo(Date value) {
            addCriterion("OPERATETIME <>", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThan(Date value) {
            addCriterion("OPERATETIME >", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATETIME >=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThan(Date value) {
            addCriterion("OPERATETIME <", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATETIME <=", value, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeIn(List<Date> values) {
            addCriterion("OPERATETIME in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotIn(List<Date> values) {
            addCriterion("OPERATETIME not in", values, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeBetween(Date value1, Date value2) {
            addCriterion("OPERATETIME between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatetimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATETIME not between", value1, value2, "operatetime");
            return (Criteria) this;
        }

        public Criteria andOperatoripIsNull() {
            addCriterion("OPERATORIP is null");
            return (Criteria) this;
        }

        public Criteria andOperatoripIsNotNull() {
            addCriterion("OPERATORIP is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoripEqualTo(String value) {
            addCriterion("OPERATORIP =", value, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripNotEqualTo(String value) {
            addCriterion("OPERATORIP <>", value, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripGreaterThan(String value) {
            addCriterion("OPERATORIP >", value, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORIP >=", value, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripLessThan(String value) {
            addCriterion("OPERATORIP <", value, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripLessThanOrEqualTo(String value) {
            addCriterion("OPERATORIP <=", value, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripLike(String value) {
            addCriterion("OPERATORIP like", value, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripNotLike(String value) {
            addCriterion("OPERATORIP not like", value, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripIn(List<String> values) {
            addCriterion("OPERATORIP in", values, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripNotIn(List<String> values) {
            addCriterion("OPERATORIP not in", values, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripBetween(String value1, String value2) {
            addCriterion("OPERATORIP between", value1, value2, "operatorip");
            return (Criteria) this;
        }

        public Criteria andOperatoripNotBetween(String value1, String value2) {
            addCriterion("OPERATORIP not between", value1, value2, "operatorip");
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