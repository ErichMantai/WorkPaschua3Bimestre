/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genericrest.service.impl;

import com.genericrest.dao.DAO;
import com.genericrest.dao.ProdutoDAO;
import com.genericrest.model.Produto;
import com.genericrest.service.GenericCRUDRestService;
import com.genericrest.service.ProdutoService;
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
@Path("/produto")
public class ProdutoRestService extends GenericCRUDRestService<Produto> implements ProdutoService {
    
    private static final Logger LOG = LoggerFactory.getLogger(ProdutoRestService.class);
    
    @Inject
    private ProdutoDAO ProdutoDAO;

    public ProdutoRestService(Class<Produto> entityClass) {
        super(Produto.class);
    }

    @Override
    public GenericEntity listToGenericEntity(List<Produto> list) {
      return new GenericEntity<List<Produto>>(list) {
        };        
    }

    @Override
    public DAO getDao() {
        return ProdutoDAO;
    }

    @Override
    public Logger getLogger() {
       return LOG; 
    }
    
}
