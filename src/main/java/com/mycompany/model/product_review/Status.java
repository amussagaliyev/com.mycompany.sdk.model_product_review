package com.mycompany.model.product_review;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Production.Status")
@NamedQuery(name="Status.getByCode", query="from Status where code = :code")
public class Status
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="StatusID")
	private Integer statusID;
	
	@Column(name="Code")
	private String code;
	
	@Column(name="Comments")
	private String comments;

	public Integer getStatusID()
	{
		return statusID;
	}

	public void setStatusID(Integer statusID)
	{
		this.statusID = statusID;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
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
