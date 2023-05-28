package com.login.id.issuer.gateway.issuergateway.security;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.oidc.web.logout.OidcClientInitiatedLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Autowired
    ClientRegistrationRepository clientRegistrationRepository; 

    OidcClientInitiatedLogoutSuccessHandler oidcLogoutSuccessHandler() { 
        OidcClientInitiatedLogoutSuccessHandler successHandler = new OidcClientInitiatedLogoutSuccessHandler(clientRegistrationRepository);
        successHandler.setPostLogoutRedirectUri(URI.create("http://localhost:8080/"));
        return successHandler;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        	.authorizeRequests()
        	.antMatchers("/issuer-gateway/idps", "/").permitAll() // Exclude /issuer-gateway/idps from authentication
        	.antMatchers("/css/**", "/js/**", "/images/**").permitAll() // Allow access to static resources
        	.anyRequest().authenticated()
        	// After we logout, redirect to root page,
            // by default Spring will send you to /login?logout
            .and().logout().logoutSuccessUrl("/").logoutSuccessHandler(oidcLogoutSuccessHandler())

            // enable OAuth2/OIDC
            .and().oauth2Login();
    }
    
}
