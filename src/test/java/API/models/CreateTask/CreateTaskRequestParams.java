package API.models.CreateTask;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTaskRequestParams {
    public String title;
    public String description;
    public String color_id;
    public int owner_id;
    public int column_id;
    public int priority;
    public int project_id;
}
