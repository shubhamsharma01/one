package com.nucleus.Validation;
//Program to perform Validation
import java.util.regex.*;

import com.nucleus.modelPackage.*;
public class ValidationCheck {
      //Method to check validation and will return boolean value
		public boolean validate(CustomerClass11 customerClass11){
			ValidationCheck validation= new ValidationCheck();
			if(validation.validateCode(customerClass11)==true&&
					validation.validateName(customerClass11)==true&&
					validation.validateAddress1(customerClass11)==true&&
					validation.validatePincode(customerClass11)==true&&
					validation.validateEmail(customerClass11)==true&&
					validation.validatePrimary(customerClass11)==true&&
					validation.validateRecord(customerClass11)==true&&
					validation.validateFlag(customerClass11)==true&&
					validation.validateDate(customerClass11)==true&&
					validation.validateCreator(customerClass11)==true)
				return true;
			else
				return false;
		}
		//Boolean Type Method to validate CustomerCode
		public boolean validateCode(CustomerClass11 customerClass11){
			if(((customerClass11.getCustomerCode().length())>=1)&&((customerClass11.getCustomerCode().length())<=10))
				return true;
			else
				return false;
			}
		//Boolean Type Method to validate CustomerName
		public boolean validateName(CustomerClass11 customerClass11){
		if(Pattern.matches("^[A-Za-z0-9]$",customerClass11.getCustomerName())||(((customerClass11.getCustomerName().length()>=1))&&((customerClass11.getCustomerName().length()>=1))))
			return true;
		else
			return false;
		}
		//Boolean Type Method to validate CustomerAddress
		public boolean validateAddress1(CustomerClass11 customerClass11){
			if(customerClass11.getCustomerAddress1().length()!=0)
				return true;
			else
				return false;
			}
		//Boolean Type Method to validate CustomerPincode
		public boolean validatePincode(CustomerClass11 customerClass11){
			if(Pattern.matches("^[0-9]{6}$", customerClass11.getCustomerPinCode())|| customerClass11.getCustomerPinCode().length()!=0)
				return true;
			else
				return false;
		}
		//Boolean Type Method to validate CustomerEmail
		public boolean validateEmail(CustomerClass11 customerClass11){

			if(Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", customerClass11.getEmailAddress())&& customerClass11.getEmailAddress().length()!=0)
				return true;
			else
				return false;
		}
		//Boolean Type Method to validate PrimaryContact Person
 		public boolean validatePrimary(CustomerClass11 customerClass11){
			if(customerClass11.getPrimaryContactPerson().length()!=0)
				return true;
			else
				return false;
			}
 		//Boolean Type Method to validate RecordeStatus
		public boolean validateRecord(CustomerClass11 customerClass11){
			if(Pattern.matches("^[A]|[N]|[D]|[R]|[M]$", customerClass11.getRecordStatus()) &&customerClass11.getRecordStatus().length()!=0)
				return true;
			else
				return false;
		}
		//Boolean Type Method to validate Active/Inactive Flag
		public boolean validateFlag(CustomerClass11 customerClass11){
			if(Pattern.matches("^[A]|[I]$",customerClass11.getActiveInactiveFlag()) &&customerClass11.getActiveInactiveFlag().length()!=0)
				return true;
			else
				return false;
		}
		//Boolean Type Method to validate CreateDate
		public boolean validateDate(CustomerClass11 customerClass11){
			if(customerClass11.getCreateDate().length()!=0)
				return true;
			else
				return false;
			}
		//Boolean Type Method to validate CreatedBy
		public boolean validateCreator(CustomerClass11 customerClass11){
			if(customerClass11.getCreateBy().length()!=0)
				return true;
			else
				return false;
			}
	}

