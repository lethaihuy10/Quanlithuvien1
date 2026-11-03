import java.util.ArrayList;
import java.util.Scanner;

public class BaiThucHanhTuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        ArrayList<String> danhSachSach = new ArrayList<>();
        ArrayList<Double> danhSachGia = new ArrayList<>();
        ArrayList<Integer> danhSachSoLuong = new ArrayList<>();

        int luaChon;

   
        do {
            System.out.println("\n================ MENU QUẢN LÝ THƯ VIỆN (TUẦN 6) ================");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa thông tin sách");
            System.out.println("6. Tính tổng số lượng sách");
            System.out.println("7. Tính tổng giá trị sách");
            System.out.println("8. Thoát");
            System.out.print("Mời bạn chọn chức năng (1-8): ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); 

            if (luaChon == 1) {
                // Thêm sách
                System.out.print("Nhập tên sách cần thêm: ");
                String ten = scanner.nextLine();
                System.out.print("Nhập giá sách: ");
                double gia = scanner.nextDouble();
                System.out.print("Nhập số lượng sách: ");
                int sl = scanner.nextInt();
                scanner.nextLine();

                danhSachSach.add(ten);
                danhSachGia.add(gia);
                danhSachSoLuong.add(sl);
                System.out.println("=> Thêm sách thành công!");

            } else if (luaChon == 2) {
                // Hiển thị sách
                System.out.println("\n--- DANH SÁCH CÁC CUỐN SÁCH TRONG THƯ VIỆN ---");
                if (danhSachSach.isEmpty()) {
                    System.out.println("Thư viện hiện đang trống!");
                } else {
                    // Sử dụng vòng lặp for để duyệt danh sách
                    for (int i = 0; i < danhSachSach.size(); i++) {
                        System.out.println((i + 1) + ". Tên: " + danhSachSach.get(i) 
                            + " | Giá: " + danhSachGia.get(i) 
                            + " | Số lượng: " + danhSachSoLuong.get(i));
                    }
                }

            } else if (luaChon == 3) {
            
                System.out.print("Nhập tên sách cần tìm: ");
                String tuKhoa = scanner.nextLine();
                boolean timThay = false;

                for (int i = 0; i < danhSachSach.size(); i++) {
                    if (danhSachSach.get(i).equalsIgnoreCase(tuKhoa)) {
                        System.out.println("=> Tìm thấy tại vị trí " + (i + 1) 
                            + ": Tên: " + danhSachSach.get(i) 
                            + " | Giá: " + danhSachGia.get(i) 
                            + " | Số lượng: " + danhSachSoLuong.get(i));
                        timThay = true;
                    }
                }
                if (!timThay) {
                    System.out.println("=> Không tìm thấy cuốn sách có tên: " + tuKhoa);
                }

            } else if (luaChon == 4) {
       
                System.out.print("Nhập vị trí (STT) của cuốn sách cần xóa: ");
                int stt = scanner.nextInt();
                scanner.nextLine();

                int index = stt - 1;
                if (index >= 0 && index < danhSachSach.size()) {
                    danhSachSach.remove(index);
                    danhSachGia.remove(index);
                    danhSachSoLuong.remove(index);
                    System.out.println("=> Đã xóa sách thành công!");
                } else {
                    System.out.println("=> Vị trí không hợp lệ!");
                }

            } else if (luaChon == 5) {
                // Sửa thông tin sách
                System.out.print("Nhập vị trí (STT) của cuốn sách cần sửa: ");
                int stt = streamlit = scanner.nextInt(); 
                scanner.nextLine();
                int index = stt - 1;

                if (index >= 0 && index < danhSachSach.size()) {
                    System.out.print("Nhập tên sách mới: ");
                    String tenMoi = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double giaMoi = scanner.nextDouble();
                    System.out.print("Nhập số lượng mới: ");
                    int slMoi = scanner.nextInt();
                    scanner.nextLine();

                    danhSachSach.set(index, tenMoi);
                    danhSachGia.set(index, giaMoi);
                    danhSachSoLuong.set(index, slMoi);
                    System.out.println("=> Cập nhật thông tin sách thành công!");
                } else {
                    System.out.println("=> Vị trí không hợp lệ!");
                }

            } else if (luaChon == 6) {
                // Tính tổng số lượng
                int tongSL = 0;
                for (int sl : danhSachSoLuong) {
                    tongSL += sl;
                }
                System.out.println("=> Tổng số lượng sách trong kho: " + tongSL);

            } else if (luaChon == 7) {
                // Tính tổng giá trị (Giá * Số lượng)
                double tongTien = 0;
                for (int i = 0; i < danhSachSach.size(); i++) {
                    tongTien += (danhSachGia.get(i) * danhSachSoLuong.get(i));
                }
                System.out.println("=> Tổng giá trị toàn bộ kho sách: " + tongTien + " VNĐ");

            } else if (luaChon == 8) {
                System.out.println("Đang thoát chương trình. Tạm biệt!");
            } else {
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 8.");
            }

        } while (luaChon != 8);

        scanner.close();
    }
}