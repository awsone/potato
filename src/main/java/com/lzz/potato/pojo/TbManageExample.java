package com.lzz.potato.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TbManageExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMCompangIsNull() {
            addCriterion("m_compang is null");
            return (Criteria) this;
        }

        public Criteria andMCompangIsNotNull() {
            addCriterion("m_compang is not null");
            return (Criteria) this;
        }

        public Criteria andMCompangEqualTo(String value) {
            addCriterion("m_compang =", value, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangNotEqualTo(String value) {
            addCriterion("m_compang <>", value, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangGreaterThan(String value) {
            addCriterion("m_compang >", value, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangGreaterThanOrEqualTo(String value) {
            addCriterion("m_compang >=", value, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangLessThan(String value) {
            addCriterion("m_compang <", value, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangLessThanOrEqualTo(String value) {
            addCriterion("m_compang <=", value, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangLike(String value) {
            addCriterion("m_compang like", value, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangNotLike(String value) {
            addCriterion("m_compang not like", value, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangIn(List<String> values) {
            addCriterion("m_compang in", values, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangNotIn(List<String> values) {
            addCriterion("m_compang not in", values, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangBetween(String value1, String value2) {
            addCriterion("m_compang between", value1, value2, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMCompangNotBetween(String value1, String value2) {
            addCriterion("m_compang not between", value1, value2, "mCompang");
            return (Criteria) this;
        }

        public Criteria andMStarttimeIsNull() {
            addCriterion("m_starttime is null");
            return (Criteria) this;
        }

        public Criteria andMStarttimeIsNotNull() {
            addCriterion("m_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andMStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("m_starttime =", value, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("m_starttime <>", value, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("m_starttime >", value, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("m_starttime >=", value, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("m_starttime <", value, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("m_starttime <=", value, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("m_starttime in", values, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("m_starttime not in", values, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("m_starttime between", value1, value2, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("m_starttime not between", value1, value2, "mStarttime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeIsNull() {
            addCriterion("m_endtime is null");
            return (Criteria) this;
        }

        public Criteria andMEndtimeIsNotNull() {
            addCriterion("m_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andMEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("m_endtime =", value, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("m_endtime <>", value, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("m_endtime >", value, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("m_endtime >=", value, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("m_endtime <", value, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("m_endtime <=", value, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("m_endtime in", values, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("m_endtime not in", values, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("m_endtime between", value1, value2, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("m_endtime not between", value1, value2, "mEndtime");
            return (Criteria) this;
        }

        public Criteria andMLeaderAIsNull() {
            addCriterion("m_leader_a is null");
            return (Criteria) this;
        }

        public Criteria andMLeaderAIsNotNull() {
            addCriterion("m_leader_a is not null");
            return (Criteria) this;
        }

        public Criteria andMLeaderAEqualTo(String value) {
            addCriterion("m_leader_a =", value, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderANotEqualTo(String value) {
            addCriterion("m_leader_a <>", value, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderAGreaterThan(String value) {
            addCriterion("m_leader_a >", value, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderAGreaterThanOrEqualTo(String value) {
            addCriterion("m_leader_a >=", value, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderALessThan(String value) {
            addCriterion("m_leader_a <", value, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderALessThanOrEqualTo(String value) {
            addCriterion("m_leader_a <=", value, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderALike(String value) {
            addCriterion("m_leader_a like", value, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderANotLike(String value) {
            addCriterion("m_leader_a not like", value, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderAIn(List<String> values) {
            addCriterion("m_leader_a in", values, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderANotIn(List<String> values) {
            addCriterion("m_leader_a not in", values, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderABetween(String value1, String value2) {
            addCriterion("m_leader_a between", value1, value2, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderANotBetween(String value1, String value2) {
            addCriterion("m_leader_a not between", value1, value2, "mLeaderA");
            return (Criteria) this;
        }

        public Criteria andMLeaderBIsNull() {
            addCriterion("m_leader_b is null");
            return (Criteria) this;
        }

        public Criteria andMLeaderBIsNotNull() {
            addCriterion("m_leader_b is not null");
            return (Criteria) this;
        }

        public Criteria andMLeaderBEqualTo(String value) {
            addCriterion("m_leader_b =", value, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBNotEqualTo(String value) {
            addCriterion("m_leader_b <>", value, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBGreaterThan(String value) {
            addCriterion("m_leader_b >", value, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBGreaterThanOrEqualTo(String value) {
            addCriterion("m_leader_b >=", value, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBLessThan(String value) {
            addCriterion("m_leader_b <", value, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBLessThanOrEqualTo(String value) {
            addCriterion("m_leader_b <=", value, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBLike(String value) {
            addCriterion("m_leader_b like", value, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBNotLike(String value) {
            addCriterion("m_leader_b not like", value, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBIn(List<String> values) {
            addCriterion("m_leader_b in", values, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBNotIn(List<String> values) {
            addCriterion("m_leader_b not in", values, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBBetween(String value1, String value2) {
            addCriterion("m_leader_b between", value1, value2, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMLeaderBNotBetween(String value1, String value2) {
            addCriterion("m_leader_b not between", value1, value2, "mLeaderB");
            return (Criteria) this;
        }

        public Criteria andMMoneyIsNull() {
            addCriterion("m_money is null");
            return (Criteria) this;
        }

        public Criteria andMMoneyIsNotNull() {
            addCriterion("m_money is not null");
            return (Criteria) this;
        }

        public Criteria andMMoneyEqualTo(Double value) {
            addCriterion("m_money =", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyNotEqualTo(Double value) {
            addCriterion("m_money <>", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyGreaterThan(Double value) {
            addCriterion("m_money >", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("m_money >=", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyLessThan(Double value) {
            addCriterion("m_money <", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyLessThanOrEqualTo(Double value) {
            addCriterion("m_money <=", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyIn(List<Double> values) {
            addCriterion("m_money in", values, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyNotIn(List<Double> values) {
            addCriterion("m_money not in", values, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyBetween(Double value1, Double value2) {
            addCriterion("m_money between", value1, value2, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyNotBetween(Double value1, Double value2) {
            addCriterion("m_money not between", value1, value2, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMPayIsNull() {
            addCriterion("m_pay is null");
            return (Criteria) this;
        }

        public Criteria andMPayIsNotNull() {
            addCriterion("m_pay is not null");
            return (Criteria) this;
        }

        public Criteria andMPayEqualTo(Double value) {
            addCriterion("m_pay =", value, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayNotEqualTo(Double value) {
            addCriterion("m_pay <>", value, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayGreaterThan(Double value) {
            addCriterion("m_pay >", value, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayGreaterThanOrEqualTo(Double value) {
            addCriterion("m_pay >=", value, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayLessThan(Double value) {
            addCriterion("m_pay <", value, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayLessThanOrEqualTo(Double value) {
            addCriterion("m_pay <=", value, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayIn(List<Double> values) {
            addCriterion("m_pay in", values, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayNotIn(List<Double> values) {
            addCriterion("m_pay not in", values, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayBetween(Double value1, Double value2) {
            addCriterion("m_pay between", value1, value2, "mPay");
            return (Criteria) this;
        }

        public Criteria andMPayNotBetween(Double value1, Double value2) {
            addCriterion("m_pay not between", value1, value2, "mPay");
            return (Criteria) this;
        }

        public Criteria andMFileIsNull() {
            addCriterion("m_file is null");
            return (Criteria) this;
        }

        public Criteria andMFileIsNotNull() {
            addCriterion("m_file is not null");
            return (Criteria) this;
        }

        public Criteria andMFileEqualTo(String value) {
            addCriterion("m_file =", value, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileNotEqualTo(String value) {
            addCriterion("m_file <>", value, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileGreaterThan(String value) {
            addCriterion("m_file >", value, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileGreaterThanOrEqualTo(String value) {
            addCriterion("m_file >=", value, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileLessThan(String value) {
            addCriterion("m_file <", value, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileLessThanOrEqualTo(String value) {
            addCriterion("m_file <=", value, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileLike(String value) {
            addCriterion("m_file like", value, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileNotLike(String value) {
            addCriterion("m_file not like", value, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileIn(List<String> values) {
            addCriterion("m_file in", values, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileNotIn(List<String> values) {
            addCriterion("m_file not in", values, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileBetween(String value1, String value2) {
            addCriterion("m_file between", value1, value2, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFileNotBetween(String value1, String value2) {
            addCriterion("m_file not between", value1, value2, "mFile");
            return (Criteria) this;
        }

        public Criteria andMFlagIsNull() {
            addCriterion("m_flag is null");
            return (Criteria) this;
        }

        public Criteria andMFlagIsNotNull() {
            addCriterion("m_flag is not null");
            return (Criteria) this;
        }

        public Criteria andMFlagEqualTo(String value) {
            addCriterion("m_flag =", value, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagNotEqualTo(String value) {
            addCriterion("m_flag <>", value, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagGreaterThan(String value) {
            addCriterion("m_flag >", value, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagGreaterThanOrEqualTo(String value) {
            addCriterion("m_flag >=", value, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagLessThan(String value) {
            addCriterion("m_flag <", value, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagLessThanOrEqualTo(String value) {
            addCriterion("m_flag <=", value, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagLike(String value) {
            addCriterion("m_flag like", value, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagNotLike(String value) {
            addCriterion("m_flag not like", value, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagIn(List<String> values) {
            addCriterion("m_flag in", values, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagNotIn(List<String> values) {
            addCriterion("m_flag not in", values, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagBetween(String value1, String value2) {
            addCriterion("m_flag between", value1, value2, "mFlag");
            return (Criteria) this;
        }

        public Criteria andMFlagNotBetween(String value1, String value2) {
            addCriterion("m_flag not between", value1, value2, "mFlag");
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