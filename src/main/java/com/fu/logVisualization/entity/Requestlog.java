package com.fu.logVisualization.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the requestlog database table.
 * 
 */
@Entity
@Table(name="requestlog")
@NamedQuery(name="Requestlog.findAll", query="SELECT r FROM Requestlog r")
public class Requestlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="accessurl", length=1500)
	private String accessURL;

	@Column(name="accessurldomain", length=100)
	private String accessURLDomain;

	@Column(name="clientip", length=100)
	private String clientIP;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(length=20)
	private String identity;

	@Column(length=10)
	private String method;

	@Column(length=20)
	private String protocol;

	@Column(length=1500)
	private String referer;

	@Column(name="refererdomain", length=100)
	private String refererDomain;

	@Column(name="responsesize", precision=10, scale=2)
	private BigDecimal responseSize;

	@Column(name="statuscode", length=3)
	private String statusCode;

	private Time time;

	@Column(name="useragent", length=1000)
	private String userAgent;

	@Column(name="agent_name", length=50)
	private String agentName;

	@Column(name="os_name", length=50)
	private String osName;
	
	@Column(length=20)
	private String username;

	public Requestlog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccessURL() {
		return this.accessURL;
	}

	public void setAccessURL(String accessURL) {
		this.accessURL = accessURL;
	}

	public String getAccessURLDomain() {
		return this.accessURLDomain;
	}

	public void setAccessURLDomain(String accessURLDomain) {
		this.accessURLDomain = accessURLDomain;
	}

	public String getClientIP() {
		return this.clientIP;
	}

	public void setClientIP(String clientIP) {
		this.clientIP = clientIP;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIdentity() {
		return this.identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getProtocol() {
		return this.protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getReferer() {
		return this.referer;
	}

	public void setReferer(String referer) {
		this.referer = referer;
	}

	public String getRefererDomain() {
		return this.refererDomain;
	}

	public void setRefererDomain(String refererDomain) {
		this.refererDomain = refererDomain;
	}

	public BigDecimal getResponseSize() {
		return this.responseSize;
	}

	public void setResponseSize(BigDecimal responseSize) {
		this.responseSize = responseSize;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessURL == null) ? 0 : accessURL.hashCode());
		result = prime * result + ((accessURLDomain == null) ? 0 : accessURLDomain.hashCode());
		result = prime * result + ((clientIP == null) ? 0 : clientIP.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((identity == null) ? 0 : identity.hashCode());
		result = prime * result + ((method == null) ? 0 : method.hashCode());
		result = prime * result + ((protocol == null) ? 0 : protocol.hashCode());
		result = prime * result + ((referer == null) ? 0 : referer.hashCode());
		result = prime * result + ((refererDomain == null) ? 0 : refererDomain.hashCode());
		result = prime * result + ((responseSize == null) ? 0 : responseSize.hashCode());
		result = prime * result + ((statusCode == null) ? 0 : statusCode.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((userAgent == null) ? 0 : userAgent.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Requestlog other = (Requestlog) obj;
		if (accessURL == null) {
			if (other.accessURL != null)
				return false;
		} else if (!accessURL.equals(other.accessURL))
			return false;
		if (accessURLDomain == null) {
			if (other.accessURLDomain != null)
				return false;
		} else if (!accessURLDomain.equals(other.accessURLDomain))
			return false;
		if (clientIP == null) {
			if (other.clientIP != null)
				return false;
		} else if (!clientIP.equals(other.clientIP))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (identity == null) {
			if (other.identity != null)
				return false;
		} else if (!identity.equals(other.identity))
			return false;
		if (method == null) {
			if (other.method != null)
				return false;
		} else if (!method.equals(other.method))
			return false;
		if (protocol == null) {
			if (other.protocol != null)
				return false;
		} else if (!protocol.equals(other.protocol))
			return false;
		if (referer == null) {
			if (other.referer != null)
				return false;
		} else if (!referer.equals(other.referer))
			return false;
		if (refererDomain == null) {
			if (other.refererDomain != null)
				return false;
		} else if (!refererDomain.equals(other.refererDomain))
			return false;
		if (responseSize == null) {
			if (other.responseSize != null)
				return false;
		} else if (!responseSize.equals(other.responseSize))
			return false;
		if (statusCode == null) {
			if (other.statusCode != null)
				return false;
		} else if (!statusCode.equals(other.statusCode))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (userAgent == null) {
			if (other.userAgent != null)
				return false;
		} else if (!userAgent.equals(other.userAgent))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Requestlog [id=" + id + ", accessURL=" + accessURL + ", accessURLDomain=" + accessURLDomain
				+ ", clientIP=" + clientIP + ", date=" + date + ", identity=" + identity + ", method=" + method
				+ ", protocol=" + protocol + ", referer=" + referer + ", refererDomain=" + refererDomain
				+ ", responseSize=" + responseSize + ", statusCode=" + statusCode + ", time=" + time + ", userAgent="
				+ userAgent + ", username=" + username + "]";
	}

}