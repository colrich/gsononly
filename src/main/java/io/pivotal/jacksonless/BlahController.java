package io.pivotal.jacksonless;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlahController {

    @GetMapping("/showmap")
    public Map<String, String> showserializemap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("aoeu", "htns");
        map.put("onteuh", "onethunot");
        return map;
    }

    @GetMapping("/showobj")
    public SomeDomainObject showserializeobj() {
        return new SomeDomainObject("onetuhntehu", "noteuhnotuhonteuh");
    }

    @PostMapping("/postobj")
    public String postobject(@RequestBody SomeDomainObject obj) {
        System.out.println("posted object - " + obj);
        return "got object from post - " + obj;
    }
}