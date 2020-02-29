package com.newer.mapper;

import com.newer.domain.Client;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ClientMapper {

  /**
   * 注册账号
   * @param client
   * @return
   */
  @Insert("insert into client values(null,null,null,null,null,#{clientPhone},#{clientAccount},#{clientPwd},null,null,null)")
    int addClient(Client client);

  /**
   * 查询是否有重复账号
   * @param clientAccount
   * @return
   */
  @Select("select count(*) from client where clientAccount=#{clientAccount}")
  int  Checkuplication(String clientAccount);

  /**
   * 查询是否有重复电话号码
   * @param clientPhone
   * @return
   */
  @Select("select count(*) from client where clientPhone=#{clientPhone}")
  int  Checkuplication1(String clientPhone);

  /**
   *
   * @param clientAccount1
   * @param clientPwd1
   * @return
   */
    @Select("select * from client where  clientAccount=#{clientAccount1} and clientPwd=#{clientPwd1}")
    Client  AccountLogin(@Param("clientAccount1") String clientAccount1, @Param("clientPwd1") String clientPwd1);

  /**
   * 短信验证码登陆
   * @param clientPhone
   * @return
   */
  @Select("select * from client where  clientPhone=#{clientPhone}")
  Client  VerificationLogin(String clientPhone);

  /**
   * 是否注册
   * @param clientPhone
   * @return
   */
  @Select("select count(*) from client where  clientPhone=#{clientPhone}")
  int  Isitregistered(String clientPhone);
}
