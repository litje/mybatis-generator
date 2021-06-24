package com.li.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * PlanInfoPOExample
     * @return null
     */
    public PlanInfoPOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause
     * @param orderByClause orderByClause
     * @return null
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     * @return java.lang.String
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     * @param distinct distinct
     * @return null
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     * @return boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     * @return java.util.List<Criteria>
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     * @param criteria criteria
     * @return null
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     * @return Criteria
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     * @return Criteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     * @return Criteria
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     * @return null
     */
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

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Long value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Long value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Long value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Long value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Long value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Long> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Long> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Long value1, Long value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Long value1, Long value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanNameIsNull() {
            addCriterion("plan_name is null");
            return (Criteria) this;
        }

        public Criteria andPlanNameIsNotNull() {
            addCriterion("plan_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlanNameEqualTo(String value) {
            addCriterion("plan_name =", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotEqualTo(String value) {
            addCriterion("plan_name <>", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameGreaterThan(String value) {
            addCriterion("plan_name >", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameGreaterThanOrEqualTo(String value) {
            addCriterion("plan_name >=", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLessThan(String value) {
            addCriterion("plan_name <", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLessThanOrEqualTo(String value) {
            addCriterion("plan_name <=", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameLike(String value) {
            addCriterion("plan_name like", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotLike(String value) {
            addCriterion("plan_name not like", value, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameIn(List<String> values) {
            addCriterion("plan_name in", values, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotIn(List<String> values) {
            addCriterion("plan_name not in", values, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameBetween(String value1, String value2) {
            addCriterion("plan_name between", value1, value2, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanNameNotBetween(String value1, String value2) {
            addCriterion("plan_name not between", value1, value2, "planName");
            return (Criteria) this;
        }

        public Criteria andPlanStsIsNull() {
            addCriterion("plan_sts is null");
            return (Criteria) this;
        }

        public Criteria andPlanStsIsNotNull() {
            addCriterion("plan_sts is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStsEqualTo(Integer value) {
            addCriterion("plan_sts =", value, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsNotEqualTo(Integer value) {
            addCriterion("plan_sts <>", value, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsGreaterThan(Integer value) {
            addCriterion("plan_sts >", value, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_sts >=", value, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsLessThan(Integer value) {
            addCriterion("plan_sts <", value, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsLessThanOrEqualTo(Integer value) {
            addCriterion("plan_sts <=", value, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsIn(List<Integer> values) {
            addCriterion("plan_sts in", values, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsNotIn(List<Integer> values) {
            addCriterion("plan_sts not in", values, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsBetween(Integer value1, Integer value2) {
            addCriterion("plan_sts between", value1, value2, "planSts");
            return (Criteria) this;
        }

        public Criteria andPlanStsNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_sts not between", value1, value2, "planSts");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("cust_id like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("cust_id not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andReachTypeIsNull() {
            addCriterion("reach_type is null");
            return (Criteria) this;
        }

        public Criteria andReachTypeIsNotNull() {
            addCriterion("reach_type is not null");
            return (Criteria) this;
        }

        public Criteria andReachTypeEqualTo(String value) {
            addCriterion("reach_type =", value, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeNotEqualTo(String value) {
            addCriterion("reach_type <>", value, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeGreaterThan(String value) {
            addCriterion("reach_type >", value, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reach_type >=", value, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeLessThan(String value) {
            addCriterion("reach_type <", value, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeLessThanOrEqualTo(String value) {
            addCriterion("reach_type <=", value, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeLike(String value) {
            addCriterion("reach_type like", value, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeNotLike(String value) {
            addCriterion("reach_type not like", value, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeIn(List<String> values) {
            addCriterion("reach_type in", values, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeNotIn(List<String> values) {
            addCriterion("reach_type not in", values, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeBetween(String value1, String value2) {
            addCriterion("reach_type between", value1, value2, "reachType");
            return (Criteria) this;
        }

        public Criteria andReachTypeNotBetween(String value1, String value2) {
            addCriterion("reach_type not between", value1, value2, "reachType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeIsNull() {
            addCriterion("touch_condition_type is null");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeIsNotNull() {
            addCriterion("touch_condition_type is not null");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeEqualTo(Integer value) {
            addCriterion("touch_condition_type =", value, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeNotEqualTo(Integer value) {
            addCriterion("touch_condition_type <>", value, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeGreaterThan(Integer value) {
            addCriterion("touch_condition_type >", value, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("touch_condition_type >=", value, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeLessThan(Integer value) {
            addCriterion("touch_condition_type <", value, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("touch_condition_type <=", value, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeIn(List<Integer> values) {
            addCriterion("touch_condition_type in", values, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeNotIn(List<Integer> values) {
            addCriterion("touch_condition_type not in", values, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeBetween(Integer value1, Integer value2) {
            addCriterion("touch_condition_type between", value1, value2, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchConditionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("touch_condition_type not between", value1, value2, "touchConditionType");
            return (Criteria) this;
        }

        public Criteria andTouchCronIsNull() {
            addCriterion("touch_cron is null");
            return (Criteria) this;
        }

        public Criteria andTouchCronIsNotNull() {
            addCriterion("touch_cron is not null");
            return (Criteria) this;
        }

        public Criteria andTouchCronEqualTo(String value) {
            addCriterion("touch_cron =", value, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronNotEqualTo(String value) {
            addCriterion("touch_cron <>", value, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronGreaterThan(String value) {
            addCriterion("touch_cron >", value, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronGreaterThanOrEqualTo(String value) {
            addCriterion("touch_cron >=", value, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronLessThan(String value) {
            addCriterion("touch_cron <", value, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronLessThanOrEqualTo(String value) {
            addCriterion("touch_cron <=", value, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronLike(String value) {
            addCriterion("touch_cron like", value, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronNotLike(String value) {
            addCriterion("touch_cron not like", value, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronIn(List<String> values) {
            addCriterion("touch_cron in", values, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronNotIn(List<String> values) {
            addCriterion("touch_cron not in", values, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronBetween(String value1, String value2) {
            addCriterion("touch_cron between", value1, value2, "touchCron");
            return (Criteria) this;
        }

        public Criteria andTouchCronNotBetween(String value1, String value2) {
            addCriterion("touch_cron not between", value1, value2, "touchCron");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeIsNull() {
            addCriterion("filter_condition_type is null");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeIsNotNull() {
            addCriterion("filter_condition_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeEqualTo(Integer value) {
            addCriterion("filter_condition_type =", value, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeNotEqualTo(Integer value) {
            addCriterion("filter_condition_type <>", value, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeGreaterThan(Integer value) {
            addCriterion("filter_condition_type >", value, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("filter_condition_type >=", value, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeLessThan(Integer value) {
            addCriterion("filter_condition_type <", value, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("filter_condition_type <=", value, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeIn(List<Integer> values) {
            addCriterion("filter_condition_type in", values, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeNotIn(List<Integer> values) {
            addCriterion("filter_condition_type not in", values, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeBetween(Integer value1, Integer value2) {
            addCriterion("filter_condition_type between", value1, value2, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("filter_condition_type not between", value1, value2, "filterConditionType");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentIsNull() {
            addCriterion("filter_condition_content is null");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentIsNotNull() {
            addCriterion("filter_condition_content is not null");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentEqualTo(String value) {
            addCriterion("filter_condition_content =", value, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentNotEqualTo(String value) {
            addCriterion("filter_condition_content <>", value, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentGreaterThan(String value) {
            addCriterion("filter_condition_content >", value, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentGreaterThanOrEqualTo(String value) {
            addCriterion("filter_condition_content >=", value, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentLessThan(String value) {
            addCriterion("filter_condition_content <", value, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentLessThanOrEqualTo(String value) {
            addCriterion("filter_condition_content <=", value, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentLike(String value) {
            addCriterion("filter_condition_content like", value, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentNotLike(String value) {
            addCriterion("filter_condition_content not like", value, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentIn(List<String> values) {
            addCriterion("filter_condition_content in", values, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentNotIn(List<String> values) {
            addCriterion("filter_condition_content not in", values, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentBetween(String value1, String value2) {
            addCriterion("filter_condition_content between", value1, value2, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andFilterConditionContentNotBetween(String value1, String value2) {
            addCriterion("filter_condition_content not between", value1, value2, "filterConditionContent");
            return (Criteria) this;
        }

        public Criteria andSqlFieldIsNull() {
            addCriterion("sql_field is null");
            return (Criteria) this;
        }

        public Criteria andSqlFieldIsNotNull() {
            addCriterion("sql_field is not null");
            return (Criteria) this;
        }

        public Criteria andSqlFieldEqualTo(String value) {
            addCriterion("sql_field =", value, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldNotEqualTo(String value) {
            addCriterion("sql_field <>", value, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldGreaterThan(String value) {
            addCriterion("sql_field >", value, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldGreaterThanOrEqualTo(String value) {
            addCriterion("sql_field >=", value, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldLessThan(String value) {
            addCriterion("sql_field <", value, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldLessThanOrEqualTo(String value) {
            addCriterion("sql_field <=", value, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldLike(String value) {
            addCriterion("sql_field like", value, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldNotLike(String value) {
            addCriterion("sql_field not like", value, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldIn(List<String> values) {
            addCriterion("sql_field in", values, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldNotIn(List<String> values) {
            addCriterion("sql_field not in", values, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldBetween(String value1, String value2) {
            addCriterion("sql_field between", value1, value2, "sqlField");
            return (Criteria) this;
        }

        public Criteria andSqlFieldNotBetween(String value1, String value2) {
            addCriterion("sql_field not between", value1, value2, "sqlField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldIsNull() {
            addCriterion("rds_field is null");
            return (Criteria) this;
        }

        public Criteria andRdsFieldIsNotNull() {
            addCriterion("rds_field is not null");
            return (Criteria) this;
        }

        public Criteria andRdsFieldEqualTo(String value) {
            addCriterion("rds_field =", value, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldNotEqualTo(String value) {
            addCriterion("rds_field <>", value, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldGreaterThan(String value) {
            addCriterion("rds_field >", value, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldGreaterThanOrEqualTo(String value) {
            addCriterion("rds_field >=", value, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldLessThan(String value) {
            addCriterion("rds_field <", value, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldLessThanOrEqualTo(String value) {
            addCriterion("rds_field <=", value, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldLike(String value) {
            addCriterion("rds_field like", value, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldNotLike(String value) {
            addCriterion("rds_field not like", value, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldIn(List<String> values) {
            addCriterion("rds_field in", values, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldNotIn(List<String> values) {
            addCriterion("rds_field not in", values, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldBetween(String value1, String value2) {
            addCriterion("rds_field between", value1, value2, "rdsField");
            return (Criteria) this;
        }

        public Criteria andRdsFieldNotBetween(String value1, String value2) {
            addCriterion("rds_field not between", value1, value2, "rdsField");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagIsNull() {
            addCriterion("blacklist_flag is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagIsNotNull() {
            addCriterion("blacklist_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagEqualTo(Boolean value) {
            addCriterion("blacklist_flag =", value, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagNotEqualTo(Boolean value) {
            addCriterion("blacklist_flag <>", value, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagGreaterThan(Boolean value) {
            addCriterion("blacklist_flag >", value, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("blacklist_flag >=", value, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagLessThan(Boolean value) {
            addCriterion("blacklist_flag <", value, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("blacklist_flag <=", value, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagIn(List<Boolean> values) {
            addCriterion("blacklist_flag in", values, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagNotIn(List<Boolean> values) {
            addCriterion("blacklist_flag not in", values, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("blacklist_flag between", value1, value2, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andBlacklistFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("blacklist_flag not between", value1, value2, "blacklistFlag");
            return (Criteria) this;
        }

        public Criteria andChnlIdIsNull() {
            addCriterion("chnl_id is null");
            return (Criteria) this;
        }

        public Criteria andChnlIdIsNotNull() {
            addCriterion("chnl_id is not null");
            return (Criteria) this;
        }

        public Criteria andChnlIdEqualTo(Long value) {
            addCriterion("chnl_id =", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotEqualTo(Long value) {
            addCriterion("chnl_id <>", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdGreaterThan(Long value) {
            addCriterion("chnl_id >", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("chnl_id >=", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLessThan(Long value) {
            addCriterion("chnl_id <", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLessThanOrEqualTo(Long value) {
            addCriterion("chnl_id <=", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdIn(List<Long> values) {
            addCriterion("chnl_id in", values, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotIn(List<Long> values) {
            addCriterion("chnl_id not in", values, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdBetween(Long value1, Long value2) {
            addCriterion("chnl_id between", value1, value2, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotBetween(Long value1, Long value2) {
            addCriterion("chnl_id not between", value1, value2, "chnlId");
            return (Criteria) this;
        }

        public Criteria andTmplIdIsNull() {
            addCriterion("tmpl_id is null");
            return (Criteria) this;
        }

        public Criteria andTmplIdIsNotNull() {
            addCriterion("tmpl_id is not null");
            return (Criteria) this;
        }

        public Criteria andTmplIdEqualTo(Long value) {
            addCriterion("tmpl_id =", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdNotEqualTo(Long value) {
            addCriterion("tmpl_id <>", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdGreaterThan(Long value) {
            addCriterion("tmpl_id >", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tmpl_id >=", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdLessThan(Long value) {
            addCriterion("tmpl_id <", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdLessThanOrEqualTo(Long value) {
            addCriterion("tmpl_id <=", value, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdIn(List<Long> values) {
            addCriterion("tmpl_id in", values, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdNotIn(List<Long> values) {
            addCriterion("tmpl_id not in", values, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdBetween(Long value1, Long value2) {
            addCriterion("tmpl_id between", value1, value2, "tmplId");
            return (Criteria) this;
        }

        public Criteria andTmplIdNotBetween(Long value1, Long value2) {
            addCriterion("tmpl_id not between", value1, value2, "tmplId");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContIsNull() {
            addCriterion("modified_tmpl_cont is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContIsNotNull() {
            addCriterion("modified_tmpl_cont is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContEqualTo(String value) {
            addCriterion("modified_tmpl_cont =", value, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContNotEqualTo(String value) {
            addCriterion("modified_tmpl_cont <>", value, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContGreaterThan(String value) {
            addCriterion("modified_tmpl_cont >", value, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContGreaterThanOrEqualTo(String value) {
            addCriterion("modified_tmpl_cont >=", value, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContLessThan(String value) {
            addCriterion("modified_tmpl_cont <", value, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContLessThanOrEqualTo(String value) {
            addCriterion("modified_tmpl_cont <=", value, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContLike(String value) {
            addCriterion("modified_tmpl_cont like", value, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContNotLike(String value) {
            addCriterion("modified_tmpl_cont not like", value, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContIn(List<String> values) {
            addCriterion("modified_tmpl_cont in", values, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContNotIn(List<String> values) {
            addCriterion("modified_tmpl_cont not in", values, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContBetween(String value1, String value2) {
            addCriterion("modified_tmpl_cont between", value1, value2, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andModifiedTmplContNotBetween(String value1, String value2) {
            addCriterion("modified_tmpl_cont not between", value1, value2, "modifiedTmplCont");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdIsNull() {
            addCriterion("wf_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdIsNotNull() {
            addCriterion("wf_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdEqualTo(String value) {
            addCriterion("wf_instance_id =", value, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdNotEqualTo(String value) {
            addCriterion("wf_instance_id <>", value, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdGreaterThan(String value) {
            addCriterion("wf_instance_id >", value, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("wf_instance_id >=", value, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdLessThan(String value) {
            addCriterion("wf_instance_id <", value, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("wf_instance_id <=", value, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdLike(String value) {
            addCriterion("wf_instance_id like", value, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdNotLike(String value) {
            addCriterion("wf_instance_id not like", value, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdIn(List<String> values) {
            addCriterion("wf_instance_id in", values, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdNotIn(List<String> values) {
            addCriterion("wf_instance_id not in", values, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdBetween(String value1, String value2) {
            addCriterion("wf_instance_id between", value1, value2, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andWfInstanceIdNotBetween(String value1, String value2) {
            addCriterion("wf_instance_id not between", value1, value2, "wfInstanceId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdIsNull() {
            addCriterion("ticket_grp_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdIsNotNull() {
            addCriterion("ticket_grp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdEqualTo(Long value) {
            addCriterion("ticket_grp_id =", value, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdNotEqualTo(Long value) {
            addCriterion("ticket_grp_id <>", value, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdGreaterThan(Long value) {
            addCriterion("ticket_grp_id >", value, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ticket_grp_id >=", value, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdLessThan(Long value) {
            addCriterion("ticket_grp_id <", value, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdLessThanOrEqualTo(Long value) {
            addCriterion("ticket_grp_id <=", value, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdIn(List<Long> values) {
            addCriterion("ticket_grp_id in", values, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdNotIn(List<Long> values) {
            addCriterion("ticket_grp_id not in", values, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdBetween(Long value1, Long value2) {
            addCriterion("ticket_grp_id between", value1, value2, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andTicketGrpIdNotBetween(Long value1, Long value2) {
            addCriterion("ticket_grp_id not between", value1, value2, "ticketGrpId");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoIsNull() {
            addCriterion("grp_event_info is null");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoIsNotNull() {
            addCriterion("grp_event_info is not null");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoEqualTo(String value) {
            addCriterion("grp_event_info =", value, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoNotEqualTo(String value) {
            addCriterion("grp_event_info <>", value, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoGreaterThan(String value) {
            addCriterion("grp_event_info >", value, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoGreaterThanOrEqualTo(String value) {
            addCriterion("grp_event_info >=", value, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoLessThan(String value) {
            addCriterion("grp_event_info <", value, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoLessThanOrEqualTo(String value) {
            addCriterion("grp_event_info <=", value, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoLike(String value) {
            addCriterion("grp_event_info like", value, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoNotLike(String value) {
            addCriterion("grp_event_info not like", value, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoIn(List<String> values) {
            addCriterion("grp_event_info in", values, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoNotIn(List<String> values) {
            addCriterion("grp_event_info not in", values, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoBetween(String value1, String value2) {
            addCriterion("grp_event_info between", value1, value2, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andGrpEventInfoNotBetween(String value1, String value2) {
            addCriterion("grp_event_info not between", value1, value2, "grpEventInfo");
            return (Criteria) this;
        }

        public Criteria andAuditStsIsNull() {
            addCriterion("audit_sts is null");
            return (Criteria) this;
        }

        public Criteria andAuditStsIsNotNull() {
            addCriterion("audit_sts is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStsEqualTo(Integer value) {
            addCriterion("audit_sts =", value, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsNotEqualTo(Integer value) {
            addCriterion("audit_sts <>", value, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsGreaterThan(Integer value) {
            addCriterion("audit_sts >", value, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_sts >=", value, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsLessThan(Integer value) {
            addCriterion("audit_sts <", value, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsLessThanOrEqualTo(Integer value) {
            addCriterion("audit_sts <=", value, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsIn(List<Integer> values) {
            addCriterion("audit_sts in", values, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsNotIn(List<Integer> values) {
            addCriterion("audit_sts not in", values, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsBetween(Integer value1, Integer value2) {
            addCriterion("audit_sts between", value1, value2, "auditSts");
            return (Criteria) this;
        }

        public Criteria andAuditStsNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_sts not between", value1, value2, "auditSts");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNull() {
            addCriterion("modified_by is null");
            return (Criteria) this;
        }

        public Criteria andModifiedByIsNotNull() {
            addCriterion("modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedByEqualTo(String value) {
            addCriterion("modified_by =", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotEqualTo(String value) {
            addCriterion("modified_by <>", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThan(String value) {
            addCriterion("modified_by >", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("modified_by >=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThan(String value) {
            addCriterion("modified_by <", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLessThanOrEqualTo(String value) {
            addCriterion("modified_by <=", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByLike(String value) {
            addCriterion("modified_by like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotLike(String value) {
            addCriterion("modified_by not like", value, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByIn(List<String> values) {
            addCriterion("modified_by in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotIn(List<String> values) {
            addCriterion("modified_by not in", values, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByBetween(String value1, String value2) {
            addCriterion("modified_by between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andModifiedByNotBetween(String value1, String value2) {
            addCriterion("modified_by not between", value1, value2, "modifiedBy");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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