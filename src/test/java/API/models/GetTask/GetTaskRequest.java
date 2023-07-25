package API.models.GetTask;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTaskRequest {
    public String jsonrpc;
    public String method;
    public int id;
    public GetTaskRequestParams params;
}
