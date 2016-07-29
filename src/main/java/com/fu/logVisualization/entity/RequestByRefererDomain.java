package com.fu.logVisualization.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * The persistent class for the requestbyrefererdomain database table.
 * 
 */
@Entity
@Table(name="requestbyrefererdomain")
public class RequestByRefererDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="refererdomain")
	private String refererDomain;

	@Column(name="numofrequest")
	private BigInteger numOfRequest;

	public RequestByRefererDomain() {
	}

	public String getRefererDomain() {
		return refererDomain;
	}

	public void setRefererDomain(String refererDomain) {
		this.refererDomain = refererDomain;
	}

	public BigInteger getNumOfRequest() {
		return this.numOfRequest;
	}

	public void setNumOfRequest(BigInteger numOfRequest) {
		this.numOfRequest = numOfRequest;
	}

}