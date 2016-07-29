package com.fu.logVisualization.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * The persistent class for the requestbydate database table.
 * 
 */
@Entity
@Table(name="requestbydayname")
public class RequestByDayName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dayname")
	private String dayName;

	@Column(name="numofrequest")
	private BigInteger numOfRequest;

	public RequestByDayName() {
	}

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	public BigInteger getNumOfRequest() {
		return this.numOfRequest;
	}

	public void setNumOfRequest(BigInteger numOfRequest) {
		this.numOfRequest = numOfRequest;
	}

}