package lk.icoder.onetooneforiegnkey.controller;

import lk.icoder.onetooneforiegnkey.enitity.Course;
import lk.icoder.onetooneforiegnkey.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Project one-to-one-foriegnkey
 * @Author DILAN on 5/27/2018
 */
@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/update")
    public void update() {

        Optional<Course> course = courseRepository.findById(1001L);
        course.get().setName("Dilan");
        courseRepository.save(course.get());
    }
}
