package com.joerajeev.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.joerajeev.model.Vehicle;
import com.joerajeev.service.CarSalesService;
import com.sun.istack.logging.Logger;

/**
 * Servlet implementation class CarServlet
 */
@WebServlet("/cars")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Logger log = Logger.getLogger(CarServlet.class);
	
	@EJB
	private CarSalesService carsalesService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/addCar.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reg = request.getParameter("reg");
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String year = request.getParameter("year");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/addCar.jsp");
		if(!isAnInt(year)){
			request.setAttribute("error", "Invalid Year");
			requestDispatcher.forward(request, response);
		}
		
		Vehicle vehicle = new Vehicle();
		vehicle.setReg(reg);
		vehicle.setMake(make);
		vehicle.setModel(model);
		vehicle.setYear(Integer.valueOf(year));
		
		log.info("saving a new vehicle");
		carsalesService.saveVehicle(vehicle);
		
		request.setAttribute("message", "Car Added");
		requestDispatcher.forward(request, response);
		
	}
	
	private boolean isAnInt(String test){
		try {
			Integer.valueOf(test);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
