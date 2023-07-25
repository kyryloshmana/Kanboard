package API.models.CreateProject;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProjectResponse {
    public String jsonrpc;
    public int result;
    public int id;
}
