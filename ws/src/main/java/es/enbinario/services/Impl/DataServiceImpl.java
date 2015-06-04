package es.enbinario.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.enbinario.dao.DataDAO;
import es.enbinario.model.EmployeeModel;
import es.enbinario.services.DataService;


@Service
@Transactional(readOnly=true)
public class DataServiceImpl implements DataService {
	
	@Autowired
	@Qualifier("dataDAOImpl")
	DataDAO dataDao;

	public EmployeeModel getRowById(long id) {
		return dataDao.getRowById(id);
	}

}