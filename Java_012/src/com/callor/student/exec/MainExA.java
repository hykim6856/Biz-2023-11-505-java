package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.impl.StartServiceImplV2;

public class MainExA {
	public static void main(String[] args) {
		StartService start = new StartServiceImplV2();
		//start.mainMenu();
		//Integer result = startService.selectMenu();
		//System.out.println(result);
		
		start.startApp();
	}
}
