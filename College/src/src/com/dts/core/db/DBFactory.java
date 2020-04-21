package src.com.dts.core.db;

import src.com.dts.core.dao.AbstractDataAccessObject;
import src.com.dts.core.model.AbstractDataObject;

/**
 *
 * @author
 */
public class DBFactory {
	
    public DBFactory() 
    {
    	new AbstractDataAccessObject().getConnection();
    }	
}
