package kahellfoundation.spring.core;

import kahellfoundation.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "kahellfoundation.spring.core.repository",
        "kahellfoundation.spring.core.service",
        "kahellfoundation.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
