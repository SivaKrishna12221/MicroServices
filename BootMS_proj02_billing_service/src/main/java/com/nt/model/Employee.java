package com.nt.model;

public class Employee {
  private Integer empno;
  private String ename;
public Employee(Integer empno, String ename) {
	super();
	this.empno = empno;
	this.ename = ename;
}
@Override
public String toString() {
	return "Employee [empno=" + empno + ", ename=" + ename + "]";
}
public Integer getEmpno() {
	return empno;
}
public void setEmpno(Integer empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
  
}
