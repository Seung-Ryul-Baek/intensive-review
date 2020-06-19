package edu.intensive.controller;

import edu.intensive.StatusApplication;
import edu.intensive.external.Course;
import edu.intensive.external.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping(value = "/statuses/view/{courseId}", produces = "application/json;charset=UTF-8")
    public String studentLectureHistory(@PathVariable Long courseId) {
        Course course = null;
        try {
             course = StatusApplication
                    .applicationContext.getBean(CourseService.class).selectOne(courseId);
        } catch (Exception e) {
            return "Not exist";
        }

        String result = "Course Name : " + course.getCourseName() + "\n";

        result += "Course Participants : ";
        if (course.getCourseParticipants() != null) {
            result += course.getCourseParticipants().toString() + "\n";
        } else {
            result += "\n";
        }

        result += "Course Grade : ";
        if (course.getCourseAverageGrade() != null) {
            result += course.getCourseAverageGrade().toString() + "\n";
        } else {
            result += "\n";
        }

        return result;
    }
}