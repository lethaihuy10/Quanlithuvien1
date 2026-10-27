import java.util.Scanner;
import java.time.LocalDate;

public class quanlisach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
        System.out.print("Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = scanner.nextLine();

        // Lấy năm hiện tại tự động
        int namHienTai = LocalDate.now().getYear();
        int namXuatBan;
        do {
            System.out.print("Nhập năm xuất bản (phải nhỏ hơn " + namHienTai + "): ");
            namXuatBan = scanner.nextInt();
            if (namXuatBan >= namHienTai) {
                System.out.println("Lỗi: Năm xuất bản phải nhỏ hơn năm hiện tại (" + namHienTai + "). Vui lòng nhập lại!");
            }
        } while (namXuatBan >= namHienTai);

        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n=== KẾT QUẢ QUẢN LÝ SÁCH ===");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("-----------------------------------");
        System.out.println("Thành tiền: " + thanhTien);
        System.out.println("Phí vận chuyển (5%): " + phiVanChuyen);
        System.out.println("Tổng tiền nhập kho: " + tongTienNhap);

        scanner.close();
    }
}