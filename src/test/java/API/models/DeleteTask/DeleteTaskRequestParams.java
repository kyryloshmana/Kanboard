package API.models.DeleteTask;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeleteTaskRequestParams {
    public int task_id;
}
