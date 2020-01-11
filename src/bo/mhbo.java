package bo;

import java.util.ArrayList;

import bean.mhbean;
import bean.svbean;
import dao.mhdao;

public class mhbo {
	
	mhdao mh = new mhdao();
	ArrayList<mhbean> dsmh;
	public ArrayList<mhbean> getMH() throws Exception{
		dsmh = mh.getMh();
		return dsmh;
	}
	public int themMH(mhbean nmh) throws Exception {
		return mh.themMh(nmh);
	}
	public int suaMH(mhbean emh) throws Exception {
		return mh.suaMh(emh);
	}
	public int xoaMH(String mamh) throws Exception {
		return mh.xoaMh(mamh);
	}
	public ArrayList<svbean> getSV() throws Exception{
		return mh.getSv();
	}
}
