import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig {

    @Bean
    public IOTDevice IOTDeviceBean() {
        return new IOTDevice();
    }
}