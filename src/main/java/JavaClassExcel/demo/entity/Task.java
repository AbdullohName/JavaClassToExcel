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
public class Task {
    @Id
    @GeneratedValue(generator = "id",strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "column_nane")
    private String columnName;

    @Column(name = "java_class_id")
    private Integer javaClassId;

    @ManyToMany(mappedBy = "ballList")
    private List<Student> studentList;

//    @OneToMany(mappedBy = "taskId")
//    private List<Ball> ballList;
}
