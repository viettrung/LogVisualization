package com.fu.logVisualization.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;

/**
 * The persistent class for the requestbydomain database table.
 * 
 */
@Entity
@Table(name="requestbyipandhour")
public class RequestByIpAndHour implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@Column(name="clientip")
	private String clientIp;

	@Column(name="hour")
	private String hour;

	@Column(name="numofrequest")
	private BigInteger numOfRequest;

	public RequestByIpAndHour() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public BigInteger getNumOfRequest() {
		return this.numOfRequest;
	}

	public void setNumOfRequest(BigInteger numOfRequest) {
		this.numOfRequest = numOfRequest;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

}