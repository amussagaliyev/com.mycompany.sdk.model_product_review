package com.mycompany.model.product_review.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.mycompany.model.product_review.Status;

@TestInstance(Lifecycle.PER_CLASS)
public class StatusTest
{
	
	private Status status;
	private Integer statusID = 1;
	private String code = "code";
	private String comments = "comments";
	
	
	@BeforeAll
	public void init()
	{
		status = new Status();
	}
	
	@Test
	public void when_setStatusID_Then_Getter_ReturnsSameValue()
	{
		status.setStatusID(statusID);
		assertEquals(statusID, status.getStatusID());
	}
	
	@Test
	public void when_setCode_Then_Getter_ReturnsSameValue()
	{
		status.setCode(code);
		assertEquals(code, status.getCode());
	}

	@Test
	public void when_setComments_Then_Getter_ReturnsSameValue()
	{
		status.setComments(comments);
		assertEquals(comments, status.getComments());
	}
}
