package API.models.CreateProject;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProjectRequestParams {
    public String name;
    public String description;
    public int owner_id;
}
