/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.PedidoDAO;
import com.genericrest.model.Categoria;
import com.genericrest.model.Pedido;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.NonUniqueResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author erichmantai
 */
public class PedidoDAOImpl extends GenericDAO<Pedido, Long> implements PedidoDAO {

    private static final Logger LOG = LoggerFactory.getLogger(PedidoDAOImpl.class);

    public PedidoDAOImpl() {
        super(Pedido.class);
    }


    @Override
    public Logger getLogger() {
        return LOG;
    }

  
}
