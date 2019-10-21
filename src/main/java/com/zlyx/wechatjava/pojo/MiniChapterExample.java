package com.zlyx.wechatjava.pojo;

import java.util.ArrayList;
import java.util.List;

public class MiniChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MiniChapterExample() {
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

        public Criteria andChapIdIsNull() {
            addCriterion("chap_id is null");
            return (Criteria) this;
        }

        public Criteria andChapIdIsNotNull() {
            addCriterion("chap_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapIdEqualTo(Long value) {
            addCriterion("chap_id =", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotEqualTo(Long value) {
            addCriterion("chap_id <>", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdGreaterThan(Long value) {
            addCriterion("chap_id >", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdGreaterThanOrEqualTo(Long value) {
            addCriterion("chap_id >=", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdLessThan(Long value) {
            addCriterion("chap_id <", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdLessThanOrEqualTo(Long value) {
            addCriterion("chap_id <=", value, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdIn(List<Long> values) {
            addCriterion("chap_id in", values, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotIn(List<Long> values) {
            addCriterion("chap_id not in", values, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdBetween(Long value1, Long value2) {
            addCriterion("chap_id between", value1, value2, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapIdNotBetween(Long value1, Long value2) {
            addCriterion("chap_id not between", value1, value2, "chapId");
            return (Criteria) this;
        }

        public Criteria andChapNameIsNull() {
            addCriterion("chap_name is null");
            return (Criteria) this;
        }

        public Criteria andChapNameIsNotNull() {
            addCriterion("chap_name is not null");
            return (Criteria) this;
        }

        public Criteria andChapNameEqualTo(String value) {
            addCriterion("chap_name =", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotEqualTo(String value) {
            addCriterion("chap_name <>", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameGreaterThan(String value) {
            addCriterion("chap_name >", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameGreaterThanOrEqualTo(String value) {
            addCriterion("chap_name >=", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLessThan(String value) {
            addCriterion("chap_name <", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLessThanOrEqualTo(String value) {
            addCriterion("chap_name <=", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameLike(String value) {
            addCriterion("chap_name like", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotLike(String value) {
            addCriterion("chap_name not like", value, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameIn(List<String> values) {
            addCriterion("chap_name in", values, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotIn(List<String> values) {
            addCriterion("chap_name not in", values, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameBetween(String value1, String value2) {
            addCriterion("chap_name between", value1, value2, "chapName");
            return (Criteria) this;
        }

        public Criteria andChapNameNotBetween(String value1, String value2) {
            addCriterion("chap_name not between", value1, value2, "chapName");
            return (Criteria) this;
        }

        public Criteria andLessIdIsNull() {
            addCriterion("less_id is null");
            return (Criteria) this;
        }

        public Criteria andLessIdIsNotNull() {
            addCriterion("less_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessIdEqualTo(String value) {
            addCriterion("less_id =", value, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdNotEqualTo(String value) {
            addCriterion("less_id <>", value, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdGreaterThan(String value) {
            addCriterion("less_id >", value, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdGreaterThanOrEqualTo(String value) {
            addCriterion("less_id >=", value, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdLessThan(String value) {
            addCriterion("less_id <", value, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdLessThanOrEqualTo(String value) {
            addCriterion("less_id <=", value, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdLike(String value) {
            addCriterion("less_id like", value, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdNotLike(String value) {
            addCriterion("less_id not like", value, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdIn(List<String> values) {
            addCriterion("less_id in", values, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdNotIn(List<String> values) {
            addCriterion("less_id not in", values, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdBetween(String value1, String value2) {
            addCriterion("less_id between", value1, value2, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessIdNotBetween(String value1, String value2) {
            addCriterion("less_id not between", value1, value2, "lessId");
            return (Criteria) this;
        }

        public Criteria andLessTypeIsNull() {
            addCriterion("less_type is null");
            return (Criteria) this;
        }

        public Criteria andLessTypeIsNotNull() {
            addCriterion("less_type is not null");
            return (Criteria) this;
        }

        public Criteria andLessTypeEqualTo(String value) {
            addCriterion("less_type =", value, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeNotEqualTo(String value) {
            addCriterion("less_type <>", value, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeGreaterThan(String value) {
            addCriterion("less_type >", value, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("less_type >=", value, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeLessThan(String value) {
            addCriterion("less_type <", value, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeLessThanOrEqualTo(String value) {
            addCriterion("less_type <=", value, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeLike(String value) {
            addCriterion("less_type like", value, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeNotLike(String value) {
            addCriterion("less_type not like", value, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeIn(List<String> values) {
            addCriterion("less_type in", values, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeNotIn(List<String> values) {
            addCriterion("less_type not in", values, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeBetween(String value1, String value2) {
            addCriterion("less_type between", value1, value2, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessTypeNotBetween(String value1, String value2) {
            addCriterion("less_type not between", value1, value2, "lessType");
            return (Criteria) this;
        }

        public Criteria andLessAttributeIsNull() {
            addCriterion("less_attribute is null");
            return (Criteria) this;
        }

        public Criteria andLessAttributeIsNotNull() {
            addCriterion("less_attribute is not null");
            return (Criteria) this;
        }

        public Criteria andLessAttributeEqualTo(String value) {
            addCriterion("less_attribute =", value, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeNotEqualTo(String value) {
            addCriterion("less_attribute <>", value, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeGreaterThan(String value) {
            addCriterion("less_attribute >", value, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("less_attribute >=", value, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeLessThan(String value) {
            addCriterion("less_attribute <", value, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeLessThanOrEqualTo(String value) {
            addCriterion("less_attribute <=", value, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeLike(String value) {
            addCriterion("less_attribute like", value, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeNotLike(String value) {
            addCriterion("less_attribute not like", value, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeIn(List<String> values) {
            addCriterion("less_attribute in", values, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeNotIn(List<String> values) {
            addCriterion("less_attribute not in", values, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeBetween(String value1, String value2) {
            addCriterion("less_attribute between", value1, value2, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andLessAttributeNotBetween(String value1, String value2) {
            addCriterion("less_attribute not between", value1, value2, "lessAttribute");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
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

        public Criteria andDelTimeIsNull() {
            addCriterion("del_time is null");
            return (Criteria) this;
        }

        public Criteria andDelTimeIsNotNull() {
            addCriterion("del_time is not null");
            return (Criteria) this;
        }

        public Criteria andDelTimeEqualTo(String value) {
            addCriterion("del_time =", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotEqualTo(String value) {
            addCriterion("del_time <>", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThan(String value) {
            addCriterion("del_time >", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("del_time >=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThan(String value) {
            addCriterion("del_time <", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLessThanOrEqualTo(String value) {
            addCriterion("del_time <=", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeLike(String value) {
            addCriterion("del_time like", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotLike(String value) {
            addCriterion("del_time not like", value, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeIn(List<String> values) {
            addCriterion("del_time in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotIn(List<String> values) {
            addCriterion("del_time not in", values, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeBetween(String value1, String value2) {
            addCriterion("del_time between", value1, value2, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelTimeNotBetween(String value1, String value2) {
            addCriterion("del_time not between", value1, value2, "delTime");
            return (Criteria) this;
        }

        public Criteria andDelNameIsNull() {
            addCriterion("del_name is null");
            return (Criteria) this;
        }

        public Criteria andDelNameIsNotNull() {
            addCriterion("del_name is not null");
            return (Criteria) this;
        }

        public Criteria andDelNameEqualTo(String value) {
            addCriterion("del_name =", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameNotEqualTo(String value) {
            addCriterion("del_name <>", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameGreaterThan(String value) {
            addCriterion("del_name >", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameGreaterThanOrEqualTo(String value) {
            addCriterion("del_name >=", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameLessThan(String value) {
            addCriterion("del_name <", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameLessThanOrEqualTo(String value) {
            addCriterion("del_name <=", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameLike(String value) {
            addCriterion("del_name like", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameNotLike(String value) {
            addCriterion("del_name not like", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameIn(List<String> values) {
            addCriterion("del_name in", values, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameNotIn(List<String> values) {
            addCriterion("del_name not in", values, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameBetween(String value1, String value2) {
            addCriterion("del_name between", value1, value2, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameNotBetween(String value1, String value2) {
            addCriterion("del_name not between", value1, value2, "delName");
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