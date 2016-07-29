package com.fu.logVisualization.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * The persistent class for the requestbydate database table.
 * 
 */
@Entity
@Table(name="requestbydate")
public class RequestByDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="date")
	private String date;

	@Column(name="numofrequest")
	private BigInteger numOfRequest;

	public RequestByDate() {
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public BigInteger getNumOfRequest() {
		return this.numOfRequest;
	}

	public void setNumOfRequest(BigInteger numOfRequest) {
		this.numOfRequest = numOfRequest;
	}

}