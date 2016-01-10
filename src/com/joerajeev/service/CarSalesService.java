package com.joerajeev.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.joerajeev.model.Vehicle;
import com.sun.istack.logging.Logger;

/**
 * Session Bean implementation class CarSalesService
 */
@Stateless
@LocalBean
public class CarSalesService {

	private static Logger log = Logger.getLogger(CarSalesService.class);
    /**
     * Default constructor. 
     */
    public CarSalesService() {
        // TODO Auto-generated constructor stub
    }
    
    @PersistenceContext(name="carsales")
    private EntityManager em;
    
    public void saveVehicle(Vehicle vehicle){
    	try{
    		em.persist(vehicle);
    	}catch(Exception e){
    		log.severe(e.getMessage());
    	}
    }

}
