package BeanLifeCycle;

public class Samosa {
	
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Samosa(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void inti()
	{
		System.out.println("Initialisinzation of bean started ");
		
	}
	public void destroy()
	{
		System.out.println("destroying the bean");
	}


}
