package exchange;

public class Exchange {
	 final double USD = 30.72;
	    final double EURO = 41.89;
	    final double YEN = 36.97;
	    final double POUND = 48.34;

	    public double exchangeUSD(double amount) {
	        return USD * amount;
	    }

	    public double exchangeEURO(double amount) {
	        return EURO * amount;
	    }

	    public double exchangeYEN(double amount) {
	        return YEN * amount;
	    }

	    public double exchangePOUND(double amount) {
	        return POUND * amount;
	    }


}
