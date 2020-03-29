package btdex.markets;

import java.util.HashMap;

public class MarketDOGE extends MarketCrypto {
	
	public String toString() {
		return "DOGE";
	}
	
	@Override
	public long getID() {
		return MARKET_DOGE;
	}
	
	
	@Override
	public void validate(HashMap<String, String> fields) throws Exception {
		super.validate(fields);
		
		String addr = fields.get(ADDRESS);
		
		if(!BTCAddrValidator.validate(addr, BTCAddrValidator.DOGE_HEADERS))
			throw new Exception(addr + " is not a valid DOGE address");
	}
}
