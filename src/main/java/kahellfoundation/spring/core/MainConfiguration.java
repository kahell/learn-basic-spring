package kahellfoundation.spring.core;

import kahellfoundation.spring.core.configuration.BarConfiguration;
import kahellfoundation.spring.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
