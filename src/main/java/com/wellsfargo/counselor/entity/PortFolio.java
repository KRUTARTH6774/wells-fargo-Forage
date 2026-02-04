package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class PortFolio {
    @Id
    @GeneratedValue()
    private long portFolioID;

    @ManyToOne
    @JoinColumn(name = "clientID", referencedColumnName = "clientID", nullable = false)
    private Clients client;

    @Column(nullable = false)
    private Date creationDate;

    protected PortFolio() {

    }

    public PortFolio(Clients clientId, Date creationDate) {
        this.client = clientId;
        this.creationDate = creationDate;
    }

    public long getPortFolioID() {
        return portFolioID;
    }

    public Clients getAdvisor() {
        return client;
    }

    public void setAdvisor(Clients client) {
        this.client = client;
    }

    public Date getCreationDate() { return creationDate; }

    public void setCreationDate(Date creationDate) { this.creationDate = creationDate; }

}
