package framework;

import framework.Staff;
/**
 * 
 * @author huyix
 *	Ա��������
 */



public class StaffAdmin {
	Staff staff = new Staff();
	
	//���Ա������	
	public void staffadd(String id,String name,String sex,String pswd) {
		staff.setStaffid(id);
		staff.setStaffname(name);
		staff.setStaffsex(sex);
		staff.setStaffpswd(pswd);
	}
	
	//ɾ��Ա������
	public void staffdel(String id) {
		//�ṩmysql���ʵ��ɾ��
	}
	
	//��ѯԱ������
	public boolean staffsee(String id) {
		if (id.equals(staff.getStaffid())) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
