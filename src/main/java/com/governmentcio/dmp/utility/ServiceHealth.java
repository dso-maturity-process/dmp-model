package com.governmentcio.dmp.utility;

/**
 * 
 * @author <a href=mailto:support@governmentcio.com>support
 *
 */
public class ServiceHealth {

	private String serviceName;
	private boolean healthy;

	/**
	 * 
	 */
	public ServiceHealth() {
	}

	/**
	 * 
	 * @param heatlhy
	 */
	public ServiceHealth(final String serviceName, final boolean heatlhy) {
		this.serviceName = serviceName;
		this.healthy = heatlhy;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the healthy
	 */
	public boolean isHealthy() {
		return healthy;
	}

	/**
	 * @param healthy the healthy to set
	 */
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceHealth [serviceName=").append(serviceName)
				.append(", healthy=").append(healthy).append("]");
		return builder.toString();
	}

}
