package framework;

import framework.Staff;
/**
 * 
 * @author huyix
 *	Ա��������
 */



public class StaffAdmin extends Staff {
	

	public StaffAdmin(String staffid, String staffname, String staffsex, String staffpswd) {
		super(staffid, staffname, staffsex, staffpswd);
		// TODO Auto-generated constructor stub
	}

	//ɾ��Ա������
	public void staffdel(String id) {
		//�ṩmysql���ʵ��ɾ��
	}
	
	//��ѯԱ������
	public boolean staffsee(String id) {
		if (id.equals(this.getStaffid())) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
