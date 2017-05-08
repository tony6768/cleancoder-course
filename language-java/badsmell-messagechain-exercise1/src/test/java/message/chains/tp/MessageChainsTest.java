package message.chains.tp;


import org.junit.Assert;
import org.junit.Test;

public class MessageChainsTest {
	
	
	@Test
	public void testPrixDansUnPaysEuropeen() {
		Country country = new Country(true);
		Address address = new Address(country );
		Customer customer1= new Customer(address);
		Invoice invoice = new Invoice(customer1);
		
		InvoiceItem invoiceItem = new InvoiceItem("item1", 10, 5);
		invoice.addItem(invoiceItem );
		
		Assert.assertEquals(50, invoice.getTotalPrice(), 0.1);
	}
	
	@Test
	public void testPrixDansUnPaysNonEuropeen() {
		Country country = new Country(false);
		Address address = new Address(country );
		Customer customer1= new Customer(address);
		Invoice invoice = new Invoice(customer1);
		
		InvoiceItem invoiceItem = new InvoiceItem("item1", 10, 5);
		invoice.addItem(invoiceItem );
		
		Assert.assertEquals(60, invoice.getTotalPrice(), 0.1);
	}

}
