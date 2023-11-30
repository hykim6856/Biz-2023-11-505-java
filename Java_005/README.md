# 자바 객체지향
* 2023.11.30.

# 자바 코드는 모든 시작이 **class** 부터이다.
* 자바는 소스코드가 `*.java` 라는 이름으로 작성된다.
* 자바 소스코드를 통상적으로 **클래스 파일** 이라고 부른다.
* 자바 소스코드를 컴파일 하면 `*.class` 파일이 생성이 되는데 이 파일은 **바이트 코드 파일** 이라고 부른다.
* 자바 소스코드는 자바 클래스 파일 이름과 같은 class 명령 그룹으로 부터 시작한다.
```java
//만약 Hello.java 파일 이라면
//다음과 같은 class 명령 그룹으로 작성된다.
public class Hello {

}
```

## 객체지향이란
* 클래스(class), 오브젝트(object) 라는 도구를 사용하여 작성되는 프로그램 코딩 방식
* 클래스(소스코드 상에서의 클래스)는 어떤 문제 해결을 위한 설계도이다.
* 오브젝트는 클래스 설계도를 사용하여 실제 문제를 해결하기 위한 도구이다.

## 클래스 그룹(`public class Hello {}`)
* 자바의 모든 명령의 시작점이다.
* `main() method` 는 `jvm`에 의해 호출되는 함수이다. 코드를 실행(run) 할때 반드시 있어야하는 함수이다.
* 개발자는 `main() method` 외에 자신이 필요한 `method`를 자유롭게 선언(코드작성)하여 필요한 곳에서 호출하여 사용할수 있다.
* 개발자가 작성한 `method`는 `static method`와 `none static method` 가 있다.
```java
//static method
public static void hello(){

}

// none static method
public void hello(){

}
```
* `static method`는 `클래스명.method()` 형식으로 어디에서나 호출 할 수있다.
* `static method`는 코드가 작동되는 순간 필요하든 필요하지 않든 자동으로 만들어져 메모리에 상주(실행할 준비하는 것) 한다.
* `none static method`는 코드가 작동되어도 `method`는 사용할 준비가 되어있지 않다.
* `none static method`는 클래스 설계도를 사용하여 오브젝트(object)로 생성한 후에 오브젝트를 통하여 호출할 수 있다.