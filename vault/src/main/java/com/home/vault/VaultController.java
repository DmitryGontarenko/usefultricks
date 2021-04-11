package com.home.vault;

import com.home.vault.config.VaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultController {

    @Autowired
    private VaultConfiguration configuration;

    @GetMapping("/cred")
    public String getCredentials() {
        return configuration.toString();
    }
}
