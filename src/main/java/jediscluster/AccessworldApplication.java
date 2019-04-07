package jediscluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("jediscluster.mapper")
public class AccessworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccessworldApplication.class, args);
    }
}
