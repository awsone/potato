package com.lzz.potato.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbRewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TbRewardExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andReIdIsNull() {
            addCriterion("re_id is null");
            return (Criteria) this;
        }

        public Criteria andReIdIsNotNull() {
            addCriterion("re_id is not null");
            return (Criteria) this;
        }

        public Criteria andReIdEqualTo(Integer value) {
            addCriterion("re_id =", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotEqualTo(Integer value) {
            addCriterion("re_id <>", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThan(Integer value) {
            addCriterion("re_id >", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_id >=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThan(Integer value) {
            addCriterion("re_id <", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThanOrEqualTo(Integer value) {
            addCriterion("re_id <=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdIn(List<Integer> values) {
            addCriterion("re_id in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotIn(List<Integer> values) {
            addCriterion("re_id not in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdBetween(Integer value1, Integer value2) {
            addCriterion("re_id between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotBetween(Integer value1, Integer value2) {
            addCriterion("re_id not between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReLevelIsNull() {
            addCriterion("re_level is null");
            return (Criteria) this;
        }

        public Criteria andReLevelIsNotNull() {
            addCriterion("re_level is not null");
            return (Criteria) this;
        }

        public Criteria andReLevelEqualTo(String value) {
            addCriterion("re_level =", value, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelNotEqualTo(String value) {
            addCriterion("re_level <>", value, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelGreaterThan(String value) {
            addCriterion("re_level >", value, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelGreaterThanOrEqualTo(String value) {
            addCriterion("re_level >=", value, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelLessThan(String value) {
            addCriterion("re_level <", value, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelLessThanOrEqualTo(String value) {
            addCriterion("re_level <=", value, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelLike(String value) {
            addCriterion("re_level like", value, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelNotLike(String value) {
            addCriterion("re_level not like", value, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelIn(List<String> values) {
            addCriterion("re_level in", values, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelNotIn(List<String> values) {
            addCriterion("re_level not in", values, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelBetween(String value1, String value2) {
            addCriterion("re_level between", value1, value2, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReLevelNotBetween(String value1, String value2) {
            addCriterion("re_level not between", value1, value2, "reLevel");
            return (Criteria) this;
        }

        public Criteria andReTimeIsNull() {
            addCriterion("re_time is null");
            return (Criteria) this;
        }

        public Criteria andReTimeIsNotNull() {
            addCriterion("re_time is not null");
            return (Criteria) this;
        }

        public Criteria andReTimeEqualTo(Date value) {
            addCriterionForJDBCDate("re_time =", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("re_time <>", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("re_time >", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("re_time >=", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeLessThan(Date value) {
            addCriterionForJDBCDate("re_time <", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("re_time <=", value, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeIn(List<Date> values) {
            addCriterionForJDBCDate("re_time in", values, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("re_time not in", values, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("re_time between", value1, value2, "reTime");
            return (Criteria) this;
        }

        public Criteria andReTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("re_time not between", value1, value2, "reTime");
            return (Criteria) this;
        }

        public Criteria andReNameIsNull() {
            addCriterion("re_name is null");
            return (Criteria) this;
        }

        public Criteria andReNameIsNotNull() {
            addCriterion("re_name is not null");
            return (Criteria) this;
        }

        public Criteria andReNameEqualTo(String value) {
            addCriterion("re_name =", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotEqualTo(String value) {
            addCriterion("re_name <>", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameGreaterThan(String value) {
            addCriterion("re_name >", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameGreaterThanOrEqualTo(String value) {
            addCriterion("re_name >=", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLessThan(String value) {
            addCriterion("re_name <", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLessThanOrEqualTo(String value) {
            addCriterion("re_name <=", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLike(String value) {
            addCriterion("re_name like", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotLike(String value) {
            addCriterion("re_name not like", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameIn(List<String> values) {
            addCriterion("re_name in", values, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotIn(List<String> values) {
            addCriterion("re_name not in", values, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameBetween(String value1, String value2) {
            addCriterion("re_name between", value1, value2, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotBetween(String value1, String value2) {
            addCriterion("re_name not between", value1, value2, "reName");
            return (Criteria) this;
        }

        public Criteria andRePersonIsNull() {
            addCriterion("re_person is null");
            return (Criteria) this;
        }

        public Criteria andRePersonIsNotNull() {
            addCriterion("re_person is not null");
            return (Criteria) this;
        }

        public Criteria andRePersonEqualTo(Integer value) {
            addCriterion("re_person =", value, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonNotEqualTo(Integer value) {
            addCriterion("re_person <>", value, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonGreaterThan(Integer value) {
            addCriterion("re_person >", value, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_person >=", value, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonLessThan(Integer value) {
            addCriterion("re_person <", value, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonLessThanOrEqualTo(Integer value) {
            addCriterion("re_person <=", value, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonIn(List<Integer> values) {
            addCriterion("re_person in", values, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonNotIn(List<Integer> values) {
            addCriterion("re_person not in", values, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonBetween(Integer value1, Integer value2) {
            addCriterion("re_person between", value1, value2, "rePerson");
            return (Criteria) this;
        }

        public Criteria andRePersonNotBetween(Integer value1, Integer value2) {
            addCriterion("re_person not between", value1, value2, "rePerson");
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