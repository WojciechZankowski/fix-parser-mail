package pl.zankowski.fixparser.mail.restclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.zankowski.fixparser.mail.MailService;
import pl.zankowski.fixparser.mail.api.UserMailTO;

@Service
public class RestClientMailService implements MailService {

    private final RestTemplate restTemplate;

    @Autowired
    public RestClientMailService(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void sendActivationEmail(final UserMailTO request) {
        restTemplate.postForEntity("http://mail-service/activation", request, ResponseEntity.class);
    }

    @Override
    public void sendResetPasswordEmail(final UserMailTO request) {
        restTemplate.postForEntity("http://mail-service/reset", request, ResponseEntity.class);
    }

}
