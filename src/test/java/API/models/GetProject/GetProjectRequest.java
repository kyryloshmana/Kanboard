package API.models.GetProject;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetProjectRequest {

    public String jsonrpc;
    public String method;
    public int id;
    public GetProjectRequestParams params;
}
