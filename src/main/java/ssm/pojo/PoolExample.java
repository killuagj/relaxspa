package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class PoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoolExample() {
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

        public Criteria andPoolIdIsNull() {
            addCriterion("pool_id is null");
            return (Criteria) this;
        }

        public Criteria andPoolIdIsNotNull() {
            addCriterion("pool_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoolIdEqualTo(Integer value) {
            addCriterion("pool_id =", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotEqualTo(Integer value) {
            addCriterion("pool_id <>", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdGreaterThan(Integer value) {
            addCriterion("pool_id >", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pool_id >=", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLessThan(Integer value) {
            addCriterion("pool_id <", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("pool_id <=", value, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdIn(List<Integer> values) {
            addCriterion("pool_id in", values, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotIn(List<Integer> values) {
            addCriterion("pool_id not in", values, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdBetween(Integer value1, Integer value2) {
            addCriterion("pool_id between", value1, value2, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pool_id not between", value1, value2, "poolId");
            return (Criteria) this;
        }

        public Criteria andPoolNameIsNull() {
            addCriterion("pool_name is null");
            return (Criteria) this;
        }

        public Criteria andPoolNameIsNotNull() {
            addCriterion("pool_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoolNameEqualTo(String value) {
            addCriterion("pool_name =", value, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameNotEqualTo(String value) {
            addCriterion("pool_name <>", value, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameGreaterThan(String value) {
            addCriterion("pool_name >", value, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("pool_name >=", value, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameLessThan(String value) {
            addCriterion("pool_name <", value, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameLessThanOrEqualTo(String value) {
            addCriterion("pool_name <=", value, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameLike(String value) {
            addCriterion("pool_name like", value, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameNotLike(String value) {
            addCriterion("pool_name not like", value, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameIn(List<String> values) {
            addCriterion("pool_name in", values, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameNotIn(List<String> values) {
            addCriterion("pool_name not in", values, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameBetween(String value1, String value2) {
            addCriterion("pool_name between", value1, value2, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolNameNotBetween(String value1, String value2) {
            addCriterion("pool_name not between", value1, value2, "poolName");
            return (Criteria) this;
        }

        public Criteria andPoolDurationIsNull() {
            addCriterion("pool_duration is null");
            return (Criteria) this;
        }

        public Criteria andPoolDurationIsNotNull() {
            addCriterion("pool_duration is not null");
            return (Criteria) this;
        }

        public Criteria andPoolDurationEqualTo(Double value) {
            addCriterion("pool_duration =", value, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationNotEqualTo(Double value) {
            addCriterion("pool_duration <>", value, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationGreaterThan(Double value) {
            addCriterion("pool_duration >", value, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationGreaterThanOrEqualTo(Double value) {
            addCriterion("pool_duration >=", value, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationLessThan(Double value) {
            addCriterion("pool_duration <", value, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationLessThanOrEqualTo(Double value) {
            addCriterion("pool_duration <=", value, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationIn(List<Double> values) {
            addCriterion("pool_duration in", values, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationNotIn(List<Double> values) {
            addCriterion("pool_duration not in", values, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationBetween(Double value1, Double value2) {
            addCriterion("pool_duration between", value1, value2, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolDurationNotBetween(Double value1, Double value2) {
            addCriterion("pool_duration not between", value1, value2, "poolDuration");
            return (Criteria) this;
        }

        public Criteria andPoolPriceIsNull() {
            addCriterion("pool_price is null");
            return (Criteria) this;
        }

        public Criteria andPoolPriceIsNotNull() {
            addCriterion("pool_price is not null");
            return (Criteria) this;
        }

        public Criteria andPoolPriceEqualTo(Double value) {
            addCriterion("pool_price =", value, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceNotEqualTo(Double value) {
            addCriterion("pool_price <>", value, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceGreaterThan(Double value) {
            addCriterion("pool_price >", value, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("pool_price >=", value, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceLessThan(Double value) {
            addCriterion("pool_price <", value, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceLessThanOrEqualTo(Double value) {
            addCriterion("pool_price <=", value, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceIn(List<Double> values) {
            addCriterion("pool_price in", values, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceNotIn(List<Double> values) {
            addCriterion("pool_price not in", values, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceBetween(Double value1, Double value2) {
            addCriterion("pool_price between", value1, value2, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolPriceNotBetween(Double value1, Double value2) {
            addCriterion("pool_price not between", value1, value2, "poolPrice");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountIsNull() {
            addCriterion("pool_left_count is null");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountIsNotNull() {
            addCriterion("pool_left_count is not null");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountEqualTo(Integer value) {
            addCriterion("pool_left_count =", value, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountNotEqualTo(Integer value) {
            addCriterion("pool_left_count <>", value, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountGreaterThan(Integer value) {
            addCriterion("pool_left_count >", value, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pool_left_count >=", value, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountLessThan(Integer value) {
            addCriterion("pool_left_count <", value, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountLessThanOrEqualTo(Integer value) {
            addCriterion("pool_left_count <=", value, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountIn(List<Integer> values) {
            addCriterion("pool_left_count in", values, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountNotIn(List<Integer> values) {
            addCriterion("pool_left_count not in", values, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountBetween(Integer value1, Integer value2) {
            addCriterion("pool_left_count between", value1, value2, "poolLeftCount");
            return (Criteria) this;
        }

        public Criteria andPoolLeftCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pool_left_count not between", value1, value2, "poolLeftCount");
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