package com.nucleus.modelPackage;
//Interface of Customer11Dao
public interface CustomerClass11Dao {
	public CustomerClass11 readFromFile(String fileLocationName,String rejectionLevel);
	public void tableWrite(CustomerClass11 customerClass11,String rejectionLevel);
   // public void tableTruncate();
}
