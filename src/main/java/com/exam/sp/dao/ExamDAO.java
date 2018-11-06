package com.exam.sp.dao;

import java.util.List;

import com.exam.sp.vo.Exam;

public interface ExamDAO {
	public List<Exam> getselectList();
	public Exam getselect(Integer no);
	public int insertExam(Exam ex);
	public int updateExam(Exam ex);
	public int deleteExam(Integer no);
}
