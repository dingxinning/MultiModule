package com.netty.discard;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by Wuxiang on 2017/11/3.
 */
public class DiscardServerHandler extends SimpleChannelInboundHandler<Object>  {

    public void messageReceived(ChannelHandlerContext ctx, Object msg) {
        System.out.println("messageReceived:" + msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        System.out.println("exceptionCaught");
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        System.out.println(o);
        System.out.println(channelHandlerContext);
    }
}
