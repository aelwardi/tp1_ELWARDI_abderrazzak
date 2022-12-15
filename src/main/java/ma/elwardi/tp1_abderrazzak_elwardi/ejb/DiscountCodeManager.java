/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.elwardi.tp1_abderrazzak_elwardi.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import ma.elwardi.tp1_abderrazzak_elwardi.entities.DiscountCode;

@Stateless
public class DiscountCodeManager {

    @PersistenceContext
    private EntityManager em;

    public List<DiscountCode> getAllDiscountCodes() {
        Query query = em.createNamedQuery("DiscountCode.findAll");
        return query.getResultList();
    }

    public DiscountCode findById(String discountCode) {
        return em.find(DiscountCode.class, discountCode);
    }

    public void persist(DiscountCode discountCode) {
        em.persist(discountCode);
    }
}
