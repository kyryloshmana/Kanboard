package API.models.CreateTask;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTaskResponse {
    public String jsonrpc;
    public int result;
    public int id;
}
