package com.fourroro.nolleogasil.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker // 웹소켓 메시지 핸들링 활성화
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /*
    STOMP를 사용하면 웹소켓만 사용할 때와 다르게 하나의 연결주소마다 핸들러 클래스를 따로 구현할 필요없이
    Controller 방식으로 간편하게 사용할 수 있다.

    subscriber(receive socket)
    : 채팅방에 입장하여 해당 채팅창을 구독, 즉 참여하고 있는 채팅창에 오는 메시지를 실시간으로 받아볼 수 있으려면 먼저 구독이 되어있어야 한다.

    sender(send socket)
    : 참여하고 있는 채팅창에 글을 써서 해당하는 주소로 메시지를 전달한다.

    broker
    : 연결된 socket들의 세션 관리를 해준다. 즉 subscriber를 구독한 채널에 연결시켜주고,
    sender가 그 채널에 메시지를 보내면 subscriber에게 전달해주는 중간 다리 역할을 한다.
    */

        // STOMP에서 사용하는 메시지 브로커 설정
        @Override
        public void configureMessageBroker(MessageBrokerRegistry config) {
            // enableSimpleBroker: 내장 메시지 브로커를 사용하기 위한 메소드
            // 파라미터로 지정한 prefix가 붙은 메시지를 발행할 경우, 메시지 브로커가 이를 처리하게 된다.
            // 메시지를 구독하는 요청 url => 즉 메시지 받을 때
            config.enableSimpleBroker("/room"); //해당 주소를 구독하고 있는 클라이언트들에게 메세지 전달

            // 메세지 핸들러로 라우팅 되는 prefix를 파라미터로 지정할 수 있다.
            // 메시지 가공 처리가 필요한 경우, 가공 핸들러로 메시지를 라우팅 되도록하는 설정
            // 메시지를 발행하는 요청 url => 즉 메시지 보낼 때
            config.setApplicationDestinationPrefixes(("/send")); //클라이언트에서 보낸 메세지를 받을 prefix
        }

        @Override
        public void registerStompEndpoints(StompEndpointRegistry registry) {
            registry.addEndpoint(("")) //SockJS 연결 주소
                    .withSockJS(); //버전 낮은 브라우저에서도 사용 가능
        }
}
