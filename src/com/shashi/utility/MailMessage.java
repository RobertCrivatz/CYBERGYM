package com.shashi.utility;

import jakarta.mail.MessagingException;

public class MailMessage {
	public static void registrationSuccess(String emailId, String name) {
		String recipient = emailId;
		String subject = "Inregistrare Reusita!";
		String htmlTextMessage = "" + "<html>" + "<body>"
				+ "<h2 style='color:green;'>Bine ați venit la Cybergym</h2>" + "" + "Hi " + name + ","
				+ "<br><br>Vă mulțumim că v-ați înscris la Cybergym.<br>"
				+ "Ne bucurăm că ne-ați ales pe noi. Vă invităm să vedeți ultima noastră colecție de produse noi pentru sport."
				+ "<br>Oferim până la 60% OFF pe majoritatea produselor noastre de sală. Deci, vă rugăm să vizitați site-ul nostru și să explorați."
				+ "<br><br>etc "
				+ "etc"
				+ "etc.<br><br>Ca un cadou de bun venit pentru noii noștri clienți, oferim 10% OFF de până la 50 Lei pentru prima achiziție de produse. "
				+ "<br>Pentru a beneficia de această ofertă trebuie doar să "
				+ " introduceți codul promoțional dat mai jos.<br><br><br> PROMO CODE: " + "CYBER500<br><br><br>"
				+ "O zi buna!<br>" + "" + "</body>" + "</html>";
		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void transactionSuccess(String recipientEmail, String name, String transId, double transAmount) {
		String recipient = recipientEmail;
		String subject = "Comanda plasata de Cybergym";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Hey " + name + ",<br/><br/>"
				+ "      Ne bucuram ca ati cumparat de la Cybergym!" + "      <br/><br/>"
				+ "      Comanda dumneavoastra a fost plasata cu succes si urmeaza sa fie procesata."
				+ "<br/><h6>Vă rugăm să rețineți că acesta este un proiect și că nu ați făcut nicio tranzacție reală!</h6>"
				+ "      <br/>" + "      Iată detaliile comandei dvs:<br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Order Id:</font>"
				+ "      <font style=\"color:green;font-weight:bold;\">" + transId + "</font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Total Plata:</font> <font style=\"color:green;font-weight:bold;\">"
				+ transAmount + "</font>" + "      <br/><br/>" + "      Multumim ca ati cumparat de la noi!<br/><br/>"
				+ "     Vino la cumpărături din nou! <br/<br/> <font style=\"color:green;font-weight:bold;\">Cybergym.</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void orderShipped(String recipientEmail, String name, String transId, double transAmount) {
		String recipient = recipientEmail;
		String subject = "Felicitări!!!, Comanda dvs. a fost expediată de la Cybergym";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Hey " + name + ",<br/><br/>"
				+ "      Ne bucurăm că ați cumpărat de la Cybergym!" + "      <br/><br/>"
				+ "      Comanda dvs. a fost expediată cu succes și este pe cale de a fi livrată."
				+ "<br/><h6>Vă rugăm să rețineți că acesta este un proiect și că nu ați făcut nicio tranzacție reală!</h6>"
				+ "      <br/>" + "      Iată detaliile comandei dvs:<br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Order Id:</font>"
				+ "      <font style=\"color:green;font-weight:bold;\">" + transId + "</font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Total Plata:</font> <font style=\"color:green;font-weight:bold;\">"
				+ transAmount + "</font>" + "      <br/><br/>" + "      Multumim ca ati cumparat de la noi!<br/><br/>"
				+ "      Vino la cumpărături din nou! <br/<br/> <font style=\"color:green;font-weight:bold;\">Cybergym.</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static void productAvailableNow(String recipientEmail, String name, String prodName, String prodId) {
		String recipient = recipientEmail;
		String subject = "Produsul " + prodName + " este acum valabil";
		String htmlTextMessage = "<html>" + "  <body>" + "    <p>" + "      Hey " + name + ",<br/><br/>"
				+ "      Ne bucurăm că ați cumpărat de la Cybergym!" + "      <br/><br/>"
				+ "      Conform istoricului dvs. recent de navigare, am văzut că ați căutat un produs care nu era disponibil în cantitate suficientă."
				+ " la acea data. <br/><br/>"
				+ "Suntem bucuroși să spunem că produsul numit <font style=\"color:green;font-weight:bold;\">" + prodName
				+ "</font> cu " + "product Id <font style=\"color:green;font-weight:bold;\">" + prodId
				+ "</font> este acum valabil in magazinul nostru!"
				+ "<br/><h6>Vă rugăm să rețineți că acesta este un proiect și că nu ați făcut nicio tranzacție reală!</h6>"
				+ "      <br/>" + "      Here is The product detail which is now available to shop:<br/>"
				+ "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Product Id: </font><font style=\"color:green;font-weight:bold;\">"
				+ prodId + " " + "      </font><br/>" + "      <br/>"
				+ "      <font style=\"color:red;font-weight:bold;\">Product Name: </font> <font style=\"color:green;font-weight:bold;\">"
				+ prodName + "</font>" + "      <br/><br/>" + "      Thanks for shopping with us!<br/><br/>"
				+ "      Come Shop Again! <br/<br/><br/> <font style=\"color:green;font-weight:bold;\">Cybergym.</font>"
				+ "    </p>" + "    " + "  </body>" + "</html>";

		try {
			JavaMailUtil.sendMail(recipient, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static String sendMessage(String toEmailId, String subject, String htmlTextMessage) {
		try {
			JavaMailUtil.sendMail(toEmailId, subject, htmlTextMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
			return "FAILURE";
		}
		return "SUCCESS";
	}
}
