package com.newer.service;

import com.newer.domain.Client;
import com.newer.mapper.ClientMapper;
import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class ClientService {

    private ClientMapper clientMapper;
    private SqlSession sqlSession;

    // 映射器接口实例化
    private  void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        clientMapper=sqlSession.getMapper(ClientMapper.class);
    }

    /*
    注册账号
     */
    public int  addClient(Client client){
        init();
        int count =clientMapper.addClient(client);
          sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
        return count;
    }

    /**
     * 短信验证码查询是否重复
     * @param clientPhone
     * @return
     */
    public int Checkuplication1(String clientPhone){
        init();
        int count =clientMapper.Checkuplication1(clientPhone);
        SqlSessionUtil.close(sqlSession);
        return count;
    }

    /**
     *查询账号是否重复
     * @param clientAccount
     * @return
     */
    public int Checkuplication(String clientAccount){
        init();
        int count =clientMapper.Checkuplication(clientAccount);
        SqlSessionUtil.close(sqlSession);
        return count;
    }

    /**
     * 账号密码登陆
     * @param clientAccount1
     * @param clientPwd1
     * @return
     */
    public Client AccountLogin(String clientAccount1,String clientPwd1){
        init();
        Client client =clientMapper.AccountLogin(clientAccount1,clientPwd1);
        SqlSessionUtil.close(sqlSession);
        return client;
    }

    /**
     * 短信验证码登陆
     * @param clientPhone
     * @return
     */
    public  Client VerificationLogin(String clientPhone){
        init();
        Client client  =clientMapper.VerificationLogin(clientPhone);
        SqlSessionUtil.close(sqlSession);
        return client;
    }

    public  int Isitregistered(String clientPhone){
        init();
        int count  =clientMapper.Isitregistered(clientPhone);
        SqlSessionUtil.close(sqlSession);
        return count;
    }
}
