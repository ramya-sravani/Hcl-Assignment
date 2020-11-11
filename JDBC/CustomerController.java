package JDBCAssignment;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Optional;



public class CustomerController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionFactory.getConnection();
		if (connection != null)
			System.out.println("sucess");

		CustomerDao dao = new CustomerDaoImpl();

// add customer
		
		/*
		 * Customer customer=new Customer(5,"sathish", "8464964782", "sat@gmail.com",
		 * new Date(),"sklm",7550000); dao.addCustomer(customer);
		 * System.out.println("---------------");
		 */
		 
// Delete the customer

		/*
		 * dao.delCustomer(5);
		 */
		
		  
// update the customer
		/*
		 * dao.updateCustomer(4,200000); System.out.println("updated.....");
		 * 
		 * 
		 */
		
		  
// print all the customers

		/*
		 * List<Customer>customers=dao.getAllCustomer(); customers.forEach(c->
		 * System.out.println(c));
		 * 
		 * 
		 */

// get customer by id

		System.out.println(dao.getCustomerById(3));

// get selected customer

		List<Customer> customers = dao.getSelectedCustomer(500000);
		customers.forEach(c -> System.out.println(c));

	}

}

