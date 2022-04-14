package com.pc.collabtest.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ConfigurationProperties(prefix = "tomcat")
public class TomcatProperties
{
	private PortProperties ajp = new PortProperties(10080);
	private PortProperties receiver = new PortProperties(6080);
	private UploadTimeoutProperties uploadTimeout = new UploadTimeoutProperties(false);

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class PortProperties
	{
		private int port;
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class UploadTimeoutProperties
	{
		private boolean disabled;
	}
}
