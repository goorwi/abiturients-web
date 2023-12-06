package com.example.abiturients.abiturientsweb.service;

import com.example.abiturients.abiturientsweb.dao.Dao;
import com.example.abiturients.abiturientsweb.entity.EnrolleeEntity;
import com.example.abiturients.abiturientsweb.entity.ExamEntity;
import com.example.abiturients.abiturientsweb.models.Enrollee;
import com.example.abiturients.abiturientsweb.models.Exam;

import java.util.ArrayList;
import java.util.List;

public class ExamService {
    private Dao examDao;

    public ExamService(Dao examDao) {
        this.examDao = examDao;
    }

    public long sizeEnrollees() {
        return examDao.size();
    }

    public List<Enrollee> getAllEnrolles() {
        return examDao.getAll();
    }

    public Enrollee getEnrollee (long id) {
        return new Enrollee((EnrolleeEntity) examDao.get(id).get());
    }

    public void save(Exam exam) {
        exam.setIdEnrollee(examDao.size());
        ExamEntity examEntity = new ExamEntity(exam);
        examDao.save(examEntity);
    }
    public List<Enrollee> getEnrolles(List<EnrolleeEntity> enrolleeEntitys) {
        List<Enrollee> enrollees = new ArrayList<>();
        for (EnrolleeEntity enrolleeEntity: enrolleeEntitys) {
            enrollees.add(new Enrollee(enrolleeEntity));
        }
        return enrollees;
    }
}
