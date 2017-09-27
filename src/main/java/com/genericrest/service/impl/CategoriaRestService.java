/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.CategoriaDAO;
import com.genericrest.dao.DAO;
import com.genericrest.model.Categoria;
import com.genericrest.service.CategoriaService;
import com.genericrest.service.GenericCRUDRestService;
import static java.util.Collections.list;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author erichmantai
 */
@ManagedBean
@Path("/categoria")
public class CategoriaRestService extends GenericCRUDRestService<Categoria> implements CategoriaService {

    private static final Logger LOG = LoggerFactory.getLogger(CategoriaRestService.class);
    @Inject
    private CategoriaDAO CategoriaDAO;

    
    public CategoriaRestService(Class<Categoria> entityClass) {
        super(Categoria.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Categoria> list) {
        return new GenericEntity<List<Categoria>>(list) {
        };
    }

    @Override
    public DAO getDao() {
        return CategoriaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

}
