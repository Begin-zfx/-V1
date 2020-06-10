package com.zfx.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedBackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedBackExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andFdidIsNull() {
            addCriterion("fdID is null");
            return (Criteria) this;
        }

        public Criteria andFdidIsNotNull() {
            addCriterion("fdID is not null");
            return (Criteria) this;
        }

        public Criteria andFdidEqualTo(Integer value) {
            addCriterion("fdID =", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidNotEqualTo(Integer value) {
            addCriterion("fdID <>", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidGreaterThan(Integer value) {
            addCriterion("fdID >", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fdID >=", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidLessThan(Integer value) {
            addCriterion("fdID <", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidLessThanOrEqualTo(Integer value) {
            addCriterion("fdID <=", value, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidIn(List<Integer> values) {
            addCriterion("fdID in", values, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidNotIn(List<Integer> values) {
            addCriterion("fdID not in", values, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidBetween(Integer value1, Integer value2) {
            addCriterion("fdID between", value1, value2, "fdid");
            return (Criteria) this;
        }

        public Criteria andFdidNotBetween(Integer value1, Integer value2) {
            addCriterion("fdID not between", value1, value2, "fdid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCpidIsNull() {
            addCriterion("cpID is null");
            return (Criteria) this;
        }

        public Criteria andCpidIsNotNull() {
            addCriterion("cpID is not null");
            return (Criteria) this;
        }

        public Criteria andCpidEqualTo(Integer value) {
            addCriterion("cpID =", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotEqualTo(Integer value) {
            addCriterion("cpID <>", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidGreaterThan(Integer value) {
            addCriterion("cpID >", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpID >=", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLessThan(Integer value) {
            addCriterion("cpID <", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLessThanOrEqualTo(Integer value) {
            addCriterion("cpID <=", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidIn(List<Integer> values) {
            addCriterion("cpID in", values, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotIn(List<Integer> values) {
            addCriterion("cpID not in", values, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidBetween(Integer value1, Integer value2) {
            addCriterion("cpID between", value1, value2, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotBetween(Integer value1, Integer value2) {
            addCriterion("cpID not between", value1, value2, "cpid");
            return (Criteria) this;
        }

        public Criteria andFdtimeIsNull() {
            addCriterion("fdTime is null");
            return (Criteria) this;
        }

        public Criteria andFdtimeIsNotNull() {
            addCriterion("fdTime is not null");
            return (Criteria) this;
        }

        public Criteria andFdtimeEqualTo(Date value) {
            addCriterion("fdTime =", value, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeNotEqualTo(Date value) {
            addCriterion("fdTime <>", value, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeGreaterThan(Date value) {
            addCriterion("fdTime >", value, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fdTime >=", value, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeLessThan(Date value) {
            addCriterion("fdTime <", value, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeLessThanOrEqualTo(Date value) {
            addCriterion("fdTime <=", value, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeIn(List<Date> values) {
            addCriterion("fdTime in", values, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeNotIn(List<Date> values) {
            addCriterion("fdTime not in", values, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeBetween(Date value1, Date value2) {
            addCriterion("fdTime between", value1, value2, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtimeNotBetween(Date value1, Date value2) {
            addCriterion("fdTime not between", value1, value2, "fdtime");
            return (Criteria) this;
        }

        public Criteria andFdtextIsNull() {
            addCriterion("fdText is null");
            return (Criteria) this;
        }

        public Criteria andFdtextIsNotNull() {
            addCriterion("fdText is not null");
            return (Criteria) this;
        }

        public Criteria andFdtextEqualTo(String value) {
            addCriterion("fdText =", value, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextNotEqualTo(String value) {
            addCriterion("fdText <>", value, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextGreaterThan(String value) {
            addCriterion("fdText >", value, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextGreaterThanOrEqualTo(String value) {
            addCriterion("fdText >=", value, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextLessThan(String value) {
            addCriterion("fdText <", value, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextLessThanOrEqualTo(String value) {
            addCriterion("fdText <=", value, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextLike(String value) {
            addCriterion("fdText like", value, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextNotLike(String value) {
            addCriterion("fdText not like", value, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextIn(List<String> values) {
            addCriterion("fdText in", values, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextNotIn(List<String> values) {
            addCriterion("fdText not in", values, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextBetween(String value1, String value2) {
            addCriterion("fdText between", value1, value2, "fdtext");
            return (Criteria) this;
        }

        public Criteria andFdtextNotBetween(String value1, String value2) {
            addCriterion("fdText not between", value1, value2, "fdtext");
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