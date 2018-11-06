package com.exam.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.sp.service.ExamService;
import com.exam.sp.vo.Exam;

@Controller
public class ExamController {
	
	@Autowired
	private ExamService esv;
	
	@GetMapping(value="/exams")
	public @ResponseBody List<Exam> getselectList(){
		return esv.getselectList();
	}
	
	@GetMapping(value="/exams/{num}")
	public @ResponseBody Exam getselect(@PathVariable Integer num){
		return esv.getselect(num);
	}
	
	@PostMapping(value="/exams")
	public @ResponseBody int insertExam(@RequestBody Exam ex) {
		return esv.insertExam(ex);
	}
	
	@PutMapping(value="/exams/{num}")
	public @ResponseBody int updateExam(@RequestBody Exam ex) {
		return esv.updateExam(ex);
	}
	
	@DeleteMapping(value="/exams/{num}")
	public @ResponseBody int deleteExam(@PathVariable Integer num) {
		return esv.deleteExam(num);
	}
}
