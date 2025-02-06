package com.eazy.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)

@Data
public class AccountsDto {
    @Schema(description = "Account number of EazyBank Account",example = "6754896765")
    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be of 10 digit")
    private Long accountNumber;
    @Schema(description = "Account type of EazyBank Account",example = "SAVINGS")
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;
    @Schema(description = "Branch Address of EazyBank",example = "123 New York")
    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
