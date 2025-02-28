package man.act.bai.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import man.act.bai.feign.user.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    public UserFeignClient userFeignClient;
    @GetMapping(path = "/")
    public String index()
    {
        return "Welcome,Order";
    }

    @GetMapping(path = "/order/user")
    public String user()
    {
        return  "orderService:"+userFeignClient.index();
    }

    @GetMapping(path = "/Sentinel")
    @SentinelResource(value = "Sentinel")
    public String sentinel()
    {
        return  "orderService:Sentinel";
    }
}
