package com.magicdroidx.raknetty.handler.session;

import com.magicdroidx.raknetty.protocol.raknet.session.SessionPacket;

import java.net.InetSocketAddress;

/**
 * raknetty Project
 * Author: MagicDroidX
 */
public interface Session {

    SessionState state();

    InetSocketAddress address();

    void close();

    void close(String reason);

    int getTimeOut();

    int getMTU();

    void setMTU(int mtu);

    void update();

    void handle(SessionPacket packet);

}