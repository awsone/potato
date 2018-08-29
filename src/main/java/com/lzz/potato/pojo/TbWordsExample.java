package com.lzz.potato.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbWordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public TbWordsExample() {
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

        public Criteria andWsIdIsNull() {
            addCriterion("ws_id is null");
            return (Criteria) this;
        }

        public Criteria andWsIdIsNotNull() {
            addCriterion("ws_id is not null");
            return (Criteria) this;
        }

        public Criteria andWsIdEqualTo(Integer value) {
            addCriterion("ws_id =", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdNotEqualTo(Integer value) {
            addCriterion("ws_id <>", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdGreaterThan(Integer value) {
            addCriterion("ws_id >", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ws_id >=", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdLessThan(Integer value) {
            addCriterion("ws_id <", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ws_id <=", value, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdIn(List<Integer> values) {
            addCriterion("ws_id in", values, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdNotIn(List<Integer> values) {
            addCriterion("ws_id not in", values, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdBetween(Integer value1, Integer value2) {
            addCriterion("ws_id between", value1, value2, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ws_id not between", value1, value2, "wsId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdIsNull() {
            addCriterion("ws_person_id is null");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdIsNotNull() {
            addCriterion("ws_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdEqualTo(Integer value) {
            addCriterion("ws_person_id =", value, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdNotEqualTo(Integer value) {
            addCriterion("ws_person_id <>", value, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdGreaterThan(Integer value) {
            addCriterion("ws_person_id >", value, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ws_person_id >=", value, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdLessThan(Integer value) {
            addCriterion("ws_person_id <", value, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("ws_person_id <=", value, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdIn(List<Integer> values) {
            addCriterion("ws_person_id in", values, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdNotIn(List<Integer> values) {
            addCriterion("ws_person_id not in", values, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("ws_person_id between", value1, value2, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ws_person_id not between", value1, value2, "wsPersonId");
            return (Criteria) this;
        }

        public Criteria andWsContentIsNull() {
            addCriterion("ws_content is null");
            return (Criteria) this;
        }

        public Criteria andWsContentIsNotNull() {
            addCriterion("ws_content is not null");
            return (Criteria) this;
        }

        public Criteria andWsContentEqualTo(String value) {
            addCriterion("ws_content =", value, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentNotEqualTo(String value) {
            addCriterion("ws_content <>", value, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentGreaterThan(String value) {
            addCriterion("ws_content >", value, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentGreaterThanOrEqualTo(String value) {
            addCriterion("ws_content >=", value, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentLessThan(String value) {
            addCriterion("ws_content <", value, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentLessThanOrEqualTo(String value) {
            addCriterion("ws_content <=", value, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentLike(String value) {
            addCriterion("ws_content like", value, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentNotLike(String value) {
            addCriterion("ws_content not like", value, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentIn(List<String> values) {
            addCriterion("ws_content in", values, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentNotIn(List<String> values) {
            addCriterion("ws_content not in", values, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentBetween(String value1, String value2) {
            addCriterion("ws_content between", value1, value2, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsContentNotBetween(String value1, String value2) {
            addCriterion("ws_content not between", value1, value2, "wsContent");
            return (Criteria) this;
        }

        public Criteria andWsReplyIsNull() {
            addCriterion("ws_reply is null");
            return (Criteria) this;
        }

        public Criteria andWsReplyIsNotNull() {
            addCriterion("ws_reply is not null");
            return (Criteria) this;
        }

        public Criteria andWsReplyEqualTo(String value) {
            addCriterion("ws_reply =", value, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyNotEqualTo(String value) {
            addCriterion("ws_reply <>", value, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyGreaterThan(String value) {
            addCriterion("ws_reply >", value, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyGreaterThanOrEqualTo(String value) {
            addCriterion("ws_reply >=", value, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyLessThan(String value) {
            addCriterion("ws_reply <", value, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyLessThanOrEqualTo(String value) {
            addCriterion("ws_reply <=", value, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyLike(String value) {
            addCriterion("ws_reply like", value, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyNotLike(String value) {
            addCriterion("ws_reply not like", value, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyIn(List<String> values) {
            addCriterion("ws_reply in", values, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyNotIn(List<String> values) {
            addCriterion("ws_reply not in", values, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyBetween(String value1, String value2) {
            addCriterion("ws_reply between", value1, value2, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsReplyNotBetween(String value1, String value2) {
            addCriterion("ws_reply not between", value1, value2, "wsReply");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeIsNull() {
            addCriterion("ws_send_time is null");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeIsNotNull() {
            addCriterion("ws_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeEqualTo(String value) {
            addCriterion("ws_send_time =", value, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeNotEqualTo(String value) {
            addCriterion("ws_send_time <>", value, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeGreaterThan(String value) {
            addCriterion("ws_send_time >", value, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ws_send_time >=", value, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeLessThan(String value) {
            addCriterion("ws_send_time <", value, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeLessThanOrEqualTo(String value) {
            addCriterion("ws_send_time <=", value, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeLike(String value) {
            addCriterion("ws_send_time like", value, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeNotLike(String value) {
            addCriterion("ws_send_time not like", value, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeIn(List<String> values) {
            addCriterion("ws_send_time in", values, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeNotIn(List<String> values) {
            addCriterion("ws_send_time not in", values, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeBetween(String value1, String value2) {
            addCriterion("ws_send_time between", value1, value2, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsSendTimeNotBetween(String value1, String value2) {
            addCriterion("ws_send_time not between", value1, value2, "wsSendTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeIsNull() {
            addCriterion("ws_reply_time is null");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeIsNotNull() {
            addCriterion("ws_reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeEqualTo(String value) {
            addCriterion("ws_reply_time =", value, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeNotEqualTo(String value) {
            addCriterion("ws_reply_time <>", value, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeGreaterThan(String value) {
            addCriterion("ws_reply_time >", value, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ws_reply_time >=", value, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeLessThan(String value) {
            addCriterion("ws_reply_time <", value, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeLessThanOrEqualTo(String value) {
            addCriterion("ws_reply_time <=", value, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeLike(String value) {
            addCriterion("ws_reply_time like", value, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeNotLike(String value) {
            addCriterion("ws_reply_time not like", value, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeIn(List<String> values) {
            addCriterion("ws_reply_time in", values, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeNotIn(List<String> values) {
            addCriterion("ws_reply_time not in", values, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeBetween(String value1, String value2) {
            addCriterion("ws_reply_time between", value1, value2, "wsReplyTime");
            return (Criteria) this;
        }

        public Criteria andWsReplyTimeNotBetween(String value1, String value2) {
            addCriterion("ws_reply_time not between", value1, value2, "wsReplyTime");
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