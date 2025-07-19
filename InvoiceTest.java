package lab07;

public class InvoiceTest {
	    public static void main(String[] args) {
	        // Create invoice objects
	        Invoice invoice1 = new Invoice("1234", "Hammer", 2, 14.95);
	        Invoice invoice2 = new Invoice("5678", "Paint Brush", -5, -9.99);

	        // Print initial invoice details
	        System.out.println("Initial Invoice Information:");
	        printInvoice(invoice1);
	        printInvoice(invoice2);

	        // Update invoice1 and invoice2
	        invoice1.setPartNumber("001234");
	        invoice1.setPartDescription("Yellow Hammer");
	        invoice1.setQuantity(3);
	        invoice1.setPricePerItem(19.49);

	        invoice2.setQuantity(3);
	        invoice2.setPricePerItem(9.49);

	        // Print updated invoice details
	        System.out.println("\nUpdated Invoice Information:");
	        printInvoice(invoice1);
	        printInvoice(invoice2);
	    }

	    public static void printInvoice(Invoice invoice) {
	        System.out.printf("Part Number: %s%n", invoice.getPartNumber());
	        System.out.printf("Description: %s%n", invoice.getPartDescription());
	        System.out.printf("Quantity: %d%n", invoice.getQuantity());
	        System.out.printf("Price per Item: $%.2f%n", invoice.getPricePerItem());
	        System.out.printf("Invoice Amount: $%.2f%n%n", invoice.getInvoiceAmount());
	    }
	}


