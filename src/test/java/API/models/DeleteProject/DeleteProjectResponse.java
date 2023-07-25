package API.models.DeleteProject;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeleteProjectResponse {
    public String jsonrpc;
    public boolean result;
    public int id;
}
