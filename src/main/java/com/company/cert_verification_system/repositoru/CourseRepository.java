package com.company.cert_verification_system.repositoru;

import com.company.cert_verification_system.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {

    Optional<Course> findByName(String name);
}
