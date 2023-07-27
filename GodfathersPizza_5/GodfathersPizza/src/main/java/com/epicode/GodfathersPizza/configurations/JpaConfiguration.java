package com.epicode.GodfathersPizza.configurations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.epicode.GodfathersPizza.classes")
public class JpaConfiguration {

}
