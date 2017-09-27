/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author erichmantai
 */
@Entity
@Table
@XmlRootElement
public class Pedido extends AbstractEntity {
    
    @Column(nullable = false)
    private Date data;
    private String status;
    
    @OneToMany
    private List<Cliente> cliente;
    


    public Pedido() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

 
    
    @Override
    public void updateParameters(Object entity) {
        
    }
    
}
