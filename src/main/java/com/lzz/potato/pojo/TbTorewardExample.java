package com.lzz.potato.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbTorewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TbTorewardExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTMIdIsNull() {
            addCriterion("t_m_id is null");
            return (Criteria) this;
        }

        public Criteria andTMIdIsNotNull() {
            addCriterion("t_m_id is not null");
            return (Criteria) this;
        }

        public Criteria andTMIdEqualTo(Integer value) {
            addCriterion("t_m_id =", value, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdNotEqualTo(Integer value) {
            addCriterion("t_m_id <>", value, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdGreaterThan(Integer value) {
            addCriterion("t_m_id >", value, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_m_id >=", value, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdLessThan(Integer value) {
            addCriterion("t_m_id <", value, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_m_id <=", value, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdIn(List<Integer> values) {
            addCriterion("t_m_id in", values, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdNotIn(List<Integer> values) {
            addCriterion("t_m_id not in", values, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdBetween(Integer value1, Integer value2) {
            addCriterion("t_m_id between", value1, value2, "tMId");
            return (Criteria) this;
        }

        public Criteria andTMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_m_id not between", value1, value2, "tMId");
            return (Criteria) this;
        }

        public Criteria andTAcIdIsNull() {
            addCriterion("t_ac_id is null");
            return (Criteria) this;
        }

        public Criteria andTAcIdIsNotNull() {
            addCriterion("t_ac_id is not null");
            return (Criteria) this;
        }

        public Criteria andTAcIdEqualTo(Integer value) {
            addCriterion("t_ac_id =", value, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdNotEqualTo(Integer value) {
            addCriterion("t_ac_id <>", value, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdGreaterThan(Integer value) {
            addCriterion("t_ac_id >", value, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_ac_id >=", value, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdLessThan(Integer value) {
            addCriterion("t_ac_id <", value, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_ac_id <=", value, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdIn(List<Integer> values) {
            addCriterion("t_ac_id in", values, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdNotIn(List<Integer> values) {
            addCriterion("t_ac_id not in", values, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdBetween(Integer value1, Integer value2) {
            addCriterion("t_ac_id between", value1, value2, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTAcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_ac_id not between", value1, value2, "tAcId");
            return (Criteria) this;
        }

        public Criteria andTLevelIsNull() {
            addCriterion("t_level is null");
            return (Criteria) this;
        }

        public Criteria andTLevelIsNotNull() {
            addCriterion("t_level is not null");
            return (Criteria) this;
        }

        public Criteria andTLevelEqualTo(String value) {
            addCriterion("t_level =", value, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelNotEqualTo(String value) {
            addCriterion("t_level <>", value, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelGreaterThan(String value) {
            addCriterion("t_level >", value, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelGreaterThanOrEqualTo(String value) {
            addCriterion("t_level >=", value, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelLessThan(String value) {
            addCriterion("t_level <", value, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelLessThanOrEqualTo(String value) {
            addCriterion("t_level <=", value, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelLike(String value) {
            addCriterion("t_level like", value, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelNotLike(String value) {
            addCriterion("t_level not like", value, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelIn(List<String> values) {
            addCriterion("t_level in", values, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelNotIn(List<String> values) {
            addCriterion("t_level not in", values, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelBetween(String value1, String value2) {
            addCriterion("t_level between", value1, value2, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTLevelNotBetween(String value1, String value2) {
            addCriterion("t_level not between", value1, value2, "tLevel");
            return (Criteria) this;
        }

        public Criteria andTRegisterIsNull() {
            addCriterion("t_register is null");
            return (Criteria) this;
        }

        public Criteria andTRegisterIsNotNull() {
            addCriterion("t_register is not null");
            return (Criteria) this;
        }

        public Criteria andTRegisterEqualTo(String value) {
            addCriterion("t_register =", value, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterNotEqualTo(String value) {
            addCriterion("t_register <>", value, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterGreaterThan(String value) {
            addCriterion("t_register >", value, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("t_register >=", value, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterLessThan(String value) {
            addCriterion("t_register <", value, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterLessThanOrEqualTo(String value) {
            addCriterion("t_register <=", value, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterLike(String value) {
            addCriterion("t_register like", value, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterNotLike(String value) {
            addCriterion("t_register not like", value, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterIn(List<String> values) {
            addCriterion("t_register in", values, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterNotIn(List<String> values) {
            addCriterion("t_register not in", values, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterBetween(String value1, String value2) {
            addCriterion("t_register between", value1, value2, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTRegisterNotBetween(String value1, String value2) {
            addCriterion("t_register not between", value1, value2, "tRegister");
            return (Criteria) this;
        }

        public Criteria andTFileIsNull() {
            addCriterion("t_file is null");
            return (Criteria) this;
        }

        public Criteria andTFileIsNotNull() {
            addCriterion("t_file is not null");
            return (Criteria) this;
        }

        public Criteria andTFileEqualTo(String value) {
            addCriterion("t_file =", value, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileNotEqualTo(String value) {
            addCriterion("t_file <>", value, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileGreaterThan(String value) {
            addCriterion("t_file >", value, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileGreaterThanOrEqualTo(String value) {
            addCriterion("t_file >=", value, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileLessThan(String value) {
            addCriterion("t_file <", value, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileLessThanOrEqualTo(String value) {
            addCriterion("t_file <=", value, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileLike(String value) {
            addCriterion("t_file like", value, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileNotLike(String value) {
            addCriterion("t_file not like", value, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileIn(List<String> values) {
            addCriterion("t_file in", values, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileNotIn(List<String> values) {
            addCriterion("t_file not in", values, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileBetween(String value1, String value2) {
            addCriterion("t_file between", value1, value2, "tFile");
            return (Criteria) this;
        }

        public Criteria andTFileNotBetween(String value1, String value2) {
            addCriterion("t_file not between", value1, value2, "tFile");
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