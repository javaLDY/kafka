package cn.baiing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.kafka.support.KafkaHeaders;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public class KafkaProduceService {
	
	 @Autowired
	 @Qualifier("kafkaTopicTest")
	 MessageChannel channel;
	 
	 public void sendUserInfo(String topic, String obj) {
	    channel.send(MessageBuilder.withPayload(obj)
	                                 .setHeader(KafkaHeaders.TOPIC,topic)
	                                 .build());
	 }

}
