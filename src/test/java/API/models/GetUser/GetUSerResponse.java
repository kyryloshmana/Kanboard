package API.models.GetUser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUSerResponse {
    public String jsonrpc;
    public int id;
    public GetUserResponseResult result;
}
