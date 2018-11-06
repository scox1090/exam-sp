package com.exam.sp.vo;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@Data
@Log4j
public class Exam {
	private Integer num;
	private String name;
	private Integer age;
	/*
	public static void main(String[] args){
		Exam e = new Exam();
		e.setAge(20);
		log.info("ExamVO =>{}",e);
		System.out.println(e.getAge());
	}*/
}
