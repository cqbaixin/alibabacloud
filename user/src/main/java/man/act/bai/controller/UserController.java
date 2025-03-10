package man.act.bai.controller;

import man.act.bai.dao.entry.User;
import man.act.bai.serivce.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/userList")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
