package API.models.DeleteProject;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeleteProjectRequest {
    public String jsonrpc;
    public String method;
    public int id;
    public DeleteProjectRequestParams params;
}
