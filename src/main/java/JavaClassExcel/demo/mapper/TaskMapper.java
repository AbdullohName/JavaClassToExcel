package JavaClassExcel.demo.mapper;

import JavaClassExcel.demo.dto.TaskDto;
import JavaClassExcel.demo.entity.Task;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    Task toDto(TaskDto taskDto);
    TaskDto toEntity(Task task);
}
