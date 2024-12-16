package Task2;

public class TapChi extends AnPham {
	private String TenTapChi;

	public TapChi(String tieuDe, int soTrang, int namXB, String tacGia, double giaTien, String tenTapChi) {
		super(tieuDe, soTrang, namXB, tacGia, giaTien);
		TenTapChi = tenTapChi;
	}

	
	public String getTenTapChi() {
		return TenTapChi;
	}


	public void setTenTapChi(String tenTapChi) {
		TenTapChi = tenTapChi;
	}


	@Override
	public String LoaiAnPham() {
		// TODO Auto-generated method stub
		return "Tạp Chí";
	}


	@Override
	public String toString() {
		return "TapChi [TenTapChi=" + TenTapChi + "]";
	}
	
	
}
