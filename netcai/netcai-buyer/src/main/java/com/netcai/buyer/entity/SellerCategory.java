package com.netcai.buyer.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 卖家分类
 * @author administrator
 */
public class SellerCategory implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 卖家分类主表ID
	 */
	private Long scId;
	/**
	 * 卖家ID
	 */
	private Long userId;
	/**
	 * 商品分类ID
	 */
	private Integer categoryId;
	/**
	 * 分类编码
	 */
	private String categoryCode;
	/**
	 * 分类名称
	 */
	private String categoryName;
	/**
	 * 层级
	 */
	private Short categoryLevel;
	/**
	 * 是否末级 1表示是末级
	 */
	private Short isEnd;
	/**
	 * 顺序号
	 */
	private Integer scSeq;
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	public Long getScId() {
		return scId;
	}
	public void setScId(Long scId) {
		this.scId = scId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Short getCategoryLevel() {
		return categoryLevel;
	}
	public void setCategoryLevel(Short categoryLevel) {
		this.categoryLevel = categoryLevel;
	}
	public Short getIsEnd() {
		return isEnd;
	}
	public void setIsEnd(Short isEnd) {
		this.isEnd = isEnd;
	}
	public Integer getScSeq() {
		return scSeq;
	}
	public void setScSeq(Integer scSeq) {
		this.scSeq = scSeq;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
