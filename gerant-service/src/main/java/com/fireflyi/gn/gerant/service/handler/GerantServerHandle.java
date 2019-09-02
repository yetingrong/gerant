package com.fireflyi.gn.gerant.service.handler;

import com.fireflyi.gerant.rpclient.protobuf.Greq;
import com.fireflyi.gn.gerant.common.util.ProToBufBuild;
import com.fireflyi.gn.gerant.domain.enumentity.CmdIdEnum;
import com.fireflyi.gn.gerant.domain.protobuf.GerantReqProtobuf;
import com.fireflyi.gn.gerant.service.core.McenterRpcClient;
import com.fireflyi.gn.gerant.service.service.RpcClient;
import com.google.inject.Inject;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author by fireflyi (6025606@qq.com)
 * @website https://www.fireflyi.com
 * @date 2019/7/18
 * DESC TODO
 */

@ChannelHandler.Sharable
public class GerantServerHandle extends SimpleChannelInboundHandler<Greq> {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    RpcClient rpcClient;

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext,Greq greq) throws Exception {
        log.info("长连接服务收到, cmdId->"+greq.getCmdId()+"收到"+ greq.getReqMsg());
        //rpcClient.mcenterRpcClient().mcPipline(greq);


        McenterRpcClient ss = new McenterRpcClient("127.0.0.1",50051);

        ss.getStub().mcPipline(greq);

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("有新链接");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {

        log.info("连接断开");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        //异常时断开连接
        cause.printStackTrace() ;
        ctx.close() ;
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent){
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt ;
            //客户端心跳
            if (idleStateEvent.state() == IdleState.WRITER_IDLE){
                Greq.Builder heartBeat = ProToBufBuild.Pinger();
                ctx.writeAndFlush(heartBeat).addListeners((ChannelFutureListener) future -> {
                    if (!future.isSuccess()) {
                        future.channel().close();
                    }
                }) ;
            }
        }
        super.userEventTriggered(ctx, evt);
    }

}
