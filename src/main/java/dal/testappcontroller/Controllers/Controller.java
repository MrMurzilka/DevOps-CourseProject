package dal.testappcontroller.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class Controller {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        log.info("Hello World");
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/error")
    public ResponseEntity<String> getError() {
        log.error("Error");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error");
    }
}
