package API.models.DeleteUser;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeleteUserResponse {
    public String jsonrpc;
    public boolean result;
    public int id;
}
