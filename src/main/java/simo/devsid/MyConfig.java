package simo.devsid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;
import org.springframework.remoting.rmi.RmiServiceExporter;
import simo.devsid.rmi.BankRmiRemote;

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

    public RmiServiceExporter getRmiService(ApplicationContext ctx){
        RmiServiceExporter rmiExporter = new RmiServiceExporter();

        rmiExporter.setService(ctx.getBean("bankRmiService"));
        rmiExporter.setRegistryPort(8082);
        rmiExporter.setServiceInterface(BankRmiRemote.class);
        rmiExporter.setServiceName("BankRmi");
        //System.setProperty("java.rmi.server.hostname","192.168.1.44");

        return rmiExporter;

    }

}
