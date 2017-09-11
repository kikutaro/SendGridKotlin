package jp.co.kke.sendgrid.kotlin

import com.sendgrid.*
import java.io.IOException

fun sendBySendGrid() {
    val from = Email("test@example.com")
    val subject = "Sending with SendGrid is Fun"
    val to = Email("test@example.com")
    val content = Content("text/plain", "and easy to do anywhere, even with Kotlin")
    val mail = Mail(from, subject, to, content)

    val sg = SendGrid("*****")
    val request = Request()
    try {
        request.method = Method.POST
        request.endpoint = "mail/send"
        request.body = mail.build()
        val response = sg.api(request)
        System.out.println(response.statusCode)
        System.out.println(response.body)
        System.out.println(response.headers)
    } catch (ex: IOException) {
        throw ex
    }
}