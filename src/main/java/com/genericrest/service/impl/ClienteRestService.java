/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.ClienteDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Categoria;
import com.genericrest.model.Cliente;
import com.genericrest.service.ClienteService;
import com.genericrest.service.GenericCRUDRestService;
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
@Path("/cliente")
 class ClienteRestService extends GenericCRUDRestService<Cliente> implements ClienteService {

    private static final Logger LOG = LoggerFactory.getLogger(ClienteRestService.class);

    @Inject
    private ClienteDAO ClienteDAO;

    public ClienteRestService() {
        super(Cliente.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Cliente> list) {
        return new GenericEntity<List<Cliente>>(list) {
        };
    }

    @Override
    public DAO getDao() {
     return ClienteDAO;
    }

    @Override
    public Logger getLogger() {
      return LOG;
    }

}
