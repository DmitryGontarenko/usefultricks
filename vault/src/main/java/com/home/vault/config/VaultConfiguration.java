package com.home.vault.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaultConfiguration {
    @Value("${login}")
    private String login;
    @Value("${password}")
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "VaultConfiguration{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
