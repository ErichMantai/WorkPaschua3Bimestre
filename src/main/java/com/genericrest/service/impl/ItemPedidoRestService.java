/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.ItemPedidoDAO;
import com.genericrest.model.Cliente;
import com.genericrest.model.ItemPedido;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.ItemPedidoService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author erichmantai
 */
@ManagedBean
@Path("/items")
 class ItemPedidoRestService extends GenericCRUDRestService<ItemPedido> implements ItemPedidoService {

    private static final Logger LOG = LoggerFactory.getLogger(ItemPedidoRestService.class);

    @Inject
    private ItemPedidoDAO ItemDAO;

    public ItemPedidoRestService() {
        super(ItemPedido.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<ItemPedido> list) {
        return new GenericEntity<List<ItemPedido>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return ItemDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}
