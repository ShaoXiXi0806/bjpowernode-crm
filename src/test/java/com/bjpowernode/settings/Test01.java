package com.bjpowernode.settings;

import com.bjpowernode.crm.utils.DateTimeUtil;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    @Test
    public void test01(){
        String lockState = "0";
        if ("0".equals(lockState)){
            System.out.println("账号已锁定");
        }
    }
}
