package pl.zankowski.fixparser.mail;

import pl.zankowski.fixparser.mail.api.UserMailTO;

public interface MailService {

    void sendActivationEmail(final UserMailTO request);

    void sendResetPasswordEmail(final UserMailTO request);

}
