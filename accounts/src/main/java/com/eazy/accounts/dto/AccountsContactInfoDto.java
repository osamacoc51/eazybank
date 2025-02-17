package com.eazy.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/***
 * java is going to make these fields as final and at the same time it is going to generate a getter and constructor method
 * no setter method
 * @param message
 * @param contactDetails
 * @param onCallSupport
 */
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String,String> contactDetails, List<String> onCallSupport) {

}
