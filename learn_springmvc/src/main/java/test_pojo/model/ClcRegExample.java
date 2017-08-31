package test_pojo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClcRegExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClcRegExample() {
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

        public Criteria andRegidIsNull() {
            addCriterion("REGID is null");
            return (Criteria) this;
        }

        public Criteria andRegidIsNotNull() {
            addCriterion("REGID is not null");
            return (Criteria) this;
        }

        public Criteria andRegidEqualTo(String value) {
            addCriterion("REGID =", value, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidNotEqualTo(String value) {
            addCriterion("REGID <>", value, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidGreaterThan(String value) {
            addCriterion("REGID >", value, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidGreaterThanOrEqualTo(String value) {
            addCriterion("REGID >=", value, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidLessThan(String value) {
            addCriterion("REGID <", value, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidLessThanOrEqualTo(String value) {
            addCriterion("REGID <=", value, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidLike(String value) {
            addCriterion("REGID like", value, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidNotLike(String value) {
            addCriterion("REGID not like", value, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidIn(List<String> values) {
            addCriterion("REGID in", values, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidNotIn(List<String> values) {
            addCriterion("REGID not in", values, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidBetween(String value1, String value2) {
            addCriterion("REGID between", value1, value2, "regid");
            return (Criteria) this;
        }

        public Criteria andRegidNotBetween(String value1, String value2) {
            addCriterion("REGID not between", value1, value2, "regid");
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

        public Criteria andPatientidIsNull() {
            addCriterion("PATIENTID is null");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNotNull() {
            addCriterion("PATIENTID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientidEqualTo(String value) {
            addCriterion("PATIENTID =", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotEqualTo(String value) {
            addCriterion("PATIENTID <>", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThan(String value) {
            addCriterion("PATIENTID >", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTID >=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThan(String value) {
            addCriterion("PATIENTID <", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThanOrEqualTo(String value) {
            addCriterion("PATIENTID <=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLike(String value) {
            addCriterion("PATIENTID like", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotLike(String value) {
            addCriterion("PATIENTID not like", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidIn(List<String> values) {
            addCriterion("PATIENTID in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotIn(List<String> values) {
            addCriterion("PATIENTID not in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidBetween(String value1, String value2) {
            addCriterion("PATIENTID between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotBetween(String value1, String value2) {
            addCriterion("PATIENTID not between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andClctimesIsNull() {
            addCriterion("CLCTIMES is null");
            return (Criteria) this;
        }

        public Criteria andClctimesIsNotNull() {
            addCriterion("CLCTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andClctimesEqualTo(Integer value) {
            addCriterion("CLCTIMES =", value, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesNotEqualTo(Integer value) {
            addCriterion("CLCTIMES <>", value, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesGreaterThan(Integer value) {
            addCriterion("CLCTIMES >", value, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLCTIMES >=", value, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesLessThan(Integer value) {
            addCriterion("CLCTIMES <", value, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesLessThanOrEqualTo(Integer value) {
            addCriterion("CLCTIMES <=", value, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesIn(List<Integer> values) {
            addCriterion("CLCTIMES in", values, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesNotIn(List<Integer> values) {
            addCriterion("CLCTIMES not in", values, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesBetween(Integer value1, Integer value2) {
            addCriterion("CLCTIMES between", value1, value2, "clctimes");
            return (Criteria) this;
        }

        public Criteria andClctimesNotBetween(Integer value1, Integer value2) {
            addCriterion("CLCTIMES not between", value1, value2, "clctimes");
            return (Criteria) this;
        }

        public Criteria andInstypeIsNull() {
            addCriterion("INSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andInstypeIsNotNull() {
            addCriterion("INSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInstypeEqualTo(String value) {
            addCriterion("INSTYPE =", value, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeNotEqualTo(String value) {
            addCriterion("INSTYPE <>", value, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeGreaterThan(String value) {
            addCriterion("INSTYPE >", value, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeGreaterThanOrEqualTo(String value) {
            addCriterion("INSTYPE >=", value, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeLessThan(String value) {
            addCriterion("INSTYPE <", value, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeLessThanOrEqualTo(String value) {
            addCriterion("INSTYPE <=", value, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeLike(String value) {
            addCriterion("INSTYPE like", value, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeNotLike(String value) {
            addCriterion("INSTYPE not like", value, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeIn(List<String> values) {
            addCriterion("INSTYPE in", values, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeNotIn(List<String> values) {
            addCriterion("INSTYPE not in", values, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeBetween(String value1, String value2) {
            addCriterion("INSTYPE between", value1, value2, "instype");
            return (Criteria) this;
        }

        public Criteria andInstypeNotBetween(String value1, String value2) {
            addCriterion("INSTYPE not between", value1, value2, "instype");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(String value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(String value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(String value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(String value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLike(String value) {
            addCriterion("DISCOUNT like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotLike(String value) {
            addCriterion("DISCOUNT not like", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<String> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<String> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(String value1, String value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andSchidIsNull() {
            addCriterion("SCHID is null");
            return (Criteria) this;
        }

        public Criteria andSchidIsNotNull() {
            addCriterion("SCHID is not null");
            return (Criteria) this;
        }

        public Criteria andSchidEqualTo(String value) {
            addCriterion("SCHID =", value, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidNotEqualTo(String value) {
            addCriterion("SCHID <>", value, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidGreaterThan(String value) {
            addCriterion("SCHID >", value, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidGreaterThanOrEqualTo(String value) {
            addCriterion("SCHID >=", value, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidLessThan(String value) {
            addCriterion("SCHID <", value, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidLessThanOrEqualTo(String value) {
            addCriterion("SCHID <=", value, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidLike(String value) {
            addCriterion("SCHID like", value, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidNotLike(String value) {
            addCriterion("SCHID not like", value, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidIn(List<String> values) {
            addCriterion("SCHID in", values, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidNotIn(List<String> values) {
            addCriterion("SCHID not in", values, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidBetween(String value1, String value2) {
            addCriterion("SCHID between", value1, value2, "schid");
            return (Criteria) this;
        }

        public Criteria andSchidNotBetween(String value1, String value2) {
            addCriterion("SCHID not between", value1, value2, "schid");
            return (Criteria) this;
        }

        public Criteria andDateregIsNull() {
            addCriterion("DATEREG is null");
            return (Criteria) this;
        }

        public Criteria andDateregIsNotNull() {
            addCriterion("DATEREG is not null");
            return (Criteria) this;
        }

        public Criteria andDateregEqualTo(Date value) {
            addCriterion("DATEREG =", value, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregNotEqualTo(Date value) {
            addCriterion("DATEREG <>", value, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregGreaterThan(Date value) {
            addCriterion("DATEREG >", value, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregGreaterThanOrEqualTo(Date value) {
            addCriterion("DATEREG >=", value, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregLessThan(Date value) {
            addCriterion("DATEREG <", value, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregLessThanOrEqualTo(Date value) {
            addCriterion("DATEREG <=", value, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregIn(List<Date> values) {
            addCriterion("DATEREG in", values, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregNotIn(List<Date> values) {
            addCriterion("DATEREG not in", values, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregBetween(Date value1, Date value2) {
            addCriterion("DATEREG between", value1, value2, "datereg");
            return (Criteria) this;
        }

        public Criteria andDateregNotBetween(Date value1, Date value2) {
            addCriterion("DATEREG not between", value1, value2, "datereg");
            return (Criteria) this;
        }

        public Criteria andRegnoIsNull() {
            addCriterion("REGNO is null");
            return (Criteria) this;
        }

        public Criteria andRegnoIsNotNull() {
            addCriterion("REGNO is not null");
            return (Criteria) this;
        }

        public Criteria andRegnoEqualTo(Integer value) {
            addCriterion("REGNO =", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotEqualTo(Integer value) {
            addCriterion("REGNO <>", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoGreaterThan(Integer value) {
            addCriterion("REGNO >", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGNO >=", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoLessThan(Integer value) {
            addCriterion("REGNO <", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoLessThanOrEqualTo(Integer value) {
            addCriterion("REGNO <=", value, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoIn(List<Integer> values) {
            addCriterion("REGNO in", values, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotIn(List<Integer> values) {
            addCriterion("REGNO not in", values, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoBetween(Integer value1, Integer value2) {
            addCriterion("REGNO between", value1, value2, "regno");
            return (Criteria) this;
        }

        public Criteria andRegnoNotBetween(Integer value1, Integer value2) {
            addCriterion("REGNO not between", value1, value2, "regno");
            return (Criteria) this;
        }

        public Criteria andClcdateIsNull() {
            addCriterion("CLCDATE is null");
            return (Criteria) this;
        }

        public Criteria andClcdateIsNotNull() {
            addCriterion("CLCDATE is not null");
            return (Criteria) this;
        }

        public Criteria andClcdateEqualTo(Date value) {
            addCriterion("CLCDATE =", value, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateNotEqualTo(Date value) {
            addCriterion("CLCDATE <>", value, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateGreaterThan(Date value) {
            addCriterion("CLCDATE >", value, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLCDATE >=", value, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateLessThan(Date value) {
            addCriterion("CLCDATE <", value, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateLessThanOrEqualTo(Date value) {
            addCriterion("CLCDATE <=", value, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateIn(List<Date> values) {
            addCriterion("CLCDATE in", values, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateNotIn(List<Date> values) {
            addCriterion("CLCDATE not in", values, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateBetween(Date value1, Date value2) {
            addCriterion("CLCDATE between", value1, value2, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClcdateNotBetween(Date value1, Date value2) {
            addCriterion("CLCDATE not between", value1, value2, "clcdate");
            return (Criteria) this;
        }

        public Criteria andClctimeIsNull() {
            addCriterion("CLCTIME is null");
            return (Criteria) this;
        }

        public Criteria andClctimeIsNotNull() {
            addCriterion("CLCTIME is not null");
            return (Criteria) this;
        }

        public Criteria andClctimeEqualTo(String value) {
            addCriterion("CLCTIME =", value, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeNotEqualTo(String value) {
            addCriterion("CLCTIME <>", value, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeGreaterThan(String value) {
            addCriterion("CLCTIME >", value, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeGreaterThanOrEqualTo(String value) {
            addCriterion("CLCTIME >=", value, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeLessThan(String value) {
            addCriterion("CLCTIME <", value, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeLessThanOrEqualTo(String value) {
            addCriterion("CLCTIME <=", value, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeLike(String value) {
            addCriterion("CLCTIME like", value, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeNotLike(String value) {
            addCriterion("CLCTIME not like", value, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeIn(List<String> values) {
            addCriterion("CLCTIME in", values, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeNotIn(List<String> values) {
            addCriterion("CLCTIME not in", values, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeBetween(String value1, String value2) {
            addCriterion("CLCTIME between", value1, value2, "clctime");
            return (Criteria) this;
        }

        public Criteria andClctimeNotBetween(String value1, String value2) {
            addCriterion("CLCTIME not between", value1, value2, "clctime");
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

        public Criteria andOperatornameIsNull() {
            addCriterion("OPERATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("OPERATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("OPERATORNAME =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("OPERATORNAME <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("OPERATORNAME >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("OPERATORNAME <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("OPERATORNAME <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("OPERATORNAME like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("OPERATORNAME not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("OPERATORNAME in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("OPERATORNAME not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("OPERATORNAME between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("OPERATORNAME not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andFreeregIsNull() {
            addCriterion("FREEREG is null");
            return (Criteria) this;
        }

        public Criteria andFreeregIsNotNull() {
            addCriterion("FREEREG is not null");
            return (Criteria) this;
        }

        public Criteria andFreeregEqualTo(String value) {
            addCriterion("FREEREG =", value, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregNotEqualTo(String value) {
            addCriterion("FREEREG <>", value, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregGreaterThan(String value) {
            addCriterion("FREEREG >", value, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregGreaterThanOrEqualTo(String value) {
            addCriterion("FREEREG >=", value, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregLessThan(String value) {
            addCriterion("FREEREG <", value, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregLessThanOrEqualTo(String value) {
            addCriterion("FREEREG <=", value, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregLike(String value) {
            addCriterion("FREEREG like", value, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregNotLike(String value) {
            addCriterion("FREEREG not like", value, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregIn(List<String> values) {
            addCriterion("FREEREG in", values, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregNotIn(List<String> values) {
            addCriterion("FREEREG not in", values, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregBetween(String value1, String value2) {
            addCriterion("FREEREG between", value1, value2, "freereg");
            return (Criteria) this;
        }

        public Criteria andFreeregNotBetween(String value1, String value2) {
            addCriterion("FREEREG not between", value1, value2, "freereg");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNull() {
            addCriterion("INVOICEID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIsNotNull() {
            addCriterion("INVOICEID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceidEqualTo(String value) {
            addCriterion("INVOICEID =", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotEqualTo(String value) {
            addCriterion("INVOICEID <>", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThan(String value) {
            addCriterion("INVOICEID >", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICEID >=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThan(String value) {
            addCriterion("INVOICEID <", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLessThanOrEqualTo(String value) {
            addCriterion("INVOICEID <=", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidLike(String value) {
            addCriterion("INVOICEID like", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotLike(String value) {
            addCriterion("INVOICEID not like", value, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidIn(List<String> values) {
            addCriterion("INVOICEID in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotIn(List<String> values) {
            addCriterion("INVOICEID not in", values, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidBetween(String value1, String value2) {
            addCriterion("INVOICEID between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andInvoiceidNotBetween(String value1, String value2) {
            addCriterion("INVOICEID not between", value1, value2, "invoiceid");
            return (Criteria) this;
        }

        public Criteria andRefundIsNull() {
            addCriterion("REFUND is null");
            return (Criteria) this;
        }

        public Criteria andRefundIsNotNull() {
            addCriterion("REFUND is not null");
            return (Criteria) this;
        }

        public Criteria andRefundEqualTo(String value) {
            addCriterion("REFUND =", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotEqualTo(String value) {
            addCriterion("REFUND <>", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThan(String value) {
            addCriterion("REFUND >", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThanOrEqualTo(String value) {
            addCriterion("REFUND >=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThan(String value) {
            addCriterion("REFUND <", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThanOrEqualTo(String value) {
            addCriterion("REFUND <=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLike(String value) {
            addCriterion("REFUND like", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotLike(String value) {
            addCriterion("REFUND not like", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundIn(List<String> values) {
            addCriterion("REFUND in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotIn(List<String> values) {
            addCriterion("REFUND not in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundBetween(String value1, String value2) {
            addCriterion("REFUND between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotBetween(String value1, String value2) {
            addCriterion("REFUND not between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNull() {
            addCriterion("RELATIONID is null");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNotNull() {
            addCriterion("RELATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationidEqualTo(String value) {
            addCriterion("RELATIONID =", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotEqualTo(String value) {
            addCriterion("RELATIONID <>", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThan(String value) {
            addCriterion("RELATIONID >", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIONID >=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThan(String value) {
            addCriterion("RELATIONID <", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThanOrEqualTo(String value) {
            addCriterion("RELATIONID <=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLike(String value) {
            addCriterion("RELATIONID like", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotLike(String value) {
            addCriterion("RELATIONID not like", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidIn(List<String> values) {
            addCriterion("RELATIONID in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotIn(List<String> values) {
            addCriterion("RELATIONID not in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidBetween(String value1, String value2) {
            addCriterion("RELATIONID between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotBetween(String value1, String value2) {
            addCriterion("RELATIONID not between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNull() {
            addCriterion("ACCOUNTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNotNull() {
            addCriterion("ACCOUNTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeEqualTo(String value) {
            addCriterion("ACCOUNTTYPE =", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotEqualTo(String value) {
            addCriterion("ACCOUNTTYPE <>", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThan(String value) {
            addCriterion("ACCOUNTTYPE >", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTTYPE >=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThan(String value) {
            addCriterion("ACCOUNTTYPE <", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTTYPE <=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLike(String value) {
            addCriterion("ACCOUNTTYPE like", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotLike(String value) {
            addCriterion("ACCOUNTTYPE not like", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIn(List<String> values) {
            addCriterion("ACCOUNTTYPE in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotIn(List<String> values) {
            addCriterion("ACCOUNTTYPE not in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeBetween(String value1, String value2) {
            addCriterion("ACCOUNTTYPE between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTTYPE not between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountdiagIsNull() {
            addCriterion("ACCOUNTDIAG is null");
            return (Criteria) this;
        }

        public Criteria andAccountdiagIsNotNull() {
            addCriterion("ACCOUNTDIAG is not null");
            return (Criteria) this;
        }

        public Criteria andAccountdiagEqualTo(String value) {
            addCriterion("ACCOUNTDIAG =", value, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagNotEqualTo(String value) {
            addCriterion("ACCOUNTDIAG <>", value, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagGreaterThan(String value) {
            addCriterion("ACCOUNTDIAG >", value, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTDIAG >=", value, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagLessThan(String value) {
            addCriterion("ACCOUNTDIAG <", value, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTDIAG <=", value, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagLike(String value) {
            addCriterion("ACCOUNTDIAG like", value, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagNotLike(String value) {
            addCriterion("ACCOUNTDIAG not like", value, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagIn(List<String> values) {
            addCriterion("ACCOUNTDIAG in", values, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagNotIn(List<String> values) {
            addCriterion("ACCOUNTDIAG not in", values, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagBetween(String value1, String value2) {
            addCriterion("ACCOUNTDIAG between", value1, value2, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountdiagNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTDIAG not between", value1, value2, "accountdiag");
            return (Criteria) this;
        }

        public Criteria andAccountunitIsNull() {
            addCriterion("ACCOUNTUNIT is null");
            return (Criteria) this;
        }

        public Criteria andAccountunitIsNotNull() {
            addCriterion("ACCOUNTUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountunitEqualTo(String value) {
            addCriterion("ACCOUNTUNIT =", value, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitNotEqualTo(String value) {
            addCriterion("ACCOUNTUNIT <>", value, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitGreaterThan(String value) {
            addCriterion("ACCOUNTUNIT >", value, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTUNIT >=", value, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitLessThan(String value) {
            addCriterion("ACCOUNTUNIT <", value, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTUNIT <=", value, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitLike(String value) {
            addCriterion("ACCOUNTUNIT like", value, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitNotLike(String value) {
            addCriterion("ACCOUNTUNIT not like", value, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitIn(List<String> values) {
            addCriterion("ACCOUNTUNIT in", values, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitNotIn(List<String> values) {
            addCriterion("ACCOUNTUNIT not in", values, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitBetween(String value1, String value2) {
            addCriterion("ACCOUNTUNIT between", value1, value2, "accountunit");
            return (Criteria) this;
        }

        public Criteria andAccountunitNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTUNIT not between", value1, value2, "accountunit");
            return (Criteria) this;
        }

        public Criteria andRegageIsNull() {
            addCriterion("REGAGE is null");
            return (Criteria) this;
        }

        public Criteria andRegageIsNotNull() {
            addCriterion("REGAGE is not null");
            return (Criteria) this;
        }

        public Criteria andRegageEqualTo(String value) {
            addCriterion("REGAGE =", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageNotEqualTo(String value) {
            addCriterion("REGAGE <>", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageGreaterThan(String value) {
            addCriterion("REGAGE >", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageGreaterThanOrEqualTo(String value) {
            addCriterion("REGAGE >=", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageLessThan(String value) {
            addCriterion("REGAGE <", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageLessThanOrEqualTo(String value) {
            addCriterion("REGAGE <=", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageLike(String value) {
            addCriterion("REGAGE like", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageNotLike(String value) {
            addCriterion("REGAGE not like", value, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageIn(List<String> values) {
            addCriterion("REGAGE in", values, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageNotIn(List<String> values) {
            addCriterion("REGAGE not in", values, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageBetween(String value1, String value2) {
            addCriterion("REGAGE between", value1, value2, "regage");
            return (Criteria) this;
        }

        public Criteria andRegageNotBetween(String value1, String value2) {
            addCriterion("REGAGE not between", value1, value2, "regage");
            return (Criteria) this;
        }

        public Criteria andRegsexIsNull() {
            addCriterion("REGSEX is null");
            return (Criteria) this;
        }

        public Criteria andRegsexIsNotNull() {
            addCriterion("REGSEX is not null");
            return (Criteria) this;
        }

        public Criteria andRegsexEqualTo(String value) {
            addCriterion("REGSEX =", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexNotEqualTo(String value) {
            addCriterion("REGSEX <>", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexGreaterThan(String value) {
            addCriterion("REGSEX >", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexGreaterThanOrEqualTo(String value) {
            addCriterion("REGSEX >=", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexLessThan(String value) {
            addCriterion("REGSEX <", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexLessThanOrEqualTo(String value) {
            addCriterion("REGSEX <=", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexLike(String value) {
            addCriterion("REGSEX like", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexNotLike(String value) {
            addCriterion("REGSEX not like", value, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexIn(List<String> values) {
            addCriterion("REGSEX in", values, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexNotIn(List<String> values) {
            addCriterion("REGSEX not in", values, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexBetween(String value1, String value2) {
            addCriterion("REGSEX between", value1, value2, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegsexNotBetween(String value1, String value2) {
            addCriterion("REGSEX not between", value1, value2, "regsex");
            return (Criteria) this;
        }

        public Criteria andRegpatnameIsNull() {
            addCriterion("REGPATNAME is null");
            return (Criteria) this;
        }

        public Criteria andRegpatnameIsNotNull() {
            addCriterion("REGPATNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegpatnameEqualTo(String value) {
            addCriterion("REGPATNAME =", value, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameNotEqualTo(String value) {
            addCriterion("REGPATNAME <>", value, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameGreaterThan(String value) {
            addCriterion("REGPATNAME >", value, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameGreaterThanOrEqualTo(String value) {
            addCriterion("REGPATNAME >=", value, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameLessThan(String value) {
            addCriterion("REGPATNAME <", value, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameLessThanOrEqualTo(String value) {
            addCriterion("REGPATNAME <=", value, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameLike(String value) {
            addCriterion("REGPATNAME like", value, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameNotLike(String value) {
            addCriterion("REGPATNAME not like", value, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameIn(List<String> values) {
            addCriterion("REGPATNAME in", values, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameNotIn(List<String> values) {
            addCriterion("REGPATNAME not in", values, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameBetween(String value1, String value2) {
            addCriterion("REGPATNAME between", value1, value2, "regpatname");
            return (Criteria) this;
        }

        public Criteria andRegpatnameNotBetween(String value1, String value2) {
            addCriterion("REGPATNAME not between", value1, value2, "regpatname");
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

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("APPID like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("APPID not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andRefunddateIsNull() {
            addCriterion("REFUNDDATE is null");
            return (Criteria) this;
        }

        public Criteria andRefunddateIsNotNull() {
            addCriterion("REFUNDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefunddateEqualTo(Date value) {
            addCriterion("REFUNDDATE =", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotEqualTo(Date value) {
            addCriterion("REFUNDDATE <>", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateGreaterThan(Date value) {
            addCriterion("REFUNDDATE >", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateGreaterThanOrEqualTo(Date value) {
            addCriterion("REFUNDDATE >=", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateLessThan(Date value) {
            addCriterion("REFUNDDATE <", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateLessThanOrEqualTo(Date value) {
            addCriterion("REFUNDDATE <=", value, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateIn(List<Date> values) {
            addCriterion("REFUNDDATE in", values, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotIn(List<Date> values) {
            addCriterion("REFUNDDATE not in", values, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateBetween(Date value1, Date value2) {
            addCriterion("REFUNDDATE between", value1, value2, "refunddate");
            return (Criteria) this;
        }

        public Criteria andRefunddateNotBetween(Date value1, Date value2) {
            addCriterion("REFUNDDATE not between", value1, value2, "refunddate");
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