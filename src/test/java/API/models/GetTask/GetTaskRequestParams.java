package API.models.GetTask;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetTaskRequestParams {
    public int task_id;
}
