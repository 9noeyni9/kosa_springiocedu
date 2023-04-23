package sampleanno2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component/*이름 부여 안 했기 때문에 default로 설정됨 맨 앞글자 소문자로 바꿔서 생성*/
public class Engineer {
	@Autowired
	@Qualifier("emp1")
	//@Resource(name="emp1")
	private Emp emp;/*emp객체 주입헤주는데 emp1이란 이름으로 주입해줘 emp에만 annotation적용됨 annotation은 각각 부여해줘야 함*/
	private String dept;
	
	public Engineer() {
		super();
		System.out.println("Engineer 객체 생성 - no args");
	}
	@Autowired
	public void ddd(String dept) {//필드명이 아니고 일반 메서드에
		this.dept = dept;
		System.out.println("Engineer 객체의 ddd() 메서드에 설정된 메서드 오토와이어를 이용한 dept 변수 설정-"+dept);
	}

	@Override
	public String toString() {
		return emp.toString()+"\n"+ "and works at the "+dept+" department.";
	}
}








