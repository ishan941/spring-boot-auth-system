package auth_spring.spring_authentication.apiResponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
@Getter
@Setter
public class ApiResponse<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("Message")
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("StatusCode")
    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("Date")
    private T date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("accessToken")
    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ListData")
    private List<T> listData;
    @JsonInclude(JsonInclude.Include.NON_NULL)

    @JsonProperty("refreshToken")
    private String refreshToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("role")
    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("userId")
    private Integer userId;

}
