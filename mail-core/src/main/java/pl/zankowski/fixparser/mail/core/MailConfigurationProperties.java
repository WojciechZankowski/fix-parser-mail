package pl.zankowski.fixparser.mail.core;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
        prefix = "mail",
        ignoreUnknownFields = false
)
public class MailConfigurationProperties {

    private String from = "";
    private String baseUrl = "";

    public MailConfigurationProperties() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(final String from) {
        this.from = from;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(final String baseUrl) {
        this.baseUrl = baseUrl;
    }

}
