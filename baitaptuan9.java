import java.util.ArrayList;

// Lớp cha: Sach
class Sach {
    protected String maSach;
    protected int soLuong;
    protected double donGia;

    public Sach() {
    }

    public Sach(String maSach, int soLuong, double donGia) {
        this.maSach = maSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void Inthongtinsach() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("So Luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
    }
}

// Lớp con 1: Sachgiaokhoa
class Sachgiaokhoa extends Sach {
    private String tinhTrang;

    public Sachgiaokhoa() {
    }

    public Sachgiaokhoa(String tinhTrang, String maSach, int soLuong, double donGia) {
        super(maSach, soLuong, donGia);
        this.tinhTrang = tinhTrang;
    }

    public double Thanhtien() {
        if (tinhTrang.equalsIgnoreCase("Moi") || tinhTrang.equalsIgnoreCase("Mới")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

    @Override
    public void Inthongtinsach() {
        super.Inthongtinsach();
        System.out.println("Tinh trang sach: " + tinhTrang);
    }
}

// Lớp con 2: Sachthamkhao
class Sachthamkhao extends Sach {
    private double thue;

    public Sachthamkhao() {
    }

    public Sachthamkhao(double thue, String maSach, int soLuong, double donGia) {
        super(maSach, soLuong, donGia);
        this.thue = thue;
    }

    public double Thanhtien() {
        return (soLuong * donGia) + thue;
    }

    @Override
    public void Inthongtinsach() {
        super.Inthongtinsach();
        System.out.println("Thue: " + thue);
    }
}

// Lớp chính chạy chương trình
public class baitaptuan9 {
    public static void main(String[] args) {
        System.out.println("--- KIỂM TRA TÍNH KẾ THỪA & ĐA HÌNH (TUẦN 9) ---");
        
        Sachgiaokhoa sgk = new Sachgiaokhoa("Moi", "001", 2, 20000);
        sgk.Inthongtinsach();
        System.out.println("Thanh tien: " + sgk.Thanhtien());
        
        System.out.println("-----------------------------------");
        
        Sachthamkhao stk = new Sachthamkhao(0.2, "002", 3, 30000);
        stk.Inthongtinsach();
        System.out.println("Thanh tien: " + stk.Thanhtien());
    }
}