package com.firstMaven.pojo;

import java.util.ArrayList;
import java.util.List;

public class Mapping401Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Mapping401Example() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCallerClassIsNull() {
            addCriterion("caller_class is null");
            return (Criteria) this;
        }

        public Criteria andCallerClassIsNotNull() {
            addCriterion("caller_class is not null");
            return (Criteria) this;
        }

        public Criteria andCallerClassEqualTo(String value) {
            addCriterion("caller_class =", value, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassNotEqualTo(String value) {
            addCriterion("caller_class <>", value, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassGreaterThan(String value) {
            addCriterion("caller_class >", value, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassGreaterThanOrEqualTo(String value) {
            addCriterion("caller_class >=", value, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassLessThan(String value) {
            addCriterion("caller_class <", value, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassLessThanOrEqualTo(String value) {
            addCriterion("caller_class <=", value, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassLike(String value) {
            addCriterion("caller_class like", value, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassNotLike(String value) {
            addCriterion("caller_class not like", value, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassIn(List<String> values) {
            addCriterion("caller_class in", values, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassNotIn(List<String> values) {
            addCriterion("caller_class not in", values, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassBetween(String value1, String value2) {
            addCriterion("caller_class between", value1, value2, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerClassNotBetween(String value1, String value2) {
            addCriterion("caller_class not between", value1, value2, "callerClass");
            return (Criteria) this;
        }

        public Criteria andCallerMethodIsNull() {
            addCriterion("caller_method is null");
            return (Criteria) this;
        }

        public Criteria andCallerMethodIsNotNull() {
            addCriterion("caller_method is not null");
            return (Criteria) this;
        }

        public Criteria andCallerMethodEqualTo(String value) {
            addCriterion("caller_method =", value, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodNotEqualTo(String value) {
            addCriterion("caller_method <>", value, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodGreaterThan(String value) {
            addCriterion("caller_method >", value, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodGreaterThanOrEqualTo(String value) {
            addCriterion("caller_method >=", value, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodLessThan(String value) {
            addCriterion("caller_method <", value, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodLessThanOrEqualTo(String value) {
            addCriterion("caller_method <=", value, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodLike(String value) {
            addCriterion("caller_method like", value, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodNotLike(String value) {
            addCriterion("caller_method not like", value, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodIn(List<String> values) {
            addCriterion("caller_method in", values, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodNotIn(List<String> values) {
            addCriterion("caller_method not in", values, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodBetween(String value1, String value2) {
            addCriterion("caller_method between", value1, value2, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodNotBetween(String value1, String value2) {
            addCriterion("caller_method not between", value1, value2, "callerMethod");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescIsNull() {
            addCriterion("caller_method_desc is null");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescIsNotNull() {
            addCriterion("caller_method_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescEqualTo(String value) {
            addCriterion("caller_method_desc =", value, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescNotEqualTo(String value) {
            addCriterion("caller_method_desc <>", value, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescGreaterThan(String value) {
            addCriterion("caller_method_desc >", value, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescGreaterThanOrEqualTo(String value) {
            addCriterion("caller_method_desc >=", value, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescLessThan(String value) {
            addCriterion("caller_method_desc <", value, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescLessThanOrEqualTo(String value) {
            addCriterion("caller_method_desc <=", value, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescLike(String value) {
            addCriterion("caller_method_desc like", value, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescNotLike(String value) {
            addCriterion("caller_method_desc not like", value, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescIn(List<String> values) {
            addCriterion("caller_method_desc in", values, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescNotIn(List<String> values) {
            addCriterion("caller_method_desc not in", values, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescBetween(String value1, String value2) {
            addCriterion("caller_method_desc between", value1, value2, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andCallerMethodDescNotBetween(String value1, String value2) {
            addCriterion("caller_method_desc not between", value1, value2, "callerMethodDesc");
            return (Criteria) this;
        }

        public Criteria andApiContentIsNull() {
            addCriterion("api_content is null");
            return (Criteria) this;
        }

        public Criteria andApiContentIsNotNull() {
            addCriterion("api_content is not null");
            return (Criteria) this;
        }

        public Criteria andApiContentEqualTo(String value) {
            addCriterion("api_content =", value, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentNotEqualTo(String value) {
            addCriterion("api_content <>", value, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentGreaterThan(String value) {
            addCriterion("api_content >", value, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentGreaterThanOrEqualTo(String value) {
            addCriterion("api_content >=", value, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentLessThan(String value) {
            addCriterion("api_content <", value, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentLessThanOrEqualTo(String value) {
            addCriterion("api_content <=", value, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentLike(String value) {
            addCriterion("api_content like", value, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentNotLike(String value) {
            addCriterion("api_content not like", value, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentIn(List<String> values) {
            addCriterion("api_content in", values, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentNotIn(List<String> values) {
            addCriterion("api_content not in", values, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentBetween(String value1, String value2) {
            addCriterion("api_content between", value1, value2, "apiContent");
            return (Criteria) this;
        }

        public Criteria andApiContentNotBetween(String value1, String value2) {
            addCriterion("api_content not between", value1, value2, "apiContent");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNull() {
            addCriterion("permission is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIsNotNull() {
            addCriterion("permission is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionEqualTo(String value) {
            addCriterion("permission =", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotEqualTo(String value) {
            addCriterion("permission <>", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThan(String value) {
            addCriterion("permission >", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("permission >=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThan(String value) {
            addCriterion("permission <", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLessThanOrEqualTo(String value) {
            addCriterion("permission <=", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionLike(String value) {
            addCriterion("permission like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotLike(String value) {
            addCriterion("permission not like", value, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionIn(List<String> values) {
            addCriterion("permission in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotIn(List<String> values) {
            addCriterion("permission not in", values, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionBetween(String value1, String value2) {
            addCriterion("permission between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andPermissionNotBetween(String value1, String value2) {
            addCriterion("permission not between", value1, value2, "permission");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIsNull() {
            addCriterion("android_version is null");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIsNotNull() {
            addCriterion("android_version is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionEqualTo(String value) {
            addCriterion("android_version =", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotEqualTo(String value) {
            addCriterion("android_version <>", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionGreaterThan(String value) {
            addCriterion("android_version >", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionGreaterThanOrEqualTo(String value) {
            addCriterion("android_version >=", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLessThan(String value) {
            addCriterion("android_version <", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLessThanOrEqualTo(String value) {
            addCriterion("android_version <=", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionLike(String value) {
            addCriterion("android_version like", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotLike(String value) {
            addCriterion("android_version not like", value, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionIn(List<String> values) {
            addCriterion("android_version in", values, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotIn(List<String> values) {
            addCriterion("android_version not in", values, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionBetween(String value1, String value2) {
            addCriterion("android_version between", value1, value2, "androidVersion");
            return (Criteria) this;
        }

        public Criteria andAndroidVersionNotBetween(String value1, String value2) {
            addCriterion("android_version not between", value1, value2, "androidVersion");
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