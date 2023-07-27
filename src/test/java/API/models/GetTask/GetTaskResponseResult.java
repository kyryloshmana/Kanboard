package API.models.GetTask;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)

public class GetTaskResponseResult {
    public int id;
    public String title;
    public String description;
    public String color_id;
    public int owner_id;
    public int column_id;
    public int project_id;
}
