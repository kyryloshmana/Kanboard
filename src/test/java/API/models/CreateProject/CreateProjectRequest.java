package API.models.CreateProject;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CreateProjectRequest {
    public String jsonrpc;
    public String method;
    public int id;
    public CreateProjectRequestParams params;

}
