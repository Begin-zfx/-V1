package com.zfx.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainExample() {
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

        public Criteria andCpdateIsNull() {
            addCriterion("cpDate is null");
            return (Criteria) this;
        }

        public Criteria andCpdateIsNotNull() {
            addCriterion("cpDate is not null");
            return (Criteria) this;
        }

        public Criteria andCpdateEqualTo(Date value) {
            addCriterion("cpDate =", value, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateNotEqualTo(Date value) {
            addCriterion("cpDate <>", value, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateGreaterThan(Date value) {
            addCriterion("cpDate >", value, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cpDate >=", value, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateLessThan(Date value) {
            addCriterion("cpDate <", value, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateLessThanOrEqualTo(Date value) {
            addCriterion("cpDate <=", value, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateIn(List<Date> values) {
            addCriterion("cpDate in", values, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateNotIn(List<Date> values) {
            addCriterion("cpDate not in", values, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateBetween(Date value1, Date value2) {
            addCriterion("cpDate between", value1, value2, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCpdateNotBetween(Date value1, Date value2) {
            addCriterion("cpDate not between", value1, value2, "cpdate");
            return (Criteria) this;
        }

        public Criteria andCptextIsNull() {
            addCriterion("cpText is null");
            return (Criteria) this;
        }

        public Criteria andCptextIsNotNull() {
            addCriterion("cpText is not null");
            return (Criteria) this;
        }

        public Criteria andCptextEqualTo(String value) {
            addCriterion("cpText =", value, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextNotEqualTo(String value) {
            addCriterion("cpText <>", value, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextGreaterThan(String value) {
            addCriterion("cpText >", value, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextGreaterThanOrEqualTo(String value) {
            addCriterion("cpText >=", value, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextLessThan(String value) {
            addCriterion("cpText <", value, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextLessThanOrEqualTo(String value) {
            addCriterion("cpText <=", value, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextLike(String value) {
            addCriterion("cpText like", value, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextNotLike(String value) {
            addCriterion("cpText not like", value, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextIn(List<String> values) {
            addCriterion("cpText in", values, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextNotIn(List<String> values) {
            addCriterion("cpText not in", values, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextBetween(String value1, String value2) {
            addCriterion("cpText between", value1, value2, "cptext");
            return (Criteria) this;
        }

        public Criteria andCptextNotBetween(String value1, String value2) {
            addCriterion("cpText not between", value1, value2, "cptext");
            return (Criteria) this;
        }

        public Criteria andPsIsNull() {
            addCriterion("ps is null");
            return (Criteria) this;
        }

        public Criteria andPsIsNotNull() {
            addCriterion("ps is not null");
            return (Criteria) this;
        }

        public Criteria andPsEqualTo(String value) {
            addCriterion("ps =", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotEqualTo(String value) {
            addCriterion("ps <>", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThan(String value) {
            addCriterion("ps >", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThanOrEqualTo(String value) {
            addCriterion("ps >=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThan(String value) {
            addCriterion("ps <", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThanOrEqualTo(String value) {
            addCriterion("ps <=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLike(String value) {
            addCriterion("ps like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotLike(String value) {
            addCriterion("ps not like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsIn(List<String> values) {
            addCriterion("ps in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotIn(List<String> values) {
            addCriterion("ps not in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsBetween(String value1, String value2) {
            addCriterion("ps between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotBetween(String value1, String value2) {
            addCriterion("ps not between", value1, value2, "ps");
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