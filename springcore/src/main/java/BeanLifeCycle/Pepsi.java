package BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {

	//bean life cycles using Interfaces
	
	
	public int PriceProduct;

	@Override
	public String toString() {
		return "Pepsi [PriceProduct=" + PriceProduct + "]";
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(int priceProduct) {
		super();
		PriceProduct = priceProduct;
	}

	public int getPriceProduct() {
		return PriceProduct;
	}

	public void setPriceProduct(int priceProduct) {
		PriceProduct = priceProduct;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//INIT
		
		System.out.println(" Bean is Initalize");
		
	}
   
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//destroy
		
		System.out.println("Bean is destroyed");
		
	}

	

}
