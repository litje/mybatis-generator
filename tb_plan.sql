CREATE TABLE  `tb_plan` (
  	`plan_id`	bigint	(64)  PRIMARY KEY  NOT NULL AUTO_INCREMENT COMMENT '计划id',
  	`plan_name`	varchar	(50)  DEFAULT NULL  COMMENT '计划名称',
  	`plan_sts`	tinyint	(2)  DEFAULT NULL  COMMENT '计划状态（1待发布/2执行中/3已结束）',
  	`reach_type`	varchar	(10)  DEFAULT NULL  COMMENT '触达类型（1事件/2主动批量/3主动单条）',
  	`touch_condition_type`	tinyint	(2)  DEFAULT NULL  COMMENT '触发条件类型（1定时、2一次性）',
  	`touch_cron`	varchar	(255)  DEFAULT NULL  COMMENT '执行时间表达式',
  	`filter_condition_type`	tinyint	(2)  DEFAULT NULL  COMMENT '过滤/圈选类型1excel2sql圈选3单人',
  	`filter_condition_content`	text DEFAULT NULL  COMMENT '过滤/圈选条件内容(excel地址/json逻辑表达式/用户id)',
	`sql_field`	text DEFAULT NULL  COMMENT 'Sql内容',
  	`rds_field`	text DEFAULT NULL  COMMENT 'rds内容',
  	`blacklist_flag`	tinyint	(1)  DEFAULT '1'  COMMENT '客户不在黑名单中（1true/0false）',
  	`chnl_id`	bigint	(64)  DEFAULT NULL  COMMENT '渠道id',
  	`tmpl_id`	bigint	(64)  DEFAULT NULL  COMMENT '模板id',
  	`modified_tmpl_cont`	text DEFAULT NULL  COMMENT '修改后模板内容',
  	`wf_instance_id`	varchar	(64)  DEFAULT NULL  COMMENT '工作流流程实例ID',
  	`ticket_grp_id`	bigint	(64)  DEFAULT NULL  COMMENT '工单分组id',
  	`grp_event_info`	varchar	(255)  DEFAULT NULL  COMMENT '分组事件信息',
  	`grp_id`	bigint	(64)  DEFAULT NULL  COMMENT '分组id',
  	`audit_sts`	tinyint	(2)  DEFAULT NULL  COMMENT '审核状态',
  	`form_config_cont`	varchar	(255)  DEFAULT NULL  COMMENT 'form配置内容',
	`create_by`	varchar	(50)  DEFAULT NULL  COMMENT '创建者',
	`gmt_create`	timestamp NULL DEFAULT NULL  COMMENT '创建时间',
  	`modified_by`	varchar	(50)  DEFAULT NULL  COMMENT '修改者',
	`gmt_modified`	timestamp NULL DEFAULT NULL  COMMENT '更新时间',
	`plan_fatigue_deg`	int	(11)  DEFAULT '1'  COMMENT '计划疲劳度（1未开启/2已开启）',
	`plan_fatigue_time`	int	(11)  DEFAULT NULL  COMMENT '计划疲劳时间',
	`plan_fatigue_cnt`	int	(11)  DEFAULT NULL  COMMENT '计划疲劳数'
) AUTO_INCREMENT=1 COMMENT ='计划表' ;