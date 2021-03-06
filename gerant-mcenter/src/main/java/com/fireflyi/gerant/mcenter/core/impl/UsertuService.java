package com.fireflyi.gerant.mcenter.core.impl;

import com.fireflyi.gerant.mcenter.core.McenterHandlerAdapter;
import com.fireflyi.gerant.mcenter.service.SendToRoute;
import com.fireflyi.gerant.rpclient.protobuf.Greq;
import com.fireflyi.gn.gerant.domain.enumentity.CmdIdEnum;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author by fireflyi (6025606@qq.com)
 * @website https://www.fireflyi.com
 * @date 2019/7/26
 * DESC TODO
 */
@Singleton
public class UsertuService extends McenterHandlerAdapter {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private static String cmdId = CmdIdEnum.USER_TO_USER.cmdId;

    @Inject
    SendToRoute rocketmq;

    @Override
    public void doHandler(Greq var1) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(var1.getCmdId());
    }

    @Override
    public String getCmdId() {
        return cmdId;
    }


}
