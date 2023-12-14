package com.callor.student.service;

/*
 *    JDK 1.8 이하 에서는
 *    interface 에는  추상 메서드(avstract method ) 만 있다.
 *    최신 버전의 interface 에는 일반 메서드도 있을 수 있다.
 */
public interface StartService {
// 코드블럭이 없는 메서드들을 추상 메서드라고 한다.
	public void mainMenu();

	public Integer selectMenu();

	public void startApp();
}
