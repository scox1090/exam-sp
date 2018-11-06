package com.exam.sp.service;

import java.util.List;

import com.exam.sp.vo.Exam;

public interface ExamService {
	public List<Exam> getselectList();
	public Exam getselect(Integer no);
	public int insertExam(Exam ex);
	public int updateExam(Exam ex);
	public int deleteExam(Integer no);
}
