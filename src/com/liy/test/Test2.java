package com.liy.test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="{createdatetime=2016-06-07 09:31:52, depart=93e22ec3-27b4-4217-9c72-937ed5717d6,7e554a39-ece4-44eb-a871-4397000b807, enddate=2016-06-30 00:00:00, id=14, persontid=test2,test4, remark=asdasd, startdate=2016-06-21 00:00:00,  status=0}";
		String values=tojsonFormat2(data,"id");
		System.out.println(values);
	}
	public static String tojsonFormat2(String values,String fieldName) {
		if (values == null || values.equals("")) {
			return "";
		}
		values = values.substring(1, values.length() - 1);
		fieldName=fieldName+"=";
		String newValues=values.substring(values.indexOf(fieldName),values.length());
		if(newValues.indexOf("=")>-1){
			newValues=newValues.substring(newValues.indexOf("=")+1,newValues.length());
			if(newValues.indexOf("=")==-1){
				return newValues.trim();
			}
			newValues=newValues.substring(0,newValues.indexOf("="));
			String[] arr = newValues.split(",");
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < arr.length; i++){
				if(i==arr.length-1){
					break;
				}else{
					sb.append(arr[i].trim()+",");
				}
				
			}
			return sb.toString().substring(0, sb.length() - 1);
		}else{
			return newValues.trim();
		}
	}

}
