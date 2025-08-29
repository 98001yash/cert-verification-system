package com.company.cert_verification_system.repository;

import com.company.cert_verification_system.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findByWalletAddress(String walletAddress);
}
