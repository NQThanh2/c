package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NLU {
	private List<AnPham> DanhSach;

	public NLU(List<AnPham> danhSach) {
		super();
		DanhSach = danhSach;
	}
	public NLU() {
        DanhSach = new ArrayList<>();
    }
	public void Add(AnPham anpham) {
		DanhSach.add(anpham);
	}
	

	//// 6
	public double tinhTongTien() {
        double tong = 0;
        for (AnPham ap : DanhSach) {
            tong += ap.getGiaTien();
        }
        return tong;
    }
	/// 7
	public SachThamKhao timChuongNhieuTrangNhat() {
	    SachThamKhao maxSach = null;
	    ChuongSach maxChuong = null;

	    for (AnPham ap : DanhSach) {
	        if (ap instanceof SachThamKhao) {
	            SachThamKhao sach = (SachThamKhao) ap;
	            ChuongSach chuongMax = sach.timChuongNhieuTrangNhat();

	            if (chuongMax != null) {
	                if (maxChuong == null || chuongMax.getSoTrang() > maxChuong.getSoTrang()) {
	                    maxChuong = chuongMax;
	                    maxSach = sach;
	                }
	            }
	        }
	    }
	    return maxSach;
	}
	/// 8
	public boolean coTapChiTen(String tenTapChi) {
        for (AnPham ap : DanhSach) {
            if (ap instanceof TapChi) {
                TapChi tc = (TapChi) ap;
                if (tc.getTenTapChi().equals(tenTapChi)) {
                    return true;
                }
            }
        }
        return false;
    }
	// 9 
	public List<TapChi> layTapChiTheoNam(int nam) {
	    List<TapChi> tapChiTheoNam = new ArrayList<>();
	    for (AnPham ap : DanhSach) {
	        if (ap instanceof TapChi) {
	            TapChi tc = (TapChi) ap;
	            if (tc.getNamXB() == nam) {
	                tapChiTheoNam.add(tc);
	            }
	        }
	    }
	    return tapChiTheoNam;
	}
	public void sapXepAnPham() {
        Collections.sort(DanhSach, new Comparator<AnPham>() {
            @Override
            public int compare(AnPham o1, AnPham o2) {
                int cmp = o1.getTieuDe().compareTo(o2.getTieuDe());
                if (cmp == 0) {
                    return o2.getNamXB() - o1.getNamXB();
                }
                return cmp;
            }
        });
    }
	public Map<Integer, Integer> thongKeTheoNamXuatBan() {
        Map<Integer, Integer> thongKe = new HashMap<>();
        for (AnPham ap : DanhSach) {
            int nam = ap.getNamXB();
            if (thongKe.containsKey(nam)) {
                thongKe.put(nam, thongKe.get(nam) + 1);
            } else {
                thongKe.put(nam, 1);
            }
        }
        return thongKe;
    }
	public List<AnPham> getDanhSach() {
		return DanhSach;
	}
	public static void main(String[] args) {
        NLU DanhMuc = new NLU();

        // Tạo tạp chí
        TapChi tc1 = new TapChi("Khoa học tự nhiên", 50, 2014, "Nguyen Van A", 20000, "KhoaHocVN");
        TapChi tc2 = new TapChi("Văn hóa xã hội", 40, 2024, "Le Thi B", 18000, "VanHoaVN");

        // Tạo sách tham khảo
        SachThamKhao st1 = new SachThamKhao("Giải phẫu học", 300, 2020, "Dr. Truong", 150000, "Y học",
        		new ChuongSach("Chương 1: Tổng quan", 20),
        		new ChuongSach("Chương 2: Chi tiết cơ thể", 100));

        SachThamKhao st2 = new SachThamKhao("Giáo dục thể chất", 200, 2019, "Mr. Nam", 100000, "Thể thao",
        		new ChuongSach("Chương 1: Lợi ích sức khỏe", 30),
        		new ChuongSach("Chương 2: Kỹ thuật tập luyện", 80));

        DanhMuc.Add(tc1);
        DanhMuc.Add(tc2);
        DanhMuc.Add(st1);
        DanhMuc.Add(st2);

        // Test các chức năng
        System.out.println("Tổng tiền: " + DanhMuc.tinhTongTien());

//        System.out.println("Tìm sách có chương nhiều trang nhất: " + DanhMuc.timChuongNhieuTrangNhat());

        System.out.println("Có tạp chí tên 'KhoaHocVN': " + DanhMuc.coTapChiTen("KhoaHocVN"));

//        System.out.println("Tạp chí xuất bản năm 2024: " + DanhMuc.layTapChiTheoNam(2024));

        System.out.println("Sắp xếp ấn phẩm:");
        DanhMuc.sapXepAnPham();
    }
}
