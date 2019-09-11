/**
 * Create Date:2019年9月11日
 */
package com.bw.test;

import java.sql.Date;

import com.bw.comtroller.Comtroller;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:穆灿
 * <br>Date:2019年9月11日
 */
public class Testmain {
  public static int getAge(Date age) {
    Comtroller ct = new Comtroller();
    String i = ct.age();
    if (i == "2000") {
      return 19;
    } else if (i == "2001") {

      return 18;
    }
    return 18;
  }
}
