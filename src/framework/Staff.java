package framework;
/**
 * 
 * 
 * @author huyix
 *	Ա��������
 *
 */
public class Staff {
		//����Ա��ID ���� �Ա� ����
		private String staffid;
		private String staffname;
		private String staffsex;
		private String staffpswd;
		
		//������ݿⷽ��ʵ�ַ��ʣ���ӣ�ɾ����
		
		//���Ա��
		public Staff(String staffid, String staffname, String staffsex, String staffpswd) {
			super();
			this.staffid = staffid;
			this.staffname = staffname;
			this.staffsex = staffsex;
			this.staffpswd = staffpswd;
		}
		
		
		
		public String getStaffid() {
			return staffid;
		}
		public String getStaffpswd() {
			return staffpswd;
		}
		public void setStaffid(String staffid) {
			this.staffid = staffid;
		}
		public String getStaffname() {
			return staffname;
		}
		public void setStaffname(String staffname) {
			this.staffname = staffname;
		}
		public String getStaffsex() {
			return staffsex;
		}
		public void setStaffsex(String staffsex) {
			this.staffsex = staffsex;
		}
		
}
