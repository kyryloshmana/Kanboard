package API.models.GetProject;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetProjectResponse {
    public String jsonrpc;
    public int id;
    public GetProjectResponseResult result;
}
