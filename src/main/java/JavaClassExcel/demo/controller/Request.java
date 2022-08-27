package JavaClassExcel.demo.controller;

import JavaClassExcel.demo.dto.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/request")
public class Request {
    @GetMapping
    private String HTTP(HttpServletRequest httpServletRequest) {
//        return httpServletRequest.toString();
        return String.valueOf(httpServletRequest.getRequestURI());
    }
}
