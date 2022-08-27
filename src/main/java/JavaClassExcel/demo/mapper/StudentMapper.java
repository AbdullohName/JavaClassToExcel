package JavaClassExcel.demo.mapper;

import JavaClassExcel.demo.dto.StudentDto;
import JavaClassExcel.demo.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentDto toDto(Student student);
    Student toEntity(StudentDto studentDto);

}
