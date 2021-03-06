package com.mycompany.model.product_review;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.mycompany.model.product.Product;

@Entity
@Table(name="Production.ProductReview")
public class ProductReview
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductReviewID")
	private Integer productReviewID;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "productID")
	private Product product;
	
	@Transient
	private Integer productID;

	@Column(name="ReviewerName")
	private String reviewerName;

	@Column(name = "ReviewDate", insertable=false)
	private Date reviewDate;

	@Column(name = "EmailAddress")
	private String emailAddress;

	@Column(name = "Rating")
	private Integer rating;

	@Column(name = "Comments")
	private String comments;
	
	@OneToMany(mappedBy="productReview", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private List<ProductReviewStatus> productReviewStatuses;
	
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

	public List<ProductReviewStatus> getProductReviewStatuses()
	{
		if (productReviewStatuses == null)
			productReviewStatuses = new ArrayList<>();
		return productReviewStatuses;
	}

	public void setProductReviewStatuses(List<ProductReviewStatus> productReviewStatuses)
	{
		this.productReviewStatuses = productReviewStatuses;
	}
	
	public ProductReviewStatus getCurrentProductReviewStatus()
	{
		return getProductReviewStatuses().stream().filter(a -> a.getIsLast()).findFirst().orElse(null);
	}
	
	public void addProductReviewStatus(ProductReviewStatus currentProductReviewStatus)
	{
		getProductReviewStatuses().add(currentProductReviewStatus);
	}
}
