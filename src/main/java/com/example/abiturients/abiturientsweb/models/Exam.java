package com.example.abiturients.abiturientsweb.models;

import com.example.abiturients.abiturientsweb.entity.ExamEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    private String subject;
    private Integer score;
    private Integer idEnrollee;

    public Exam(ExamEntity exam) {
        setSubject(exam.getSubject());
        setScore(exam.getScore());
        setIdEnrollee(exam.getIdEnrollee());
    }
    public boolean notNull() {
        return subject != null && score != null;
    }
}
