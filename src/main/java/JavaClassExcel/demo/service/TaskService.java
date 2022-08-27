package JavaClassExcel.demo.service;

import JavaClassExcel.demo.dto.ResponseDto;
import JavaClassExcel.demo.dto.TaskDto;

public interface TaskService {
    ResponseDto addTask(TaskDto taskDto);
}
