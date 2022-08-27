package JavaClassExcel.demo.mapper;


import JavaClassExcel.demo.dto.BallDto;
import JavaClassExcel.demo.entity.Ball;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BallMapper {
    Ball toEntity(BallDto ballDto);
    BallDto toDto(Ball ball);
}
