package com.aro.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import lombok.extern.slf4j.*;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@Slf4j
public class MessageController {
    final Logger log = LoggerFactory.getLogger(MessageController.class);

    @GetMapping("/")
    public RedirectView index() {
         return new RedirectView("/swagger-ui.html");
    }

    @GetMapping("/messages")
    public HashMap<String, String> getMessage() {
        
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("message", "Logging Test Azure Red Hat Openshift - Azure Monitor.");
        log.info(map.get("message"));
        return map;
    }
    @GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
		String greeting = "Hello " + name;
        log.info(greeting);
        return greeting;
	}

    @GetMapping("/exception1")
    public void getException1() throws Exception {
        log.info("First custom exception");
        throw new Exception("Azure Monitor, First custom exception ARO");
    }

    @GetMapping("/exception2")
    public void getException2() throws Exception {
        log.info("Second custom exception");
        throw new Exception("Azure Monitor, Second custom exception ARO");
    }
}