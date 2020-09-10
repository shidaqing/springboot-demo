package com.shidq.dingding;


import okhttp3.Response;

import javax.crypto.* ;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64 ;
import java.net.URLEncoder ;
/**
 * @Author : shidq
 * @Date : 2020/9/10 22:16
 * @Desc :
 * @Version : 1.0
 */
public class SendDingMessage {


    public static void main(String[] args) throws Exception {

             DingdingSender dingdingSender =  new DingdingSender() ;
        Response response =  dingdingSender.sendmessage("NIHAO") ;
        System.out.println(response);



    }


}
