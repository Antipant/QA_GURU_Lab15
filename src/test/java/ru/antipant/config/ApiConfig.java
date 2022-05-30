package ru.antipant.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:configProperties/api.properties")
public interface ApiConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://www.comindware.com/ru/")
    String baseUrl();

    @Key("token")
    String token();
}
