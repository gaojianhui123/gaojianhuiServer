package com.sanyi.framework.mqtt;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;
import org.springframework.integration.mqtt.outbound.MqttPahoMessageHandler;
import org.springframework.integration.mqtt.support.DefaultPahoMessageConverter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

//@Configuration
//@IntegrationComponentScan
public class MQTTConfig {
//	    @Value("${spring.mqtt.username}")
//	    private String username;
//
//	    @Value("${spring.mqtt.password}")
//	    private String password;
//
//	    @Value("${spring.mqtt.url}")
//	    private String hostUrl;
//
//	    @Value("${spring.mqtt.client.out.id}")
//	    private String clientOutId;
//
//	    @Value("${spring.mqtt.client.in.id}")
//	    private String clientInId;
//
//	    @Value("${spring.mqtt.default.topic}")
//	    private String defaultTopic;
//
//	    // client factory
//	    @Bean
//	    public MqttConnectOptions getMqttConnectOptions() {
//	        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
////	         mqttConnectOptions.setUserName(username);
////	         mqttConnectOptions.setPassword(password.toCharArray());
//	        mqttConnectOptions.setServerURIs(new String[]{hostUrl});
//	        mqttConnectOptions.setKeepAliveInterval(20);
//	        return mqttConnectOptions;
//	    }
//
//	    @Bean
//	    public MqttPahoClientFactory mqttClientFactory() {
//	        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
//	        factory.setConnectionOptions(getMqttConnectOptions());
//	        return factory;
//	    }
//
//	    // 推送消息的配置
//	    @Bean
//	    @ServiceActivator(inputChannel = "mqttOutboundChannel")
//	    public MessageHandler mqttOutbound() {
//	        MqttPahoMessageHandler messageHandler = new MqttPahoMessageHandler(clientOutId, mqttClientFactory());
//	        messageHandler.setAsync(true);
//	        messageHandler.setDefaultQos(1);
//	        messageHandler.setDefaultTopic(defaultTopic);
//	        return messageHandler;
//	    }
//
//	    @Bean
//	    public MessageChannel mqttOutboundChannel() {
//	        return new DirectChannel();
//	    }
//	    
//	    /**
//	     * 以下为消息接受部分
//	     */
//	    @Bean
//	    public MessageChannel mqttInputChannel() {
//	        return new DirectChannel();
//	    }
//
//	    @Bean
//	    public MessageProducer inbound() {
//	        MqttPahoMessageDrivenChannelAdapter adapter =
//	                new MqttPahoMessageDrivenChannelAdapter(clientInId,mqttClientFactory());
//	        adapter.setCompletionTimeout(10 * 1000);
//	        adapter.setConverter(new DefaultPahoMessageConverter());
//	        adapter.setQos(1);
//	        adapter.addTopic(defaultTopic);
//	        adapter.setOutputChannel(mqttInputChannel());
//	        return adapter;
//	    }
//	    /**
//	     * 可以动态添加topic，如：
//	     * @RestController
//			@Slf4j
//			public class TestController {
//			@Autowired
//	    		MqttPahoMessageDrivenChannelAdapter adapter;
//	 		@RequestMapping("/subscribe")
//		    public String subscribe(@RequestParam("topic") String topic) {
//		        String defaultTopic = "mytopic/send";
//		        if (StringUtils.isNotBlank(topic)) {
//		            defaultTopic = topic;
//		        }
//		        log.info("subscribe topic {} ", defaultTopic);
//		        // 防止重复订阅，先移除再订阅
//		        adapter.removeTopic(defaultTopic);
//		        adapter.addTopic(defaultTopic);
//		        return "OK";
//		    		}
//	    		}
//	     * @return
//	     */
//	    @Bean
//	    @ServiceActivator(inputChannel = "mqttInputChannel")
//	    public MessageHandler handler() {
//	        return new MessageHandler() {
//
//	            @Override
//	            public void handleMessage(Message<?> message) throws MessagingException {
//	            	//TODO 消息处理
//	                System.out.println(message.getPayload());
//	            }
//
//	        };
//	    }
}
