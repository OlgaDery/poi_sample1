/**
 * 
 */
package model;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//FUNCTIONALITY MIGRATED
/**
 * @author Olga
 *
 */
public class Modify_poi_model implements Model {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	

	/* (non-Javadoc)
	 * @see model.Model#process(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public void process(HttpServletRequest request) {
		// TODO Auto-generated method stub
		logger.info("enter process(HttpServletRequest request");
		
		logger.info("exit process(HttpServletRequest request");
	}

}