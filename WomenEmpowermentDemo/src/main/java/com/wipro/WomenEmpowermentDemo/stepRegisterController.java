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
public class stepRegisterController {
	@Autowired
    private stepRegisterService stepregisterService;

    @GetMapping("/stepregister")
    public ResponseEntity < List < stepRegister >> getAllstepRegister() {
        return ResponseEntity.ok().body(stepregisterService.getAllstepRegister());
    }

  
    @PostMapping("/stepregister")
    public ResponseEntity < stepRegister > createstepRegister(@RequestBody stepRegister stepregister) {
        return ResponseEntity.ok().body(this.stepregisterService.createstepRegister(stepregister));
    }

    

}
