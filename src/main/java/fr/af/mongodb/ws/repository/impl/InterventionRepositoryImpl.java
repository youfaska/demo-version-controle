package fr.af.mongodb.ws.repository.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import fr.af.mongodb.ws.common.Constant;
import fr.af.mongodb.ws.config.ConexionDb;
import fr.af.mongodb.ws.repository.InterventionRepository;

/**
 * The Class InterventionRepositoryImpl.
 */
@Repository
public class InterventionRepositoryImpl implements InterventionRepository{
	
	/** The Constant logger. */
	static final Logger logger = Logger.getLogger(InterventionRepositoryImpl.class);

	/** The conexion bd. */
	@Autowired
	private ConexionDb conexionBd;
	
	@Override
	public DBCursor findAllInterventions() {
		logger.info("BEGIN - findAllInterventions: ");
		DBCursor elementList = null;
		DBCollection dbCollection  = conexionBd.getMongoDbCollection(Constant.COLLECTION_INTERVENTION);
		try {
			elementList =  dbCollection.find();
			if (elementList!=null){
				logger.info("Total elemente retrieved: "+elementList.size());
				logger.debug(elementList);
			}else{
				logger.error("An error has occured during intervention retrieving process...");
			}
		}catch (Exception exception){
			logger.error(exception);
		}
		logger.info("END - findAllInterventions. ");
		return elementList;
	}

	
}
