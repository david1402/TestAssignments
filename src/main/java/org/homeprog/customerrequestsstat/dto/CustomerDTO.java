package org.homeprog.customerrequestsstat.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.homeprog.customerrequestsstat.validation.NonNullValues;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NonNullValues
@JsonIgnoreProperties(ignoreUnknown=true)
public class CustomerDTO {
    @Nullable
    private Long id;

    @JsonProperty("customerID")
    private Long customerId;

    @JsonProperty("remoteIP")
    private String remoteIp;

    @JsonProperty("userID")
    private String userAgent;

    private LocalDateTime time;

    private boolean isValid;
}
