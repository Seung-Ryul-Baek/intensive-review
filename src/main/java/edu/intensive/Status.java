package edu.intensive;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Status {
    @Id
    @GeneratedValue
    Long id;
    Long courseId;
    Long courseParticipantsNumber;
    Double courseGrade;
}
