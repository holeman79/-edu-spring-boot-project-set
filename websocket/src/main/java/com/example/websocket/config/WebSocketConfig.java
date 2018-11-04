package com.example.websocket.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket    // 웹소켓 관련 설정이 자동으로 설정됨.
public class WebSocketConfig implements WebSocketConfigurer {
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // websocket 접속경로 : /ws
        // sockjs를 지원하도록 한다.
        registry.addHandler(new SocketHandler(), "/ws").withSockJS();
    }
}
