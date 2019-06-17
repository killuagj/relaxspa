package ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpaExample() {
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

        public Criteria andSpaIdIsNull() {
            addCriterion("spa_id is null");
            return (Criteria) this;
        }

        public Criteria andSpaIdIsNotNull() {
            addCriterion("spa_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpaIdEqualTo(Integer value) {
            addCriterion("spa_id =", value, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdNotEqualTo(Integer value) {
            addCriterion("spa_id <>", value, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdGreaterThan(Integer value) {
            addCriterion("spa_id >", value, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spa_id >=", value, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdLessThan(Integer value) {
            addCriterion("spa_id <", value, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdLessThanOrEqualTo(Integer value) {
            addCriterion("spa_id <=", value, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdIn(List<Integer> values) {
            addCriterion("spa_id in", values, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdNotIn(List<Integer> values) {
            addCriterion("spa_id not in", values, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdBetween(Integer value1, Integer value2) {
            addCriterion("spa_id between", value1, value2, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spa_id not between", value1, value2, "spaId");
            return (Criteria) this;
        }

        public Criteria andSpaNameIsNull() {
            addCriterion("spa_name is null");
            return (Criteria) this;
        }

        public Criteria andSpaNameIsNotNull() {
            addCriterion("spa_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpaNameEqualTo(String value) {
            addCriterion("spa_name =", value, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameNotEqualTo(String value) {
            addCriterion("spa_name <>", value, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameGreaterThan(String value) {
            addCriterion("spa_name >", value, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameGreaterThanOrEqualTo(String value) {
            addCriterion("spa_name >=", value, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameLessThan(String value) {
            addCriterion("spa_name <", value, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameLessThanOrEqualTo(String value) {
            addCriterion("spa_name <=", value, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameLike(String value) {
            addCriterion("spa_name like", value, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameNotLike(String value) {
            addCriterion("spa_name not like", value, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameIn(List<String> values) {
            addCriterion("spa_name in", values, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameNotIn(List<String> values) {
            addCriterion("spa_name not in", values, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameBetween(String value1, String value2) {
            addCriterion("spa_name between", value1, value2, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaNameNotBetween(String value1, String value2) {
            addCriterion("spa_name not between", value1, value2, "spaName");
            return (Criteria) this;
        }

        public Criteria andSpaTypeIsNull() {
            addCriterion("spa_type is null");
            return (Criteria) this;
        }

        public Criteria andSpaTypeIsNotNull() {
            addCriterion("spa_type is not null");
            return (Criteria) this;
        }

        public Criteria andSpaTypeEqualTo(String value) {
            addCriterion("spa_type =", value, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeNotEqualTo(String value) {
            addCriterion("spa_type <>", value, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeGreaterThan(String value) {
            addCriterion("spa_type >", value, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spa_type >=", value, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeLessThan(String value) {
            addCriterion("spa_type <", value, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeLessThanOrEqualTo(String value) {
            addCriterion("spa_type <=", value, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeLike(String value) {
            addCriterion("spa_type like", value, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeNotLike(String value) {
            addCriterion("spa_type not like", value, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeIn(List<String> values) {
            addCriterion("spa_type in", values, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeNotIn(List<String> values) {
            addCriterion("spa_type not in", values, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeBetween(String value1, String value2) {
            addCriterion("spa_type between", value1, value2, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaTypeNotBetween(String value1, String value2) {
            addCriterion("spa_type not between", value1, value2, "spaType");
            return (Criteria) this;
        }

        public Criteria andSpaDurationIsNull() {
            addCriterion("spa_duration is null");
            return (Criteria) this;
        }

        public Criteria andSpaDurationIsNotNull() {
            addCriterion("spa_duration is not null");
            return (Criteria) this;
        }

        public Criteria andSpaDurationEqualTo(Double value) {
            addCriterion("spa_duration =", value, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationNotEqualTo(Double value) {
            addCriterion("spa_duration <>", value, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationGreaterThan(Double value) {
            addCriterion("spa_duration >", value, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationGreaterThanOrEqualTo(Double value) {
            addCriterion("spa_duration >=", value, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationLessThan(Double value) {
            addCriterion("spa_duration <", value, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationLessThanOrEqualTo(Double value) {
            addCriterion("spa_duration <=", value, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationIn(List<Double> values) {
            addCriterion("spa_duration in", values, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationNotIn(List<Double> values) {
            addCriterion("spa_duration not in", values, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationBetween(Double value1, Double value2) {
            addCriterion("spa_duration between", value1, value2, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaDurationNotBetween(Double value1, Double value2) {
            addCriterion("spa_duration not between", value1, value2, "spaDuration");
            return (Criteria) this;
        }

        public Criteria andSpaPriceIsNull() {
            addCriterion("spa_price is null");
            return (Criteria) this;
        }

        public Criteria andSpaPriceIsNotNull() {
            addCriterion("spa_price is not null");
            return (Criteria) this;
        }

        public Criteria andSpaPriceEqualTo(Double value) {
            addCriterion("spa_price =", value, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceNotEqualTo(Double value) {
            addCriterion("spa_price <>", value, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceGreaterThan(Double value) {
            addCriterion("spa_price >", value, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("spa_price >=", value, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceLessThan(Double value) {
            addCriterion("spa_price <", value, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceLessThanOrEqualTo(Double value) {
            addCriterion("spa_price <=", value, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceIn(List<Double> values) {
            addCriterion("spa_price in", values, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceNotIn(List<Double> values) {
            addCriterion("spa_price not in", values, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceBetween(Double value1, Double value2) {
            addCriterion("spa_price between", value1, value2, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaPriceNotBetween(Double value1, Double value2) {
            addCriterion("spa_price not between", value1, value2, "spaPrice");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountIsNull() {
            addCriterion("spa_left_count is null");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountIsNotNull() {
            addCriterion("spa_left_count is not null");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountEqualTo(Integer value) {
            addCriterion("spa_left_count =", value, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountNotEqualTo(Integer value) {
            addCriterion("spa_left_count <>", value, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountGreaterThan(Integer value) {
            addCriterion("spa_left_count >", value, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("spa_left_count >=", value, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountLessThan(Integer value) {
            addCriterion("spa_left_count <", value, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountLessThanOrEqualTo(Integer value) {
            addCriterion("spa_left_count <=", value, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountIn(List<Integer> values) {
            addCriterion("spa_left_count in", values, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountNotIn(List<Integer> values) {
            addCriterion("spa_left_count not in", values, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountBetween(Integer value1, Integer value2) {
            addCriterion("spa_left_count between", value1, value2, "spaLeftCount");
            return (Criteria) this;
        }

        public Criteria andSpaLeftCountNotBetween(Integer value1, Integer value2) {
            addCriterion("spa_left_count not between", value1, value2, "spaLeftCount");
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