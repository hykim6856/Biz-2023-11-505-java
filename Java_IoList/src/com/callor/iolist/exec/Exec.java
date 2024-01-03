package com.callor.iolist.exec;

import com.callor.iolist.service.IoService;
import com.callor.iolist.service.impl.IoServiceImplV1;

public class Exec {
	public static void main(String[] args) {
		IoService ioService = new IoServiceImplV1();
		ioService.loadIoService();
		ioService.printIoService();

	}
}
