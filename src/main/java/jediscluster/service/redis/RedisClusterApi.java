package jediscluster.service.redis;


import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@Service
public class RedisClusterApi {

    public String tryRedis() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.setex("jedis", 200,"Hello Work!");
        System.out.println(jedis.get("jedis"));
        String jedisWord = jedis.get("jedis");
        jedis.close();
        return jedisWord;
    }
}
