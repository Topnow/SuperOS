package framework;
/**
 * 
 * 
 * @author huyix
 *	员工定义类
 *
 */
public class Staff {
		//定义员工ID 名字 性别 密码
		private String staffid;
		private String staffname;
		private String staffsex;
		private String staffpswd;
		
		//添加数据库方法实现访问，添加，删除；
		
		//添加员工
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
