package man.act.bai.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix ="act.bai" )
@Component
@RefreshScope
public class ActConfig {

    @NacosValue(value = "${name:default_url}", autoRefreshed = true)
    private  String name;

    private  String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "ActConfig{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
