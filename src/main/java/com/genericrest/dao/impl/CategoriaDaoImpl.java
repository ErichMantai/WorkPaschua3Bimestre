/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.CategoriaDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Categoria;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.Query;
import org.hibernate.NonUniqueResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author erichmantai
 */
@ApplicationScoped
public class CategoriaDaoImpl extends GenericDAO<Categoria, Long> implements CategoriaDAO {
    
    private static final Logger LOG = LoggerFactory.getLogger(CategoriaDaoImpl.class);
    
    public CategoriaDaoImpl() {
        super(Categoria.class);
    }
    
    
    @Override
    public Logger getLogger() {
        return LOG;        
    }

}
