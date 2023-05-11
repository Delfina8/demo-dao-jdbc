package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

/*
 * Essa classe terá operações estáticas para instanciar o DAO
 */
public class DaoFactory {
	
	/* o método createSellerDao() terá de retornar um SellerDao (SellerDao é uma interface), ou seja,
	 * vai retornar um tipo da interface
	 */
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
