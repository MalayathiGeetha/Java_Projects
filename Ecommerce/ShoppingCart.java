import java.util.*;
class ShoppingCart{
	private List<Product> cartItems;
	public ShoppingCart(){
		cartItems=new ArrayList<>();
	}

	public void addItem(Product product){
		cartItems.add(product);
		System.out.println(product.getName()+"has been added into the cart successfully!!");
	}
	public void viewCart(){
		if(cartItems.isEmpty()){
			System.out.println("Cart has no items");
		}else{
			System.out.println("Cart details:");
			for(Product product:cartItems){
				System.out.println(product);
			}
		}
	}
	public double cartPrice(){
		double amt=0;
		for(Product product:cartItems){
			amt=amt+product.getPrice();
		}
		return amt;
	}
}