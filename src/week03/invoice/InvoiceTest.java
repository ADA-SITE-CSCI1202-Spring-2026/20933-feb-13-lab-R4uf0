package week03.invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("P001", "testItem1", 23, 4567.89);
        System.out.println(invoice1);
        Invoice invoice2 = new Invoice("P002", "testItem2", -43, -3256.54);
        System.out.println(invoice2);
    }
}
