package man.act.bai.feign.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "OrderServer")
public interface OrderFeignClient {
    @GetMapping(path = "/")
    String index();
}
