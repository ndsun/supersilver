/**
 * @(zhajunjun)EstateSerializer.java, 2013-8-14. 
 * 
 * Copyright 2013 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.supersilver.utils;

import net.sf.json.JSONArray;

import com.supersilver.entity.TbUser;



/**
 *
 * @author yangze
 *
 */
public class EstateSerializer {
  public static void main(String[] args) {
	TbUser tb = new TbUser();
	tb.setUserId((long)1232);
	tb.setUserName("xiaozhang");
	tb.setUserPassword("sdrfdfdfd");
	JSONArray ja1 = JSONArray.fromObject(tb);
	System.out.println(ja1);
}

}
