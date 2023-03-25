package com.kj.auth;

import com.kj.auth.service.SysRoleService;
import com.kj.model.system.SysRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMpDemo2 {

    //注入
    @Autowired
    private SysRoleService service;

    //查询所有记录
    @Test
    public void getAll() {
        List<SysRole> list = service.list();
        System.out.println(list);
    }

}
