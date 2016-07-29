package com.fu.logVisualization.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * The persistent class for the requestbydomain database table.
 * 
 */
@Entity
@Table(name="requestbyhour")
public class RequestByHour implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hour")
	private String hour;

	@Column(name="numofrequest")
	private BigInteger numOfRequest;

	public RequestByHour() {
	}

	public String getHour() {
		return this.hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public BigInteger getNumOfRequest() {
		return this.numOfRequest;
	}

	public void setNumOfRequest(BigInteger numOfRequest) {
		this.numOfRequest = numOfRequest;
	}

}