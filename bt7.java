import java.util.ArrayList;
import java.time.Year; 

class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);       
    }

    
    public void setMaSach(String maSach) { this.maSach = maSach; }
    public void setTieuDe(String tieuDe) { this.tieuDe = tieuDe; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }
    
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue(); 
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Lỗi: Năm xuất bản không hợp lệ!");
        }
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Lỗi: Số lượng không được âm!");
        }
    }

  
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

        danhSachThuVien.add(new Sach("001", "Gia tich", "Nguyen Van A", 2023, 5));
        danhSachThuVien.add(new Sach("002", "Vat ly dai cuong", "Tran Van B", 2022, 3));
        danhSachThuVien.add(new Sach("003", "Hoa dai cuong", "Le Van C", 2024, 4));

        System.out.println("--- DANH SÁCH SÁCH TRONG THƯ VIỆN (TUẦN 8 - TÍNH ĐÓNG GÓI) ---");
        for (int i = 0; i < danhSachThuVien.size(); i++) {
            System.out.print((i + 1) + ". ");
            danhSachThuVien.get(i).inthongtinsach();
        }
    }
}