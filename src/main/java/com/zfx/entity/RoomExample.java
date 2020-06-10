package com.zfx.entity;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRoomidIsNull() {
            addCriterion("roomID is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("roomID =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("roomID <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("roomID >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roomID >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("roomID <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("roomID <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("roomID in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("roomID not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("roomID between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("roomID not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andSeatcountIsNull() {
            addCriterion("seatCount is null");
            return (Criteria) this;
        }

        public Criteria andSeatcountIsNotNull() {
            addCriterion("seatCount is not null");
            return (Criteria) this;
        }

        public Criteria andSeatcountEqualTo(String value) {
            addCriterion("seatCount =", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountNotEqualTo(String value) {
            addCriterion("seatCount <>", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountGreaterThan(String value) {
            addCriterion("seatCount >", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountGreaterThanOrEqualTo(String value) {
            addCriterion("seatCount >=", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountLessThan(String value) {
            addCriterion("seatCount <", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountLessThanOrEqualTo(String value) {
            addCriterion("seatCount <=", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountLike(String value) {
            addCriterion("seatCount like", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountNotLike(String value) {
            addCriterion("seatCount not like", value, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountIn(List<String> values) {
            addCriterion("seatCount in", values, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountNotIn(List<String> values) {
            addCriterion("seatCount not in", values, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountBetween(String value1, String value2) {
            addCriterion("seatCount between", value1, value2, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSeatcountNotBetween(String value1, String value2) {
            addCriterion("seatCount not between", value1, value2, "seatcount");
            return (Criteria) this;
        }

        public Criteria andSearrateIsNull() {
            addCriterion("searRate is null");
            return (Criteria) this;
        }

        public Criteria andSearrateIsNotNull() {
            addCriterion("searRate is not null");
            return (Criteria) this;
        }

        public Criteria andSearrateEqualTo(Float value) {
            addCriterion("searRate =", value, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateNotEqualTo(Float value) {
            addCriterion("searRate <>", value, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateGreaterThan(Float value) {
            addCriterion("searRate >", value, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateGreaterThanOrEqualTo(Float value) {
            addCriterion("searRate >=", value, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateLessThan(Float value) {
            addCriterion("searRate <", value, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateLessThanOrEqualTo(Float value) {
            addCriterion("searRate <=", value, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateIn(List<Float> values) {
            addCriterion("searRate in", values, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateNotIn(List<Float> values) {
            addCriterion("searRate not in", values, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateBetween(Float value1, Float value2) {
            addCriterion("searRate between", value1, value2, "searrate");
            return (Criteria) this;
        }

        public Criteria andSearrateNotBetween(Float value1, Float value2) {
            addCriterion("searRate not between", value1, value2, "searrate");
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