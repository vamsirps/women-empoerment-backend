package com.wipro.WomenEmpowermentDemo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ngoRegisterController {
	@Autowired
    private ngoRegisterService ngoregisterService;

    @GetMapping("/ngoregister")
    public ResponseEntity < List < ngoRegister >> getAllngoRegister() {
        return ResponseEntity.ok().body(ngoregisterService.getAllngoRegister());
    }

  
    @PostMapping("/ngoregister")
    public ResponseEntity < ngoRegister > createngoRegister(@RequestBody ngoRegister ngoregister) {
        return ResponseEntity.ok().body(this.ngoregisterService.createngoRegister(ngoregister));
    }
}
