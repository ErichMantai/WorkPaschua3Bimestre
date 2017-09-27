/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.dao.impl;

import com.genericrest.dao.GenericDAO;
import com.genericrest.dao.ItemPedidoDAO;
import com.genericrest.model.Categoria;
import com.genericrest.model.ItemPedido;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.NonUniqueResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author erichmantai
 */
public class ItemPedidoDaoImpl extends GenericDAO<ItemPedido, Long> implements ItemPedidoDAO {

    private static final Logger LOG = LoggerFactory.getLogger(ItemPedidoDaoImpl.class);

    public ItemPedidoDaoImpl(Class<ItemPedido> entityClass) {
        super(entityClass);
    }


    @Override
    public Logger getLogger() {
        return LOG;
    }

 
}
