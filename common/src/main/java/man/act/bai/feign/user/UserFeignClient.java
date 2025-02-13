package man.act.bai.feign.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "UserServer")
public interface UserFeignClient {
    @GetMapping(path = "/")
    String index();
}
