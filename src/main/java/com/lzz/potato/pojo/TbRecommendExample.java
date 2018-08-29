package com.lzz.potato.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbRecommendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TbRecommendExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNull() {
            addCriterion("r_time is null");
            return (Criteria) this;
        }

        public Criteria andRTimeIsNotNull() {
            addCriterion("r_time is not null");
            return (Criteria) this;
        }

        public Criteria andRTimeEqualTo(Date value) {
            addCriterionForJDBCDate("r_time =", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("r_time <>", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("r_time >", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_time >=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThan(Date value) {
            addCriterionForJDBCDate("r_time <", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_time <=", value, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeIn(List<Date> values) {
            addCriterionForJDBCDate("r_time in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("r_time not in", values, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_time between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_time not between", value1, value2, "rTime");
            return (Criteria) this;
        }

        public Criteria andRLevelIsNull() {
            addCriterion("r_level is null");
            return (Criteria) this;
        }

        public Criteria andRLevelIsNotNull() {
            addCriterion("r_level is not null");
            return (Criteria) this;
        }

        public Criteria andRLevelEqualTo(String value) {
            addCriterion("r_level =", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelNotEqualTo(String value) {
            addCriterion("r_level <>", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelGreaterThan(String value) {
            addCriterion("r_level >", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelGreaterThanOrEqualTo(String value) {
            addCriterion("r_level >=", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelLessThan(String value) {
            addCriterion("r_level <", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelLessThanOrEqualTo(String value) {
            addCriterion("r_level <=", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelLike(String value) {
            addCriterion("r_level like", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelNotLike(String value) {
            addCriterion("r_level not like", value, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelIn(List<String> values) {
            addCriterion("r_level in", values, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelNotIn(List<String> values) {
            addCriterion("r_level not in", values, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelBetween(String value1, String value2) {
            addCriterion("r_level between", value1, value2, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRLevelNotBetween(String value1, String value2) {
            addCriterion("r_level not between", value1, value2, "rLevel");
            return (Criteria) this;
        }

        public Criteria andRNameIsNull() {
            addCriterion("r_name is null");
            return (Criteria) this;
        }

        public Criteria andRNameIsNotNull() {
            addCriterion("r_name is not null");
            return (Criteria) this;
        }

        public Criteria andRNameEqualTo(String value) {
            addCriterion("r_name =", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotEqualTo(String value) {
            addCriterion("r_name <>", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThan(String value) {
            addCriterion("r_name >", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThanOrEqualTo(String value) {
            addCriterion("r_name >=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThan(String value) {
            addCriterion("r_name <", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThanOrEqualTo(String value) {
            addCriterion("r_name <=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLike(String value) {
            addCriterion("r_name like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotLike(String value) {
            addCriterion("r_name not like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameIn(List<String> values) {
            addCriterion("r_name in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotIn(List<String> values) {
            addCriterion("r_name not in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameBetween(String value1, String value2) {
            addCriterion("r_name between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotBetween(String value1, String value2) {
            addCriterion("r_name not between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRPersonIsNull() {
            addCriterion("r_person is null");
            return (Criteria) this;
        }

        public Criteria andRPersonIsNotNull() {
            addCriterion("r_person is not null");
            return (Criteria) this;
        }

        public Criteria andRPersonEqualTo(Integer value) {
            addCriterion("r_person =", value, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonNotEqualTo(Integer value) {
            addCriterion("r_person <>", value, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonGreaterThan(Integer value) {
            addCriterion("r_person >", value, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_person >=", value, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonLessThan(Integer value) {
            addCriterion("r_person <", value, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonLessThanOrEqualTo(Integer value) {
            addCriterion("r_person <=", value, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonIn(List<Integer> values) {
            addCriterion("r_person in", values, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonNotIn(List<Integer> values) {
            addCriterion("r_person not in", values, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonBetween(Integer value1, Integer value2) {
            addCriterion("r_person between", value1, value2, "rPerson");
            return (Criteria) this;
        }

        public Criteria andRPersonNotBetween(Integer value1, Integer value2) {
            addCriterion("r_person not between", value1, value2, "rPerson");
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