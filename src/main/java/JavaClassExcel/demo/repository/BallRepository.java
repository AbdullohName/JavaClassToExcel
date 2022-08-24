package JavaClassExcel.demo.repository;

import JavaClassExcel.demo.entity.Ball;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BallRepository extends JpaRepository<Ball,Integer> {
}
