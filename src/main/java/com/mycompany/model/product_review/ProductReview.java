package com.mycompany.model.product_review;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mycompany.model.product.Product;

@Entity
@Table(name="MwbProductReview")
public class ProductReview
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MwbProductReviewSeq")
	@Column(name = "ProductReviewID")
	private Integer productReviewID;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "productID")
	private Product product;
	
	@Transient
	@JsonProperty("productid")
	private Integer productID;

	@JsonProperty("name")
	@Column(name="ReviewerName")
	private String reviewerName;

	@Column(name = "ReviewDate")
	private Date reviewDate;

	@JsonProperty("email")
	@Column(name = "EmailAddress")
	private String emailAddress;

	@Column(name = "Rating")
	private Integer rating;

	@Column(name = "Comments")
	private String comments;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "ModifiedDate", insertable=false)
	private Date modifiedDate;

	public Integer getProductReviewID()
	{
		return productReviewID;
	}

	public void setProductReviewID(Integer productReviewID)
	{
		this.productReviewID = productReviewID;
	}

	public Integer getProductID()
	{
		return productID;
	}

	public void setProductID(Integer productID)
	{
		this.productID = productID;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

	public String getReviewerName()
	{
		return reviewerName;
	}

	public void setReviewerName(String reviewerName)
	{
		this.reviewerName = reviewerName;
	}

	public Date getReviewDate()
	{
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate)
	{
		this.reviewDate = reviewDate;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}

	public Integer getRating()
	{
		return rating;
	}

	public void setRating(Integer rating)
	{
		this.rating = rating;
	}

	public String getComments()
	{
		return comments;
	}

	public void setComments(String comments)
	{
		this.comments = comments;
	}

	public Date getModifiedDate()
	{
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate)
	{
		this.modifiedDate = modifiedDate;
	}
	


}
