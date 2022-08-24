package JavaClassExcel.demo.service;


import JavaClassExcel.demo.dto.JavaClassDto;
import JavaClassExcel.demo.dto.ResponseDto;
import JavaClassExcel.demo.dto.StudentDto;
import JavaClassExcel.demo.dto.TaskDto;
import JavaClassExcel.demo.entity.JavaClass;
import JavaClassExcel.demo.entity.Student;

public interface JavaClassService {

    ResponseDto addJavaClass(JavaClassDto javaClassDto);

}
