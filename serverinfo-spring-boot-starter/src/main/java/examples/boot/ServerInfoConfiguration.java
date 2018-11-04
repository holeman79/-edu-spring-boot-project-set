package examples.boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 2. ServerInfo Bean을 생성하는 Java Config를 작성한다.
@Configuration
@EnableConfigurationProperties(ServerInfoProperties.class)
public class ServerInfoConfiguration {

    @Bean
    @ConditionalOnMissingBean // 기존 생성 Bean 이 없으면 이것을 사용할 수 있도록한다.
    public ServerInfo serverInfo(
            ServerInfoProperties serverInfoProperties){
        ServerInfo serverInfo = new ServerInfo();
        serverInfo.setAddress(serverInfoProperties.getAddress());
        serverInfo.setPort(serverInfoProperties.getPort());
        return serverInfo;
    }
}
