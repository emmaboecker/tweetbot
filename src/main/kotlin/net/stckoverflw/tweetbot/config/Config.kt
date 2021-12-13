package net.stckoverflw.tweetbot.config

import dev.schlaubi.envconf.environment
import dev.schlaubi.envconf.getEnv

object Config {

    val TWITTER_API_KEY by environment
    val TWITTER_API_SECRET by environment
    val TWITTER_ACCESS_TOKEN by environment
    val TWITTER_ACCESS_SECRET by environment

    val KRONTAB_SCHEDULE by environment
    val TWEET_TEXT: List<String> by getEnv {
        it.split("|")
    }

}