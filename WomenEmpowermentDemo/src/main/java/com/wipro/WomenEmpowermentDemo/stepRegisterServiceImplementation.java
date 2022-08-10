package com.wipro.WomenEmpowermentDemo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class stepRegisterServiceImplementation implements stepRegisterService{
	@Autowired
    private stepRegisterRepository stepregisterRepository;

    @Override
    public stepRegister createstepRegister(stepRegister stepregister) {
        return stepregisterRepository.save(stepregister);
    }

 
    @Override
    public List < stepRegister > getAllstepRegister() {
        return this.stepregisterRepository.findAll();
    }


	@Override
	public stepRegister getstepRegisterById(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	

	
}
