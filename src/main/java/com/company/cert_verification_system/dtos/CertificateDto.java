package com.company.cert_verification_system.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificateDto {

    private Long id;
    private String studentName;
    private String courseName;
    private String ipfsHash;
    private LocalDate issuedAt;
}
