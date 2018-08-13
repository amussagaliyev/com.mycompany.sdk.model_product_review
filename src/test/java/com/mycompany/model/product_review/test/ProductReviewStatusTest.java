package com.mycompany.model.product_review.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.mycompany.model.product_review.ProductReview;
import com.mycompany.model.product_review.ProductReviewStatus;
import com.mycompany.model.product_review.Status;

@TestInstance(Lifecycle.PER_CLASS)
public class ProductReviewStatusTest
{
	private ProductReviewStatus productReviewStatus;
	private String comments;
	private Date endDate;
	private Boolean isLast;
	private ProductReview productReview;
	private Integer productReviewStatusID;
	private Date startDate;
	private Status status;
	
	@BeforeAll
	public void init()
	{
		productReviewStatus = new ProductReviewStatus();

		comments = "comments";
		endDate = toDate("05/01/2018");
		isLast = false;
		productReview = new ProductReview();
		productReview.setProductReviewID(1);
		productReviewStatusID = 2;
		startDate = toDate("06/01/2018");
		status = new Status();
		status.setStatusID(3);

	}
	
	@Test
	public void when_setComments_Then_Getter_ReturnsSameValue()
	{
		productReviewStatus.setComments(comments);
		assertEquals(comments, productReviewStatus.getComments());
	}
	
	
	@Test
	public void when_setEndDate_Then_Getter_ReturnsSameValue()
	{
		productReviewStatus.setEndDate(endDate);
		assertEquals(endDate, productReviewStatus.getEndDate());
	}
	
	
	@Test
	public void when_setIsLast_Then_Getter_ReturnsSameValue()
	{
		productReviewStatus.setIsLast(isLast);
		assertEquals(isLast, productReviewStatus.getIsLast());
	}
	
	
	@Test
	public void when_setProductReview_Then_Getter_ReturnsSameValue()
	{
		productReviewStatus.setProductReview(productReview);
		assertEquals(productReview.getProductReviewID(), productReviewStatus.getProductReview().getProductReviewID());
	}
	
	
	@Test
	public void when_setProductReviewStatusID_Then_Getter_ReturnsSameValue()
	{
		productReviewStatus.setProductReviewStatusID(productReviewStatusID);
		assertEquals(productReviewStatusID, productReviewStatus.getProductReviewStatusID());
	}
	
	
	@Test
	public void when_setv_Then_Getter_ReturnsSameValue()
	{
		productReviewStatus.setStartDate(startDate);
		assertEquals(startDate, productReviewStatus.getStartDate());
	}
	
	
	@Test
	public void when_setStatus_Then_Getter_ReturnsSameValue()
	{
		productReviewStatus.setStatus(status);
		assertEquals(status.getStatusID(), productReviewStatus.getStatus().getStatusID());
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
