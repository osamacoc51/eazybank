package com.eazy.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(description = "Name of the Customer",example = "Jhon")
    @NotEmpty(message = "name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of name should be between 5 to 30")
    private String name;
    @Schema(description = "Email of the Customer",example = "Jhon@mail.com")
    @NotEmpty(message = "email cannot be null or empty")
    @Email(message = "email should be valid")
    private String email;
    @Schema(description = "Mobile Number of the Customer",example = "9876543210")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Invalid mobile number")
    private String mobileNumber;
    @Schema(description = "Account details of the Customer")
    private AccountsDto accountsDto;
}
