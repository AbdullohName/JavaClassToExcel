package JavaClassExcel.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ball {
    @Id
    @GeneratedValue(generator = "id",strategy = GenerationType.AUTO)
    private Integer id;

    private Integer ball;

    @Column(name = "task_id")
    private Integer taskId;

    @Column(name = "student_id")
    private Integer studentId;

    private String comment;

}
