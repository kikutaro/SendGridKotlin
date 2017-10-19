package jp.co.kke.sendgrid.kotlin

import java.util.*
import javax.mail.*
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

fun sendByJavaMail() {
    val prop = Properties()
    prop.put("mail.smtp.host", "smtp.sendgrid.net")
    prop.put("mail.smtp.port", "587")
    prop.put("mail.smtp.auth", "true")

    val session = Session.getDefaultInstance(prop, object: Authenticator(){
        override fun getPasswordAuthentication(): PasswordAuthentication {
            return PasswordAuthentication("user", "pass")
        }
    })
    val message = MimeMessage(session)
    message.setFrom("from@example.com")
    message.setRecipient(Message.RecipientType.TO, InternetAddress("to@example.com"))
    message.setSubject("Kotlinからの送信テスト(SMTP/JavaMail)", "UTF-8")
    message.setText("Kotlinから送った", "UTF-8")
    Transport.send(message)
}