package com.mycompany.model.product_review.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.mycompany.model.product.Product;
import com.mycompany.model.product_review.ProductReview;
import com.mycompany.model.product_review.ProductReviewStatus;


@TestInstance(Lifecycle.PER_CLASS)
public class ProductReviewTest
{
	private ProductReview productReview;
	private String comments = "comments";
	private String emailAddress = "emailAddress";
	private Date modifiedDate = toDate("05/01/2018");
	private Product product = new Product();
	private Integer productID = 1;
	private Integer productReviewID = 2;
	private List<ProductReviewStatus> productReviewStatuses = new ArrayList<>();
	private Integer rating = 3;
	private Date reviewDate = toDate("06/01/2018");
	private String reviewerName = "reviewerName";
	
	@BeforeAll
	public void init()
	{
		productReview = new ProductReview();
		product.setProductID(productID);
	}
	
	@Test
	public void when_setComments_Then_Getter_ReturnsSameValue()
	{
		productReview.setComments(comments);
		assertEquals(comments, productReview.getComments());
	}

	@Test
	public void when_setEmailAddress_Then_Getter_ReturnsSameValue()
	{
		productReview.setEmailAddress(emailAddress);
		assertEquals(emailAddress, productReview.getEmailAddress());
	}

	@Test
	public void when_setModifiedDate_Then_Getter_ReturnsSameValue()
	{
		productReview.setModifiedDate(modifiedDate);
		assertEquals(modifiedDate, productReview.getModifiedDate());
	}

	@Test
	public void when_setProduct_Then_Getter_ReturnsSameValue()
	{
		productReview.setProduct(product);
		assertEquals(product.getProductID(), productReview.getProduct().getProductID());
	}

	@Test
	public void when_setProductID_Then_Getter_ReturnsSameValue()
	{
		productReview.setProductID(productID);
		assertEquals(productID, productReview.getProductID());
	}

	@Test
	public void when_setProductReviewID_Then_Getter_ReturnsSameValue()
	{
		productReview.setProductReviewID(productReviewID);
		assertEquals(productReviewID, productReview.getProductReviewID());
	}

	@Test
	public void when_setProductReviewStatuses_Then_Getter_ReturnsSameValue()
	{
		productReview.setProductReviewStatuses(productReviewStatuses);
		assertEquals(productReviewStatuses, productReview.getProductReviewStatuses());
	}

	@Test
	public void when_setRating_Then_Getter_ReturnsSameValue()
	{
		productReview.setRating(rating);
		assertEquals(rating, productReview.getRating());
	}

	@Test
	public void when_setReviewDate_Then_Getter_ReturnsSameValue()
	{
		productReview.setReviewDate(reviewDate);
		assertEquals(reviewDate, productReview.getReviewDate());
	}

	@Test
	public void when_setReviewerName_Then_Getter_ReturnsSameValue()
	{
		productReview.setReviewerName(reviewerName);
		assertEquals(reviewerName, productReview.getReviewerName());
	}

	private Date toDate(String sDate)
	{
		try
		{
			return new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
		} catch (ParseException e)
		{
			throw new RuntimeException("Wrong date format", e);
		}
	}
}
