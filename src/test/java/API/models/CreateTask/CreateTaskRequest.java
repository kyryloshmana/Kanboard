package API.models.CreateTask;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTaskRequest {
    public String jsonrpc;
    public String method;
    public int id;
    public CreateTaskRequestParams params;
}
