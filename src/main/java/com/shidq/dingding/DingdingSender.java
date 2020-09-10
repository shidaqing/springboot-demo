package com.shidq.dingding;

import com.alibaba.fastjson.JSONObject;
import okhttp3.*;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * @Author : shidq
 * @Date : 2020/9/10 22:50
 * @Desc :
 * @Version : 1.0
 */
public class DingdingSender {
    String webhook = "https://oapi.dingtalk.com/robot/send?access_token=7a2de306674ec6f7304de5502bc289183609377f85e5c34b180f358c8347888a"  ;
    String secret = "SEC814c6f2f4f0d7415c77dad614882050e718fb9c1654ed6201240937b91179ca1" ;
    public String encode() throws Exception {
        long timestamp = System.currentTimeMillis() ;
        String stringTosign = timestamp+"\n"+secret ;
        Mac mac = Mac.getInstance("HmacSHA256") ;
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"),"HmacSHA256"));
        byte[] signData = mac.doFinal(stringTosign.getBytes("UTF-8")) ;
        Base64.Encoder encoder = Base64.getEncoder() ;
        String sign = URLEncoder.encode(new String(encoder.encodeToString(signData)),"UTF-8") ;
        String result = "&timestamp=" + timestamp + "&sign=" +sign ;
        return result ;
    }
    public Response sendmessage(String message) throws Exception {
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        JSONObject result = new JSONObject();
        JSONObject text = new JSONObject();
        text.put("content",message) ;
        result.put("text" ,text) ;
        result.put("msgtype","text") ;
        String jsonString  = result.toJSONString() ;
        String url = this.webhook+this.encode() ;
        RequestBody body = RequestBody.create(JSON, jsonString);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        System.out.println(request);
        Response response = client.newCall(request).execute();
        return response;
    }
}
