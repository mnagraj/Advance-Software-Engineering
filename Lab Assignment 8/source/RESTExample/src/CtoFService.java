/**
 * @author ry6d3
 *
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
 
@Path("/ctofservice")
public class CtoFService {
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
 
		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;
 
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
	public String convertMtoK() {
		 
		Double kilometers;
		Double miles = 20.00;
		kilometers = miles*1.61;
 
		String result = "@Produces(\"application/xml\") Output: \n\nMiles to Km Converter Output: \n\n" + miles;
		return "<ctofservice>" + "<celsius>" + miles + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
	
	public String convertInrtoDollar() {
		 
		Double Dollars;
		Double Inr = 36.8;
		Dollars = Inr/66;
 
		String result = "@Produces(\"application/xml\") Output: \n\nInr to Dollars Converter Output: \n\n" + Dollars;
		return "<ctofservice>" + "<celsius>" + Inr + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
	}
	
}