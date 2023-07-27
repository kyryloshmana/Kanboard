package API.models.CreateUser;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserRequestParams {
    public String username;
    public String password;
    public String name;
    public String email;
    public String role;
}
