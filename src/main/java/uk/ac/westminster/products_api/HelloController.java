package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.LocalDateTime;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from spring boot !!!!";

    }
    @GetMapping("/status")
    public String status(){
        return "API running -"+LocalDate.now().toString();

    }
    @GetMapping("/goodbye")
    public String goodbye(){
        return  "Good bye from Springboot :  "+ LocalDateTime.now().toString();
    }

}
