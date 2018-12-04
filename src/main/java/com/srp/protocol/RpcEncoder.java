package com.srp.protocol;

import com.srp.serializer.KryoSerializer;
import com.srp.serializer.Serializer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @ Author: Su RuiPeng
 * @ Date: 2018/10/18
 */
public class RpcEncoder extends MessageToByteEncoder<Object> {
    private Serializer serializer = new KryoSerializer();

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Object msg, ByteBuf out) throws Exception {

        byte[] bytes = serializer.serialize(msg);
        int length = bytes.length;
        out.writeInt(length);
        out.writeBytes(bytes);
    }
}
