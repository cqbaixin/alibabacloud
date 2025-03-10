package man.act.bai.serivce;

import man.act.bai.dao.entry.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getUsers();
}
