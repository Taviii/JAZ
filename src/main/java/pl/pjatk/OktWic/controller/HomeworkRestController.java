package pl.pjatk.OktWic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.OktWic.model.Homework;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/homework")
public class HomeworkRestController {

    @GetMapping("/getpath/{subject}/{grade}")
    public ResponseEntity<Homework> getPathVariable(@PathVariable("subject") String subject,
                                                    @PathVariable("grade") String grade, Homework homework){
        return ResponseEntity.ok(homework);
    }


    @GetMapping("/getrequestparam")
    public ResponseEntity<Homework> getRequestedParam(@RequestParam String subject,
                                                      @RequestParam String grade, Homework homework){
        return ResponseEntity.ok(homework);
    }


    @PutMapping("/putmapping/{subject}")
    public ResponseEntity<Homework> putMapping(@PathVariable("subject") String subject,
                                               @RequestBody String grade, Homework homework){
        homework.setSubject(subject);
        homework.setGrade(grade);
        return ResponseEntity.ok(homework);
    }

    @PostMapping("/postm")
    public ResponseEntity<Homework> postM(@RequestBody Homework homework){
        return ResponseEntity.ok(homework);
    }

    @DeleteMapping("/delete/{toDelete}")
    public ResponseEntity<HttpStatus> deleteM(@PathVariable String toDelete){
        return ResponseEntity.ok().build();
    }
}
