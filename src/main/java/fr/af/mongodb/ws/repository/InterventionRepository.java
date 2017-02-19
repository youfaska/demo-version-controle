package fr.af.mongodb.ws.repository;

import com.mongodb.DBCursor;


/**
 * The Interface InterventionRepository.
 * @author youssef.oufaska
 */
public interface InterventionRepository {
	
	/**
	 * Find all interventions.
	 *
	 * @return the Collection<DBObject>
	 */
	DBCursor findAllInterventions();
}
