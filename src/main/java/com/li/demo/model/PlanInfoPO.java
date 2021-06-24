package com.li.demo.model;

import java.util.Date;

/**
 * 计划表
 * 对应数据库表为：tb_plan
 * 
 * @author null
 * @date 2021-06-24
 */
public class PlanInfoPO {
    /**
     * 对应表字段：plan_id
     */
    private Long planId;

    /**
     * 对应表字段：plan_name
     */
    private String planName;

    /**
     * 对应表字段：plan_sts
     */
    private Integer planSts;

    /**
     * 对应表字段：cust_id
     */
    private String custId;

    /**
     * 对应表字段：reach_type
     */
    private String reachType;

    /**
     * 对应表字段：touch_condition_type
     */
    private Integer touchConditionType;

    /**
     * 对应表字段：touch_cron
     */
    private String touchCron;

    /**
     * 对应表字段：filter_condition_type
     */
    private Integer filterConditionType;

    /**
     * 对应表字段：filter_condition_content
     */
    private String filterConditionContent;

    /**
     * 对应表字段：sql_field
     */
    private String sqlField;

    /**
     * 对应表字段：rds_field
     */
    private String rdsField;

    /**
     * 对应表字段：blacklist_flag
     */
    private Boolean blacklistFlag;

    /**
     * 对应表字段：chnl_id
     */
    private Long chnlId;

    /**
     * 对应表字段：tmpl_id
     */
    private Long tmplId;

    /**
     * 对应表字段：modified_tmpl_cont
     */
    private String modifiedTmplCont;

    /**
     * 对应表字段：wf_instance_id
     */
    private String wfInstanceId;

    /**
     * 对应表字段：ticket_grp_id
     */
    private Long ticketGrpId;

    /**
     * 对应表字段：grp_event_info
     */
    private String grpEventInfo;

    /**
     * 对应表字段：audit_sts
     */
    private Integer auditSts;

    /**
     * 对应表字段：create_by
     */
    private String createBy;

    /**
     * 对应表字段：gmt_create
     */
    private Date gmtCreate;

    /**
     * 对应表字段：modified_by
     */
    private String modifiedBy;

    /**
     * 对应表字段：gmt_modified
     */
    private Date gmtModified;

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    public Integer getPlanSts() {
        return planSts;
    }

    public void setPlanSts(Integer planSts) {
        this.planSts = planSts;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    public String getReachType() {
        return reachType;
    }

    public void setReachType(String reachType) {
        this.reachType = reachType == null ? null : reachType.trim();
    }

    public Integer getTouchConditionType() {
        return touchConditionType;
    }

    public void setTouchConditionType(Integer touchConditionType) {
        this.touchConditionType = touchConditionType;
    }

    public String getTouchCron() {
        return touchCron;
    }

    public void setTouchCron(String touchCron) {
        this.touchCron = touchCron == null ? null : touchCron.trim();
    }

    public Integer getFilterConditionType() {
        return filterConditionType;
    }

    public void setFilterConditionType(Integer filterConditionType) {
        this.filterConditionType = filterConditionType;
    }

    public String getFilterConditionContent() {
        return filterConditionContent;
    }

    public void setFilterConditionContent(String filterConditionContent) {
        this.filterConditionContent = filterConditionContent == null ? null : filterConditionContent.trim();
    }

    public String getSqlField() {
        return sqlField;
    }

    public void setSqlField(String sqlField) {
        this.sqlField = sqlField == null ? null : sqlField.trim();
    }

    public String getRdsField() {
        return rdsField;
    }

    public void setRdsField(String rdsField) {
        this.rdsField = rdsField == null ? null : rdsField.trim();
    }

    public Boolean getBlacklistFlag() {
        return blacklistFlag;
    }

    public void setBlacklistFlag(Boolean blacklistFlag) {
        this.blacklistFlag = blacklistFlag;
    }

    public Long getChnlId() {
        return chnlId;
    }

    public void setChnlId(Long chnlId) {
        this.chnlId = chnlId;
    }

    public Long getTmplId() {
        return tmplId;
    }

    public void setTmplId(Long tmplId) {
        this.tmplId = tmplId;
    }

    public String getModifiedTmplCont() {
        return modifiedTmplCont;
    }

    public void setModifiedTmplCont(String modifiedTmplCont) {
        this.modifiedTmplCont = modifiedTmplCont == null ? null : modifiedTmplCont.trim();
    }

    public String getWfInstanceId() {
        return wfInstanceId;
    }

    public void setWfInstanceId(String wfInstanceId) {
        this.wfInstanceId = wfInstanceId == null ? null : wfInstanceId.trim();
    }

    public Long getTicketGrpId() {
        return ticketGrpId;
    }

    public void setTicketGrpId(Long ticketGrpId) {
        this.ticketGrpId = ticketGrpId;
    }

    public String getGrpEventInfo() {
        return grpEventInfo;
    }

    public void setGrpEventInfo(String grpEventInfo) {
        this.grpEventInfo = grpEventInfo == null ? null : grpEventInfo.trim();
    }

    public Integer getAuditSts() {
        return auditSts;
    }

    public void setAuditSts(Integer auditSts) {
        this.auditSts = auditSts;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy == null ? null : modifiedBy.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}