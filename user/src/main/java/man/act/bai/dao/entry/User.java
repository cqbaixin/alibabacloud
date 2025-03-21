package man.act.bai.dao.entry;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Date createdAt;
    private Date UpdatedAt;
}
