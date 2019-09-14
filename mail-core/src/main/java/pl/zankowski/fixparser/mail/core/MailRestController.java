package pl.zankowski.fixparser.mail.core;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.zankowski.fixparser.mail.MailService;
import pl.zankowski.fixparser.mail.api.UserMailTO;

import javax.validation.Valid;

@RestController
@RequestMapping
@Api(tags = "Mail")
public class MailRestController {

    private final MailService mailService;

    @Autowired
    public MailRestController(final MailService mailService) {
        this.mailService = mailService;
    }

    @ApiOperation(value = "Send activation email")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Activation email has been sent.")
    })
    @PostMapping("/activation")
    public ResponseEntity sendActivationEmail(@Valid @RequestBody final UserMailTO request) {
        mailService.sendActivationEmail(request);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Send password reset email")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Password reset email has been sent.")
    })
    @PostMapping("/reset")
    public ResponseEntity sendResetPasswordEmail(@Valid @RequestBody final UserMailTO request) {
        mailService.sendResetPasswordEmail(request);
        return ResponseEntity.ok().build();
    }

}
