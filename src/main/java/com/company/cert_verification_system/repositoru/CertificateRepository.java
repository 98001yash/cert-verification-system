package com.company.cert_verification_system.repositoru;

import com.company.cert_verification_system.entities.Certificate;
import com.company.cert_verification_system.entities.Course;
import com.company.cert_verification_system.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CertificateRepository extends JpaRepository<Certificate,Long> {

    Optional<Certificate> findByStudentAndCourse(Student student, Course course);
}
