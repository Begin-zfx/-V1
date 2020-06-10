package com.zfx.entity;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andManageridIsNull() {
            addCriterion("managerID is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("managerID is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(Integer value) {
            addCriterion("managerID =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(Integer value) {
            addCriterion("managerID <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(Integer value) {
            addCriterion("managerID >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(Integer value) {
            addCriterion("managerID >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(Integer value) {
            addCriterion("managerID <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(Integer value) {
            addCriterion("managerID <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<Integer> values) {
            addCriterion("managerID in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<Integer> values) {
            addCriterion("managerID not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(Integer value1, Integer value2) {
            addCriterion("managerID between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(Integer value1, Integer value2) {
            addCriterion("managerID not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNull() {
            addCriterion("managerName is null");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNotNull() {
            addCriterion("managerName is not null");
            return (Criteria) this;
        }

        public Criteria andManagernameEqualTo(String value) {
            addCriterion("managerName =", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotEqualTo(String value) {
            addCriterion("managerName <>", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThan(String value) {
            addCriterion("managerName >", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("managerName >=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThan(String value) {
            addCriterion("managerName <", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThanOrEqualTo(String value) {
            addCriterion("managerName <=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLike(String value) {
            addCriterion("managerName like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotLike(String value) {
            addCriterion("managerName not like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameIn(List<String> values) {
            addCriterion("managerName in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotIn(List<String> values) {
            addCriterion("managerName not in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameBetween(String value1, String value2) {
            addCriterion("managerName between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotBetween(String value1, String value2) {
            addCriterion("managerName not between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagertelIsNull() {
            addCriterion("managerTel is null");
            return (Criteria) this;
        }

        public Criteria andManagertelIsNotNull() {
            addCriterion("managerTel is not null");
            return (Criteria) this;
        }

        public Criteria andManagertelEqualTo(String value) {
            addCriterion("managerTel =", value, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelNotEqualTo(String value) {
            addCriterion("managerTel <>", value, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelGreaterThan(String value) {
            addCriterion("managerTel >", value, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelGreaterThanOrEqualTo(String value) {
            addCriterion("managerTel >=", value, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelLessThan(String value) {
            addCriterion("managerTel <", value, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelLessThanOrEqualTo(String value) {
            addCriterion("managerTel <=", value, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelLike(String value) {
            addCriterion("managerTel like", value, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelNotLike(String value) {
            addCriterion("managerTel not like", value, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelIn(List<String> values) {
            addCriterion("managerTel in", values, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelNotIn(List<String> values) {
            addCriterion("managerTel not in", values, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelBetween(String value1, String value2) {
            addCriterion("managerTel between", value1, value2, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagertelNotBetween(String value1, String value2) {
            addCriterion("managerTel not between", value1, value2, "managertel");
            return (Criteria) this;
        }

        public Criteria andManagerpwdIsNull() {
            addCriterion("managerPwd is null");
            return (Criteria) this;
        }

        public Criteria andManagerpwdIsNotNull() {
            addCriterion("managerPwd is not null");
            return (Criteria) this;
        }

        public Criteria andManagerpwdEqualTo(String value) {
            addCriterion("managerPwd =", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdNotEqualTo(String value) {
            addCriterion("managerPwd <>", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdGreaterThan(String value) {
            addCriterion("managerPwd >", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdGreaterThanOrEqualTo(String value) {
            addCriterion("managerPwd >=", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdLessThan(String value) {
            addCriterion("managerPwd <", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdLessThanOrEqualTo(String value) {
            addCriterion("managerPwd <=", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdLike(String value) {
            addCriterion("managerPwd like", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdNotLike(String value) {
            addCriterion("managerPwd not like", value, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdIn(List<String> values) {
            addCriterion("managerPwd in", values, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdNotIn(List<String> values) {
            addCriterion("managerPwd not in", values, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdBetween(String value1, String value2) {
            addCriterion("managerPwd between", value1, value2, "managerpwd");
            return (Criteria) this;
        }

        public Criteria andManagerpwdNotBetween(String value1, String value2) {
            addCriterion("managerPwd not between", value1, value2, "managerpwd");
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