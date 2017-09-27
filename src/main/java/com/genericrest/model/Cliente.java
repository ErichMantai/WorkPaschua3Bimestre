/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author erichmantai
 */
@Entity
@Table
@XmlRootElement
public class Cliente extends AbstractEntity {
    @Column(length = 255, nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private int idade;
    
    @Column(length = 255, nullable = false)
    private String telefone;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    @Override
    public void updateParameters(Object entity) {
 
    }
    
}
