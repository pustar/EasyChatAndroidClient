package com.king.easychat.netty.packet.resp

import com.king.easychat.netty.MessageType
import com.king.easychat.netty.packet.Packet

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class LoginResp(val userId: String,val userName: String,val success: Boolean,val reason: String) : Packet() {


    override fun messageType(): Int {
        return MessageType.LOGIN_RESP
    }

    override fun toString(): String {
        return "LoginResp(userId='$userId', userName='$userName', success=$success, reason='$reason')"
    }


}