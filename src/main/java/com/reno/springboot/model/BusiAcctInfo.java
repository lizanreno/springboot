package com.reno.springboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * entity:BusiAcctInfo
 * 
 * @author reno
 */
@Data
@NoArgsConstructor
public class BusiAcctInfo implements Serializable {
	
	private static final long serialVersionUID = -1790456975370404274L;
	private Long    memberId;   /* 个人会员ID */
	private Long	acctId;		 /* 账户ID */ 
	private Long	channelId;		 /* 渠道ID */ 
	private String	acctName;		 /* 账户名称 */ 
	private String	password;		 /* 账户密码 */ 
	private String	acctCode;		 /* 账户编码 */ 
	private Integer	acctState;		 /* 账户状态 */ 
	private Integer authState;      /* 个人认证状态 */
	private String	logoUrl;		 /* LOGO_URL */ 
	private String	name;		 /* 姓名 */ 
	private Integer	genderType;		 /* 性别 */ 
	private Long	deptId;		 /* 部门ID */ 
	private String	mobileNum;		 /* 手机号 */ 
	private String	email;		 /* 电子邮件 */ 
	private Long	areaId;		 /* 地区ID */ 
	private String	areaIdFullPath;		 /* 地区ID路径 */ 
	private String	areaNameFullPath;		 /* 地区名称路径 */ 
	private String	contactAddr;		 /* 联系地址 */ 
	private String	postCode;		 /* 邮编 */ 
	private Date	registerTime;		 /* 注册时间 */ 
	private Date	updateTime;		 /* 更新时间 */ 
	private Date	lastLoginTime;		 /* 最后登录时间 */ 
	private Integer	isDelete;		 /* 是否删除 */ 
	private String choiceAuthenType; /* 第一次注册成功后，有个页面选择要成为的平台企业身份 */
	private String registrationSource;/*1平台注册 2产品委注册 3智库注册*/
	private String	entName;		 /* 企业名称 */


	
}
