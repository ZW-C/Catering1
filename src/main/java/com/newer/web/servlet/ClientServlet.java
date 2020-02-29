package com.newer.web.servlet;

import com.google.gson.JsonObject;
import com.newer.domain.Client;
import com.newer.service.ClientService;
import com.newer.util.EncryptUtil;
import com.newer.util.SendMsg;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@WebServlet("/ClientServlet")
public class ClientServlet extends HttpServlet {
    private ClientService clientService = new ClientService();
    private EncryptUtil encryptUtil = new EncryptUtil();


    private SendMsg sendMsg = new SendMsg();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String action = req.getParameter("action");
        System.out.println(action);
        if (action.equals("Accountregistration")) {
            //账号注册
            try {
                Accountregistration(req, resp);
            } catch (IllegalBlockSizeException e) {
                e.printStackTrace();
            } catch (InvalidKeyException e) {
                e.printStackTrace();
            } catch (BadPaddingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (NoSuchPaddingException e) {
                e.printStackTrace();
            }

        } else if (action.equals("SMSregistration")) {
            SMSregistration(req, resp);
        } else if (action.equals("code")) {
            code(req, resp);
        } else if (action.equals("Accountlogin")) {
            try {
                accountLogin(req, resp);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (BadPaddingException e) {
                e.printStackTrace();
            } catch (NoSuchPaddingException e) {
                e.printStackTrace();
            } catch (IllegalBlockSizeException e) {
                e.printStackTrace();
            } catch (InvalidKeyException e) {
                e.printStackTrace();
            }
        } else if (action.equals("verificationlogin")) {
            verificatioLogin(req, resp);
        } else if (action.equals("delsession")) {
            delsession(req, resp);
        } else if (action.equals("codelogin")) {
            codelogin(req, resp);
        }

    }

    /**
     * 登陆发送验证码
     *
     * @param req
     * @param resp
     */
    private void codelogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        JsonObject jsonObject = new JsonObject();
        String clientPhone = req.getParameter("clientPhone");
        String a = sendMsg.randomCode();
        System.out.println(clientPhone);
        System.out.println(a);
        if (clientPhone != null) {
            //  sendMsg.code(req.getParameter("clientPhone"),a);
            jsonObject.addProperty("msg", a);
            jsonObject.addProperty("suc", true);
        } else {
            jsonObject.addProperty("msg", "短信发送失败");
            jsonObject.addProperty("suc", false);
        }

        PrintWriter out = resp.getWriter();
        out.print(jsonObject);
        out.close();

    }

    private void delsession(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        JsonObject jsonObject = new JsonObject();
        HttpSession session = req.getSession();//创建session
        session.invalidate();

        jsonObject.addProperty("msg", "退出成功");

        jsonObject.addProperty("suc", true);
        PrintWriter out = resp.getWriter();
        out.print(jsonObject);
        out.close();
    }

    /**
     * 短信验证码登陆
     *
     * @param req
     * @param resp
     */
    private void verificatioLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String clientPhone = req.getParameter("clientPhone");
        System.out.println(clientPhone);
        JsonObject jsonObject = new JsonObject();
        Client client = clientService.VerificationLogin(clientPhone);
        int count = clientService.Isitregistered(clientPhone);

        System.out.println(client);
        System.out.println(count);
        if (count == 0) {
            jsonObject.addProperty("msg", "电话号码未注册请先注册");
            jsonObject.addProperty("suc", "");
        } else if (client != null) {
            jsonObject.addProperty("msg", "登陆成功");
            System.out.println("登陆成功");
            jsonObject.addProperty("suc", true);
        } else {
            jsonObject.addProperty("msg", "手机号码或验证码输入有误请重新输入");
            jsonObject.addProperty("suc", false);
        }


        PrintWriter out = resp.getWriter();
        out.print(jsonObject);
        out.close();


    }

    /**
     * 账号登陆
     *
     * @param req
     * @param resp
     */
    private void accountLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException, NoSuchAlgorithmException, BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, InvalidKeyException {
        JsonObject jsonObject = new JsonObject();
        String clientAccount = req.getParameter("clientAccount");

        String clientPwd = req.getParameter("clientPwd");
        // 加密
        String cipherText = encryptUtil.desEncript(clientPwd, clientAccount);
        Client client = clientService.AccountLogin(clientAccount, cipherText);


        if (client != null) {
            jsonObject.addProperty("msg", "登陆成功");
            System.out.println("登陆成功");
            jsonObject.addProperty("suc", true);
        } else {
            jsonObject.addProperty("msg", "账号或密码输入错误请重新输入");
            jsonObject.addProperty("suc", false);
        }

        PrintWriter out = resp.getWriter();
        out.print(jsonObject);
        out.close();

    }

    //阿里云短信服务
    private void code(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String clientPhone = req.getParameter("clientPhone");
        //阿里云短信服务的返回值
        // {"Message":"OK","RequestId":"8CC180A9-C31C-4A3B-9271-0FA8BE18FCCC","BizId":"977421382554320987^0","Code":"OK"}
        String a = sendMsg.randomCode();
        System.out.println(a);
        JsonObject jsonObject = new JsonObject();
        if (clientService.Checkuplication1(clientPhone) > 0) {
            jsonObject.addProperty("suc1", true);
            jsonObject.addProperty("msg1", "电话号码已经注册请重新输入");

        } else if (true) {
//           sendMsg.code(req.getParameter("clientPhone"),a);
            jsonObject.addProperty("msg", a);
            jsonObject.addProperty("suc", true);
        } else {

            jsonObject.addProperty("msg", "短信发送失败");
            jsonObject.addProperty("suc", false);
        }

        PrintWriter out = resp.getWriter();
        out.print(jsonObject);
        out.close();

    }

    //短信注册
    private void SMSregistration(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String clientPhone = req.getParameter("clientPhone");
        System.out.println(clientPhone);
        String code = req.getParameter("code");
        Client client = new Client();
        JsonObject jsonObject = new JsonObject();

        client.setClientPhone(clientPhone);
        if (clientService.addClient(client) > 0) {
            jsonObject.addProperty("suc", true);
            jsonObject.addProperty("msg", "注册成功");
        } else {

            jsonObject.addProperty("msg", "注册失败");
            jsonObject.addProperty("suc", false);
        }
        PrintWriter out = resp.getWriter();
        out.print(jsonObject);
        out.close();

    }


    //账号注册
    private void Accountregistration(HttpServletRequest req, HttpServletResponse resp) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, IOException {
        String clientAccount = req.getParameter("clientAccount");
        String clientPwd = req.getParameter("clientPwd");
        System.out.println(clientAccount);
        System.out.println(clientPwd);
        //密码加密工具类
        // 加密
        String cipherText = encryptUtil.desEncript(clientPwd, clientAccount);
        //解密
        // String clearText2=encryptUtil.desDecript(cipherText,clientAccount);
        Client client = new Client();
        //set账号和加密后的密码
        client.setClientAccount(clientAccount);
        client.setClientPwd(cipherText);
        //new json对象
        JsonObject jsonObject = new JsonObject();
        if (clientService.Checkuplication(clientAccount) > 0) {
            jsonObject.addProperty("suc1", true);
            jsonObject.addProperty("msg1", "账号已经存在请重新输入");
        } else {
            if (clientService.addClient(client) > 0) {
                jsonObject.addProperty("suc", true);
                jsonObject.addProperty("msg", "注册成功");
            } else {

                jsonObject.addProperty("msg", "注册失败");
                jsonObject.addProperty("suc", false);
            }
        }


        PrintWriter out = resp.getWriter();
        out.print(jsonObject);
        out.close();


    }


}
