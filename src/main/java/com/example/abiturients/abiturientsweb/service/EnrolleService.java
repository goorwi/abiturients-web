package com.example.abiturients.abiturientsweb.service;

import com.example.abiturients.abiturientsweb.dao.Dao;
import com.example.abiturients.abiturientsweb.entity.EnrolleeEntity;
import com.example.abiturients.abiturientsweb.models.Enrollee;

import java.util.ArrayList;
import java.util.List;

public class EnrolleService {
    private Dao enrolleeDao;

    public EnrolleService(Dao enrolleeDao) {
        this.enrolleeDao = enrolleeDao;
    }

    public long sizeEnrollees() {
        return enrolleeDao.size();
    }

    public List<Enrollee> getAllEnrolles() {
        return enrolleeDao.getAll().stream().map(x -> new Enrollee((EnrolleeEntity) x)).toList();
    }

    public Enrollee getEnrollee (long id) {
        return new Enrollee((EnrolleeEntity) enrolleeDao.get(id).get());
    }

    public void save(Enrollee enrollee) {
        enrollee.setId(enrolleeDao.size());
        EnrolleeEntity enrolleeEntity = new EnrolleeEntity(enrollee);
        enrolleeDao.save(enrolleeEntity);
    }

}