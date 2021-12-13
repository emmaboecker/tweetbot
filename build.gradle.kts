plugins {
    kotlin("jvm") version "1.6.0"
    id("com.github.johnrengelman.shadow") version "7.1.0"
    application
}

group = "net.stckoverflw"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://schlaubi.jfrog.io/artifactory/envconf/")
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("dev.schlaubi", "envconf", "1.1")
    implementation("io.github.redouane59.twitter", "twittered","2.13")
    implementation("dev.inmo", "krontab","0.6.6")
    implementation("ch.qos.logback", "logback-classic", "1.2.6")
    implementation("io.github.microutils", "kotlin-logging", "2.0.11")
}

application {
    mainClass.set("net.stckoverflw.tweetbot.LauncherKt")
}