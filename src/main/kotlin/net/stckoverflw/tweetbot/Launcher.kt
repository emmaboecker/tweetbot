package net.stckoverflw.tweetbot

import org.slf4j.LoggerFactory
import ch.qos.logback.classic.Level
import ch.qos.logback.classic.Logger

suspend fun main() {
    val rootLogger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME) as Logger
    rootLogger.level = Level.DEBUG
    TwitterBot().start()
}