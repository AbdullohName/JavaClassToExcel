package JavaClassExcel.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BallDto {

    private Integer id;
    private Integer taskId;
    private Integer studentId;
    private Integer ball;
    private String comment;
}
