package net.stckoverflw.tweetbot

import dev.inmo.krontab.doWhile
import io.github.redouane59.twitter.TwitterClient
import mu.KotlinLogging
import net.stckoverflw.tweetbot.config.Config
import net.stckoverflw.tweetbot.twitter.credentials

private val LOG = KotlinLogging.logger { }

class TwitterBot {

    private val twitter: TwitterClient = TwitterClient(credentials {
        apiKey = Config.TWITTER_API_KEY
        apiSecretKey = Config.TWITTER_API_SECRET
        accessToken = Config.TWITTER_ACCESS_TOKEN
        accessTokenSecret = Config.TWITTER_ACCESS_SECRET
    })

    suspend fun start() {
        LOG.info("Starting Schedule \"${Config.KRONTAB_SCHEDULE}\"")
        doWhile(Config.KRONTAB_SCHEDULE) {
            val text = Config.TWEET_TEXT.random()
            twitter.postTweet(text)
            LOG.info("Posted Tweet: $text")
            true
        }
    }

}