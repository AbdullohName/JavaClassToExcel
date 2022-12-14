package JavaClassExcel.demo.service.impl;

import JavaClassExcel.demo.dto.JavaClassDto;
import JavaClassExcel.demo.dto.ResponseDto;
import JavaClassExcel.demo.dto.StudentDto;
import JavaClassExcel.demo.dto.TaskDto;
import JavaClassExcel.demo.entity.JavaClass;
import JavaClassExcel.demo.entity.Student;
import JavaClassExcel.demo.mapper.JavaClassMapper;
import JavaClassExcel.demo.repository.JavaClassRepository;
import JavaClassExcel.demo.service.JavaClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JavaClassServiceImpl implements JavaClassService {
    private final JavaClassRepository repository;
    private final JavaClassMapper javaClassMapper;

    @Override
    public ResponseDto addJavaClass(JavaClassDto javaClassDto) {
        JavaClass javaClass =  javaClassMapper.toEntity(javaClassDto);
        return null;
    }



}
