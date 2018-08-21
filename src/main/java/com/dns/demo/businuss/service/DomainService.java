package com.dns.demo.businuss.service;

import com.dns.demo.data.entity.Domain;
import com.dns.demo.data.repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DomainService {

    private DomainRepository domainRepository;

    @Autowired
    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    public List<Domain> getAllDomain(){

        List<Domain> domains = new ArrayList<>();
        domainRepository.findAll().forEach(domains::add);
        return domains;
    }
}
