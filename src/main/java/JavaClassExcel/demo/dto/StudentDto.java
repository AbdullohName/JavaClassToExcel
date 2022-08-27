package JavaClassExcel.demo.dto;

import JavaClassExcel.demo.entity.Ball;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {
    private Integer id;
    private String fullName;
    private String phoneNumber;

    private Integer javaClassId;

    private List<Ball> ballList;

}
