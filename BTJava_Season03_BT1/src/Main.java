import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========== NHẬP THÔNG TIN HÓA ĐƠN ===========");
        System.out.print("Nhập tên khách hàng: ");
        String customerName = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số lượng mua: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Khách có thẻ thành viên? (true/false): ");
        boolean isMember = sc.nextBoolean();
        int subTotal = price * quantity;
        int discount = isMember ? subTotal / 10 : 1;
        int vat = (subTotal - discount) * 8 /100;
        int total = subTotal - discount + vat;

        System.out.println("\n=========== HÓA ĐƠN ===========");
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Sản phẩm : " + productName);
        System.out.println("Số lượng : " + quantity);
        System.out.println("Đơn giá  : " + price + " VND");
        System.out.println("Thành tiền: " + subTotal + " VND");
        System.out.println("Giảm giá: " + discount + " VND");
        System.out.println("Tiền VAT (8%): " + vat + " VND");
        System.out.println("Tổng tiền thanh toán: " + total + " VND");
    }
}
