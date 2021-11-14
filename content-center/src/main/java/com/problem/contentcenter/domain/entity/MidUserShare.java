package com.problem.contentcenter.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * <p>
 * 用户-分享中间表【描述用户购买的分享】
 * </p>
 *
 * @author problem
 * @since 2021-11-14
 */
@TableName("mid_user_share")
public class MidUserShare implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	private Integer id;

	/**
	 * share.id
	 */
	@TableField(value = "share_id")
	private Integer shareId;

	/**
	 * user.id
	 */
	@TableField(value = "user_id")
	private Integer userId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getShareId() {
		return shareId;
	}

	public void setShareId(Integer shareId) {
		this.shareId = shareId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
