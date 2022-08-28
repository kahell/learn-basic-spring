package kahellfoundation.spring.core;

import kahellfoundation.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnConfigurationTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOnConfiguration(){
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
