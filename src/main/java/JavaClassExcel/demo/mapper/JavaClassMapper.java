package JavaClassExcel.demo.mapper;

import JavaClassExcel.demo.dto.JavaClassDto;
import JavaClassExcel.demo.entity.JavaClass;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JavaClassMapper {
    JavaClassDto toEntity(JavaClass javaClass);
    JavaClass toDto(JavaClassDto javaClassDto);
}
