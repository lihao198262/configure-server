package com.lihao.configure.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.server.encryption.EnvironmentEncryptor;
import org.springframework.cloud.config.server.encryption.TextEncryptorLocator;
import org.springframework.stereotype.Component;

@Component
public class EncryptAdpter {

	@Autowired
	private EnvironmentEncryptor environmentEncryptor;

	@Autowired(required = false)
	private TextEncryptorLocator locator;

	public void doChange() {
		System.out.println(environmentEncryptor);
		System.out.println(locator);
	}
}
