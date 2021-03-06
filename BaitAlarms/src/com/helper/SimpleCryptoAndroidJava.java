package com.helper;

  import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

        public class SimpleCryptoAndroidJava {

                private String iv = "fedcba9876543210";//Dummy iv (CHANGE IT!)
                private IvParameterSpec ivspec;
                private SecretKeySpec keyspec;
                private Cipher cipher;
                
                private String SecretKey = "0123456789abcdef";//Dummy secretKey (CHANGE IT!)
                
                public SimpleCryptoAndroidJava()
                {
                        ivspec = new IvParameterSpec(iv.getBytes());

                        keyspec = new SecretKeySpec(SecretKey.getBytes(), "AES");
                        
                        try {
                                cipher = Cipher.getInstance("AES/CBC/NoPadding");
                        } catch (NoSuchAlgorithmException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        } catch (NoSuchPaddingException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                }
                
                public byte[] encrypt(String text) throws Exception
                {
                        if(text == null || text.length() == 0)
                                throw new Exception("Empty string");
                        
                        byte[] encrypted = null;

                        try {
                                cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);

                                encrypted = cipher.doFinal(padString(text).getBytes());
                        } catch (Exception e)
                        {                       
                                throw new Exception("[encrypt] " + e.getMessage());
                        }
                        
                        return encrypted;
                }
                
                public byte[] decrypt(String code) throws Exception
                {
                        if(code == null || code.length() == 0)
                                throw new Exception("Empty string");
                        
                        byte[] decrypted = null;

                        try {
                                cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
                                
                                decrypted = cipher.doFinal(hexToBytes(code));
                        } catch (Exception e)
                        {
                                throw new Exception("[decrypt] " + e.getMessage());
                        }
                        return decrypted;
                }
                

                
                public static String bytesToHex(byte[] data)
                {
                        if (data==null)
                        {
                                return null;
                        }
                        
                        int len = data.length;
                        String str = "";
                        for (int i=0; i<len; i++) {
                                if ((data[i]&0xFF)<16)
                                        str = str + "0" + java.lang.Integer.toHexString(data[i]&0xFF);
                                else
                                        str = str + java.lang.Integer.toHexString(data[i]&0xFF);
                        }
                        return str;
                }
                
                        
                public static byte[] hexToBytes(String str) {
                        if (str==null) {
                                return null;
                        } else if (str.length() < 2) {
                                return null;
                        } else {
                                int len = str.length() / 2;
                                byte[] buffer = new byte[len];
                                for (int i=0; i<len; i++) {
                                        buffer[i] = (byte) Integer.parseInt(str.substring(i*2,i*2+2),16);
                                }
                                return buffer;
                        }
                }
                
                

                private static String padString(String source)
                {
                  char paddingChar = ' ';
                  int size = 16;
                  int x = source.length() % size;
                  int padLength = size - x;

                  for (int i = 0; i < padLength; i++)
                  {
                          source += paddingChar;
                  }

                  return source;
                }
                public static String encryptString(String data) throws Exception{
                	SimpleCryptoAndroidJava mc=new SimpleCryptoAndroidJava();
					byte encrypted[];
				
						encrypted=mc.encrypt(data);
						String str=mc.bytesToHex(encrypted);
					
					return str;
                }
                public static String decryptString(String enc) throws Exception{
                	SimpleCryptoAndroidJava mc=new SimpleCryptoAndroidJava();
                	byte decrypted[];
					decrypted=mc.decrypt(enc);
					String str1=new String(decrypted);
					
					
					return str1;
                }
                public static void main(String[] args) {
                	
					try {
//						encrypted=mc.encrypt("hirajeshhowareyou");
//						String str=mc.bytesToHex(encrypted);
//						System.out.println(str);
//						byte decrypted[];
//						decrypted=mc.decrypt("5f52861bc9fd6881947435453eb57626cc6c5ea7e460f22fcb3f0ce2db634c0a");
//						String str1=new String(decrypted);
						
						System.out.println(encryptString("mahesh@1234"));
						System.out.println(decryptString("195c44b3a19e209c324317447dac72aa"));
						
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				}
        }
