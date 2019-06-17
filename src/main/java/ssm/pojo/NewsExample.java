package ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsNameIsNull() {
            addCriterion("news_name is null");
            return (Criteria) this;
        }

        public Criteria andNewsNameIsNotNull() {
            addCriterion("news_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewsNameEqualTo(String value) {
            addCriterion("news_name =", value, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameNotEqualTo(String value) {
            addCriterion("news_name <>", value, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameGreaterThan(String value) {
            addCriterion("news_name >", value, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameGreaterThanOrEqualTo(String value) {
            addCriterion("news_name >=", value, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameLessThan(String value) {
            addCriterion("news_name <", value, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameLessThanOrEqualTo(String value) {
            addCriterion("news_name <=", value, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameLike(String value) {
            addCriterion("news_name like", value, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameNotLike(String value) {
            addCriterion("news_name not like", value, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameIn(List<String> values) {
            addCriterion("news_name in", values, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameNotIn(List<String> values) {
            addCriterion("news_name not in", values, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameBetween(String value1, String value2) {
            addCriterion("news_name between", value1, value2, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsNameNotBetween(String value1, String value2) {
            addCriterion("news_name not between", value1, value2, "newsName");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNull() {
            addCriterion("news_date is null");
            return (Criteria) this;
        }

        public Criteria andNewsDateIsNotNull() {
            addCriterion("news_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDateEqualTo(Date value) {
            addCriterion("news_date =", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotEqualTo(Date value) {
            addCriterion("news_date <>", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThan(Date value) {
            addCriterion("news_date >", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("news_date >=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThan(Date value) {
            addCriterion("news_date <", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateLessThanOrEqualTo(Date value) {
            addCriterion("news_date <=", value, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateIn(List<Date> values) {
            addCriterion("news_date in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotIn(List<Date> values) {
            addCriterion("news_date not in", values, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateBetween(Date value1, Date value2) {
            addCriterion("news_date between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsDateNotBetween(Date value1, Date value2) {
            addCriterion("news_date not between", value1, value2, "newsDate");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceIsNull() {
            addCriterion("news_place is null");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceIsNotNull() {
            addCriterion("news_place is not null");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceEqualTo(String value) {
            addCriterion("news_place =", value, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceNotEqualTo(String value) {
            addCriterion("news_place <>", value, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceGreaterThan(String value) {
            addCriterion("news_place >", value, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("news_place >=", value, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceLessThan(String value) {
            addCriterion("news_place <", value, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceLessThanOrEqualTo(String value) {
            addCriterion("news_place <=", value, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceLike(String value) {
            addCriterion("news_place like", value, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceNotLike(String value) {
            addCriterion("news_place not like", value, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceIn(List<String> values) {
            addCriterion("news_place in", values, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceNotIn(List<String> values) {
            addCriterion("news_place not in", values, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceBetween(String value1, String value2) {
            addCriterion("news_place between", value1, value2, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsPlaceNotBetween(String value1, String value2) {
            addCriterion("news_place not between", value1, value2, "newsPlace");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationIsNull() {
            addCriterion("news_image_location is null");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationIsNotNull() {
            addCriterion("news_image_location is not null");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationEqualTo(String value) {
            addCriterion("news_image_location =", value, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationNotEqualTo(String value) {
            addCriterion("news_image_location <>", value, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationGreaterThan(String value) {
            addCriterion("news_image_location >", value, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("news_image_location >=", value, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationLessThan(String value) {
            addCriterion("news_image_location <", value, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationLessThanOrEqualTo(String value) {
            addCriterion("news_image_location <=", value, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationLike(String value) {
            addCriterion("news_image_location like", value, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationNotLike(String value) {
            addCriterion("news_image_location not like", value, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationIn(List<String> values) {
            addCriterion("news_image_location in", values, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationNotIn(List<String> values) {
            addCriterion("news_image_location not in", values, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationBetween(String value1, String value2) {
            addCriterion("news_image_location between", value1, value2, "newsImageLocation");
            return (Criteria) this;
        }

        public Criteria andNewsImageLocationNotBetween(String value1, String value2) {
            addCriterion("news_image_location not between", value1, value2, "newsImageLocation");
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