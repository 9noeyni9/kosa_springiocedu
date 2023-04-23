package sampleanno8;

import org.springframework.stereotype.Component;

@Component
public class A {/*의존관계에 있으면 먼저 생성 지금은 여러 component 중 순서대로 생성함*/
	A(){
		System.out.println("A 객체 생성");
	}
}
