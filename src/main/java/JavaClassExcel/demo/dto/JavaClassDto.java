package JavaClassExcel.demo.dto;

import JavaClassExcel.demo.entity.Student;
import JavaClassExcel.demo.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Builder;

import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JavaClassDto {
    private Integer id;
    private String fullName;
    private List<Student> studentList;
    private List<Task> taskList;
}
