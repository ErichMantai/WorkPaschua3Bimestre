/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.CategoriaDAO;
import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.ProdutoDAO;
import com.genericrest.model.Cliente;
import com.genericrest.model.Produto;
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
public class ProdutoDAOImp extends GenericDAO<Produto, Long> implements ProdutoDAO {

    private static final Logger LOG = LoggerFactory.getLogger(ProdutoDAOImp.class);

    public ProdutoDAOImp() {
        super(Produto.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }


   

}
