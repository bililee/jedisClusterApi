package jediscluster.controller;


import jediscluster.service.redis.RedisClusterApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RedisClusterApi redisClusterApi;

    @ResponseBody
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String world() {
        System.out.println("hello worold");
        return "hello world1";
    }

    @ResponseBody
    @RequestMapping(value="/signalRedis", method=RequestMethod.GET)
    public String signalRedis() {
        return redisClusterApi.tryRedis();
    }
}
