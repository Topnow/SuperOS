package framework;

import framework.Staff;
/**
 * 
 * @author huyix
 *	员工操作类
 */



public class StaffAdmin {
	Staff staff = new Staff();
	
	//添加员工方法	
	public void staffadd(String id,String name,String sex,String pswd) {
		staff.setStaffid(id);
		staff.setStaffname(name);
		staff.setStaffsex(sex);
		staff.setStaffpswd(pswd);
	}
	
	//删除员工方法
	public void staffdel(String id) {
		//提供mysql语句实现删除
	}
	
	//查询员工方法
	public boolean staffsee(String id) {
		if (id.equals(staff.getStaffid())) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
