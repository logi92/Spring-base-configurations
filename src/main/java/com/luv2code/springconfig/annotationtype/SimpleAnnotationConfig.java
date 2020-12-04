package com.luv2code.springconfig.annotationtype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * For annotation config simple enough to add @ComponentScan
 *  and show package. Every Class with @Component become Bean.
 */
@Configuration
@ComponentScan("com.luv2code.springconfig.annotationtype")
public class SimpleAnnotationConfig {
}
