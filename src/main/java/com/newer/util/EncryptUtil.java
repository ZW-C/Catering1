package com.newer.util;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {



    /**
     * 解密
     * @param originkey
     * @return
     */
    public static String desDecript(String cipherText, String originkey) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher= Cipher.getInstance("DES");
        Key key=getKey(originkey);
        cipher.init(Cipher.DECRYPT_MODE,key);
       byte[] decode= Base64.decode(cipherText);
       byte[] doFinal=cipher.doFinal(decode);

        return new String(doFinal);
    }

    public static String desEncript(String clearText, String originkey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
             //获取加密算法工具类
        Cipher cipher= Cipher.getInstance("DES");
        SecretKeySpec key=getKey(originkey);
        //对工具类对象进行初始化
        cipher.init(Cipher.ENCRYPT_MODE,key);
      byte[] doFinal=  cipher.doFinal(clearText.getBytes());
//        return new String(doFinal);
        String encode= Base64.encode(doFinal);
     return   encode;
    }


    private static SecretKeySpec getKey(String originkey) {
 byte[] buffer=new byte[8];
 byte[] originkeyBytes=originkey.getBytes();
        for (int i = 0; i <8 && i<originkeyBytes.length ; i++) {
            buffer[i]=originkeyBytes[i];
        }
      SecretKeySpec key=  new SecretKeySpec(buffer,"DES");
        return key;

    }

}


