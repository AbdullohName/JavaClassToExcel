package JavaClassExcel.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto <T> {

        private int code;
        private boolean success;
        private String message;
        private T data;
}
