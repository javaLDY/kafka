package cn.baiing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.baiing.service.KafkaProduceService;

@RequestMapping("/kafka")
@Controller
public class KafkaController {
	
	@Autowired
	private KafkaProduceService kafkaProduceService;

	@RequestMapping("sendMessage")
	public void sendMessage(String topic, String obj){
		kafkaProduceService.sendUserInfo(topic, obj);
	}
}
