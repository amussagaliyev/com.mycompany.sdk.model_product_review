package com.mycompany.model.product_review;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Production.ProductReviewStatus")
public class ProductReviewStatus
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ProductReviewStatusID")
	private Integer productReviewStatusID;
	
	@ManyToOne
	@JoinColumn(name="ProductReviewID")
	private ProductReview productReview;
	
	@ManyToOne
	@JoinColumn(name="StatusID")
	private Status status;

	@Column(name="StartDate", nullable=false, insertable=false, updatable=false)
	private Date startDate;
	
	@Column(name="EndDate", insertable=false)
	private Date endDate;

	@Column(name="IsLast", nullable=false)
	private Boolean isLast;

	@Column(name="Comments")
	private String comments;

	public Integer getProductReviewStatusID()
	{
		return productReviewStatusID;
	}

	public void setProductReviewStatusID(Integer productReviewStatusID)
	{
		this.productReviewStatusID = productReviewStatusID;
	}

	public ProductReview getProductReview()
	{
		return productReview;
	}

	public void setProductReview(ProductReview productReview)
	{
		this.productReview = productReview;
	}

	public Status getStatus()
	{
		return status;
	}

	public void setStatus(Status status)
	{
		this.status = status;
	}

	public Date getStartDate()
	{
		return startDate;
	}

	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	public Date getEndDate()
	{
		return endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public Boolean getIsLast()
	{
		return isLast;
	}

	public void setIsLast(Boolean isLast)
	{
		this.isLast = isLast;
	}

	public String getComments()
	{
		return comments;
	}

	public void setComments(String comments)
	{
		this.comments = comments;
	}

}
