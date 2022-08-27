package JavaClassExcel.demo.dto;

import JavaClassExcel.demo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskDto {
    private Integer id;
    private String columnName;
    private Integer javaClassId;
    private List<Student> studentList;
}
