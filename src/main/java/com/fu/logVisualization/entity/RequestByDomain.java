package com.fu.logVisualization.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * The persistent class for the requestbydomain database table.
 * 
 */
@Entity
@Table(name="requestbydomain")
public class RequestByDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="accessurldomain")
	private String accessURLDomain;

	@Column(name="numofrequest")
	private BigInteger numOfRequest;

	public RequestByDomain() {
	}

	public String getAccessURLDomain() {
		return this.accessURLDomain;
	}

	public void setAccessURLDomain(String accessURLDomain) {
		this.accessURLDomain = accessURLDomain;
	}

	public BigInteger getNumOfRequest() {
		return this.numOfRequest;
	}

	public void setNumOfRequest(BigInteger numOfRequest) {
		this.numOfRequest = numOfRequest;
	}

}