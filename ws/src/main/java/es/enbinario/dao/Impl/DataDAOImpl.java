package es.enbinario.dao.Impl;

import org.springframework.stereotype.Repository;

import es.enbinario.dao.DataDAO;
import es.enbinario.model.EmployeeModel;

@Repository("dataDAOImpl")
public class DataDAOImpl extends BaseDAOImpl<EmployeeModel, Long> implements DataDAO {

	public DataDAOImpl() {
		super();
//		setMyClass(EmployeeModel.class);
	}

	public EmployeeModel getRowById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
