package com.dns.demo.data.repository;

import com.dns.demo.data.entity.Domain;
import org.dom4j.dom.DOMAttribute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainRepository extends CrudRepository<Domain, Long> {

    Domain findByDomainName(String domainName);


}
