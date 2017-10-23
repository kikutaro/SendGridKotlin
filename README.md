# Kotlin x SendGrid

KotlinからSendGridを利用してメール送信するサンプルコードです。

## 動作確認環境

- JDK 8u131
- IntelliJ IDEA 2017.1.5
- Kotlin 1.1.4-3
- Gradle

## Gradle

サンプルコードは以下の依存性で動作確認しています。Fuelをフルに活用する場合は[こちらの定義](https://github.com/kittinunf/Fuel#gradle)を参考にしてください。

``` Groovy
dependencies {
    compile "org.jetbrains.kotlin:kotlin-stdlib-jre8:$kotlin_version"
    compile "com.github.kittinunf.fuel:fuel:1.9.0"
    compile "com.github.kittinunf.fuel:fuel-gson:1.9.0"
}
```

## Kotlin x HttpClient

[HttpClientFuel.kt](https://github.com/kikutaro/SendGridKotlin/blob/master/src/main/kotlin/jp/co/kke/sendgrid/kotlin/HttpClientFuel.kt)
HttpClientのライブラリとして[Fuel](https://github.com/kittinunf/Fuel)を利用した例です。

## Kotlin x SendGrid Java

[SendGridLib.kt](https://github.com/kikutaro/SendGridKotlin/blob/master/src/main/kotlin/jp/co/kke/sendgrid/kotlin/SendGrindLib.kt)
[SendGrid公式のJavaライブラリ](https://github.com/sendgrid/sendgrid-java)を利用した例です。

## Kotlin x JavaMail(SMTP)

[JavaMailLib.kt](https://github.com/kikutaro/SendGridKotlin/blob/master/src/main/kotlin/jp/co/kke/sendgrid/kotlin/JavaMailLib.kt)
[JavaMail](https://javaee.github.io/javamail/)を利用してSMTPでメール送信する例です。