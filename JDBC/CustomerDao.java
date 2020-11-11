package JDBCAssignment;
import java.util.List;
import java.util.Optional;

public interface CustomerDao 
{
	
	   public void addCustomer(Customer customer);
	    public void delCustomer(int id);
	    public void updateCustomer(int id, double purchase_capacity);
	    public List<Customer> getAllCustomer();
	    public Optional<Customer> getCustomerById(int id);
	    public List<Customer> getSelectedCustomer(double purchase_capacity);
	



}

