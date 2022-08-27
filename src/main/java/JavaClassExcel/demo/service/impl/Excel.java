package JavaClassExcel.demo.service.impl;

import JavaClassExcel.demo.dto.*;
import JavaClassExcel.demo.entity.Ball;
import JavaClassExcel.demo.entity.JavaClass;
import JavaClassExcel.demo.entity.Student;
import JavaClassExcel.demo.entity.Task;
import JavaClassExcel.demo.mapper.BallMapper;
import JavaClassExcel.demo.mapper.JavaClassMapper;
import JavaClassExcel.demo.mapper.StudentMapper;
import JavaClassExcel.demo.mapper.TaskMapper;
import JavaClassExcel.demo.repository.BallRepository;
import JavaClassExcel.demo.repository.JavaClassRepository;
import JavaClassExcel.demo.repository.StudentRepository;
import JavaClassExcel.demo.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Excel {
    private final TaskMapper taskMapper;
    private final JavaClassMapper javaClassMapper;
    private final JavaClassRepository javaClassRepository;
    private final StudentMapper studentMapper;
    private final StudentRepository studentRepository;
    private final TaskRepository taskRepository;
    private final BallRepository ballRepository;
    private final BallMapper ballMapper;

    public boolean addExcel(JavaClassDto javaClassDto, Student student, Task task) throws IOException {
        File file = new File("src/main/resources/templates/Student/xlsx");
        file.createNewFile();
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
        if(javaClassDto.getFullName() != null) {
            XSSFSheet sheet = workbook.createSheet(javaClassDto.getFullName());
        }else {
            XSSFSheet sheet = workbook.getSheet(javaClassDto.getFullName());
        }
    return false;
    }

    public ResponseDto addTask(TaskDto taskDto) throws IOException {
        if(taskDto.getColumnName() == null) {
            return new ResponseDto<>(-1,false,"Not found",null);
        }
        Task task = taskMapper.toEntity(taskDto);
        File file = new File("src/main/resources/templates/Student/xlsx");
        file.createNewFile();
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = workbook.getSheetAt(task.getId());
        Row row = sheet.getRow(0);
        row.createCell(row.getLastCellNum() + 1).setCellValue(task.getColumnName());
        FileOutputStream outputStream = new FileOutputStream(file);

        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        taskRepository.save(task);
        return new ResponseDto<>(0,true,"Success",null);
    }

    public ResponseDto addJavaClass(JavaClassDto javaClassDto) throws IOException {
        if(javaClassDto.getFullName() == null) {
            return new ResponseDto<>(-1,false,"Not found",null);
        }

        JavaClass javaClass = javaClassMapper.toEntity(javaClassDto);
        File file = new File("src/main/resources/templates/Student/xlsx");
        file.createNewFile();
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = workbook.createSheet(javaClass.getGroupName());

        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        javaClassRepository.save(javaClass);
        return new ResponseDto<>(0,true,"Success",null);
    }

    public ResponseDto addStudent(StudentDto studentDto) throws IOException {
        if(studentDto.getFullName() == null || studentDto.getJavaClassId() == null) {
            return new ResponseDto<>(-1,false,"Not found",null);
        }
        Student student = studentMapper.toEntity(studentDto);
        File file = new File("src/main/resources/templates/Student/xlsx");
        file.createNewFile();
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));
        XSSFSheet sheet = workbook.getSheetAt(student.getJavaClassId());

        Row row = sheet.createRow(sheet.getLastRowNum()+1);

        row.createCell(0).setCellValue(student.getId());
        row.createCell(1).setCellValue(student.getFullName());

        FileOutputStream outputStream = new FileOutputStream(file);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        studentRepository.save(student);
        return new ResponseDto<>(0,true,"Success",null);
    }

    public ResponseDto addBall(BallDto ballDto) throws IOException {
        if (ballDto.getStudentId() == null || ballDto.getTaskId() == null) {
            return new ResponseDto<>(-1, false, "Not Found", null);
        }
        Ball ball = ballMapper.toEntity(ballDto);
        File file = new File("src/main/resources/templates/Student/xlsx");
        file.createNewFile();
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file));

        if (studentRepository.existsById(ball.getStudentId())) {
            return new ResponseDto<>(-1, false, "Not Found", null);
        }
        Optional<Student> student = studentRepository.findById(ball.getStudentId());

//        XSSFSheet sheet = workbook.getSheetAt();
        return new ResponseDto<>(0, true, "Success", null);
    }
}
