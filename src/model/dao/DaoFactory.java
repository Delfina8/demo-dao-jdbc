package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

/*
 * Essa classe ter� opera��es est�ticas para instanciar o DAO
 */
public class DaoFactory {
	
	/* o m�todo createSellerDao() ter� de retornar um SellerDao (SellerDao � uma interface), ou seja,
	 * vai retornar um tipo da interface
	 */
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

}
