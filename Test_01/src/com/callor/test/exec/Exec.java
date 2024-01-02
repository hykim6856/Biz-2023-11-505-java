package com.callor.test.exec;

import com.callor.test.service.GuideService;
import com.callor.test.service.impl.GuideServiceImplV1;

public class Exec {
public static void main(String[] args) {
	GuideService guideService = new GuideServiceImplV1();
	guideService.loadGuide();
	guideService.printGuide();
}
}
