package com.zfx.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StatisticExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatisticExample() {
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
            List<java.sql.Date> dateList = new ArrayList<>();
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

        public Criteria andStaidIsNull() {
            addCriterion("staID is null");
            return (Criteria) this;
        }

        public Criteria andStaidIsNotNull() {
            addCriterion("staID is not null");
            return (Criteria) this;
        }

        public Criteria andStaidEqualTo(Integer value) {
            addCriterion("staID =", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotEqualTo(Integer value) {
            addCriterion("staID <>", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThan(Integer value) {
            addCriterion("staID >", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staID >=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThan(Integer value) {
            addCriterion("staID <", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThanOrEqualTo(Integer value) {
            addCriterion("staID <=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidIn(List<Integer> values) {
            addCriterion("staID in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotIn(List<Integer> values) {
            addCriterion("staID not in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidBetween(Integer value1, Integer value2) {
            addCriterion("staID between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotBetween(Integer value1, Integer value2) {
            addCriterion("staID not between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andStadateIsNull() {
            addCriterion("stadate is null");
            return (Criteria) this;
        }

        public Criteria andStadateIsNotNull() {
            addCriterion("stadate is not null");
            return (Criteria) this;
        }

        public Criteria andStadateEqualTo(Date value) {
            addCriterionForJDBCDate("stadate =", value, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateNotEqualTo(Date value) {
            addCriterionForJDBCDate("stadate <>", value, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateGreaterThan(Date value) {
            addCriterionForJDBCDate("stadate >", value, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stadate >=", value, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateLessThan(Date value) {
            addCriterionForJDBCDate("stadate <", value, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stadate <=", value, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateIn(List<Date> values) {
            addCriterionForJDBCDate("stadate in", values, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateNotIn(List<Date> values) {
            addCriterionForJDBCDate("stadate not in", values, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stadate between", value1, value2, "stadate");
            return (Criteria) this;
        }

        public Criteria andStadateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stadate not between", value1, value2, "stadate");
            return (Criteria) this;
        }

        public Criteria andSeatuIsNull() {
            addCriterion("seatU is null");
            return (Criteria) this;
        }

        public Criteria andSeatuIsNotNull() {
            addCriterion("seatU is not null");
            return (Criteria) this;
        }

        public Criteria andSeatuEqualTo(Integer value) {
            addCriterion("seatU =", value, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuNotEqualTo(Integer value) {
            addCriterion("seatU <>", value, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuGreaterThan(Integer value) {
            addCriterion("seatU >", value, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatU >=", value, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuLessThan(Integer value) {
            addCriterion("seatU <", value, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuLessThanOrEqualTo(Integer value) {
            addCriterion("seatU <=", value, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuIn(List<Integer> values) {
            addCriterion("seatU in", values, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuNotIn(List<Integer> values) {
            addCriterion("seatU not in", values, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuBetween(Integer value1, Integer value2) {
            addCriterion("seatU between", value1, value2, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatuNotBetween(Integer value1, Integer value2) {
            addCriterion("seatU not between", value1, value2, "seatu");
            return (Criteria) this;
        }

        public Criteria andSeatrIsNull() {
            addCriterion("seatR is null");
            return (Criteria) this;
        }

        public Criteria andSeatrIsNotNull() {
            addCriterion("seatR is not null");
            return (Criteria) this;
        }

        public Criteria andSeatrEqualTo(Integer value) {
            addCriterion("seatR =", value, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrNotEqualTo(Integer value) {
            addCriterion("seatR <>", value, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrGreaterThan(Integer value) {
            addCriterion("seatR >", value, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatR >=", value, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrLessThan(Integer value) {
            addCriterion("seatR <", value, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrLessThanOrEqualTo(Integer value) {
            addCriterion("seatR <=", value, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrIn(List<Integer> values) {
            addCriterion("seatR in", values, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrNotIn(List<Integer> values) {
            addCriterion("seatR not in", values, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrBetween(Integer value1, Integer value2) {
            addCriterion("seatR between", value1, value2, "seatr");
            return (Criteria) this;
        }

        public Criteria andSeatrNotBetween(Integer value1, Integer value2) {
            addCriterion("seatR not between", value1, value2, "seatr");
            return (Criteria) this;
        }

        public Criteria andOth1IsNull() {
            addCriterion("oth1 is null");
            return (Criteria) this;
        }

        public Criteria andOth1IsNotNull() {
            addCriterion("oth1 is not null");
            return (Criteria) this;
        }

        public Criteria andOth1EqualTo(String value) {
            addCriterion("oth1 =", value, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1NotEqualTo(String value) {
            addCriterion("oth1 <>", value, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1GreaterThan(String value) {
            addCriterion("oth1 >", value, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1GreaterThanOrEqualTo(String value) {
            addCriterion("oth1 >=", value, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1LessThan(String value) {
            addCriterion("oth1 <", value, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1LessThanOrEqualTo(String value) {
            addCriterion("oth1 <=", value, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1Like(String value) {
            addCriterion("oth1 like", value, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1NotLike(String value) {
            addCriterion("oth1 not like", value, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1In(List<String> values) {
            addCriterion("oth1 in", values, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1NotIn(List<String> values) {
            addCriterion("oth1 not in", values, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1Between(String value1, String value2) {
            addCriterion("oth1 between", value1, value2, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth1NotBetween(String value1, String value2) {
            addCriterion("oth1 not between", value1, value2, "oth1");
            return (Criteria) this;
        }

        public Criteria andOth2IsNull() {
            addCriterion("oth2 is null");
            return (Criteria) this;
        }

        public Criteria andOth2IsNotNull() {
            addCriterion("oth2 is not null");
            return (Criteria) this;
        }

        public Criteria andOth2EqualTo(String value) {
            addCriterion("oth2 =", value, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2NotEqualTo(String value) {
            addCriterion("oth2 <>", value, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2GreaterThan(String value) {
            addCriterion("oth2 >", value, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2GreaterThanOrEqualTo(String value) {
            addCriterion("oth2 >=", value, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2LessThan(String value) {
            addCriterion("oth2 <", value, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2LessThanOrEqualTo(String value) {
            addCriterion("oth2 <=", value, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2Like(String value) {
            addCriterion("oth2 like", value, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2NotLike(String value) {
            addCriterion("oth2 not like", value, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2In(List<String> values) {
            addCriterion("oth2 in", values, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2NotIn(List<String> values) {
            addCriterion("oth2 not in", values, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2Between(String value1, String value2) {
            addCriterion("oth2 between", value1, value2, "oth2");
            return (Criteria) this;
        }

        public Criteria andOth2NotBetween(String value1, String value2) {
            addCriterion("oth2 not between", value1, value2, "oth2");
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