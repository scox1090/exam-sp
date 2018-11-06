package com.exam.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.sp.dao.ExamDAO;
import com.exam.sp.service.ExamService;
import com.exam.sp.vo.Exam;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDAO edao;
	
	@Override
	public List<Exam> getselectList() {
		return edao.getselectList();
	}

	@Override
	public Exam getselect(Integer no) {
		return edao.getselect(no);
	}

	@Override
	public int insertExam(Exam ex) {
		return edao.insertExam(ex);
	}

	@Override
	public int updateExam(Exam ex) {
		return edao.updateExam(ex);
	}

	@Override
	public int deleteExam(Integer no) {
		return edao.deleteExam(no);
	}

}
