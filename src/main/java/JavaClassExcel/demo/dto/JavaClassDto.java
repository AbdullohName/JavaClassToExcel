package JavaClassExcel.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JavaClassDto {
    private Integer id;
    private String fullName;
}
