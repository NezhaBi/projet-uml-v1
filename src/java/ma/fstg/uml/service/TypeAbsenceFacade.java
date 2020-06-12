/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.fstg.uml.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ma.fstg.uml.bean.TypeAbsence;

/**
 *
 * @author pc
 */
@Stateless
public class TypeAbsenceFacade extends AbstractFacade<TypeAbsence> {

    @PersistenceContext(unitName = "projet-uml-v1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeAbsenceFacade() {
        super(TypeAbsence.class);
    }
    
}
