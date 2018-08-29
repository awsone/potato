package com.lzz.potato.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbAchieveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TbAchieveExample() {
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

        public Criteria andAcIdIsNull() {
            addCriterion("ac_id is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("ac_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(Integer value) {
            addCriterion("ac_id =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(Integer value) {
            addCriterion("ac_id <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(Integer value) {
            addCriterion("ac_id >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_id >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(Integer value) {
            addCriterion("ac_id <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(Integer value) {
            addCriterion("ac_id <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<Integer> values) {
            addCriterion("ac_id in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<Integer> values) {
            addCriterion("ac_id not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(Integer value1, Integer value2) {
            addCriterion("ac_id between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_id not between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcMIdIsNull() {
            addCriterion("ac_m_id is null");
            return (Criteria) this;
        }

        public Criteria andAcMIdIsNotNull() {
            addCriterion("ac_m_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcMIdEqualTo(Integer value) {
            addCriterion("ac_m_id =", value, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdNotEqualTo(Integer value) {
            addCriterion("ac_m_id <>", value, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdGreaterThan(Integer value) {
            addCriterion("ac_m_id >", value, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_m_id >=", value, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdLessThan(Integer value) {
            addCriterion("ac_m_id <", value, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdLessThanOrEqualTo(Integer value) {
            addCriterion("ac_m_id <=", value, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdIn(List<Integer> values) {
            addCriterion("ac_m_id in", values, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdNotIn(List<Integer> values) {
            addCriterion("ac_m_id not in", values, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdBetween(Integer value1, Integer value2) {
            addCriterion("ac_m_id between", value1, value2, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_m_id not between", value1, value2, "acMId");
            return (Criteria) this;
        }

        public Criteria andAcContentIsNull() {
            addCriterion("ac_content is null");
            return (Criteria) this;
        }

        public Criteria andAcContentIsNotNull() {
            addCriterion("ac_content is not null");
            return (Criteria) this;
        }

        public Criteria andAcContentEqualTo(String value) {
            addCriterion("ac_content =", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentNotEqualTo(String value) {
            addCriterion("ac_content <>", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentGreaterThan(String value) {
            addCriterion("ac_content >", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentGreaterThanOrEqualTo(String value) {
            addCriterion("ac_content >=", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentLessThan(String value) {
            addCriterion("ac_content <", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentLessThanOrEqualTo(String value) {
            addCriterion("ac_content <=", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentLike(String value) {
            addCriterion("ac_content like", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentNotLike(String value) {
            addCriterion("ac_content not like", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentIn(List<String> values) {
            addCriterion("ac_content in", values, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentNotIn(List<String> values) {
            addCriterion("ac_content not in", values, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentBetween(String value1, String value2) {
            addCriterion("ac_content between", value1, value2, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentNotBetween(String value1, String value2) {
            addCriterion("ac_content not between", value1, value2, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcSaleIsNull() {
            addCriterion("ac_sale is null");
            return (Criteria) this;
        }

        public Criteria andAcSaleIsNotNull() {
            addCriterion("ac_sale is not null");
            return (Criteria) this;
        }

        public Criteria andAcSaleEqualTo(String value) {
            addCriterion("ac_sale =", value, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleNotEqualTo(String value) {
            addCriterion("ac_sale <>", value, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleGreaterThan(String value) {
            addCriterion("ac_sale >", value, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleGreaterThanOrEqualTo(String value) {
            addCriterion("ac_sale >=", value, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleLessThan(String value) {
            addCriterion("ac_sale <", value, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleLessThanOrEqualTo(String value) {
            addCriterion("ac_sale <=", value, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleLike(String value) {
            addCriterion("ac_sale like", value, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleNotLike(String value) {
            addCriterion("ac_sale not like", value, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleIn(List<String> values) {
            addCriterion("ac_sale in", values, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleNotIn(List<String> values) {
            addCriterion("ac_sale not in", values, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleBetween(String value1, String value2) {
            addCriterion("ac_sale between", value1, value2, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcSaleNotBetween(String value1, String value2) {
            addCriterion("ac_sale not between", value1, value2, "acSale");
            return (Criteria) this;
        }

        public Criteria andAcLevelIsNull() {
            addCriterion("ac_level is null");
            return (Criteria) this;
        }

        public Criteria andAcLevelIsNotNull() {
            addCriterion("ac_level is not null");
            return (Criteria) this;
        }

        public Criteria andAcLevelEqualTo(String value) {
            addCriterion("ac_level =", value, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelNotEqualTo(String value) {
            addCriterion("ac_level <>", value, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelGreaterThan(String value) {
            addCriterion("ac_level >", value, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ac_level >=", value, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelLessThan(String value) {
            addCriterion("ac_level <", value, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelLessThanOrEqualTo(String value) {
            addCriterion("ac_level <=", value, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelLike(String value) {
            addCriterion("ac_level like", value, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelNotLike(String value) {
            addCriterion("ac_level not like", value, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelIn(List<String> values) {
            addCriterion("ac_level in", values, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelNotIn(List<String> values) {
            addCriterion("ac_level not in", values, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelBetween(String value1, String value2) {
            addCriterion("ac_level between", value1, value2, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcLevelNotBetween(String value1, String value2) {
            addCriterion("ac_level not between", value1, value2, "acLevel");
            return (Criteria) this;
        }

        public Criteria andAcFileIsNull() {
            addCriterion("ac_file is null");
            return (Criteria) this;
        }

        public Criteria andAcFileIsNotNull() {
            addCriterion("ac_file is not null");
            return (Criteria) this;
        }

        public Criteria andAcFileEqualTo(String value) {
            addCriterion("ac_file =", value, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileNotEqualTo(String value) {
            addCriterion("ac_file <>", value, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileGreaterThan(String value) {
            addCriterion("ac_file >", value, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileGreaterThanOrEqualTo(String value) {
            addCriterion("ac_file >=", value, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileLessThan(String value) {
            addCriterion("ac_file <", value, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileLessThanOrEqualTo(String value) {
            addCriterion("ac_file <=", value, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileLike(String value) {
            addCriterion("ac_file like", value, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileNotLike(String value) {
            addCriterion("ac_file not like", value, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileIn(List<String> values) {
            addCriterion("ac_file in", values, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileNotIn(List<String> values) {
            addCriterion("ac_file not in", values, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileBetween(String value1, String value2) {
            addCriterion("ac_file between", value1, value2, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcFileNotBetween(String value1, String value2) {
            addCriterion("ac_file not between", value1, value2, "acFile");
            return (Criteria) this;
        }

        public Criteria andAcTimeIsNull() {
            addCriterion("ac_time is null");
            return (Criteria) this;
        }

        public Criteria andAcTimeIsNotNull() {
            addCriterion("ac_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ac_time =", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ac_time <>", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ac_time >", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ac_time >=", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeLessThan(Date value) {
            addCriterionForJDBCDate("ac_time <", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ac_time <=", value, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ac_time in", values, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ac_time not in", values, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ac_time between", value1, value2, "acTime");
            return (Criteria) this;
        }

        public Criteria andAcTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ac_time not between", value1, value2, "acTime");
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