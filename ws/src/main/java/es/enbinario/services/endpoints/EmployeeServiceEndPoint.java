package es.enbinario.services.endpoints;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import es.enbinario.model.EmployeeModel;
import es.enbinario.services.DataService;
import es.enbinario.webservices.employee.Employee;
import es.enbinario.webservices.employeeservice.EmployeeDetailsRequest;
import es.enbinario.webservices.employeeservice.EmployeeDetailsResponse;

@Endpoint
public class EmployeeServiceEndPoint {
 
	private static final String TARGET_NAMESPACE = "http://es/enbinario/webservices/employeeservice";
   
	@Autowired 
	private DataService dataservice; 
  
	@PayloadRoot(localPart = "EmployeeDetailsRequest", namespace = TARGET_NAMESPACE)  
	public @ResponsePayload EmployeeDetailsResponse getAccountDetails(@RequestPayload EmployeeDetailsRequest request) {  
		System.out.println("Entro al metodo");  
		EmployeeDetailsResponse response = new EmployeeDetailsResponse();  
     
		System.out.println(request.getEmployeeId());  
		EmployeeModel employeeModel = dataservice.getRowById(Long.parseLong(request.getEmployeeId()));  
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeModel, employee);
		System.out.println("Encuentro " + employee.getFistName());
		response.setEmployeeDetails(employee);  
		System.out.println("salgo del metodo");  
		return response;  
 }  
  
}