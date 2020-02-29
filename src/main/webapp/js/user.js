 $(function () {

        //账号注册
        $("#dis2").hide();
        //短信验证注册


        $("#sss").click(function () {
            //账号注册
            $("#dis1").hide();
            //短信验证注册
            $("#dis2").show();
        });

        $("#sss1").click(function () {
            $("#dis2").hide();
            $("#dis1").show();
        });

        $("#button-log").click(function () {
            if (!$("#clientAccount").val()) {
                layer.msg('用户名不能为空', { icon: 2, time: 1500 })
                return;
            } else if (!$("#clientPwd").val()) {
                layer.msg('密码不能为空', { icon: 2, time: 1500 })
                return;
            } else if (!$("#sure-input-pwd").val()) {
                layer.msg('请确认您输入的密码', { icon: 2, time: 1500 })
                return;
            } else if ($("#clientPwd").val() != $("#sure-input-pwd").val()) {
                layer.msg('两次输入不一致', { icon: 2, time: 1500 })
                return;
            } else {
                var clientAccount = $("#clientAccount").val();
                var clientPwd = $("#clientPwd").val();


                $.ajax({
                    type: "post",
                    url: "ClientServlet?action=Accountregistration",
                    dataType: "json",
                    data: { clientAccount: clientAccount, clientPwd: clientPwd },
                    success: function (data) {
                        console.log(data);
                        if (data.suc1 == true) {
                            $("#msg8").css("color", "red");
                            $("#msg8").text(data.msg1);
                            setTimeout(function () {
                                $("#msg8").text("")
                                //重置表单
                                $("#empForm").get(0).reset()
                            }, 2000)
                            return;
                        } else {
                            if (data.suc) {

                                $("#msg1").css("color", "green");
                            } else {
                                $("#msg1").css("color", "red");

                            }
                        }



                        $("#msg1").text(data.msg);
                        setTimeout(function () {
                            $("#msg1").text("")
                            //重置表单
                            $("#empForm").get(0).reset()
                        }, 2000)


                    }
                })
            }


        })

        //发送验证码
        var aaa = "";
        $("#codebuttno").click(function () {
            if (!$("#clientPhone").val()) {
                layer.msg('手机号码不能为空', { icon: 2, time: 1500 })
                return;
            } else {

                $.ajax({
                    type: "post",
                    url: "ClientServlet?action=code",
                    data: { clientPhone: $("#clientPhone").val() },
                    dataType: "json",
                    success: function (data) {
                        if(data.suc1){
                            console.log(data)
                            $("#msg9").css("color", "red");
                            $("#msg9").text(data.msg1);
                            setTimeout(function () {
                                $("#msg9").text("")
                                //重置表单
                                $("#empForm1").get(0).reset()
                            }, 1000)
                        }else{
                            btnCheck();
                            if (!data.msg) {

                                console.log(data.msg)
                            } else {

                                aaa += data.msg
                            }
                        }


                    }
                })
            }

        })
        // $("#button-log1").click(function () {
        //
        //     console.log("最后的值" + aaa);
        // })
        //验证码注册
        $("#button-log1").click(function () {
            if (!$("#clientPhone").val()) {
                layer.msg('手机号码不能为空', { icon: 2, time: 1500 })
                return;
            } else if (!$("#code").val()) {
                layer.msg('验证码不能为空', { icon: 2, time: 1500 })
                return;
            } else {
                var clientPhone = $("#clientPhone").val();
                alert(clientPhone)
                var code = $("#code").val();
                if (code == aaa) {
                    $.ajax({
                        type: "post",
                        url: "ClientServlet?action=SMSregistration",
                        dataType: "json",
                        data: { clientPhone: clientPhone, code: code },
                        success: function (data) {
                            console.log(data);
                         if (data.msg) {

                                $("#msg2").css("color", "green");
                            } else {
                                $("#msg2").css("color", "red");
                            }

                            $("#msg2").text(data.msg);
                            setTimeout(function () {
                                $("#msg2").text("")
                                //重置表单
                                $("#empForm1").get(0).reset()
                            }, 1000)
                            window.location.href = "user.html";

                        }
                    })
                }

            }

        })

        function btnCheck() {

            $("#codebuttno").addClass("on");
            var time = 60;
            $(this).attr("disabled", true);
            var timer = setInterval(function () {
                if (time == 0) {
                    clearInterval(timer);
                    $("#codebuttno").attr("disabled", false);
                    $("#codebuttno").val("获取验证码");
                    $("#codebuttno").removeClass("on");
                } else {

                    $('#codebuttno').val("正在发送验证码：" + time + "秒");

                    time--;

                }
            }, 1000);
        }
        // function addClient() {
        //
        //     $.ajax({
        //
        //         data: $("#form-demo").serialize(),
        //         url: "emps?action=add",
        //         dataType: "json",
        //         success: function (data) {
        //             console.log(data);
        //             if (data.suc) {
        //
        //                 $("#msg").css("color", "green");
        //             } else {
        //                 $("#msg").css("color", "red");
        //
        //             }
        //             $("#msg").text(data.msg);
        //             setTimeout(function () {
        //                 $("#msg").text("")
        //                 //重置表单
        //                 $("#empForm").get(0).reset()
        //             }, 1000)
        //         }
        //     })
        // }

    })

