package com.nucleus.modelPackage;
///Implementation class to implement methods of InterFace CustomerDao
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nucleus.Error.ErrorLog;
import com.nucleus.Validation.ValidationCheck;
import com.nucleus.connection.ConnectionSetup;

//Implementation Class
public class CustomerClass11DaoRdbms implements CustomerClass11Dao {
	//Object Creation
	FileReader fileReader;
	ValidationCheck validation=new ValidationCheck();
    PreparedStatement preparedStatement;
    CustomerClass11 customerClass11;
    ConnectionSetup connectionsetup=new ConnectionSetup();
	Connection con=connectionsetup.getConnection();
	public static int result=0;
    boolean errorLog1=false;
    //Implementation of method readFromFile
	@SuppressWarnings("resource")
	public CustomerClass11 readFromFile(String fileLocationName,String rejectionLevel){
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		CustomerClass11Dao customerDao=CustomerDaoFactory.getCustomerDao("rdbms");
		
        try{
            fileReader=new FileReader(fileLocationName);
			bufferedReader=new BufferedReader(fileReader);
			String print=bufferedReader.readLine();
			long id=1;
		    while(print!=null){
					String[] arrprint=print.split("~",-1);
					
					String customerCode=arrprint[0];
					String customerName=arrprint[1];
					String customerAddress1=arrprint[2];
					String customerAddresss2=arrprint[3];
					String customerPinCode=arrprint[4];
					String emailAddress=arrprint[5];
					String contactNumber=arrprint[6];
					String primaryContactPerson=arrprint[7];
					String recordStatus=arrprint[8];
					String activeInactiveFlag=arrprint[9];
					String createDate=arrprint[10];
					String createBy=arrprint[11];
					String modifiedDate=arrprint[12];
					String modifiedBy=arrprint[13];
				    String authorizedDate=arrprint[14];
					String authorizedBy=arrprint[15];
					customerClass11=new CustomerClass11(id,customerCode,customerName,
							customerAddress1,customerAddresss2,
							customerPinCode,emailAddress,contactNumber,
							primaryContactPerson,recordStatus,
							activeInactiveFlag,createDate,createBy,
							modifiedDate,modifiedBy,authorizedDate,
					        authorizedBy);
					
					if(validation.validate(customerClass11)==true){
						customerDao.tableWrite(customerClass11,rejectionLevel);
						
					}
					else{
					
						errorLog1=true;
                        new ErrorLog(customerClass11);
                        
					}
					//File Rejection
					if(rejectionLevel.equalsIgnoreCase("f")){
						if(errorLog1==true){
							try {
								con.rollback();
								result=2;
								new ErrorLog(customerClass11);
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						else{
							try {
								con.commit();//connection rolled back
							} catch (SQLException e) {
								e.printStackTrace();
							}
		                 }
					}
					print=bufferedReader.readLine();
					id++;
		}/*
		    System.out.println(count1+ " entries are added in Database");
			 System.out.println(count2+ " entries are added in error log");*/
	    }
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
				e.printStackTrace();
	    }
		return customerClass11;
	}
	
	//Implementation of method tableWrite
		public void tableWrite(CustomerClass11 customerClass11,String rejectionLevel) {

			/*ConnectionSetup connectionSetup= new ConnectionSetup();
			Connection connection = connectionSetup.getConnection();*/
			try {
				preparedStatement = con.prepareStatement("insert into BRDAYUSHNEW values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				preparedStatement.setLong(1, customerClass11.getCustId());
				preparedStatement.setString(2,customerClass11.getCustomerCode());
				preparedStatement.setString(3,customerClass11.getCustomerName());
				preparedStatement.setString(4,customerClass11.getCustomerAddress1());
				preparedStatement.setString(5,customerClass11.getCustomerAddresss2());
				preparedStatement.setString(6,customerClass11.getCustomerPinCode());
				preparedStatement.setString(7,customerClass11.getEmailAddress());
				preparedStatement.setString(8,customerClass11.getContactNumber());
				preparedStatement.setString(9,customerClass11.getPrimaryContactPerson());
				preparedStatement.setString(10,customerClass11.getRecordStatus());
				preparedStatement.setString(11,customerClass11.getActiveInactiveFlag());
				preparedStatement.setString(12,customerClass11.getCreateDate());
				preparedStatement.setString(13,customerClass11.getCreateBy());
				preparedStatement.setString(14,customerClass11.getModifiedDate());
				preparedStatement.setString(15,customerClass11.getModifiedBy());
				preparedStatement.setString(16,customerClass11.getAuthorizedDate());
				preparedStatement.setString(17,customerClass11.getAuthorizedBy());
				preparedStatement.executeUpdate();
				if (rejectionLevel.equalsIgnoreCase("r"))
				{//IF IT IS RECORD LEVEL
					con.commit();
					result=1;
					System.out.println("Data Saved at Record Level in Database");
				}else{
					System.out.println("Data Rejected at File Level");
				}
			} catch (SQLException e) {
				System.out.println("Invalid Entry");
				//e.printStackTrace();
			}
			/*finally{
				try {
					con.close();
					preparedStatement.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}*/
		}
}





