package fr.af.mongodb.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.af.mondodb.ws.model.Intervention;
import fr.af.mongodb.ws.service.InterventionService;

/**
 * The Class InterventionController.
 */
@RestController
public class InterventionController {

	/** The intervention servie. */
	@Autowired
	private InterventionService interventionServie;

	/**
	 * get all interventions.
	 * @return the List<Intervention>
	 */
	@RequestMapping("/intervention/") 
	 @ResponseBody  List<Intervention>  getAllInterventions() {
		return interventionServie.getAllInterventions();
	}
}
