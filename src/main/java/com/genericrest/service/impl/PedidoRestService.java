/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.ItemPedidoDAO;
import com.genericrest.dao.PedidoDAO;
import com.genericrest.model.ItemPedido;
import com.genericrest.model.Pedido;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.PedidoService;
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
@Path("/pedido")
public class PedidoRestService extends GenericCRUDRestService<Pedido> implements PedidoService {

    private static final Logger LOG = LoggerFactory.getLogger(PedidoRestService.class);
    
    @Inject
    private PedidoDAO PedidoDAO;

    public PedidoRestService(Class<Pedido> entityClass) {
        super(Pedido.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Pedido> list) {
        return new GenericEntity<List<Pedido>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return PedidoDAO;
    }

    @Override
    public Logger getLogger() {
       return LOG;
    }

}
