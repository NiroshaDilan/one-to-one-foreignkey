package lk.icoder.onetooneforiegnkey.repository;

import lk.icoder.onetooneforiegnkey.enitity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project one-to-one-foriegnkey
 * @Author DILAN on 5/27/2018
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
