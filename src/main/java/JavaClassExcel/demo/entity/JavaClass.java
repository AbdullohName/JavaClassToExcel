package JavaClassExcel.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "java_class")
public class JavaClass {
    @Id
    @GeneratedValue(generator = "id",strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "group_name")
    private String groupName;

    @OneToMany(mappedBy = "javaClassId")
    private List<Student> studentList;

    @OneToMany(mappedBy = "javaClassId")
    private List<Task> taskList;
}
