package simo.devsid;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {

    public MyConfig() {
    }

    @Bean
    public SimpleJaxWsServiceExporter getWs() {
        SimpleJaxWsServiceExporter jaxWsExporter = new SimpleJaxWsServiceExporter();
        jaxWsExporter.setBaseAddress("http://localhost:8081/Bank");
        return jaxWsExporter;
    }

}
