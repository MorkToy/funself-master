package com.onelife.fun.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WishExample() {
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

        public Criteria andWishIdIsNull() {
            addCriterion("wish_id is null");
            return (Criteria) this;
        }

        public Criteria andWishIdIsNotNull() {
            addCriterion("wish_id is not null");
            return (Criteria) this;
        }

        public Criteria andWishIdEqualTo(Integer value) {
            addCriterion("wish_id =", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotEqualTo(Integer value) {
            addCriterion("wish_id <>", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdGreaterThan(Integer value) {
            addCriterion("wish_id >", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wish_id >=", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdLessThan(Integer value) {
            addCriterion("wish_id <", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdLessThanOrEqualTo(Integer value) {
            addCriterion("wish_id <=", value, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdIn(List<Integer> values) {
            addCriterion("wish_id in", values, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotIn(List<Integer> values) {
            addCriterion("wish_id not in", values, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdBetween(Integer value1, Integer value2) {
            addCriterion("wish_id between", value1, value2, "wishId");
            return (Criteria) this;
        }

        public Criteria andWishIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wish_id not between", value1, value2, "wishId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWishContentIsNull() {
            addCriterion("wish_content is null");
            return (Criteria) this;
        }

        public Criteria andWishContentIsNotNull() {
            addCriterion("wish_content is not null");
            return (Criteria) this;
        }

        public Criteria andWishContentEqualTo(String value) {
            addCriterion("wish_content =", value, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentNotEqualTo(String value) {
            addCriterion("wish_content <>", value, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentGreaterThan(String value) {
            addCriterion("wish_content >", value, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentGreaterThanOrEqualTo(String value) {
            addCriterion("wish_content >=", value, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentLessThan(String value) {
            addCriterion("wish_content <", value, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentLessThanOrEqualTo(String value) {
            addCriterion("wish_content <=", value, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentLike(String value) {
            addCriterion("wish_content like", value, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentNotLike(String value) {
            addCriterion("wish_content not like", value, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentIn(List<String> values) {
            addCriterion("wish_content in", values, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentNotIn(List<String> values) {
            addCriterion("wish_content not in", values, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentBetween(String value1, String value2) {
            addCriterion("wish_content between", value1, value2, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishContentNotBetween(String value1, String value2) {
            addCriterion("wish_content not between", value1, value2, "wishContent");
            return (Criteria) this;
        }

        public Criteria andWishDeclareIsNull() {
            addCriterion("wish_declare is null");
            return (Criteria) this;
        }

        public Criteria andWishDeclareIsNotNull() {
            addCriterion("wish_declare is not null");
            return (Criteria) this;
        }

        public Criteria andWishDeclareEqualTo(String value) {
            addCriterion("wish_declare =", value, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareNotEqualTo(String value) {
            addCriterion("wish_declare <>", value, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareGreaterThan(String value) {
            addCriterion("wish_declare >", value, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareGreaterThanOrEqualTo(String value) {
            addCriterion("wish_declare >=", value, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareLessThan(String value) {
            addCriterion("wish_declare <", value, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareLessThanOrEqualTo(String value) {
            addCriterion("wish_declare <=", value, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareLike(String value) {
            addCriterion("wish_declare like", value, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareNotLike(String value) {
            addCriterion("wish_declare not like", value, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareIn(List<String> values) {
            addCriterion("wish_declare in", values, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareNotIn(List<String> values) {
            addCriterion("wish_declare not in", values, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareBetween(String value1, String value2) {
            addCriterion("wish_declare between", value1, value2, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWishDeclareNotBetween(String value1, String value2) {
            addCriterion("wish_declare not between", value1, value2, "wishDeclare");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNull() {
            addCriterion("wechat_name is null");
            return (Criteria) this;
        }

        public Criteria andWechatNameIsNotNull() {
            addCriterion("wechat_name is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNameEqualTo(String value) {
            addCriterion("wechat_name =", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotEqualTo(String value) {
            addCriterion("wechat_name <>", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThan(String value) {
            addCriterion("wechat_name >", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_name >=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThan(String value) {
            addCriterion("wechat_name <", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLessThanOrEqualTo(String value) {
            addCriterion("wechat_name <=", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameLike(String value) {
            addCriterion("wechat_name like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotLike(String value) {
            addCriterion("wechat_name not like", value, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameIn(List<String> values) {
            addCriterion("wechat_name in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotIn(List<String> values) {
            addCriterion("wechat_name not in", values, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameBetween(String value1, String value2) {
            addCriterion("wechat_name between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andWechatNameNotBetween(String value1, String value2) {
            addCriterion("wechat_name not between", value1, value2, "wechatName");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andWishStatusIsNull() {
            addCriterion("wish_status is null");
            return (Criteria) this;
        }

        public Criteria andWishStatusIsNotNull() {
            addCriterion("wish_status is not null");
            return (Criteria) this;
        }

        public Criteria andWishStatusEqualTo(Byte value) {
            addCriterion("wish_status =", value, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusNotEqualTo(Byte value) {
            addCriterion("wish_status <>", value, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusGreaterThan(Byte value) {
            addCriterion("wish_status >", value, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("wish_status >=", value, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusLessThan(Byte value) {
            addCriterion("wish_status <", value, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusLessThanOrEqualTo(Byte value) {
            addCriterion("wish_status <=", value, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusIn(List<Byte> values) {
            addCriterion("wish_status in", values, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusNotIn(List<Byte> values) {
            addCriterion("wish_status not in", values, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusBetween(Byte value1, Byte value2) {
            addCriterion("wish_status between", value1, value2, "wishStatus");
            return (Criteria) this;
        }

        public Criteria andWishStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("wish_status not between", value1, value2, "wishStatus");
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