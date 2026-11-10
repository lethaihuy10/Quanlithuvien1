import java.util.ArrayList;

class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public void setMaSach(String maSach) { this.maSach = maSach; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }
    public void setNamXuatBan(int namXuatBan) { this.namXuatBan = namXuatBan; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }

    public String getMaSach() { return maSach; }
    public String getTieuDe() { return tieuDe; }
    public String getTacGia() { return tacGia; }
    public int getNamXuatBan() { return namXuatBan; }
    public int getSoLuong() { return soLuong; }

    public void inthongtinsach() {
        System.out.println("Mã sách: " + maSach + 
                           " | Tiêu đề: " + tieuDe + 
                           " | Tác giả: " + tacGia + 
                           " | Năm XB: " + namXuatBan + 
                           " | Số lượng: " + soLuong);
    }
}

public class bt7 {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachThuVien = new ArrayList<>();

        // 1. Sách Toán
        Sach sachToan = new Sach();
        sachToan.setMaSach("001");
        sachToan.setTieuDe("Gia tich");
        sachToan.setTacGia("Nguyen Van A");
        sachToan.setNamXuatBan(2023);
        sachToan.setSoLuong(5);
        danhSachThuVien.add(sachToan);

        // 2. Sách Vật Lý
        Sach sachLy = new Sach();
        sachLy.setMaSach("002");
        sachLy.setTieuDe("Vat ly dai cuong");
        sachLy.setTacGia("Tran Van B");
        sachLy.setNamXuatBan(2022);
        sachLy.setSoLuong(3);
        danhSachThuVien.add(sachLy);

        // 3. Sách Hóa Học
        Sach sachHoa = new Sach();
        sachHoa.setMaSach("003");
        sachHoa.setTieuDe("Hoa dai cuong");
        sachHoa.setTacGia("Le Van C");
        sachHoa.setNamXuatBan(2024);
        sachHoa.setSoLuong(4);
        danhSachThuVien.add(sachHoa);

        // In danh sách
        System.out.println("--- DANH SÁCH SÁCH TRONG THƯ VIỆN (OOP & ArrayList) ---");
        for (int i = 0; i < danhSachThuVien.size(); i++) {
            System.out.print((i + 1) + ". ");
            danhSachThuVien.get(i).inthongtinsach();
        }
    }
}