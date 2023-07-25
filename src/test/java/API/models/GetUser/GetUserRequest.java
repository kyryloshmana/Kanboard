package API.models.GetUser;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetUserRequest {

    public String jsonrpc;
    public String method;
    public int id;
    public GetUserRequestParams params;

}
