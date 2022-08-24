package JavaClassExcel.demo.mapper;


import JavaClassExcel.demo.dto.BallDto;
import JavaClassExcel.demo.entity.Ball;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BallMapper {
    BallDto toEntity(Ball ball);
    Ball toDto(BallDto ballDto);
}
