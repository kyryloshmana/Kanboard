package API.models.GetUser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserResponseResult {
    public int id;
    public String username;
    public String password;
    public String role;
    public int is_ldap_user;
    public String name;
    public String email;
    public int notifications_enabled;
    public String google_id;
    public String github_id;

}
