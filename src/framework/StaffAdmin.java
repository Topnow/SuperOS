package framework;

import framework.Staff;
/**
 * 
 * @author huyix
 *	员工操作类
 */



public class StaffAdmin extends Staff {
	

	public StaffAdmin(String staffid, String staffname, String staffsex, String staffpswd) {
		super(staffid, staffname, staffsex, staffpswd);
		// TODO Auto-generated constructor stub
	}

	//删除员工方法
	public void staffdel(String id) {
		//提供mysql语句实现删除
	}
	
	//查询员工方法
	public boolean staffsee(String id) {
		if (id.equals(this.getStaffid())) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
