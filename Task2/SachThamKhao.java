package Task2;

import java.util.Arrays;
import java.util.List;

public class SachThamKhao extends AnPham {
	private String LinhVuc;
	private List<ChuongSach> Chuong;
	public SachThamKhao(String tieuDe, int soTrang, int namXB, String tacGia, double giaTien, String linhVuc,
			List<ChuongSach> chuong) {
		super(tieuDe, soTrang, namXB, tacGia, giaTien);
		LinhVuc = linhVuc;
		this.Chuong = chuong;
	}
	public SachThamKhao(String tieuDe, int soTrang, int namXB, String tacGia, double giaTien, String linhVuc, ChuongSach... chuong) {
        super(tieuDe, soTrang, namXB, tacGia, giaTien);
        this.LinhVuc = linhVuc;
        this.Chuong = Arrays.asList(chuong);
    }

	@Override
	public String LoaiAnPham() {
		// TODO Auto-generated method stub
		return "Sách Tham Khảo";
	}
	//// 7
	public ChuongSach timChuongNhieuTrangNhat() {
        ChuongSach maxChuong = Chuong.get(0);
        for (ChuongSach chuongsach : Chuong) {
            if (chuongsach.getSoTrang() > maxChuong.getSoTrang()) {
                maxChuong = chuongsach;
            }
        }
        return maxChuong;
    }

}
