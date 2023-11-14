package com.example.isaprojekat.service;

import com.example.isaprojekat.model.Company;
import com.example.isaprojekat.model.User;
import com.example.isaprojekat.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company findOne(Integer id) {
        return companyRepository.findById(id).orElseGet(null);
    }
}
