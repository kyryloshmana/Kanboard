package API.models.CreateUser;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequest {
    public String jsonrpc;
    public String method;
    public int id;
    public CreateUserRequestParams params;
}
