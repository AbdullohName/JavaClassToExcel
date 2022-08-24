package JavaClassExcel.demo.mapper;

import JavaClassExcel.demo.dto.StudentDto;
import JavaClassExcel.demo.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student toDto(StudentDto studentDto);
    StudentDto toEntity(Student student);

}
