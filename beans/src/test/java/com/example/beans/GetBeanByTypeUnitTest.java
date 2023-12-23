package com.example.beans;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.model.Lion;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetBeanByTypeUnitTest {
    private ApplicationContext context;

    @BeforeAll
    void setup() {
        context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    }

    @Test
    void whenGivenExistingUniqueType_thenShouldReturnRelatedBean() {
        Lion lion = context.getBean(Lion.class);

        assertNotNull(lion);
    }

    @Test
    void whenGivenAmbiguousType_thenShouldThrowException() {
        //assertThrows(NoUniqueBeanDefinitionException.class, () -> context.getBean(AnnotationConfig.Animal.class));
    	assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean(AnnotationConfig.Animal.class));
    }
}
