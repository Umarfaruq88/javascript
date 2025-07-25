package lab07;

public class Invoice {
	    private String partNumber;
	    private String partDescription;
	    private int quantity;
	    private double pricePerItem;

	    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
	        this.partNumber = partNumber;
	        this.partDescription = partDescription;
	        setQuantity(quantity);          // use setter to enforce validation
	        setPricePerItem(pricePerItem);  // use setter to enforce validation
	    }

	    public void setPartNumber(String partNumber) {
	        this.partNumber = partNumber;
	    }

	    public String getPartNumber() {
	        return partNumber;
	    }

	    public void setPartDescription(String partDescription) {
	        this.partDescription = partDescription;
	    }

	    public String getPartDescription() {
	        return partDescription;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = (quantity > 0) ? quantity : 0;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setPricePerItem(double pricePerItem) {
	        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
	    }

	    public double getPricePerItem() {
	        return pricePerItem;
	    }

	    public double getInvoiceAmount() {
	        return quantity * pricePerItem;
	    }
	}
