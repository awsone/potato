package com.lzz.potato.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TbPersonExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPPasswordIsNull() {
            addCriterion("p_password is null");
            return (Criteria) this;
        }

        public Criteria andPPasswordIsNotNull() {
            addCriterion("p_password is not null");
            return (Criteria) this;
        }

        public Criteria andPPasswordEqualTo(String value) {
            addCriterion("p_password =", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotEqualTo(String value) {
            addCriterion("p_password <>", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordGreaterThan(String value) {
            addCriterion("p_password >", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("p_password >=", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLessThan(String value) {
            addCriterion("p_password <", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLessThanOrEqualTo(String value) {
            addCriterion("p_password <=", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordLike(String value) {
            addCriterion("p_password like", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotLike(String value) {
            addCriterion("p_password not like", value, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordIn(List<String> values) {
            addCriterion("p_password in", values, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotIn(List<String> values) {
            addCriterion("p_password not in", values, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordBetween(String value1, String value2) {
            addCriterion("p_password between", value1, value2, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPPasswordNotBetween(String value1, String value2) {
            addCriterion("p_password not between", value1, value2, "pPassword");
            return (Criteria) this;
        }

        public Criteria andPSaltIsNull() {
            addCriterion("p_salt is null");
            return (Criteria) this;
        }

        public Criteria andPSaltIsNotNull() {
            addCriterion("p_salt is not null");
            return (Criteria) this;
        }

        public Criteria andPSaltEqualTo(String value) {
            addCriterion("p_salt =", value, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltNotEqualTo(String value) {
            addCriterion("p_salt <>", value, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltGreaterThan(String value) {
            addCriterion("p_salt >", value, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltGreaterThanOrEqualTo(String value) {
            addCriterion("p_salt >=", value, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltLessThan(String value) {
            addCriterion("p_salt <", value, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltLessThanOrEqualTo(String value) {
            addCriterion("p_salt <=", value, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltLike(String value) {
            addCriterion("p_salt like", value, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltNotLike(String value) {
            addCriterion("p_salt not like", value, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltIn(List<String> values) {
            addCriterion("p_salt in", values, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltNotIn(List<String> values) {
            addCriterion("p_salt not in", values, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltBetween(String value1, String value2) {
            addCriterion("p_salt between", value1, value2, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPSaltNotBetween(String value1, String value2) {
            addCriterion("p_salt not between", value1, value2, "pSalt");
            return (Criteria) this;
        }

        public Criteria andPLocationIsNull() {
            addCriterion("p_location is null");
            return (Criteria) this;
        }

        public Criteria andPLocationIsNotNull() {
            addCriterion("p_location is not null");
            return (Criteria) this;
        }

        public Criteria andPLocationEqualTo(String value) {
            addCriterion("p_location =", value, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationNotEqualTo(String value) {
            addCriterion("p_location <>", value, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationGreaterThan(String value) {
            addCriterion("p_location >", value, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationGreaterThanOrEqualTo(String value) {
            addCriterion("p_location >=", value, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationLessThan(String value) {
            addCriterion("p_location <", value, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationLessThanOrEqualTo(String value) {
            addCriterion("p_location <=", value, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationLike(String value) {
            addCriterion("p_location like", value, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationNotLike(String value) {
            addCriterion("p_location not like", value, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationIn(List<String> values) {
            addCriterion("p_location in", values, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationNotIn(List<String> values) {
            addCriterion("p_location not in", values, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationBetween(String value1, String value2) {
            addCriterion("p_location between", value1, value2, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPLocationNotBetween(String value1, String value2) {
            addCriterion("p_location not between", value1, value2, "pLocation");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPBirthdayIsNull() {
            addCriterion("p_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPBirthdayIsNotNull() {
            addCriterion("p_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("p_birthday =", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("p_birthday <>", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("p_birthday >", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_birthday >=", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("p_birthday <", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_birthday <=", value, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("p_birthday in", values, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("p_birthday not in", values, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_birthday between", value1, value2, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_birthday not between", value1, value2, "pBirthday");
            return (Criteria) this;
        }

        public Criteria andPHomeIsNull() {
            addCriterion("p_home is null");
            return (Criteria) this;
        }

        public Criteria andPHomeIsNotNull() {
            addCriterion("p_home is not null");
            return (Criteria) this;
        }

        public Criteria andPHomeEqualTo(String value) {
            addCriterion("p_home =", value, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeNotEqualTo(String value) {
            addCriterion("p_home <>", value, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeGreaterThan(String value) {
            addCriterion("p_home >", value, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeGreaterThanOrEqualTo(String value) {
            addCriterion("p_home >=", value, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeLessThan(String value) {
            addCriterion("p_home <", value, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeLessThanOrEqualTo(String value) {
            addCriterion("p_home <=", value, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeLike(String value) {
            addCriterion("p_home like", value, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeNotLike(String value) {
            addCriterion("p_home not like", value, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeIn(List<String> values) {
            addCriterion("p_home in", values, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeNotIn(List<String> values) {
            addCriterion("p_home not in", values, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeBetween(String value1, String value2) {
            addCriterion("p_home between", value1, value2, "pHome");
            return (Criteria) this;
        }

        public Criteria andPHomeNotBetween(String value1, String value2) {
            addCriterion("p_home not between", value1, value2, "pHome");
            return (Criteria) this;
        }

        public Criteria andPSchoolIsNull() {
            addCriterion("p_school is null");
            return (Criteria) this;
        }

        public Criteria andPSchoolIsNotNull() {
            addCriterion("p_school is not null");
            return (Criteria) this;
        }

        public Criteria andPSchoolEqualTo(String value) {
            addCriterion("p_school =", value, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolNotEqualTo(String value) {
            addCriterion("p_school <>", value, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolGreaterThan(String value) {
            addCriterion("p_school >", value, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("p_school >=", value, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolLessThan(String value) {
            addCriterion("p_school <", value, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolLessThanOrEqualTo(String value) {
            addCriterion("p_school <=", value, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolLike(String value) {
            addCriterion("p_school like", value, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolNotLike(String value) {
            addCriterion("p_school not like", value, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolIn(List<String> values) {
            addCriterion("p_school in", values, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolNotIn(List<String> values) {
            addCriterion("p_school not in", values, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolBetween(String value1, String value2) {
            addCriterion("p_school between", value1, value2, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPSchoolNotBetween(String value1, String value2) {
            addCriterion("p_school not between", value1, value2, "pSchool");
            return (Criteria) this;
        }

        public Criteria andPEduIsNull() {
            addCriterion("p_edu is null");
            return (Criteria) this;
        }

        public Criteria andPEduIsNotNull() {
            addCriterion("p_edu is not null");
            return (Criteria) this;
        }

        public Criteria andPEduEqualTo(String value) {
            addCriterion("p_edu =", value, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduNotEqualTo(String value) {
            addCriterion("p_edu <>", value, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduGreaterThan(String value) {
            addCriterion("p_edu >", value, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduGreaterThanOrEqualTo(String value) {
            addCriterion("p_edu >=", value, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduLessThan(String value) {
            addCriterion("p_edu <", value, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduLessThanOrEqualTo(String value) {
            addCriterion("p_edu <=", value, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduLike(String value) {
            addCriterion("p_edu like", value, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduNotLike(String value) {
            addCriterion("p_edu not like", value, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduIn(List<String> values) {
            addCriterion("p_edu in", values, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduNotIn(List<String> values) {
            addCriterion("p_edu not in", values, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduBetween(String value1, String value2) {
            addCriterion("p_edu between", value1, value2, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPEduNotBetween(String value1, String value2) {
            addCriterion("p_edu not between", value1, value2, "pEdu");
            return (Criteria) this;
        }

        public Criteria andPFinishIsNull() {
            addCriterion("p_finish is null");
            return (Criteria) this;
        }

        public Criteria andPFinishIsNotNull() {
            addCriterion("p_finish is not null");
            return (Criteria) this;
        }

        public Criteria andPFinishEqualTo(Date value) {
            addCriterionForJDBCDate("p_finish =", value, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishNotEqualTo(Date value) {
            addCriterionForJDBCDate("p_finish <>", value, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishGreaterThan(Date value) {
            addCriterionForJDBCDate("p_finish >", value, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_finish >=", value, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishLessThan(Date value) {
            addCriterionForJDBCDate("p_finish <", value, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_finish <=", value, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishIn(List<Date> values) {
            addCriterionForJDBCDate("p_finish in", values, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishNotIn(List<Date> values) {
            addCriterionForJDBCDate("p_finish not in", values, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_finish between", value1, value2, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPFinishNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_finish not between", value1, value2, "pFinish");
            return (Criteria) this;
        }

        public Criteria andPMajorIsNull() {
            addCriterion("p_major is null");
            return (Criteria) this;
        }

        public Criteria andPMajorIsNotNull() {
            addCriterion("p_major is not null");
            return (Criteria) this;
        }

        public Criteria andPMajorEqualTo(String value) {
            addCriterion("p_major =", value, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorNotEqualTo(String value) {
            addCriterion("p_major <>", value, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorGreaterThan(String value) {
            addCriterion("p_major >", value, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorGreaterThanOrEqualTo(String value) {
            addCriterion("p_major >=", value, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorLessThan(String value) {
            addCriterion("p_major <", value, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorLessThanOrEqualTo(String value) {
            addCriterion("p_major <=", value, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorLike(String value) {
            addCriterion("p_major like", value, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorNotLike(String value) {
            addCriterion("p_major not like", value, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorIn(List<String> values) {
            addCriterion("p_major in", values, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorNotIn(List<String> values) {
            addCriterion("p_major not in", values, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorBetween(String value1, String value2) {
            addCriterion("p_major between", value1, value2, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPMajorNotBetween(String value1, String value2) {
            addCriterion("p_major not between", value1, value2, "pMajor");
            return (Criteria) this;
        }

        public Criteria andPWorkIsNull() {
            addCriterion("p_work is null");
            return (Criteria) this;
        }

        public Criteria andPWorkIsNotNull() {
            addCriterion("p_work is not null");
            return (Criteria) this;
        }

        public Criteria andPWorkEqualTo(String value) {
            addCriterion("p_work =", value, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkNotEqualTo(String value) {
            addCriterion("p_work <>", value, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkGreaterThan(String value) {
            addCriterion("p_work >", value, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkGreaterThanOrEqualTo(String value) {
            addCriterion("p_work >=", value, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkLessThan(String value) {
            addCriterion("p_work <", value, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkLessThanOrEqualTo(String value) {
            addCriterion("p_work <=", value, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkLike(String value) {
            addCriterion("p_work like", value, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkNotLike(String value) {
            addCriterion("p_work not like", value, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkIn(List<String> values) {
            addCriterion("p_work in", values, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkNotIn(List<String> values) {
            addCriterion("p_work not in", values, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkBetween(String value1, String value2) {
            addCriterion("p_work between", value1, value2, "pWork");
            return (Criteria) this;
        }

        public Criteria andPWorkNotBetween(String value1, String value2) {
            addCriterion("p_work not between", value1, value2, "pWork");
            return (Criteria) this;
        }

        public Criteria andPJobtimeIsNull() {
            addCriterion("p_jobtime is null");
            return (Criteria) this;
        }

        public Criteria andPJobtimeIsNotNull() {
            addCriterion("p_jobtime is not null");
            return (Criteria) this;
        }

        public Criteria andPJobtimeEqualTo(Date value) {
            addCriterionForJDBCDate("p_jobtime =", value, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("p_jobtime <>", value, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("p_jobtime >", value, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_jobtime >=", value, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeLessThan(Date value) {
            addCriterionForJDBCDate("p_jobtime <", value, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_jobtime <=", value, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeIn(List<Date> values) {
            addCriterionForJDBCDate("p_jobtime in", values, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("p_jobtime not in", values, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_jobtime between", value1, value2, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPJobtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_jobtime not between", value1, value2, "pJobtime");
            return (Criteria) this;
        }

        public Criteria andPQualiIsNull() {
            addCriterion("p_quali is null");
            return (Criteria) this;
        }

        public Criteria andPQualiIsNotNull() {
            addCriterion("p_quali is not null");
            return (Criteria) this;
        }

        public Criteria andPQualiEqualTo(String value) {
            addCriterion("p_quali =", value, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiNotEqualTo(String value) {
            addCriterion("p_quali <>", value, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiGreaterThan(String value) {
            addCriterion("p_quali >", value, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiGreaterThanOrEqualTo(String value) {
            addCriterion("p_quali >=", value, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiLessThan(String value) {
            addCriterion("p_quali <", value, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiLessThanOrEqualTo(String value) {
            addCriterion("p_quali <=", value, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiLike(String value) {
            addCriterion("p_quali like", value, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiNotLike(String value) {
            addCriterion("p_quali not like", value, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiIn(List<String> values) {
            addCriterion("p_quali in", values, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiNotIn(List<String> values) {
            addCriterion("p_quali not in", values, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiBetween(String value1, String value2) {
            addCriterion("p_quali between", value1, value2, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualiNotBetween(String value1, String value2) {
            addCriterion("p_quali not between", value1, value2, "pQuali");
            return (Criteria) this;
        }

        public Criteria andPQualitimeIsNull() {
            addCriterion("p_qualitime is null");
            return (Criteria) this;
        }

        public Criteria andPQualitimeIsNotNull() {
            addCriterion("p_qualitime is not null");
            return (Criteria) this;
        }

        public Criteria andPQualitimeEqualTo(Date value) {
            addCriterionForJDBCDate("p_qualitime =", value, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("p_qualitime <>", value, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeGreaterThan(Date value) {
            addCriterionForJDBCDate("p_qualitime >", value, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_qualitime >=", value, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeLessThan(Date value) {
            addCriterionForJDBCDate("p_qualitime <", value, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("p_qualitime <=", value, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeIn(List<Date> values) {
            addCriterionForJDBCDate("p_qualitime in", values, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("p_qualitime not in", values, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_qualitime between", value1, value2, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPQualitimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("p_qualitime not between", value1, value2, "pQualitime");
            return (Criteria) this;
        }

        public Criteria andPIdentityIsNull() {
            addCriterion("p_identity is null");
            return (Criteria) this;
        }

        public Criteria andPIdentityIsNotNull() {
            addCriterion("p_identity is not null");
            return (Criteria) this;
        }

        public Criteria andPIdentityEqualTo(String value) {
            addCriterion("p_identity =", value, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityNotEqualTo(String value) {
            addCriterion("p_identity <>", value, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityGreaterThan(String value) {
            addCriterion("p_identity >", value, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("p_identity >=", value, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityLessThan(String value) {
            addCriterion("p_identity <", value, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityLessThanOrEqualTo(String value) {
            addCriterion("p_identity <=", value, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityLike(String value) {
            addCriterion("p_identity like", value, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityNotLike(String value) {
            addCriterion("p_identity not like", value, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityIn(List<String> values) {
            addCriterion("p_identity in", values, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityNotIn(List<String> values) {
            addCriterion("p_identity not in", values, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityBetween(String value1, String value2) {
            addCriterion("p_identity between", value1, value2, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityNotBetween(String value1, String value2) {
            addCriterion("p_identity not between", value1, value2, "pIdentity");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdIsNull() {
            addCriterion("p_identity_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdIsNotNull() {
            addCriterion("p_identity_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdEqualTo(Integer value) {
            addCriterion("p_identity_id =", value, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdNotEqualTo(Integer value) {
            addCriterion("p_identity_id <>", value, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdGreaterThan(Integer value) {
            addCriterion("p_identity_id >", value, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_identity_id >=", value, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdLessThan(Integer value) {
            addCriterion("p_identity_id <", value, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_identity_id <=", value, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdIn(List<Integer> values) {
            addCriterion("p_identity_id in", values, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdNotIn(List<Integer> values) {
            addCriterion("p_identity_id not in", values, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdBetween(Integer value1, Integer value2) {
            addCriterion("p_identity_id between", value1, value2, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPIdentityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_identity_id not between", value1, value2, "pIdentityId");
            return (Criteria) this;
        }

        public Criteria andPLevelIsNull() {
            addCriterion("p_level is null");
            return (Criteria) this;
        }

        public Criteria andPLevelIsNotNull() {
            addCriterion("p_level is not null");
            return (Criteria) this;
        }

        public Criteria andPLevelEqualTo(String value) {
            addCriterion("p_level =", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelNotEqualTo(String value) {
            addCriterion("p_level <>", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelGreaterThan(String value) {
            addCriterion("p_level >", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelGreaterThanOrEqualTo(String value) {
            addCriterion("p_level >=", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelLessThan(String value) {
            addCriterion("p_level <", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelLessThanOrEqualTo(String value) {
            addCriterion("p_level <=", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelLike(String value) {
            addCriterion("p_level like", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelNotLike(String value) {
            addCriterion("p_level not like", value, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelIn(List<String> values) {
            addCriterion("p_level in", values, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelNotIn(List<String> values) {
            addCriterion("p_level not in", values, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelBetween(String value1, String value2) {
            addCriterion("p_level between", value1, value2, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPLevelNotBetween(String value1, String value2) {
            addCriterion("p_level not between", value1, value2, "pLevel");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNull() {
            addCriterion("p_type is null");
            return (Criteria) this;
        }

        public Criteria andPTypeIsNotNull() {
            addCriterion("p_type is not null");
            return (Criteria) this;
        }

        public Criteria andPTypeEqualTo(String value) {
            addCriterion("p_type =", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotEqualTo(String value) {
            addCriterion("p_type <>", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThan(String value) {
            addCriterion("p_type >", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeGreaterThanOrEqualTo(String value) {
            addCriterion("p_type >=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThan(String value) {
            addCriterion("p_type <", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLessThanOrEqualTo(String value) {
            addCriterion("p_type <=", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeLike(String value) {
            addCriterion("p_type like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotLike(String value) {
            addCriterion("p_type not like", value, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeIn(List<String> values) {
            addCriterion("p_type in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotIn(List<String> values) {
            addCriterion("p_type not in", values, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeBetween(String value1, String value2) {
            addCriterion("p_type between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPTypeNotBetween(String value1, String value2) {
            addCriterion("p_type not between", value1, value2, "pType");
            return (Criteria) this;
        }

        public Criteria andPExtraIsNull() {
            addCriterion("p_extra is null");
            return (Criteria) this;
        }

        public Criteria andPExtraIsNotNull() {
            addCriterion("p_extra is not null");
            return (Criteria) this;
        }

        public Criteria andPExtraEqualTo(String value) {
            addCriterion("p_extra =", value, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraNotEqualTo(String value) {
            addCriterion("p_extra <>", value, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraGreaterThan(String value) {
            addCriterion("p_extra >", value, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraGreaterThanOrEqualTo(String value) {
            addCriterion("p_extra >=", value, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraLessThan(String value) {
            addCriterion("p_extra <", value, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraLessThanOrEqualTo(String value) {
            addCriterion("p_extra <=", value, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraLike(String value) {
            addCriterion("p_extra like", value, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraNotLike(String value) {
            addCriterion("p_extra not like", value, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraIn(List<String> values) {
            addCriterion("p_extra in", values, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraNotIn(List<String> values) {
            addCriterion("p_extra not in", values, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraBetween(String value1, String value2) {
            addCriterion("p_extra between", value1, value2, "pExtra");
            return (Criteria) this;
        }

        public Criteria andPExtraNotBetween(String value1, String value2) {
            addCriterion("p_extra not between", value1, value2, "pExtra");
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