package com.wipro.WomenEmpowermentDemo;

import java.util.List;

public interface stepRegisterService {
	stepRegister createstepRegister(stepRegister stepregister);

   

    List < stepRegister > getAllstepRegister();

    stepRegister getstepRegisterById(String username);

}
