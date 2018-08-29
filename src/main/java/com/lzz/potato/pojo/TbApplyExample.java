package com.lzz.potato.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TbApplyExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("a_name is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("a_name is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("a_name =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("a_name <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("a_name >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("a_name >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("a_name <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("a_name <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("a_name like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("a_name not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("a_name in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("a_name not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("a_name between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("a_name not between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andATypeIsNull() {
            addCriterion("a_type is null");
            return (Criteria) this;
        }

        public Criteria andATypeIsNotNull() {
            addCriterion("a_type is not null");
            return (Criteria) this;
        }

        public Criteria andATypeEqualTo(String value) {
            addCriterion("a_type =", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotEqualTo(String value) {
            addCriterion("a_type <>", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeGreaterThan(String value) {
            addCriterion("a_type >", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeGreaterThanOrEqualTo(String value) {
            addCriterion("a_type >=", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLessThan(String value) {
            addCriterion("a_type <", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLessThanOrEqualTo(String value) {
            addCriterion("a_type <=", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeLike(String value) {
            addCriterion("a_type like", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotLike(String value) {
            addCriterion("a_type not like", value, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeIn(List<String> values) {
            addCriterion("a_type in", values, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotIn(List<String> values) {
            addCriterion("a_type not in", values, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeBetween(String value1, String value2) {
            addCriterion("a_type between", value1, value2, "aType");
            return (Criteria) this;
        }

        public Criteria andATypeNotBetween(String value1, String value2) {
            addCriterion("a_type not between", value1, value2, "aType");
            return (Criteria) this;
        }

        public Criteria andALocationIsNull() {
            addCriterion("a_location is null");
            return (Criteria) this;
        }

        public Criteria andALocationIsNotNull() {
            addCriterion("a_location is not null");
            return (Criteria) this;
        }

        public Criteria andALocationEqualTo(String value) {
            addCriterion("a_location =", value, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationNotEqualTo(String value) {
            addCriterion("a_location <>", value, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationGreaterThan(String value) {
            addCriterion("a_location >", value, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationGreaterThanOrEqualTo(String value) {
            addCriterion("a_location >=", value, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationLessThan(String value) {
            addCriterion("a_location <", value, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationLessThanOrEqualTo(String value) {
            addCriterion("a_location <=", value, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationLike(String value) {
            addCriterion("a_location like", value, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationNotLike(String value) {
            addCriterion("a_location not like", value, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationIn(List<String> values) {
            addCriterion("a_location in", values, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationNotIn(List<String> values) {
            addCriterion("a_location not in", values, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationBetween(String value1, String value2) {
            addCriterion("a_location between", value1, value2, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALocationNotBetween(String value1, String value2) {
            addCriterion("a_location not between", value1, value2, "aLocation");
            return (Criteria) this;
        }

        public Criteria andALeaderIsNull() {
            addCriterion("a_leader is null");
            return (Criteria) this;
        }

        public Criteria andALeaderIsNotNull() {
            addCriterion("a_leader is not null");
            return (Criteria) this;
        }

        public Criteria andALeaderEqualTo(String value) {
            addCriterion("a_leader =", value, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderNotEqualTo(String value) {
            addCriterion("a_leader <>", value, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderGreaterThan(String value) {
            addCriterion("a_leader >", value, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderGreaterThanOrEqualTo(String value) {
            addCriterion("a_leader >=", value, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderLessThan(String value) {
            addCriterion("a_leader <", value, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderLessThanOrEqualTo(String value) {
            addCriterion("a_leader <=", value, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderLike(String value) {
            addCriterion("a_leader like", value, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderNotLike(String value) {
            addCriterion("a_leader not like", value, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderIn(List<String> values) {
            addCriterion("a_leader in", values, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderNotIn(List<String> values) {
            addCriterion("a_leader not in", values, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderBetween(String value1, String value2) {
            addCriterion("a_leader between", value1, value2, "aLeader");
            return (Criteria) this;
        }

        public Criteria andALeaderNotBetween(String value1, String value2) {
            addCriterion("a_leader not between", value1, value2, "aLeader");
            return (Criteria) this;
        }

        public Criteria andAMoneyIsNull() {
            addCriterion("a_money is null");
            return (Criteria) this;
        }

        public Criteria andAMoneyIsNotNull() {
            addCriterion("a_money is not null");
            return (Criteria) this;
        }

        public Criteria andAMoneyEqualTo(Double value) {
            addCriterion("a_money =", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotEqualTo(Double value) {
            addCriterion("a_money <>", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyGreaterThan(Double value) {
            addCriterion("a_money >", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("a_money >=", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyLessThan(Double value) {
            addCriterion("a_money <", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyLessThanOrEqualTo(Double value) {
            addCriterion("a_money <=", value, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyIn(List<Double> values) {
            addCriterion("a_money in", values, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotIn(List<Double> values) {
            addCriterion("a_money not in", values, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyBetween(Double value1, Double value2) {
            addCriterion("a_money between", value1, value2, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAMoneyNotBetween(Double value1, Double value2) {
            addCriterion("a_money not between", value1, value2, "aMoney");
            return (Criteria) this;
        }

        public Criteria andAContentIsNull() {
            addCriterion("a_content is null");
            return (Criteria) this;
        }

        public Criteria andAContentIsNotNull() {
            addCriterion("a_content is not null");
            return (Criteria) this;
        }

        public Criteria andAContentEqualTo(String value) {
            addCriterion("a_content =", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentNotEqualTo(String value) {
            addCriterion("a_content <>", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentGreaterThan(String value) {
            addCriterion("a_content >", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentGreaterThanOrEqualTo(String value) {
            addCriterion("a_content >=", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentLessThan(String value) {
            addCriterion("a_content <", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentLessThanOrEqualTo(String value) {
            addCriterion("a_content <=", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentLike(String value) {
            addCriterion("a_content like", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentNotLike(String value) {
            addCriterion("a_content not like", value, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentIn(List<String> values) {
            addCriterion("a_content in", values, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentNotIn(List<String> values) {
            addCriterion("a_content not in", values, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentBetween(String value1, String value2) {
            addCriterion("a_content between", value1, value2, "aContent");
            return (Criteria) this;
        }

        public Criteria andAContentNotBetween(String value1, String value2) {
            addCriterion("a_content not between", value1, value2, "aContent");
            return (Criteria) this;
        }

        public Criteria andAExtraIsNull() {
            addCriterion("a_extra is null");
            return (Criteria) this;
        }

        public Criteria andAExtraIsNotNull() {
            addCriterion("a_extra is not null");
            return (Criteria) this;
        }

        public Criteria andAExtraEqualTo(String value) {
            addCriterion("a_extra =", value, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraNotEqualTo(String value) {
            addCriterion("a_extra <>", value, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraGreaterThan(String value) {
            addCriterion("a_extra >", value, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraGreaterThanOrEqualTo(String value) {
            addCriterion("a_extra >=", value, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraLessThan(String value) {
            addCriterion("a_extra <", value, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraLessThanOrEqualTo(String value) {
            addCriterion("a_extra <=", value, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraLike(String value) {
            addCriterion("a_extra like", value, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraNotLike(String value) {
            addCriterion("a_extra not like", value, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraIn(List<String> values) {
            addCriterion("a_extra in", values, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraNotIn(List<String> values) {
            addCriterion("a_extra not in", values, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraBetween(String value1, String value2) {
            addCriterion("a_extra between", value1, value2, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAExtraNotBetween(String value1, String value2) {
            addCriterion("a_extra not between", value1, value2, "aExtra");
            return (Criteria) this;
        }

        public Criteria andAFileIsNull() {
            addCriterion("a_file is null");
            return (Criteria) this;
        }

        public Criteria andAFileIsNotNull() {
            addCriterion("a_file is not null");
            return (Criteria) this;
        }

        public Criteria andAFileEqualTo(String value) {
            addCriterion("a_file =", value, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileNotEqualTo(String value) {
            addCriterion("a_file <>", value, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileGreaterThan(String value) {
            addCriterion("a_file >", value, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileGreaterThanOrEqualTo(String value) {
            addCriterion("a_file >=", value, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileLessThan(String value) {
            addCriterion("a_file <", value, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileLessThanOrEqualTo(String value) {
            addCriterion("a_file <=", value, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileLike(String value) {
            addCriterion("a_file like", value, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileNotLike(String value) {
            addCriterion("a_file not like", value, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileIn(List<String> values) {
            addCriterion("a_file in", values, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileNotIn(List<String> values) {
            addCriterion("a_file not in", values, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileBetween(String value1, String value2) {
            addCriterion("a_file between", value1, value2, "aFile");
            return (Criteria) this;
        }

        public Criteria andAFileNotBetween(String value1, String value2) {
            addCriterion("a_file not between", value1, value2, "aFile");
            return (Criteria) this;
        }

        public Criteria andATheIdIsNull() {
            addCriterion("a_the_id is null");
            return (Criteria) this;
        }

        public Criteria andATheIdIsNotNull() {
            addCriterion("a_the_id is not null");
            return (Criteria) this;
        }

        public Criteria andATheIdEqualTo(Integer value) {
            addCriterion("a_the_id =", value, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdNotEqualTo(Integer value) {
            addCriterion("a_the_id <>", value, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdGreaterThan(Integer value) {
            addCriterion("a_the_id >", value, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_the_id >=", value, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdLessThan(Integer value) {
            addCriterion("a_the_id <", value, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_the_id <=", value, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdIn(List<Integer> values) {
            addCriterion("a_the_id in", values, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdNotIn(List<Integer> values) {
            addCriterion("a_the_id not in", values, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdBetween(Integer value1, Integer value2) {
            addCriterion("a_the_id between", value1, value2, "aTheId");
            return (Criteria) this;
        }

        public Criteria andATheIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_the_id not between", value1, value2, "aTheId");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionIsNull() {
            addCriterion("a_first_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionIsNotNull() {
            addCriterion("a_first_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionEqualTo(String value) {
            addCriterion("a_first_opinion =", value, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionNotEqualTo(String value) {
            addCriterion("a_first_opinion <>", value, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionGreaterThan(String value) {
            addCriterion("a_first_opinion >", value, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("a_first_opinion >=", value, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionLessThan(String value) {
            addCriterion("a_first_opinion <", value, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionLessThanOrEqualTo(String value) {
            addCriterion("a_first_opinion <=", value, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionLike(String value) {
            addCriterion("a_first_opinion like", value, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionNotLike(String value) {
            addCriterion("a_first_opinion not like", value, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionIn(List<String> values) {
            addCriterion("a_first_opinion in", values, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionNotIn(List<String> values) {
            addCriterion("a_first_opinion not in", values, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionBetween(String value1, String value2) {
            addCriterion("a_first_opinion between", value1, value2, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andAFirstOpinionNotBetween(String value1, String value2) {
            addCriterion("a_first_opinion not between", value1, value2, "aFirstOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionIsNull() {
            addCriterion("a_leader_opinion is null");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionIsNotNull() {
            addCriterion("a_leader_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionEqualTo(String value) {
            addCriterion("a_leader_opinion =", value, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionNotEqualTo(String value) {
            addCriterion("a_leader_opinion <>", value, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionGreaterThan(String value) {
            addCriterion("a_leader_opinion >", value, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("a_leader_opinion >=", value, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionLessThan(String value) {
            addCriterion("a_leader_opinion <", value, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionLessThanOrEqualTo(String value) {
            addCriterion("a_leader_opinion <=", value, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionLike(String value) {
            addCriterion("a_leader_opinion like", value, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionNotLike(String value) {
            addCriterion("a_leader_opinion not like", value, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionIn(List<String> values) {
            addCriterion("a_leader_opinion in", values, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionNotIn(List<String> values) {
            addCriterion("a_leader_opinion not in", values, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionBetween(String value1, String value2) {
            addCriterion("a_leader_opinion between", value1, value2, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andALeaderOpinionNotBetween(String value1, String value2) {
            addCriterion("a_leader_opinion not between", value1, value2, "aLeaderOpinion");
            return (Criteria) this;
        }

        public Criteria andAFlagIsNull() {
            addCriterion("a_flag is null");
            return (Criteria) this;
        }

        public Criteria andAFlagIsNotNull() {
            addCriterion("a_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAFlagEqualTo(String value) {
            addCriterion("a_flag =", value, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagNotEqualTo(String value) {
            addCriterion("a_flag <>", value, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagGreaterThan(String value) {
            addCriterion("a_flag >", value, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagGreaterThanOrEqualTo(String value) {
            addCriterion("a_flag >=", value, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagLessThan(String value) {
            addCriterion("a_flag <", value, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagLessThanOrEqualTo(String value) {
            addCriterion("a_flag <=", value, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagLike(String value) {
            addCriterion("a_flag like", value, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagNotLike(String value) {
            addCriterion("a_flag not like", value, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagIn(List<String> values) {
            addCriterion("a_flag in", values, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagNotIn(List<String> values) {
            addCriterion("a_flag not in", values, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagBetween(String value1, String value2) {
            addCriterion("a_flag between", value1, value2, "aFlag");
            return (Criteria) this;
        }

        public Criteria andAFlagNotBetween(String value1, String value2) {
            addCriterion("a_flag not between", value1, value2, "aFlag");
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