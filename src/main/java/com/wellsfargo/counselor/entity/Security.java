package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portFolioID", referencedColumnName = "portFolioID", nullable = false)
    private PortFolio portFolio;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private long Quantity;

    protected Security() {

    }

    public Security(PortFolio portFolio ,String Name, String Category, long purchasePrice, Date purchaseDate, long Quantity) {
        this.portFolio = portFolio;
        this.Name = Name;
        this.Category = Category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.Quantity = Quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public PortFolio getPortFolio() {
        return portFolio;
    }

    public void setPortFolio(PortFolio portFolio) {
        this.portFolio = portFolio;
    }

    public String getName() { return Name; }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public long getPurchasePrice() { return purchasePrice; }

    public void setPurchasePrice(long purchasePrice) { this.purchasePrice = purchasePrice; }

    public Date getPurchaseDate() { return purchaseDate; }

    public void setPurchaseDate(Date purchaseDate) { this.purchaseDate = purchaseDate; }

    public long getQuantity() { return Quantity; }

    public void setEmail(long Quantity) { this.Quantity = Quantity; }
}
