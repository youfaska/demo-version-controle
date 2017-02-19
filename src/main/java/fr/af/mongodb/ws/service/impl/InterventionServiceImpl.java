package fr.af.mongodb.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import fr.af.mondodb.ws.model.Intervention;
import fr.af.mongodb.ws.repository.InterventionRepository;
import fr.af.mongodb.ws.service.InterventionService;

/**
 * The Class InterventionServiceImpl.
 */
@Service
public class InterventionServiceImpl implements InterventionService {
	static final Logger logger = Logger.getLogger(InterventionServiceImpl.class);

	@Autowired
	private InterventionRepository interventionRepository;

	@Override
	public List<Intervention> getAllInterventions() {
		logger.info("BEGIN - getAllInterventions:");
		DBCursor inteventionList = null;
		DBObject interventionMongodb = null;
		List<Intervention> interventionRResultList = new ArrayList<Intervention>();
		try {
			inteventionList = interventionRepository.findAllInterventions();
			while (inteventionList.hasNext()) {
				interventionMongodb = inteventionList.next();
				Intervention intervention = new Intervention((String) interventionMongodb.get("type"),
						(String) interventionMongodb.get("operation"), (String) interventionMongodb.get("status"),
						(String) interventionMongodb.get("code_intervention"));
				interventionRResultList.add(intervention);
			}
			logger.info("conversion from DBObjet to Intervention  process complete.");
			logger.debug(interventionRResultList);
		} catch (Exception exception) {
			logger.error(exception);
		}
		logger.info("END - getAllInterventions.");
		return interventionRResultList;
	}

}
