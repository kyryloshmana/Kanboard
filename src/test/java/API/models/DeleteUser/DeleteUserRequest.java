package API.models.DeleteUser;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeleteUserRequest {
    public String jsonrpc;
    public String method;
    public int id;
    public DeleteUserRequestParams params;
}
