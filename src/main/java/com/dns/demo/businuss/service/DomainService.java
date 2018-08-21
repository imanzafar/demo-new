package com.dns.demo.businuss.service;

import com.dns.demo.data.entity.Domain;
import com.dns.demo.data.repository.DomainRepository;
import com.sun.xml.internal.bind.v2.model.core.ID;
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

    public String getUserDomain(String domainName){

        Domain userDomain = new Domain();
        userDomain.setDomainName(domainName);
        List<Domain> domains;
        domains = getAllDomain();
        userDomain.setDomainName("Whitelist");
        domains.forEach(domain -> {
            System.out.println(domain.getDomainName().equals(domainName));
            if (domain.getDomainName().equals(domainName)){
                userDomain.setDomainName("Blacklist");
            }
        });

        return userDomain.getDomainName();
    }


}
