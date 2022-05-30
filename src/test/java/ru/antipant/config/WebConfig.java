package ru.antipant.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:config/local.properties")
public interface WebConfig extends Config {

    @Key("remoteWebDriver")
    String getRemoteWebDriver();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://www.comindware.com/ru/")
    String getBaseUrl();

    @Key("remoteUrl")
    URL getRemoteUrl();
}
