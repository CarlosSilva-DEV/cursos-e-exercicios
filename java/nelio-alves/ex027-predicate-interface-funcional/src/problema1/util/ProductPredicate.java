package problema1.util;

import java.util.function.Predicate;

import problema1.entities.Product;

public class ProductPredicate implements Predicate<Product> {
	
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}
	
}
