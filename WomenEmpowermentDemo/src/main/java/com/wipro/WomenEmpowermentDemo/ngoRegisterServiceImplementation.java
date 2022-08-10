package com.wipro.WomenEmpowermentDemo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ngoRegisterServiceImplementation implements ngoRegisterService {
	@Autowired
    private ngoRegisterRepository ngoregisterRepository;

    @Override
    public ngoRegister createngoRegister(ngoRegister ngoregister) {
        return ngoregisterRepository.save(ngoregister);
    }

 
    @Override
    public List < ngoRegister > getAllngoRegister() {
        return this.ngoregisterRepository.findAll();
    }


	@Override
	public ngoRegister getngoRegisterById(String username) {
		// TODO Auto-generated method stub
		return null;
	}


}
