package com.example.abiturients.abiturientsweb.models;

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

    public boolean notNull() {
        return subject != null && score != null;
    }
}
