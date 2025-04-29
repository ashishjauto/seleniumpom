plugins {
    id("java")
}

group = "com.aj.auto.web"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.seleniumhq.selenium:selenium-java:4.31.0")

    testImplementation("org.testng:testng:7.11.0")

    implementation("com.github.javafaker:javafaker:1.0.2")
}

tasks.test {
    useJUnitPlatform()
}