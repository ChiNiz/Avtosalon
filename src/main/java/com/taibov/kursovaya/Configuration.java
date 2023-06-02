package com.taibov.kursovaya;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.sql.DataSource;

@org.springframework.context.annotation.Configuration
public class Configuration
{
    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://db/cars")
                .username("postgres")
                .password("Fnsrnjnfrjq123")
                .build();
    }
}
