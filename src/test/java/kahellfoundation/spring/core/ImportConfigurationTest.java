package kahellfoundation.spring.core;

import kahellfoundation.spring.core.data.Bar;
import kahellfoundation.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportConfigurationTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testImport(){
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);
    }
}
