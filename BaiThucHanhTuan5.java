import java.util.Scanner;

public class BaiThucHanhTuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int luaChon; // Biến lưu lựa chọn của người dùng trong menu

        // Các biến lưu thông tin tổng quát cho toàn bộ chương trình
        int tongSoLuong = 0;
        double tongGiaTri = 0;
        int n = 0; // Số lượng sách nhập vào

        // Biến lưu tên sách nhập sau cùng để hỗ trợ Bài 4 (Tìm kiếm)
        String tenSachLuu = "";
        double giaLuu = 0;

        // BÀI 3: Vòng lặp do-while giữ cho menu chạy liên tục cho đến khi chọn 0 (Thoát)
        do {
            System.out.println("\n================ MENU THỰC HÀNH TUẦN 5 ================");
            System.out.println("1. Bài 1 & 2: Nhập danh sách n cuốn sách & Tính tổng");
            System.out.println("3. Bài 3: Kiểm tra trạng thái Menu lặp");
            System.out.println("4. Bài 4: Tìm sách theo tên/thông tin");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (0-4): ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng dư thừa

            // Sử dụng các câu lệnh điều kiện cơ bản để xử lý lựa chọn
            if (luaChon == 1) {
                System.out.print("\nNhập số lượng sách (n) cần thêm vào hệ thống: ");
                n = scanner.nextInt();
                scanner.nextLine();

                // Đặt lại các giá trị tích lũy
                tongSoLuong = 0;
                tongGiaTri = 0;

                // BÀI 1: Sử dụng vòng lặp for để nhập n cuốn sách
                for (int i = 1; i <= n; i++) {
                    System.out.println("\n--- Nhập cuốn sách thứ " + i + " ---");
                    
                    System.out.print("Tên sách: ");
                    String tenSach = scanner.nextLine();

                    System.out.print("Giá sách: ");
                    double gia = scanner.nextDouble();

                    System.out.print("Số lượng: ");
                    int soLuong = scanner.nextInt();

                    System.out.print("Năm xuất bản: ");
                    int namXuatBan = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ dòng trống

                    // Kiểm tra điều kiện hợp lệ
                    if (gia > 0 && soLuong >= 0 && namXuatBan <= 2026) {
                        System.out.println("=> Nhập thành công!");
                        
                        // BÀI 2: Tính tổng số lượng và tổng giá trị
                        tongSoLuong += soLuong;
                        tongGiaTri += (gia * soLuong);

                        // Lưu thông tin cuốn sách cuối cùng để phục vụ tìm kiếm ở Bài 4
                        tenSachLuu = tenSach;
                        giaLuu = gia;
                    } else {
                        System.out.println("=> Dữ liệu nhập không hợp lệ (Giá > 0, Số lượng >= 0, Năm XB <= 2026). Cuốn sách này bị bỏ qua!");
                    }
                }

                // Hiển thị kết quả Bài 2
                System.out.println("\n--- BÀI 2: KẾT QUẢ THỐNG KÊ ---");
                System.out.println("Tổng số lượng sách nhập hợp lệ: " + tongSoLuong);
                System.out.println("Tổng giá trị toàn bộ kho sách: " + tongGiaTri + " VNĐ");

            } else if (luaChon == 3) {
                // BÀI 3: Xác nhận vòng lặp menu do-while
                System.out.println("\n--- BÀI 3: KIỂM TRA MENU ---");
                System.out.println("Menu vẫn đang hoạt động lặp liên tục thông qua vòng lặp do-while.");

            } else if (luaChon == 4) {
                // BÀI 4: Tìm sách
                System.out.println("\n--- BÀI 4: TÌM SÁCH THƯ VỆN ---");
                if (n == 0) {
                    System.out.println("Chưa có sách nào trong thư viện. Vui lòng thực hiện Bài 1 trước!");
                } else {
                    System.out.print("Nhập tên sách cần tìm: ");
                    String tuKhoa = scanner.nextLine();

                    // So sánh từ khóa nhập vào với sách trong dữ liệu
                    if (tuKhoa.equalsIgnoreCase(tenSachLuu)) {
                        System.out.println("=> TÌM THẤY: Sách '" + tenSachLuu + "' với giá " + giaLuu + " VNĐ.");
                    } else {
                        System.out.println("=> KHÔNG TÌM THẤY sách có tên: " + tuKhoa);
                    }
                }

            } else if (luaChon == 0) {
                System.out.println("\nĐã thoát chương trình thành công. Tạm biệt!");
            } else {
                System.out.println("\nLựa chọn không hợp lệ! Vui lòng chọn số từ 0 đến 4.");
            }

        } while (luaChon != 0); // Vòng lặp dừng lại khi luaChon = 0

        scanner.close();
    }
}