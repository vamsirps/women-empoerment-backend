package com.wipro.WomenEmpowermentDemo;
import java.util.List;


public interface ngoRegisterService {
	ngoRegister createngoRegister(ngoRegister ngoregister);

	   

    List < ngoRegister > getAllngoRegister();

    ngoRegister getngoRegisterById(String username);


}
