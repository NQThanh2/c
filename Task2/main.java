package Task2;

import java.util.Map;

public class main {
	public static void main(String[] args) {
        NLU DanhMuc = new NLU();

        TapChi tc1 = new TapChi("Khoa học tự nhiên", 50, 2014, "Nguyen Van A", 20000, "KhoaHocVN");
        TapChi tc2 = new TapChi("Văn hóa xã hội", 40, 2024, "Le Thi B", 18000, "VanHoaVN");

        SachThamKhao st1 = new SachThamKhao("Giải phẫu học", 300, 2020, "Dr. Truong", 150000, "Y học",
        		new ChuongSach("Chương 1: Tổng quan", 20),
        		new ChuongSach("Chương 2: Chi tiết cơ thể", 100));
        SachThamKhao st2 = new SachThamKhao("Giáo dục thể chất", 200, 2019, "Mr. Nam", 100000, "Thể thao",
        		new ChuongSach("Chương 1: Lợi ích sức khỏe", 30),
        		new ChuongSach("Chương 2: Kỹ thuật tập luyện", 80),
        		new ChuongSach("Chương 3: ", 0));

        DanhMuc.Add(tc1);
        DanhMuc.Add(tc2);
        DanhMuc.Add(st1);
        DanhMuc.Add(st2);

        System.out.println("/////////////////// 6 ///////////////////");
        System.out.println("Tổng tiền: " + DanhMuc.tinhTongTien());

        System.out.println("/////////////////// 7 ///////////////////");
        System.out.println("Tìm sách tham khảo có chương nhiều nhất: " + DanhMuc.timChuongNhieuTrangNhat().getTieuDe());
        
        System.out.println("//////////////////// 8 ////////////////////");
        System.out.println("Có tạp chí tên 'KhoaHocVN': " + DanhMuc.coTapChiTen("KhoaHocVN"));
        
        System.out.println("///////////////////// 9 ///////////////////");
        System.out.println("Tạp chí xuất bản năm 2024: " + DanhMuc.layTapChiTheoNam(2024));

        System.out.println("///////////////////// 10 ////////////////////");
        System.out.println("Sắp xếp ấn phẩm:");
        DanhMuc.sapXepAnPham();
        for (AnPham ap : DanhMuc.getDanhSach()) {
            System.out.println(ap.getTieuDe() + " - " + ap.getNamXB());
        }
        
        System.out.println("//////////////////// 11 ///////////////////");
        System.out.println("Thống kê ấn phẩm theo năm xuất bản:");
        Map<Integer, Integer> thongKe = DanhMuc.thongKeTheoNamXuatBan();
        for (Map.Entry<Integer, Integer> entry : thongKe.entrySet()) {
            System.out.println("Năm " + entry.getKey() + ": " + entry.getValue() + " ấn phẩm");
        }
    }
}
