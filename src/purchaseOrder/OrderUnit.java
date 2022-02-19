package purchaseOrder;

public class OrderUnit {
	static int metre = 1;
	static int kup = 1;
	static int kg = 1;
	static int box = 1;
	

	public static void main(String[] args) {
		OrderUnit orderunit = new OrderUnit();
		
		orderunit.box = orderunit.kg *10 ;
		
		
	}

}
