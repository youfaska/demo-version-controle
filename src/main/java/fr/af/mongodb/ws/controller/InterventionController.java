package fr.af.mongodb.ws.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.af.mondodb.ws.model.Actividad;
import fr.af.mongodb.ws.repository.impl.InterventionRepositoryImpl;
import fr.af.mongodb.ws.service.InterventionService;

/**
 * The Class InterventionController.
 */
@RestController
public class InterventionController {
	static final Logger logger = Logger.getLogger(InterventionController.class);

	/** The intervention servie. */
	@Autowired
	private InterventionService interventionServie;

	/**
	 * get all interventions.
	 * 
	 * @return the List<Intervention>
	 */
	@RequestMapping("/intervention/")
	@ResponseBody
	List<Actividad> getAllInterventions() {
		return interventionServie.getAllInterventions();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@Valid @RequestBody String nombre) {
		// User userCreated = userService.create(user);
		logger.info("el nombre es: " + nombre);
		return "TODO OK";
	}

	/*
	 * @RequestMapping(value = "/create", method = RequestMethod.POST) public
	 * ResponseEntity<User> create(@Valid @RequestBody User user) { User userCreated
	 * = userService.create(user); return new ResponseEntity(userCreated,
	 * HttpStatus.CREATED); }
	 */
}
