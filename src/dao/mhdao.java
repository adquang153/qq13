package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import bean.mhbean;
import bean.svbean;


public class mhdao {
	DungChung dc = new DungChung();
	public ArrayList<mhbean> getMh() throws Exception{
		ArrayList<mhbean> dsmh = new ArrayList<mhbean>();
		dc.KetNoi();
		String sql = "select * from MONHOC";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String mamh = rs.getString("MaMH");
			String tenmh = rs.getString("TenMH");
			int sotc = rs.getInt("SoTinChi");
			int sob = rs.getInt("SoBuoi");
			int sosvtt = rs.getInt("SoSVToiThieu");
			int sosvtd = rs.getInt("SoSVToiDa");
			int sosvdk = rs.getInt("SoSVDangKy");
			Date ngaynh = rs.getDate("NgayNhapHoc");
			Date ngayhh = rs.getDate("NgayHetHan");
			mhbean a = new mhbean(mamh, tenmh, sotc, sob, sosvtt, sosvtd, sosvdk, ngaynh, ngayhh);
			dsmh.add(a);
		}
		rs.close();
		dc.cn.close();
		return dsmh;
	}
	boolean KTMH(String mamh) throws SQLException {
		String sql = "select MaMH from MONHOC where MaMH=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, mamh);
		ResultSet rs = cmd.executeQuery();
		boolean kq = rs.next();
		rs.close();
		return kq;
	}
	public int themMh(mhbean mh) throws Exception {
		dc.KetNoi();
		if(KTMH(mh.getMamh())) return 0;
		String sql = "insert into MONHOC values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, mh.getMamh());
		cmd.setString(2, mh.getTenmh());
		cmd.setInt(3, mh.getSotc());
		cmd.setInt(4, mh.getSob());
		cmd.setInt(5, mh.getSosvtt());
		cmd.setInt(6, mh.getSosvtd());
		cmd.setInt(7, mh.getSosvdk());
		cmd.setDate(8, mh.getNgaynh());
		cmd.setDate(9, mh.getNgaynh());
		int kq = cmd.executeUpdate();
		//b5: truyen tham so
		//b6: cho thuc hien
		cmd.close();
		//b7: dong ket noi
		dc.cn.close();
		return 1;
	}
	public int suaMh(mhbean emh) throws Exception {
		dc.KetNoi();
		String sql = "update MONHOC set TenMH=?,SoTinChi=?,SoBuoi=?,SoSVToiThieu=?,SoSVToiDa=?,SoSVDangKy=?,NgayNhapHoc=?,NgayHetHan=? where MaMH=?";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		cmd.setString(1, emh.getTenmh());
		cmd.setInt(2, emh.getSotc());
		cmd.setInt(3, emh.getSob());
		cmd.setInt(4, emh.getSosvtt());
		cmd.setInt(5, emh.getSosvtd());
		cmd.setInt(6, emh.getSosvdk());
		cmd.setDate(7, emh.getNgaynh());
		cmd.setDate(8, emh.getNgayhh());
		cmd.setString(9, emh.getMamh());
		int kq = cmd.executeUpdate();
		//b5: truyen tham so
		//b6: cho thuc hien
		cmd.close();
		//b7: dong ket noi
		dc.cn.close();
		return kq;
	}
	public int xoaMh(String mamh) throws Exception {
		dc.KetNoi();
		if(KTMH(mamh))
			return 0;
		try {
			String sql = "delete from MONHOC where MaMH=?";
			PreparedStatement cmd = dc.cn.prepareStatement(sql);
			cmd.setString(1, mamh);
			int kq = cmd.executeUpdate();
			cmd.close();
			dc.cn.close();
			return kq;
		}
		catch (Exception e) {
			return 4;
			// TODO: handle exception
		}
	}
	public ArrayList<svbean> getSv() throws Exception{
		ArrayList<svbean> dssv = new ArrayList<svbean>();
		dc.KetNoi();
		String sql = "select * from Vtc ORDER BY TongSoTinChi DESC";
		PreparedStatement cmd = dc.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();
		while(rs.next()) {
			String masv = rs.getString("MaSV");
			String hoten = rs.getString("HoTen");
			String gioitinh = rs.getString("GioiTinh");
			Date ngaysinh = rs.getDate("NgaySinh");
			String diachi = rs.getString("DiaChi");
			String lop = rs.getString("Lop");
			String email = rs.getString("Email");
			String sdt = rs.getString("SoDienThoai");
			String ttc = rs.getString("TongSoTinChi");
			svbean a = new svbean(masv, hoten, gioitinh, ngaysinh, diachi, lop, email, sdt, ttc);
			dssv.add(a);
		}
		rs.close();
		dc.cn.close();
		return dssv;
	}
}
