package edu.intensive.external;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Course {
    Long courseId;
    String courseName;
    Long courseParticipants;
    Double courseAverageGrade;
    Long courseGradedNumber;
}