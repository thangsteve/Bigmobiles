/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Products;

/**
 *
 * @author An
 */
@Stateless
public class ProductsFacade extends AbstractFacade<Products> implements ProductsFacadeLocal {
    @PersistenceContext(unitName = "BigmobilesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductsFacade() {
        super(Products.class);
    }
    
}
