package API.models.CreateUser;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserResponse {
    public String jsonrpc;
    public int result;
    public int id;
}
