public class TestInvoiceItem 
{
	public static void main(String[] args) 
	{
	      // Test constructor and toString()
	  
	      InvoiceItem invc1=new InvoiceItem("NEWREC123","JIO RECHARGE",3,299);
	      
	      System.out.println("ID : " + invc1.getId());
	      System.out.println("Description : " + invc1.getDesc());
	      System.out.println("Quantity : " + invc1.getQty());
	      System.out.println("Unit Price : " + invc1.getUnitPrice());
	      System.out.println("Total : " + invc1.getTotal());
	      System.out.println("-------------" );
	      invc1.setUnitPrice(299);
	      System.out.println("Total : " + invc1.getTotal());
	      System.out.println("-------------" );
	      System.out.println(invc1);	     
	 }
}