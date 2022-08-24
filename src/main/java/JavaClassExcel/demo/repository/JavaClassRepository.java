package JavaClassExcel.demo.repository;


import JavaClassExcel.demo.entity.JavaClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JavaClassRepository extends JpaRepository<JavaClass,Integer> {
}
