package API.models.DeleteTask;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeleteTaskResponse {
    public String jsonrpc;
    public boolean result;
    public int id;
}
