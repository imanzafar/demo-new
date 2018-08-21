package com.dns.demo.data.entity;


import javax.persistence.*;


@Entity
@Table(name = "DOMAIN_TABLE")
public class Domain {


    public Domain() {
    }

    @Id
    @Column(name = "DOMAIN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "DOMAIN_NAME")
    private String domainName;

    public Domain(long id, String domainName) {
        this.id = id;
        this.domainName = domainName;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
}
