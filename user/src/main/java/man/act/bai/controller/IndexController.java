package man.act.bai.controller;

import man.act.bai.feign.order.OrderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    public OrderFeignClient orderFeignClient;
    @GetMapping(path = "/")
    public String index()
    {
        return "welcome,User";
    }

    @GetMapping(path = "/user/order")

    public String order()
    {
        return  "userIndex:"+orderFeignClient.index();
    }
}
