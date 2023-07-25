package API.models.GetTask;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)

public class GetTaskResponse {
    public String jsonrpc;
    public int id;
    public GetTaskResponseResult result;
}
