package oneLevShop;

import java.math.BigDecimal;

interface Buyable {
	 BigDecimal getPrice(); // to be more difficult I changed double to BigDecimal that is better type for money
	 int getQuantity();
	
}
