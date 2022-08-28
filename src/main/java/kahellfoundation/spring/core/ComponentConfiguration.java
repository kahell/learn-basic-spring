package kahellfoundation.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "kahellfoundation.spring.core.repository",
        "kahellfoundation.spring.core.service"
})
public class ComponentConfiguration {
}
