package com.zlyx.wechatjava.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRoleExample() {
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

        public Criteria andRoleNoIsNull() {
            addCriterion("role_no is null");
            return (Criteria) this;
        }

        public Criteria andRoleNoIsNotNull() {
            addCriterion("role_no is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNoEqualTo(String value) {
            addCriterion("role_no =", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotEqualTo(String value) {
            addCriterion("role_no <>", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoGreaterThan(String value) {
            addCriterion("role_no >", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoGreaterThanOrEqualTo(String value) {
            addCriterion("role_no >=", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoLessThan(String value) {
            addCriterion("role_no <", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoLessThanOrEqualTo(String value) {
            addCriterion("role_no <=", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoLike(String value) {
            addCriterion("role_no like", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotLike(String value) {
            addCriterion("role_no not like", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoIn(List<String> values) {
            addCriterion("role_no in", values, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotIn(List<String> values) {
            addCriterion("role_no not in", values, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoBetween(String value1, String value2) {
            addCriterion("role_no between", value1, value2, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotBetween(String value1, String value2) {
            addCriterion("role_no not between", value1, value2, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdIsNull() {
            addCriterion("role_create_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdIsNotNull() {
            addCriterion("role_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdEqualTo(String value) {
            addCriterion("role_create_id =", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdNotEqualTo(String value) {
            addCriterion("role_create_id <>", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdGreaterThan(String value) {
            addCriterion("role_create_id >", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_create_id >=", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdLessThan(String value) {
            addCriterion("role_create_id <", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdLessThanOrEqualTo(String value) {
            addCriterion("role_create_id <=", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdLike(String value) {
            addCriterion("role_create_id like", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdNotLike(String value) {
            addCriterion("role_create_id not like", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdIn(List<String> values) {
            addCriterion("role_create_id in", values, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdNotIn(List<String> values) {
            addCriterion("role_create_id not in", values, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdBetween(String value1, String value2) {
            addCriterion("role_create_id between", value1, value2, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdNotBetween(String value1, String value2) {
            addCriterion("role_create_id not between", value1, value2, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIsNull() {
            addCriterion("role_create is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIsNotNull() {
            addCriterion("role_create is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateEqualTo(String value) {
            addCriterion("role_create =", value, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateNotEqualTo(String value) {
            addCriterion("role_create <>", value, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateGreaterThan(String value) {
            addCriterion("role_create >", value, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateGreaterThanOrEqualTo(String value) {
            addCriterion("role_create >=", value, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateLessThan(String value) {
            addCriterion("role_create <", value, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateLessThanOrEqualTo(String value) {
            addCriterion("role_create <=", value, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateLike(String value) {
            addCriterion("role_create like", value, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateNotLike(String value) {
            addCriterion("role_create not like", value, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIn(List<String> values) {
            addCriterion("role_create in", values, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateNotIn(List<String> values) {
            addCriterion("role_create not in", values, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateBetween(String value1, String value2) {
            addCriterion("role_create between", value1, value2, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateNotBetween(String value1, String value2) {
            addCriterion("role_create not between", value1, value2, "roleCreate");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIsNull() {
            addCriterion("role_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIsNotNull() {
            addCriterion("role_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeEqualTo(String value) {
            addCriterion("role_create_time =", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotEqualTo(String value) {
            addCriterion("role_create_time <>", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeGreaterThan(String value) {
            addCriterion("role_create_time >", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("role_create_time >=", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeLessThan(String value) {
            addCriterion("role_create_time <", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("role_create_time <=", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeLike(String value) {
            addCriterion("role_create_time like", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotLike(String value) {
            addCriterion("role_create_time not like", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIn(List<String> values) {
            addCriterion("role_create_time in", values, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotIn(List<String> values) {
            addCriterion("role_create_time not in", values, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeBetween(String value1, String value2) {
            addCriterion("role_create_time between", value1, value2, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotBetween(String value1, String value2) {
            addCriterion("role_create_time not between", value1, value2, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleDescIsNull() {
            addCriterion("role_desc is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescIsNotNull() {
            addCriterion("role_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescEqualTo(String value) {
            addCriterion("role_desc =", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotEqualTo(String value) {
            addCriterion("role_desc <>", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescGreaterThan(String value) {
            addCriterion("role_desc >", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("role_desc >=", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLessThan(String value) {
            addCriterion("role_desc <", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLessThanOrEqualTo(String value) {
            addCriterion("role_desc <=", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLike(String value) {
            addCriterion("role_desc like", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotLike(String value) {
            addCriterion("role_desc not like", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescIn(List<String> values) {
            addCriterion("role_desc in", values, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotIn(List<String> values) {
            addCriterion("role_desc not in", values, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescBetween(String value1, String value2) {
            addCriterion("role_desc between", value1, value2, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotBetween(String value1, String value2) {
            addCriterion("role_desc not between", value1, value2, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNull() {
            addCriterion("op_id is null");
            return (Criteria) this;
        }

        public Criteria andOpIdIsNotNull() {
            addCriterion("op_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpIdEqualTo(String value) {
            addCriterion("op_id =", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotEqualTo(String value) {
            addCriterion("op_id <>", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThan(String value) {
            addCriterion("op_id >", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdGreaterThanOrEqualTo(String value) {
            addCriterion("op_id >=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThan(String value) {
            addCriterion("op_id <", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLessThanOrEqualTo(String value) {
            addCriterion("op_id <=", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdLike(String value) {
            addCriterion("op_id like", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotLike(String value) {
            addCriterion("op_id not like", value, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdIn(List<String> values) {
            addCriterion("op_id in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotIn(List<String> values) {
            addCriterion("op_id not in", values, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdBetween(String value1, String value2) {
            addCriterion("op_id between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpIdNotBetween(String value1, String value2) {
            addCriterion("op_id not between", value1, value2, "opId");
            return (Criteria) this;
        }

        public Criteria andOpNameIsNull() {
            addCriterion("op_name is null");
            return (Criteria) this;
        }

        public Criteria andOpNameIsNotNull() {
            addCriterion("op_name is not null");
            return (Criteria) this;
        }

        public Criteria andOpNameEqualTo(String value) {
            addCriterion("op_name =", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotEqualTo(String value) {
            addCriterion("op_name <>", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameGreaterThan(String value) {
            addCriterion("op_name >", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameGreaterThanOrEqualTo(String value) {
            addCriterion("op_name >=", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLessThan(String value) {
            addCriterion("op_name <", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLessThanOrEqualTo(String value) {
            addCriterion("op_name <=", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLike(String value) {
            addCriterion("op_name like", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotLike(String value) {
            addCriterion("op_name not like", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameIn(List<String> values) {
            addCriterion("op_name in", values, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotIn(List<String> values) {
            addCriterion("op_name not in", values, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameBetween(String value1, String value2) {
            addCriterion("op_name between", value1, value2, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotBetween(String value1, String value2) {
            addCriterion("op_name not between", value1, value2, "opName");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNull() {
            addCriterion("op_time is null");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNotNull() {
            addCriterion("op_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpTimeEqualTo(String value) {
            addCriterion("op_time =", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotEqualTo(String value) {
            addCriterion("op_time <>", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThan(String value) {
            addCriterion("op_time >", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThanOrEqualTo(String value) {
            addCriterion("op_time >=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThan(String value) {
            addCriterion("op_time <", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThanOrEqualTo(String value) {
            addCriterion("op_time <=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLike(String value) {
            addCriterion("op_time like", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotLike(String value) {
            addCriterion("op_time not like", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeIn(List<String> values) {
            addCriterion("op_time in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotIn(List<String> values) {
            addCriterion("op_time not in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeBetween(String value1, String value2) {
            addCriterion("op_time between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotBetween(String value1, String value2) {
            addCriterion("op_time not between", value1, value2, "opTime");
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