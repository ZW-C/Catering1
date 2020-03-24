package com.newer.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id =  "2016101800718132";

	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCByfCnZNNLBIJ0rVfUpKc7KUCd0QPox93dhGFLbDUEemkCpHqGJU5j2uPEQouoB+8uKrrqIDllki6cAnxSdJIJM55TMHhhRvHYBIPMzb4YjltAz6a3CJRzeuRZdWI1KVH6WexY9ljyjslYvf8WwbbTDcPB9DGdm8WG8NKot+hzljKhvsvOkAQ9h3ilXY4vUDrTSGw/jD8m9D24xSV0BB5+zRqDOcF1AVAU/kVUZCh+ioiscSNBdWShRufsXtS+RoqRWecE/U7ZHWmF0JDstX7DH3vBYu5ep6GcJv1fKbbYDLfR79wsAk5Mj/k7AFrPS00GQYAFqan9D6dKllt6Y+k5AgMBAAECggEALKpskY8XUCfbJYBKS7nme2u0+xrld4ThC8z1FtnEXSgrX2dvax8HnUHFRNOJ8Gfank7CSLSSTCxEshgA5PeNEnGbORHjO8cIj8jt+tuLYjQLn4BW5YKkZCGU2FyXUahIuBmeRvdwoPkWvd2VHiXIX1XLWsJJGO50yf2y4bF44939U5SEqcPerhC+9S+4MZiiY9MOAt8D0OAaG545ZGToAoGMMrsl6s5VfCz7WtMXAXm6LrWtxLX50Udms9RMkpznzvLfKkmERQn/I3HmoyBWjFzejPcYiOEytjNuEyR5VHix3EWh4yLLxTfzYwz1SqL5fgZJTmpAdzdtjfMfHILVAQKBgQC3pVLkVQ7YR+qDhIQeCGs8xetuYTikwUzF1yULuvN4vy0fjp/xRUiKhtxOh/eclBAVn/hua3alnbNqDdEANYgIvHVt91vwl8gNNZyOieqBmF28w23tZA+N3PFjwslreIQSucSlk+Ca5tDnwXWjwQw75VkmX4hyGCD4/cF9cadw6QKBgQC07I4ieLQ4rDogzlLCeUo9RPy34cP3M0gLZWa/AJ2MZepRfSHr56pr24PsrRGbpC/+Z9hLkQ4KaaYm9KdL1zR612HCQETJcYCJOOw6Q6ifijLgukoGZ5uOFv4pMEpE3rR0RrBmDbFXxpehLxQTS3IHg8AneLuNjSvULC4AnK4D0QKBgQCoCxazqwV/cSctm1fNp4SBQtYw1bOgRuT6b+kNN8/MYJtosfi3LN+5Krhy/8XbOD0TnKMWXy1dVNW0qNnjaBiHbfPCYUN2/1xmgfU1FQxJ8+NqdCWlwRbeiBs2XyoyNkAcZnKD1LIE7EqilwsPgfmw4SfXjjlrtZqOXJzuLc666QKBgCjCEdMaNh9+TSoO0P4WrO7Yl8YlCiyqVNScZ2UoElYKr5rkAbxPWEksDrBG3OyfNGCvrD550xvtaQzlmLqxJJV36AIG0HhBJZ/EPxNxIo+uZn/R99MxjA2aiG9m/ZQ+R5DaS+rxsr3/czFQlcky+eFPgP5jaH0fDHyj50kkAt/BAoGAWpbWIG4eG9tBXD4aI0QLu5RlCBKT/DI2DX8KLkxSOZnszeDGvr2M30a1dBRngkNBs5ZwvtyPqb3qW+GBzWdtwYKezhtt7dkzVhlIRpdR/DO39YNyCxw4ED5KHGG3XscCE2AX35Mfdz7FMm+RmQmn44zm67lwSbewfzU/4X48kDQ=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwcsxRwF6bOmvgg4oBdu+OHNs3OO3lAF6zfAbHXRb3HNijkwDzKYFfuIheFvpSTCOx8cgoeOD4oL/u2nYvVHf+AQrh1GQkvxSo6UTF2FazTHzKI2Ivy7D7Gxe1pDET0BD043tQZfqDqrVVT3ut9P8x/jz7+0GsWe2jYTlTHaVRiDljA9E//zDPw42YcoYsUFOu1KWSRkBdjUW2zfa60tXyIId/97UIAKJsYdYNT9jj0DqC113M9HDTeHcGl8xIgY8iYKL0iilcITG0NFLNvO0Da82pSpODP5zHEZOLSDJXm4MhkPHAnlA24ny6p4K4vC93igznKG+KMVfrcNeyIYIbwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://127.0.0.1:8080/success_pay.html";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:9090/butCart/success_pay.html";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝日志
	public static String log_path = "C:\\";



}

