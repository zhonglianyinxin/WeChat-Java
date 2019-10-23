package com.zlyx.wechatjava.pojo;

import java.util.ArrayList;
import java.util.List;

public class MiniGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MiniGroupExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdIsNull() {
            addCriterion("group_adm_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdIsNotNull() {
            addCriterion("group_adm_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdEqualTo(String value) {
            addCriterion("group_adm_id =", value, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdNotEqualTo(String value) {
            addCriterion("group_adm_id <>", value, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdGreaterThan(String value) {
            addCriterion("group_adm_id >", value, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_adm_id >=", value, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdLessThan(String value) {
            addCriterion("group_adm_id <", value, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdLessThanOrEqualTo(String value) {
            addCriterion("group_adm_id <=", value, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdLike(String value) {
            addCriterion("group_adm_id like", value, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdNotLike(String value) {
            addCriterion("group_adm_id not like", value, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdIn(List<String> values) {
            addCriterion("group_adm_id in", values, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdNotIn(List<String> values) {
            addCriterion("group_adm_id not in", values, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdBetween(String value1, String value2) {
            addCriterion("group_adm_id between", value1, value2, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupAdmIdNotBetween(String value1, String value2) {
            addCriterion("group_adm_id not between", value1, value2, "groupAdmId");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupLevelIsNull() {
            addCriterion("group_level is null");
            return (Criteria) this;
        }

        public Criteria andGroupLevelIsNotNull() {
            addCriterion("group_level is not null");
            return (Criteria) this;
        }

        public Criteria andGroupLevelEqualTo(String value) {
            addCriterion("group_level =", value, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelNotEqualTo(String value) {
            addCriterion("group_level <>", value, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelGreaterThan(String value) {
            addCriterion("group_level >", value, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelGreaterThanOrEqualTo(String value) {
            addCriterion("group_level >=", value, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelLessThan(String value) {
            addCriterion("group_level <", value, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelLessThanOrEqualTo(String value) {
            addCriterion("group_level <=", value, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelLike(String value) {
            addCriterion("group_level like", value, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelNotLike(String value) {
            addCriterion("group_level not like", value, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelIn(List<String> values) {
            addCriterion("group_level in", values, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelNotIn(List<String> values) {
            addCriterion("group_level not in", values, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelBetween(String value1, String value2) {
            addCriterion("group_level between", value1, value2, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andGroupLevelNotBetween(String value1, String value2) {
            addCriterion("group_level not between", value1, value2, "groupLevel");
            return (Criteria) this;
        }

        public Criteria andStuYearIsNull() {
            addCriterion("stu_year is null");
            return (Criteria) this;
        }

        public Criteria andStuYearIsNotNull() {
            addCriterion("stu_year is not null");
            return (Criteria) this;
        }

        public Criteria andStuYearEqualTo(String value) {
            addCriterion("stu_year =", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearNotEqualTo(String value) {
            addCriterion("stu_year <>", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearGreaterThan(String value) {
            addCriterion("stu_year >", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearGreaterThanOrEqualTo(String value) {
            addCriterion("stu_year >=", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearLessThan(String value) {
            addCriterion("stu_year <", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearLessThanOrEqualTo(String value) {
            addCriterion("stu_year <=", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearLike(String value) {
            addCriterion("stu_year like", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearNotLike(String value) {
            addCriterion("stu_year not like", value, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearIn(List<String> values) {
            addCriterion("stu_year in", values, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearNotIn(List<String> values) {
            addCriterion("stu_year not in", values, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearBetween(String value1, String value2) {
            addCriterion("stu_year between", value1, value2, "stuYear");
            return (Criteria) this;
        }

        public Criteria andStuYearNotBetween(String value1, String value2) {
            addCriterion("stu_year not between", value1, value2, "stuYear");
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

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("create_id not between", value1, value2, "createId");
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