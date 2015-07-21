package com.kasim.test.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class CrunchifyGetPropertyValues {
	public static String res=null;
	
	
	 public static String getPimsApiUsername() {
	Properties prop = new Properties();
	InputStream  input=null;
	try {
 
		  input = new FileInputStream("config.properties");
 
		// load a properties file
		prop.load(input);
 
		// get the property value and print it out
		res=	prop.getProperty("user");
		
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	return res;

	 }
	 
	 public static String getPimsApiPassword() {
			Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=	prop.getProperty("password");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
	 
	 public static String getendpointURL() {
		 Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=prop.getProperty("endpointURL");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
	 
	 public static String getAccessChannel() {
		 Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=prop.getProperty("AccessChannel");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
	 
	 public static String getServiceKey() {
		 Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=prop.getProperty("ServiceKey");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
	 public static String getPartnerReference() {
		 Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=prop.getProperty("PartnerReference");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
	 
	 public static String getSmsHeader() {
		 Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=prop.getProperty("SmsHeader");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
	 
	 public static String getSmsType() {
		 Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=prop.getProperty("SmsType");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
	 public static String getOfferKey() {
		 Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=prop.getProperty("OfferKey");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
	 
	 public static String getServiceProfileAttributeKey() {
		 Properties prop = new Properties();
			InputStream  input=null;
			try {
		 
				  input = new FileInputStream("config.properties");
		 
				
				// load a properties file
				prop.load(input);
		 
				// get the property value and print it out
				res=prop.getProperty("ServiceProfileAttributeKey");
				
		 
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			return res;

			 }
}
