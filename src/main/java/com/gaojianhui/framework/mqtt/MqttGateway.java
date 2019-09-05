package com.gaojianhui.framework.mqtt;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
/**
 * 使用例子
 * @RestController
	@Slf4j
	public class TestController {
 *  @Autowired
    private MqttGateway mqttGateway;
        @RequestMapping("/send")
    public String sendMqtt(@RequestParam("message") String message) {
        String sendData = message;
        log.info("send message {} ", sendData);
        // 推送消息
        mqttGateway.sendToMqtt(sendData, "mytopic/send");
        return "OK";
    }
    }
 * @author wuzhenxue
 *
 */
//@Component
//@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
public interface MqttGateway {
//	/**
//	 * 给特定的主题发送消息
//	 * @param data
//	 * @param topic
//	 */
//	void sendToMqtt(String data, @Header(MqttHeaders.TOPIC) String topic);
//	/**
//	 * 给默认的topic发送消息
//	 * @param data
//	 */
//	void sendToMqtt(String data);
	
}
