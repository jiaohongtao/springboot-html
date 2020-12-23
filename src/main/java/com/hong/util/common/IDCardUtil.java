package com.hong.util.common;

import com.hong.util.httpRequest.HttpClientUitl;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StringUtils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 身份证工具
 *
 * @author jiaohongtao
 * @version 1.0
 * @since 2020年12月23日
 */
public class IDCardUtil {
    /**
     * 根据身份证号判断性别
     *
     * @param idNumber 身份证号
     * @return sex
     */
    public static String judgeGender(String idNumber) throws IllegalArgumentException {
        // System.out.println(idNumber.length());
        if (idNumber.length() != 18 && idNumber.length() != 15) {
            throw new IllegalArgumentException("身份证号长度错误");
        }
        int gender;
        if (idNumber.length() == 18) {
            //如果身份证号18位，取身份证号倒数第二位
            char c = idNumber.charAt(idNumber.length() - 2);
            gender = Integer.parseInt(String.valueOf(c));
        } else {
            //如果身份证号15位，取身份证号最后一位
            char c = idNumber.charAt(idNumber.length() - 1);
            gender = Integer.parseInt(String.valueOf(c));
        }
        // System.out.println("gender = " + gender);
        if (gender % 2 == 1) {
            return "男";
        } else {
            return "女";
        }
    }

    /**
     * 根据身份证的号码算出当前身份证持有者的年龄
     *
     * @return age
     */
    public static int countAge(String idNumber) {
        if (idNumber.length() != 18 && idNumber.length() != 15) {
            throw new IllegalArgumentException("身份证号长度错误");
        }
        String year;
        String yue;
        String day;
        if (idNumber.length() == 18) {
            year = idNumber.substring(6).substring(0, 4);// 得到年份
            yue = idNumber.substring(10).substring(0, 2);// 得到月份
            day = idNumber.substring(12).substring(0, 2);//得到日
        } else {
            year = "19" + idNumber.substring(6, 8);// 年份
            yue = idNumber.substring(8, 10);// 月份
            day = idNumber.substring(10, 12);//日
        }
        Date date = new Date();// 得到当前的系统时间
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String fyear = format.format(date).substring(0, 4);// 当前年份
        String fyue = format.format(date).substring(5, 7);// 月份
        String fday = format.format(date).substring(8, 10);//
        int age = 0;
        if (Integer.parseInt(yue) == Integer.parseInt(fyue)) {//如果月份相同
            if (Integer.parseInt(day) <= Integer.parseInt(fday)) {//说明已经过了生日或者今天是生日
                age = Integer.parseInt(fyear) - Integer.parseInt(year);
            }
        } else {

            if (Integer.parseInt(yue) < Integer.parseInt(fyue)) {
                //如果当前月份大于出生月份
                age = Integer.parseInt(fyear) - Integer.parseInt(year);
            } else {
                //如果当前月份小于出生月份,说明生日还没过
                age = Integer.parseInt(fyear) - Integer.parseInt(year) - 1;
            }
        }
        // System.out.println("age = " + age);
        return age;
    }

    public static String getProvince(String idNumber) {
        String proNum = idNumber.substring(0, 3);
        System.out.println(proNum);
        ClassPathResource classPathResource = new ClassPathResource("static/province.txt");
        // StringBuilder buffer = new StringBuilder();
        try {
            InputStream inputStream = classPathResource.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
            while (bufferedReader.ready()) {
                // buffer.append((char) bufferedReader.read());
                String addresses = bufferedReader.readLine();
                String[] split = addresses.split(" ");
                if (proNum.equals(split[1])) {
                    // System.out.println(split[0]);
                    return split[0];
                }
                // System.out.println(addresses);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println(buffer.toString());
        return "母鸡";
    }

    public static void main(String[] args) {
        /*String idNumber = "130527199606212014";
        System.out.println(judgeGender(idNumber));
        System.out.println(countAge(idNumber));*/
        // System.out.println(HttpClientUitl.doHttpGet("http://www.syx7.com/Citydm.asp", new ArrayList<>()));

        System.out.println(getProvince("130**************4"));
    }
}
