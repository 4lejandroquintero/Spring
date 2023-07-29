package com.platzimarket.domain;

import com.platzimarket.domain.PurchaseItem;

import java.time.LocalDate;
import java.util.List;

public class Pruchase {
    private int pruchaseId;
    private String clienteId;
    private LocalDate date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> item;

    public int getPruchaseId() {
        return pruchaseId;
    }

    public void setPruchaseId(int pruchaseId) {
        this.pruchaseId = pruchaseId;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<PurchaseItem> getItem() {
        return item;
    }

    public void setItem(List<PurchaseItem> item) {
        this.item = item;
    }
}
