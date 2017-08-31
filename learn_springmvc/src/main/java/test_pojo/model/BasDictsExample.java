package test_pojo.model;

import java.util.ArrayList;
import java.util.List;

public class BasDictsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasDictsExample() {
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

        public Criteria andDictidIsNull() {
            addCriterion("DICTID is null");
            return (Criteria) this;
        }

        public Criteria andDictidIsNotNull() {
            addCriterion("DICTID is not null");
            return (Criteria) this;
        }

        public Criteria andDictidEqualTo(String value) {
            addCriterion("DICTID =", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotEqualTo(String value) {
            addCriterion("DICTID <>", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidGreaterThan(String value) {
            addCriterion("DICTID >", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidGreaterThanOrEqualTo(String value) {
            addCriterion("DICTID >=", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidLessThan(String value) {
            addCriterion("DICTID <", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidLessThanOrEqualTo(String value) {
            addCriterion("DICTID <=", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidLike(String value) {
            addCriterion("DICTID like", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotLike(String value) {
            addCriterion("DICTID not like", value, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidIn(List<String> values) {
            addCriterion("DICTID in", values, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotIn(List<String> values) {
            addCriterion("DICTID not in", values, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidBetween(String value1, String value2) {
            addCriterion("DICTID between", value1, value2, "dictid");
            return (Criteria) this;
        }

        public Criteria andDictidNotBetween(String value1, String value2) {
            addCriterion("DICTID not between", value1, value2, "dictid");
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

        public Criteria andSysnameIsNull() {
            addCriterion("SYSNAME is null");
            return (Criteria) this;
        }

        public Criteria andSysnameIsNotNull() {
            addCriterion("SYSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSysnameEqualTo(String value) {
            addCriterion("SYSNAME =", value, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameNotEqualTo(String value) {
            addCriterion("SYSNAME <>", value, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameGreaterThan(String value) {
            addCriterion("SYSNAME >", value, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameGreaterThanOrEqualTo(String value) {
            addCriterion("SYSNAME >=", value, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameLessThan(String value) {
            addCriterion("SYSNAME <", value, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameLessThanOrEqualTo(String value) {
            addCriterion("SYSNAME <=", value, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameLike(String value) {
            addCriterion("SYSNAME like", value, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameNotLike(String value) {
            addCriterion("SYSNAME not like", value, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameIn(List<String> values) {
            addCriterion("SYSNAME in", values, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameNotIn(List<String> values) {
            addCriterion("SYSNAME not in", values, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameBetween(String value1, String value2) {
            addCriterion("SYSNAME between", value1, value2, "sysname");
            return (Criteria) this;
        }

        public Criteria andSysnameNotBetween(String value1, String value2) {
            addCriterion("SYSNAME not between", value1, value2, "sysname");
            return (Criteria) this;
        }

        public Criteria andNekeyIsNull() {
            addCriterion("NEKEY is null");
            return (Criteria) this;
        }

        public Criteria andNekeyIsNotNull() {
            addCriterion("NEKEY is not null");
            return (Criteria) this;
        }

        public Criteria andNekeyEqualTo(Short value) {
            addCriterion("NEKEY =", value, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyNotEqualTo(Short value) {
            addCriterion("NEKEY <>", value, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyGreaterThan(Short value) {
            addCriterion("NEKEY >", value, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyGreaterThanOrEqualTo(Short value) {
            addCriterion("NEKEY >=", value, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyLessThan(Short value) {
            addCriterion("NEKEY <", value, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyLessThanOrEqualTo(Short value) {
            addCriterion("NEKEY <=", value, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyIn(List<Short> values) {
            addCriterion("NEKEY in", values, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyNotIn(List<Short> values) {
            addCriterion("NEKEY not in", values, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyBetween(Short value1, Short value2) {
            addCriterion("NEKEY between", value1, value2, "nekey");
            return (Criteria) this;
        }

        public Criteria andNekeyNotBetween(Short value1, Short value2) {
            addCriterion("NEKEY not between", value1, value2, "nekey");
            return (Criteria) this;
        }

        public Criteria andNevalueIsNull() {
            addCriterion("NEVALUE is null");
            return (Criteria) this;
        }

        public Criteria andNevalueIsNotNull() {
            addCriterion("NEVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNevalueEqualTo(String value) {
            addCriterion("NEVALUE =", value, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueNotEqualTo(String value) {
            addCriterion("NEVALUE <>", value, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueGreaterThan(String value) {
            addCriterion("NEVALUE >", value, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueGreaterThanOrEqualTo(String value) {
            addCriterion("NEVALUE >=", value, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueLessThan(String value) {
            addCriterion("NEVALUE <", value, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueLessThanOrEqualTo(String value) {
            addCriterion("NEVALUE <=", value, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueLike(String value) {
            addCriterion("NEVALUE like", value, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueNotLike(String value) {
            addCriterion("NEVALUE not like", value, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueIn(List<String> values) {
            addCriterion("NEVALUE in", values, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueNotIn(List<String> values) {
            addCriterion("NEVALUE not in", values, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueBetween(String value1, String value2) {
            addCriterion("NEVALUE between", value1, value2, "nevalue");
            return (Criteria) this;
        }

        public Criteria andNevalueNotBetween(String value1, String value2) {
            addCriterion("NEVALUE not between", value1, value2, "nevalue");
            return (Criteria) this;
        }

        public Criteria andContentsIsNull() {
            addCriterion("CONTENTS is null");
            return (Criteria) this;
        }

        public Criteria andContentsIsNotNull() {
            addCriterion("CONTENTS is not null");
            return (Criteria) this;
        }

        public Criteria andContentsEqualTo(String value) {
            addCriterion("CONTENTS =", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotEqualTo(String value) {
            addCriterion("CONTENTS <>", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThan(String value) {
            addCriterion("CONTENTS >", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENTS >=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThan(String value) {
            addCriterion("CONTENTS <", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLessThanOrEqualTo(String value) {
            addCriterion("CONTENTS <=", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsLike(String value) {
            addCriterion("CONTENTS like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotLike(String value) {
            addCriterion("CONTENTS not like", value, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsIn(List<String> values) {
            addCriterion("CONTENTS in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotIn(List<String> values) {
            addCriterion("CONTENTS not in", values, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsBetween(String value1, String value2) {
            addCriterion("CONTENTS between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andContentsNotBetween(String value1, String value2) {
            addCriterion("CONTENTS not between", value1, value2, "contents");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("ISDEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("ISDEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(String value) {
            addCriterion("ISDEFAULT =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(String value) {
            addCriterion("ISDEFAULT <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(String value) {
            addCriterion("ISDEFAULT >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(String value) {
            addCriterion("ISDEFAULT >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(String value) {
            addCriterion("ISDEFAULT <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(String value) {
            addCriterion("ISDEFAULT <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLike(String value) {
            addCriterion("ISDEFAULT like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotLike(String value) {
            addCriterion("ISDEFAULT not like", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<String> values) {
            addCriterion("ISDEFAULT in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<String> values) {
            addCriterion("ISDEFAULT not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(String value1, String value2) {
            addCriterion("ISDEFAULT between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(String value1, String value2) {
            addCriterion("ISDEFAULT not between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andOption01IsNull() {
            addCriterion("OPTION01 is null");
            return (Criteria) this;
        }

        public Criteria andOption01IsNotNull() {
            addCriterion("OPTION01 is not null");
            return (Criteria) this;
        }

        public Criteria andOption01EqualTo(String value) {
            addCriterion("OPTION01 =", value, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01NotEqualTo(String value) {
            addCriterion("OPTION01 <>", value, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01GreaterThan(String value) {
            addCriterion("OPTION01 >", value, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION01 >=", value, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01LessThan(String value) {
            addCriterion("OPTION01 <", value, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01LessThanOrEqualTo(String value) {
            addCriterion("OPTION01 <=", value, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01Like(String value) {
            addCriterion("OPTION01 like", value, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01NotLike(String value) {
            addCriterion("OPTION01 not like", value, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01In(List<String> values) {
            addCriterion("OPTION01 in", values, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01NotIn(List<String> values) {
            addCriterion("OPTION01 not in", values, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01Between(String value1, String value2) {
            addCriterion("OPTION01 between", value1, value2, "option01");
            return (Criteria) this;
        }

        public Criteria andOption01NotBetween(String value1, String value2) {
            addCriterion("OPTION01 not between", value1, value2, "option01");
            return (Criteria) this;
        }

        public Criteria andOption02IsNull() {
            addCriterion("OPTION02 is null");
            return (Criteria) this;
        }

        public Criteria andOption02IsNotNull() {
            addCriterion("OPTION02 is not null");
            return (Criteria) this;
        }

        public Criteria andOption02EqualTo(String value) {
            addCriterion("OPTION02 =", value, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02NotEqualTo(String value) {
            addCriterion("OPTION02 <>", value, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02GreaterThan(String value) {
            addCriterion("OPTION02 >", value, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION02 >=", value, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02LessThan(String value) {
            addCriterion("OPTION02 <", value, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02LessThanOrEqualTo(String value) {
            addCriterion("OPTION02 <=", value, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02Like(String value) {
            addCriterion("OPTION02 like", value, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02NotLike(String value) {
            addCriterion("OPTION02 not like", value, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02In(List<String> values) {
            addCriterion("OPTION02 in", values, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02NotIn(List<String> values) {
            addCriterion("OPTION02 not in", values, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02Between(String value1, String value2) {
            addCriterion("OPTION02 between", value1, value2, "option02");
            return (Criteria) this;
        }

        public Criteria andOption02NotBetween(String value1, String value2) {
            addCriterion("OPTION02 not between", value1, value2, "option02");
            return (Criteria) this;
        }

        public Criteria andOption03IsNull() {
            addCriterion("OPTION03 is null");
            return (Criteria) this;
        }

        public Criteria andOption03IsNotNull() {
            addCriterion("OPTION03 is not null");
            return (Criteria) this;
        }

        public Criteria andOption03EqualTo(String value) {
            addCriterion("OPTION03 =", value, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03NotEqualTo(String value) {
            addCriterion("OPTION03 <>", value, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03GreaterThan(String value) {
            addCriterion("OPTION03 >", value, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION03 >=", value, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03LessThan(String value) {
            addCriterion("OPTION03 <", value, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03LessThanOrEqualTo(String value) {
            addCriterion("OPTION03 <=", value, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03Like(String value) {
            addCriterion("OPTION03 like", value, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03NotLike(String value) {
            addCriterion("OPTION03 not like", value, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03In(List<String> values) {
            addCriterion("OPTION03 in", values, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03NotIn(List<String> values) {
            addCriterion("OPTION03 not in", values, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03Between(String value1, String value2) {
            addCriterion("OPTION03 between", value1, value2, "option03");
            return (Criteria) this;
        }

        public Criteria andOption03NotBetween(String value1, String value2) {
            addCriterion("OPTION03 not between", value1, value2, "option03");
            return (Criteria) this;
        }

        public Criteria andOption04IsNull() {
            addCriterion("OPTION04 is null");
            return (Criteria) this;
        }

        public Criteria andOption04IsNotNull() {
            addCriterion("OPTION04 is not null");
            return (Criteria) this;
        }

        public Criteria andOption04EqualTo(String value) {
            addCriterion("OPTION04 =", value, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04NotEqualTo(String value) {
            addCriterion("OPTION04 <>", value, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04GreaterThan(String value) {
            addCriterion("OPTION04 >", value, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION04 >=", value, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04LessThan(String value) {
            addCriterion("OPTION04 <", value, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04LessThanOrEqualTo(String value) {
            addCriterion("OPTION04 <=", value, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04Like(String value) {
            addCriterion("OPTION04 like", value, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04NotLike(String value) {
            addCriterion("OPTION04 not like", value, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04In(List<String> values) {
            addCriterion("OPTION04 in", values, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04NotIn(List<String> values) {
            addCriterion("OPTION04 not in", values, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04Between(String value1, String value2) {
            addCriterion("OPTION04 between", value1, value2, "option04");
            return (Criteria) this;
        }

        public Criteria andOption04NotBetween(String value1, String value2) {
            addCriterion("OPTION04 not between", value1, value2, "option04");
            return (Criteria) this;
        }

        public Criteria andOption05IsNull() {
            addCriterion("OPTION05 is null");
            return (Criteria) this;
        }

        public Criteria andOption05IsNotNull() {
            addCriterion("OPTION05 is not null");
            return (Criteria) this;
        }

        public Criteria andOption05EqualTo(String value) {
            addCriterion("OPTION05 =", value, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05NotEqualTo(String value) {
            addCriterion("OPTION05 <>", value, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05GreaterThan(String value) {
            addCriterion("OPTION05 >", value, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION05 >=", value, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05LessThan(String value) {
            addCriterion("OPTION05 <", value, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05LessThanOrEqualTo(String value) {
            addCriterion("OPTION05 <=", value, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05Like(String value) {
            addCriterion("OPTION05 like", value, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05NotLike(String value) {
            addCriterion("OPTION05 not like", value, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05In(List<String> values) {
            addCriterion("OPTION05 in", values, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05NotIn(List<String> values) {
            addCriterion("OPTION05 not in", values, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05Between(String value1, String value2) {
            addCriterion("OPTION05 between", value1, value2, "option05");
            return (Criteria) this;
        }

        public Criteria andOption05NotBetween(String value1, String value2) {
            addCriterion("OPTION05 not between", value1, value2, "option05");
            return (Criteria) this;
        }

        public Criteria andOption06IsNull() {
            addCriterion("OPTION06 is null");
            return (Criteria) this;
        }

        public Criteria andOption06IsNotNull() {
            addCriterion("OPTION06 is not null");
            return (Criteria) this;
        }

        public Criteria andOption06EqualTo(String value) {
            addCriterion("OPTION06 =", value, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06NotEqualTo(String value) {
            addCriterion("OPTION06 <>", value, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06GreaterThan(String value) {
            addCriterion("OPTION06 >", value, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION06 >=", value, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06LessThan(String value) {
            addCriterion("OPTION06 <", value, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06LessThanOrEqualTo(String value) {
            addCriterion("OPTION06 <=", value, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06Like(String value) {
            addCriterion("OPTION06 like", value, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06NotLike(String value) {
            addCriterion("OPTION06 not like", value, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06In(List<String> values) {
            addCriterion("OPTION06 in", values, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06NotIn(List<String> values) {
            addCriterion("OPTION06 not in", values, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06Between(String value1, String value2) {
            addCriterion("OPTION06 between", value1, value2, "option06");
            return (Criteria) this;
        }

        public Criteria andOption06NotBetween(String value1, String value2) {
            addCriterion("OPTION06 not between", value1, value2, "option06");
            return (Criteria) this;
        }

        public Criteria andOption07IsNull() {
            addCriterion("OPTION07 is null");
            return (Criteria) this;
        }

        public Criteria andOption07IsNotNull() {
            addCriterion("OPTION07 is not null");
            return (Criteria) this;
        }

        public Criteria andOption07EqualTo(String value) {
            addCriterion("OPTION07 =", value, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07NotEqualTo(String value) {
            addCriterion("OPTION07 <>", value, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07GreaterThan(String value) {
            addCriterion("OPTION07 >", value, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION07 >=", value, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07LessThan(String value) {
            addCriterion("OPTION07 <", value, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07LessThanOrEqualTo(String value) {
            addCriterion("OPTION07 <=", value, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07Like(String value) {
            addCriterion("OPTION07 like", value, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07NotLike(String value) {
            addCriterion("OPTION07 not like", value, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07In(List<String> values) {
            addCriterion("OPTION07 in", values, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07NotIn(List<String> values) {
            addCriterion("OPTION07 not in", values, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07Between(String value1, String value2) {
            addCriterion("OPTION07 between", value1, value2, "option07");
            return (Criteria) this;
        }

        public Criteria andOption07NotBetween(String value1, String value2) {
            addCriterion("OPTION07 not between", value1, value2, "option07");
            return (Criteria) this;
        }

        public Criteria andOption08IsNull() {
            addCriterion("OPTION08 is null");
            return (Criteria) this;
        }

        public Criteria andOption08IsNotNull() {
            addCriterion("OPTION08 is not null");
            return (Criteria) this;
        }

        public Criteria andOption08EqualTo(String value) {
            addCriterion("OPTION08 =", value, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08NotEqualTo(String value) {
            addCriterion("OPTION08 <>", value, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08GreaterThan(String value) {
            addCriterion("OPTION08 >", value, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION08 >=", value, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08LessThan(String value) {
            addCriterion("OPTION08 <", value, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08LessThanOrEqualTo(String value) {
            addCriterion("OPTION08 <=", value, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08Like(String value) {
            addCriterion("OPTION08 like", value, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08NotLike(String value) {
            addCriterion("OPTION08 not like", value, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08In(List<String> values) {
            addCriterion("OPTION08 in", values, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08NotIn(List<String> values) {
            addCriterion("OPTION08 not in", values, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08Between(String value1, String value2) {
            addCriterion("OPTION08 between", value1, value2, "option08");
            return (Criteria) this;
        }

        public Criteria andOption08NotBetween(String value1, String value2) {
            addCriterion("OPTION08 not between", value1, value2, "option08");
            return (Criteria) this;
        }

        public Criteria andOption09IsNull() {
            addCriterion("OPTION09 is null");
            return (Criteria) this;
        }

        public Criteria andOption09IsNotNull() {
            addCriterion("OPTION09 is not null");
            return (Criteria) this;
        }

        public Criteria andOption09EqualTo(String value) {
            addCriterion("OPTION09 =", value, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09NotEqualTo(String value) {
            addCriterion("OPTION09 <>", value, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09GreaterThan(String value) {
            addCriterion("OPTION09 >", value, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION09 >=", value, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09LessThan(String value) {
            addCriterion("OPTION09 <", value, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09LessThanOrEqualTo(String value) {
            addCriterion("OPTION09 <=", value, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09Like(String value) {
            addCriterion("OPTION09 like", value, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09NotLike(String value) {
            addCriterion("OPTION09 not like", value, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09In(List<String> values) {
            addCriterion("OPTION09 in", values, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09NotIn(List<String> values) {
            addCriterion("OPTION09 not in", values, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09Between(String value1, String value2) {
            addCriterion("OPTION09 between", value1, value2, "option09");
            return (Criteria) this;
        }

        public Criteria andOption09NotBetween(String value1, String value2) {
            addCriterion("OPTION09 not between", value1, value2, "option09");
            return (Criteria) this;
        }

        public Criteria andOption10IsNull() {
            addCriterion("OPTION10 is null");
            return (Criteria) this;
        }

        public Criteria andOption10IsNotNull() {
            addCriterion("OPTION10 is not null");
            return (Criteria) this;
        }

        public Criteria andOption10EqualTo(String value) {
            addCriterion("OPTION10 =", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotEqualTo(String value) {
            addCriterion("OPTION10 <>", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10GreaterThan(String value) {
            addCriterion("OPTION10 >", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION10 >=", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10LessThan(String value) {
            addCriterion("OPTION10 <", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10LessThanOrEqualTo(String value) {
            addCriterion("OPTION10 <=", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10Like(String value) {
            addCriterion("OPTION10 like", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotLike(String value) {
            addCriterion("OPTION10 not like", value, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10In(List<String> values) {
            addCriterion("OPTION10 in", values, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotIn(List<String> values) {
            addCriterion("OPTION10 not in", values, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10Between(String value1, String value2) {
            addCriterion("OPTION10 between", value1, value2, "option10");
            return (Criteria) this;
        }

        public Criteria andOption10NotBetween(String value1, String value2) {
            addCriterion("OPTION10 not between", value1, value2, "option10");
            return (Criteria) this;
        }

        public Criteria andCaneditIsNull() {
            addCriterion("CANEDIT is null");
            return (Criteria) this;
        }

        public Criteria andCaneditIsNotNull() {
            addCriterion("CANEDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCaneditEqualTo(Short value) {
            addCriterion("CANEDIT =", value, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditNotEqualTo(Short value) {
            addCriterion("CANEDIT <>", value, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditGreaterThan(Short value) {
            addCriterion("CANEDIT >", value, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditGreaterThanOrEqualTo(Short value) {
            addCriterion("CANEDIT >=", value, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditLessThan(Short value) {
            addCriterion("CANEDIT <", value, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditLessThanOrEqualTo(Short value) {
            addCriterion("CANEDIT <=", value, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditIn(List<Short> values) {
            addCriterion("CANEDIT in", values, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditNotIn(List<Short> values) {
            addCriterion("CANEDIT not in", values, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditBetween(Short value1, Short value2) {
            addCriterion("CANEDIT between", value1, value2, "canedit");
            return (Criteria) this;
        }

        public Criteria andCaneditNotBetween(Short value1, Short value2) {
            addCriterion("CANEDIT not between", value1, value2, "canedit");
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

        public Criteria andInputcpyIsNull() {
            addCriterion("INPUTCPY is null");
            return (Criteria) this;
        }

        public Criteria andInputcpyIsNotNull() {
            addCriterion("INPUTCPY is not null");
            return (Criteria) this;
        }

        public Criteria andInputcpyEqualTo(String value) {
            addCriterion("INPUTCPY =", value, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyNotEqualTo(String value) {
            addCriterion("INPUTCPY <>", value, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyGreaterThan(String value) {
            addCriterion("INPUTCPY >", value, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTCPY >=", value, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyLessThan(String value) {
            addCriterion("INPUTCPY <", value, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyLessThanOrEqualTo(String value) {
            addCriterion("INPUTCPY <=", value, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyLike(String value) {
            addCriterion("INPUTCPY like", value, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyNotLike(String value) {
            addCriterion("INPUTCPY not like", value, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyIn(List<String> values) {
            addCriterion("INPUTCPY in", values, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyNotIn(List<String> values) {
            addCriterion("INPUTCPY not in", values, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyBetween(String value1, String value2) {
            addCriterion("INPUTCPY between", value1, value2, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcpyNotBetween(String value1, String value2) {
            addCriterion("INPUTCPY not between", value1, value2, "inputcpy");
            return (Criteria) this;
        }

        public Criteria andInputcwbIsNull() {
            addCriterion("INPUTCWB is null");
            return (Criteria) this;
        }

        public Criteria andInputcwbIsNotNull() {
            addCriterion("INPUTCWB is not null");
            return (Criteria) this;
        }

        public Criteria andInputcwbEqualTo(String value) {
            addCriterion("INPUTCWB =", value, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbNotEqualTo(String value) {
            addCriterion("INPUTCWB <>", value, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbGreaterThan(String value) {
            addCriterion("INPUTCWB >", value, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTCWB >=", value, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbLessThan(String value) {
            addCriterion("INPUTCWB <", value, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbLessThanOrEqualTo(String value) {
            addCriterion("INPUTCWB <=", value, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbLike(String value) {
            addCriterion("INPUTCWB like", value, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbNotLike(String value) {
            addCriterion("INPUTCWB not like", value, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbIn(List<String> values) {
            addCriterion("INPUTCWB in", values, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbNotIn(List<String> values) {
            addCriterion("INPUTCWB not in", values, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbBetween(String value1, String value2) {
            addCriterion("INPUTCWB between", value1, value2, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andInputcwbNotBetween(String value1, String value2) {
            addCriterion("INPUTCWB not between", value1, value2, "inputcwb");
            return (Criteria) this;
        }

        public Criteria andStdinfoIsNull() {
            addCriterion("STDINFO is null");
            return (Criteria) this;
        }

        public Criteria andStdinfoIsNotNull() {
            addCriterion("STDINFO is not null");
            return (Criteria) this;
        }

        public Criteria andStdinfoEqualTo(String value) {
            addCriterion("STDINFO =", value, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoNotEqualTo(String value) {
            addCriterion("STDINFO <>", value, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoGreaterThan(String value) {
            addCriterion("STDINFO >", value, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoGreaterThanOrEqualTo(String value) {
            addCriterion("STDINFO >=", value, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoLessThan(String value) {
            addCriterion("STDINFO <", value, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoLessThanOrEqualTo(String value) {
            addCriterion("STDINFO <=", value, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoLike(String value) {
            addCriterion("STDINFO like", value, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoNotLike(String value) {
            addCriterion("STDINFO not like", value, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoIn(List<String> values) {
            addCriterion("STDINFO in", values, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoNotIn(List<String> values) {
            addCriterion("STDINFO not in", values, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoBetween(String value1, String value2) {
            addCriterion("STDINFO between", value1, value2, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andStdinfoNotBetween(String value1, String value2) {
            addCriterion("STDINFO not between", value1, value2, "stdinfo");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("ISDELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("ISDELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(String value) {
            addCriterion("ISDELETED =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(String value) {
            addCriterion("ISDELETED <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(String value) {
            addCriterion("ISDELETED >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(String value) {
            addCriterion("ISDELETED >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(String value) {
            addCriterion("ISDELETED <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(String value) {
            addCriterion("ISDELETED <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLike(String value) {
            addCriterion("ISDELETED like", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotLike(String value) {
            addCriterion("ISDELETED not like", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<String> values) {
            addCriterion("ISDELETED in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<String> values) {
            addCriterion("ISDELETED not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(String value1, String value2) {
            addCriterion("ISDELETED between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(String value1, String value2) {
            addCriterion("ISDELETED not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andOption11IsNull() {
            addCriterion("OPTION11 is null");
            return (Criteria) this;
        }

        public Criteria andOption11IsNotNull() {
            addCriterion("OPTION11 is not null");
            return (Criteria) this;
        }

        public Criteria andOption11EqualTo(String value) {
            addCriterion("OPTION11 =", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11NotEqualTo(String value) {
            addCriterion("OPTION11 <>", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11GreaterThan(String value) {
            addCriterion("OPTION11 >", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11GreaterThanOrEqualTo(String value) {
            addCriterion("OPTION11 >=", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11LessThan(String value) {
            addCriterion("OPTION11 <", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11LessThanOrEqualTo(String value) {
            addCriterion("OPTION11 <=", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11Like(String value) {
            addCriterion("OPTION11 like", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11NotLike(String value) {
            addCriterion("OPTION11 not like", value, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11In(List<String> values) {
            addCriterion("OPTION11 in", values, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11NotIn(List<String> values) {
            addCriterion("OPTION11 not in", values, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11Between(String value1, String value2) {
            addCriterion("OPTION11 between", value1, value2, "option11");
            return (Criteria) this;
        }

        public Criteria andOption11NotBetween(String value1, String value2) {
            addCriterion("OPTION11 not between", value1, value2, "option11");
            return (Criteria) this;
        }

        public Criteria andIsgdbIsNull() {
            addCriterion("ISGDB is null");
            return (Criteria) this;
        }

        public Criteria andIsgdbIsNotNull() {
            addCriterion("ISGDB is not null");
            return (Criteria) this;
        }

        public Criteria andIsgdbEqualTo(String value) {
            addCriterion("ISGDB =", value, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbNotEqualTo(String value) {
            addCriterion("ISGDB <>", value, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbGreaterThan(String value) {
            addCriterion("ISGDB >", value, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbGreaterThanOrEqualTo(String value) {
            addCriterion("ISGDB >=", value, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbLessThan(String value) {
            addCriterion("ISGDB <", value, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbLessThanOrEqualTo(String value) {
            addCriterion("ISGDB <=", value, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbLike(String value) {
            addCriterion("ISGDB like", value, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbNotLike(String value) {
            addCriterion("ISGDB not like", value, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbIn(List<String> values) {
            addCriterion("ISGDB in", values, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbNotIn(List<String> values) {
            addCriterion("ISGDB not in", values, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbBetween(String value1, String value2) {
            addCriterion("ISGDB between", value1, value2, "isgdb");
            return (Criteria) this;
        }

        public Criteria andIsgdbNotBetween(String value1, String value2) {
            addCriterion("ISGDB not between", value1, value2, "isgdb");
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