package API.models.DeleteTask;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeleteTaskRequest{
    public String jsonrpc;
    public String method;
    public int id;
    public DeleteTaskRequestParams params;
}
