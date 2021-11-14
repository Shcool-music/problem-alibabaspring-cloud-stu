package com.problem.contentcenter.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 分享表
 * </p>
 *
 * @author problem
 * @since 2021-11-14
 */
public class Share implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 发布人id
	 */
	@TableField(value = "user_id")
	private Integer userId;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 创建时间
	 */
	@TableField(value = "create_time")
	private Date createTime;

	/**
	 * 修改时间
	 */
	@TableField(value = "update_time")
	private Date updateTime;

	/**
	 * 是否原创 0:否 1:是
	 */
	@TableField(value = "is_original")
	private Integer isOriginal;

	/**
	 * 作者
	 */
	private String author;

	/**
	 * 封面
	 */
	private String cover;

	/**
	 * 概要信息
	 */
	private String summary;

	/**
	 * 价格（需要的积分）
	 */
	private Integer price;

	/**
	 * 下载地址
	 */
	@TableField(value = "download_url")
	private String downloadUrl;

	/**
	 * 下载数
	 */
	@TableField(value = "buy_count")
	private Integer buyCount;

	/**
	 * 是否显示 0:否 1:是
	 */
	@TableField(value = "show_flag")
	private Integer showFlag;

	/**
	 * 审核状态 NOT_YET: 待审核 PASSED:审核通过 REJECTED:审核不通过
	 */
	@TableField(value = "audit_status")
	private String auditStatus;

	/**
	 * 审核不通过原因
	 */
	private String reason;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsOriginal() {
		return isOriginal;
	}

	public void setIsOriginal(Integer isOriginal) {
		this.isOriginal = isOriginal;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Integer getBuyCount() {
		return buyCount;
	}

	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}

	public Integer getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(Integer showFlag) {
		this.showFlag = showFlag;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
