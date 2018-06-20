package framework;
/**
 * 
 * @author huyix
 *	商品类 售货与进货
 */
public class CarGo {
	//商品名称，价格，数量，编号，类别
	private String cargename;
	private String cargeid;
	private int cargenum;
	private String cargesort;
	private double cargeprice;
	
	//添加数据库方法实现访问，添加，删除；
	
	public CarGo(String cargename, String cargeid, int cargenum, String cargesort, double cargeprice) {
		super();
		this.cargename = cargename;
		this.cargeid = cargeid;
		this.cargenum = cargenum;
		this.cargesort = cargesort;
		this.cargeprice = cargeprice;
	}
	public String getCargename() {
		return cargename;
	}
	public void setCargename(String cargename) {
		this.cargename = cargename;
	}
	public String getCargeid() {
		return cargeid;
	}
	public void setCargeid(String cargeid) {
		this.cargeid = cargeid;
	}
	public int getCargenum() {
		return cargenum;
	}
	public void setCargenum(int cargenum) {
		this.cargenum = cargenum;
	}
	public String getCargesort() {
		return cargesort;
	}
	public void setCargesort(String cargesort) {
		this.cargesort = cargesort;
	}
	public double getCargeprice() {
		return cargeprice;
	}
	public void setCargeprice(double cargeprice) {
		this.cargeprice = cargeprice;
	}
	
	
	
}
