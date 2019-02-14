package SqlQueries;

public class SqlQuery {
int deptNo;
String ename,location,deptName;
public SqlQuery(int deptNo, String ename, String location,String deptName) {
	super();
	this.deptNo = deptNo;
	this.ename = ename;
	this.location = location;
	this.deptName=deptName;
}


public int getDeptNo() {
	return deptNo;
}


public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


public String getDeptName() {
	return deptName;
}


public void setDeptName(String deptName) {
	this.deptName = deptName;
}


@Override
public String toString() {
	return "SqlQuery [deptNo=" + deptNo + ", ename=" + ename + ", location="
			+ location + "]";
}


}
