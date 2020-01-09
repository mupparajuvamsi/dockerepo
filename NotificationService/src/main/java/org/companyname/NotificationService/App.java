package org.companyname.NotificationService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@PropertySource("classpath:application.properties")
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Value("${senderEmailAddress}")
	String senderEmailAddress;
	@Value("${sendEmailPassword}")
	String senderEmailPassword;

	// api for sending email to the user
	@PostMapping("/sendEmail")
	public void sendEmail(@RequestParam String useremail) {
		Mailer mailer = new Mailer();
		mailer.send(senderEmailAddress, senderEmailPassword, useremail, "hello Sandeep", "How r u?");
	}
}
