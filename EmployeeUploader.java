package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class Connection2{
	static {
		try {
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	public static Connection con() throws SQLException{
		return DriverManager.getConnection( "jdbc:mysql://localhost:3306/mrinaldb","root","Mrinal@5");//creating connection
		 
	}
}
public class EmployeeUploader {

Scanner sc=new Scanner(System.in);


//this method is to insert department details
public void storeDepartmentDetails() {
	System.out.println("INSERTING DEPARTMENT DETAILS");
		System.out.println("enter Department_ID :");
		int Department_ID=sc.nextInt();
		System.out.println("enter Department_Name :");
		String Department_Name =sc.next();
		System.out.println("enter Department_Head :");
		String Department_Head=sc.next();
		System.out.println("enter Department_Description :");
		String Department_Description  =sc.next();
		try {
			//Creating connection
		Connection con=Connection2.con();  
			PreparedStatement stm; 
		String sql="insert into DEPARTMENT values(?,?,?,?)";
		stm = con.prepareStatement(sql);
		stm.setInt(1, Department_ID );
		stm.setString(2, Department_Name);
		stm.setString(3, Department_Head);
		stm.setString(4, Department_Description);
        stm.execute();
		con.close();
		  System.out.println("DEPARTMENT DETAILS INSERTED SUCCESSFULLY");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
//this method is to insert employee details
public void storeEmployeeDetails(){
	
		System.out.println("INSERTING EMPLOYEE DETAILS");
		System.out.println("enter Employee_Id :");
		int Employee_Id=sc.nextInt();
		System.out.println("enter	Employee_Name :");
		String Employee_Name =sc.next();
		System.out.println("enter Employee_Address:");
		String Employee_Address=sc.next();
		System.out.println("enter Employee_Salary :");
		long Employee_Salary  =sc.nextLong();
		System.out.println("enter Employee_Contact_No :");
		long Employee_Contact_No=sc.nextLong();
		System.out.println("enter Department_Id:");
		int	Department_Id  =sc.nextInt();
		try {
			//Creating connection
		Connection con=Connection2.con();  
			PreparedStatement stm; 
		String sql="insert into EMPLOYEE values(?,?,?,?,?,?)";
		stm = con.prepareStatement(sql);
		stm.setInt(1, Employee_Id );
		stm.setString(2, Employee_Name);
		stm.setString(3, Employee_Address);
		stm.setLong(4, Employee_Salary);
		stm.setLong(5, Employee_Contact_No);
		stm.setInt(6, Department_Id);
        stm.execute();
		  con.close();
		  System.out.println(" Employee DETAILS INSERTED SUCCESSFULLY");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

//this method is to retrieve data
public void retrieveEmployeeDetails () {
	  try {
			 
			 System.out.println("Retrieving tables using Select query:");
			Connection con=Connection2.con();//Creating connection
			Statement stm=con.createStatement();//creating statement
			System.out.print("enter Employee_id you want to check:");
			int Employee_id=sc.nextInt();

			ResultSet rs=stm.executeQuery("select Employee_ID,Employee_Namee,Employee_Address,Employee_Contact_No,Department_Name,Department_Head from Department left join Employee on Department.Department_ID = Employee.Department_ID where Employee_ID="+Employee_id);
			while(rs.next()) {
		System.out.println("EMPLOYEE DETAILS :\n"+"ID:"+rs.getInt(1)+"\nNAME:"+rs.getString(2)+"\nEmployee_Address:"+rs.getString(3)+"\nEmployee_Contact_No: "+rs.getLong(4)+"\nDepartment_name:"+rs.getString(5)+"\nDepartment_head: "+rs.getString(6));
			}
			
			rs.close();

				}
				catch(Exception e) {
					System.out.println(e);
				}	
}

//this method is to calculate pf
public void calculatePF() {
	 try {
		 
		 System.out.println("CALCULATING PF");
			Connection con=Connection2.con();//Creating connection
			Statement stm=con.createStatement();//creating statement
			System.out.print("enter Employee_id you want to check the pf:");
			int Employee_id=sc.nextInt();

			ResultSet rs=stm.executeQuery("select * from Employee where Employee_id="+Employee_id);
			while(rs.next()) {
				System.out.println("Employee_salary:"+rs.getLong(4));
				if(rs.getLong(4)>1000 && rs.getLong(4)<10000) {
		System.out.println("pf ammount is:"+(rs.getLong(4)*5/100));
				}
				if(rs.getLong(4)>10000 && rs.getLong(4)<100000) {
					System.out.println("pf ammount is:"+(rs.getLong(4)*6/100));
							}
				if(rs.getLong(4)>100000) {
					System.out.println("pf ammount is:"+(rs.getLong(4)*7/100));
							}
			}
			rs.close();

				}
				catch(Exception e) {
					System.out.println(e);
				}
}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("press 1. to insert department details :\npress 2. to insert employee details :\npress 3. to check details :\npress 4. to check PF : ");
		int press=sc.nextInt();
		EmployeeUploader e=new EmployeeUploader();
		
		if(press==1) {
		e.storeDepartmentDetails();
		}
		else if(press==2) {
		e.storeEmployeeDetails();
		}
		else if(press==3) {
		e.retrieveEmployeeDetails();
		}
		else if(press==4) {
		e.calculatePF();
		}
		System.out.println("------------------------------------");
		}
		
	}
	
}