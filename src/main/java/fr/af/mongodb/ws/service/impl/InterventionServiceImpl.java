package fr.af.mongodb.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import fr.af.mondodb.ws.model.Actividad;
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
	public List<Actividad> getAllInterventions() {
		logger.info("BEGIN - getAllInterventions:");
		DBCursor inteventionList = null;
		DBObject interventionMongodb = null;
		List<Actividad> interventionRResultList = new ArrayList<Actividad>();
		try {
			inteventionList = interventionRepository.findAllInterventions();
			while (inteventionList.hasNext()) {
				interventionMongodb = inteventionList.next();
				Actividad intervention = new Actividad((String) interventionMongodb.get("aplicacion"),(String) interventionMongodb.get("tiempo")
						, (String) interventionMongodb.get("fecha"), (String) interventionMongodb.get("error")
						, (String) interventionMongodb.get("camino"), (String) interventionMongodb.get("nombreActividad"));
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
