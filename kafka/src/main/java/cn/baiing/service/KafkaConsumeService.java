package cn.baiing.service;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumeService {
	
	 static final Logger logger = LoggerFactory.getLogger(KafkaConsumeService.class);
	 
	    public void processMessage(Map<String, Map<Integer, String>> msgs) {
//	    	try {
//	    		System.out.println("开始模拟宕机情况----------------------------------");
//				Thread.sleep(1000*10l);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	        System.out.println(("===============processMessage==============="));
	        for (Map.Entry<String, Map<Integer, String>> entry : msgs.entrySet()) {
	        	System.out.println("============Topic:" + entry.getKey());
	            LinkedHashMap<Integer, String> messages = (LinkedHashMap<Integer, String>) entry.getValue();
	            Set<Integer> keys = messages.keySet();
	            for (Integer i : keys)
	            System.out.println("======Partition:" + i);
	            Collection<String> values = messages.values();
	            for (Iterator<String> iterator = values.iterator(); iterator.hasNext();) {
	                String message = "["+iterator.next()+"]";
	                logger.info("=====message:" + message);
	                System.out.println("=====message:" + message);
	            }
	 
	        }
	    }

}
