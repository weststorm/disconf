package com.baidu.disconf.core.test.path;

import org.junit.Assert;
import org.junit.Test;

import com.baidu.disconf.core.common.constants.DisConfigTypeEnum;
import com.baidu.disconf.core.common.path.DisconfWebPathMgr;
import com.baidu.disconf.core.test.common.BaseCoreTestCase;

/**
 * @author liaoqiqi
 * @version 2014-6-16
 */
public class DisconfWebPathMgrTestCase extends BaseCoreTestCase {

    @Test
    public void getZooPrefixUrlTest() {

        String result = DisconfWebPathMgr.getZooPrefixUrl("/test");

        Assert.assertEquals("/test/prefix", result);
    }

    @Test
    public void getZooHostsUrlTest() {

        String result = DisconfWebPathMgr.getZooHostsUrl("/test");

        Assert.assertEquals("/test/hosts", result);
    }

    @Test
    public void getRemoteUrlParameterTest() {

        String fileUrl =
            DisconfWebPathMgr.getRemoteUrlParameter("test", "app", "version", "env", "key", DisConfigTypeEnum.FILE);
        System.out.println(fileUrl);
        Assert.assertEquals("test/file?app=app&env=env&type=0&version=version&key=key", fileUrl);

        String itemUrl =
            DisconfWebPathMgr.getRemoteUrlParameter("test", "app", "version", "env", "key", DisConfigTypeEnum.ITEM);
        System.out.println(fileUrl);
        Assert.assertEquals("test/item?app=app&env=env&type=1&version=version&key=key", itemUrl);
    }
}
