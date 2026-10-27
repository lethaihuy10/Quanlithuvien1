import java.util.Scanner;

public class quanlicacsach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhập giá sách: ");
        double gia = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = scanner.nextInt();

        // Bài 1: Kiểm tra giá > 0, số lượng >= 0, năm xuất bản hợp lệ (ví dụ <= 2026)
        System.out.println("\n--- KẾT QUẢ BÀI 1: KIỂM TRA HỢP LỆ ---");
        if (gia > 0 && soLuong >= 0 && namXuatBan <= 2026) {
            System.out.println("Thông tin sách hợp lệ!");
        } else {
            System.out.println("Thông tin sách không hợp lệ! Vui lòng kiểm tra lại giá, số lượng hoặc năm xuất bản.");
        }

        // Bài 2: Phân loại giá
        System.out.println("\n--- KẾT QUẢ BÀI 2: PHÂN LOẠI GIÁ ---");
        if (gia < 50000) {
            System.out.println("Sách giá thấp");
        } else if (gia >= 50000 && gia <= 100000) {
            System.out.println("Sách giá trung bình");
        } else if (gia > 100000 && gia <= 200000) {
            System.out.println("Sách giá cao");
        } else {
            System.out.println("Sách giá đặc biệt");
        }

        scanner.close();
    }
}