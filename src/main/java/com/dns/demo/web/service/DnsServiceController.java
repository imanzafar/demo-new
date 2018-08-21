package com.dns.demo.web.service;

import com.dns.demo.businuss.service.DomainService;
import com.dns.demo.data.entity.Domain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class DnsServiceController {

    DomainService domainService;

    @RequestMapping(value = "/domain", method = RequestMethod.GET)
    public List<Domain> getAllDomain(){

        return domainService.getAllDomain();
    }
}
