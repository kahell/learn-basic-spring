package kahellfoundation.spring.core;

import kahellfoundation.spring.core.repository.CategoryRepository;
import kahellfoundation.spring.core.repository.ProductRepository;
import kahellfoundation.spring.core.service.CategoryService;
import kahellfoundation.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentConfigurationTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService(){
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService",ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection(){
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testSetterDependencyInjection(){
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }
}
