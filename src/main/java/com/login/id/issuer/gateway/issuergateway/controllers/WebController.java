package com.login.id.issuer.gateway.issuergateway.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class WebController {

    @GetMapping("/")
    public String showIdps() {
        return "redirect:/issuer-gateway/idps";
    }

    @GetMapping("/issuer-gateway/idps")
    public String index() {
        return "index";
    }

    @GetMapping("/issuer-gateway/home")
    public String home(@AuthenticationPrincipal OidcUser oidcUser, Model model) {
        model.addAttribute("familyName", oidcUser.getFamilyName());
        model.addAttribute("token", oidcUser.getIdToken().getTokenValue());

        return "home";
    }

    @GetMapping("/issuer-gateway/providers")
    public String showProviderInfo(@RequestParam(value = "Credential") String dataType, Model model) {

        Map<String, List<Map<String, Object>>> data = DataController.getProviders();

        // Convert data to JSON string
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData;
        try {
            jsonData = objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            // Handle the exception
            jsonData = "{}"; // Set a default value or handle the error as per your requirements
        }
        // Add the dataType to the model
        model.addAttribute("familyName", dataType);
        model.addAttribute("data", jsonData);

        return "providers"; // Return the view for displaying the provider information

    }

    @GetMapping("/issuer-gateway/final")
	public String handleFinalRequest(@RequestParam(name = "Name", required = true) String name,
			@RequestParam(name = "Value", required = true) String value,
			@RequestParam(name = "IssuerName", required = true) String issuerName,
			@RequestParam(name = "Type", required = true) String type) {

		return "final";
	}

}