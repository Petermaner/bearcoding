package com.github.bearcoding.forum.api.model.enums;

/**
 * websocket 连接 状态
 *
 *
 *
 */
public enum WsConnectStateEnum {
    // 初始化
    INIT,
    // 连接中
    CONNECTING,
    // 已连接
    CONNECTED,
    // 连接失败
    FAILED,
    // 已关闭
    CLOSED,
    ;
}
