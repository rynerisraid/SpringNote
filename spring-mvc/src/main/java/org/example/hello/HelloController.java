package org.example.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mvc")
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(ModelMap map){
        map.addAttribute("name","张三");
        return "hello";
    }

    @RequestMapping("/hello/{name}")
    public String HelloPath(ModelMap map, @PathVariable(value = "name") String name){
        Logger logger = LoggerFactory.getLogger(HelloController.class);
        logger.debug("调试日志");
        logger.info("一般日志");
        logger.warn("警告日志");
        logger.error("错误日志");
        map.addAttribute("name",name);
        return "hello";

    }


}
