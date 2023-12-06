package com.example.abiturients.abiturientsweb.models;

import com.example.abiturients.abiturientsweb.entity.EnrolleeEntity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NotNull
@AllArgsConstructor
@NoArgsConstructor
@Size(min = 2, max = 30)
public class Enrollee {
    private int id;
    private String fullName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Enrollee(EnrolleeEntity enrollee) {
        setId((int) enrollee.getId());
        setBirthday(enrollee.getBirthday());
        setFullName(enrollee.getFullName());
    }

    public String getDrString() {
        return birthday.getDay() + "." + birthday.getMonth() + "." + birthday.getYear();
    }

    public boolean notNull() {
        return fullName != null && birthday != null;
    }
}
