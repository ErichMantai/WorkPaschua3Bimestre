/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.CategoriaDAO;
import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.GenericDAO;
import com.genericrest.model.Categoria;
import com.genericrest.model.Cliente;
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
public class ClienteDAOImpl extends GenericDAO<Cliente, Long> implements ClienteDAO {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteDAOImpl.class);

    public ClienteDAOImpl() {
        super(Cliente.class);
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}
