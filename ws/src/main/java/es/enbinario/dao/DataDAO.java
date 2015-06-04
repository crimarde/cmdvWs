package es.enbinario.dao;

import es.enbinario.model.EmployeeModel;

public interface DataDAO {

	public EmployeeModel getRowById(long id);

}
