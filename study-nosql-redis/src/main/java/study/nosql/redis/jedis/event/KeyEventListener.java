package study.nosql.redis.jedis.event;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.JedisPubSub;

@Slf4j
public class KeyEventListener extends JedisPubSub {

    /**
     * （★）普通
     */
    @Override
    public void onMessage(String channel, String message) {
        log.info("channel={}, message={}", channel, message);
    }

    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        log.info("订阅了{}", channel);
    }

    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        log.info("订阅了{}", channel);
    }

    /**
     * （★）模式
     */
    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        log.info("ffffffffffffff");
    }

    @Override
    public void onPMessage(String pattern, String channel, String message) {
        log.info("channel={}, message={}", channel, message);
    }

    @Override
    public void onPUnsubscribe(String pattern, int subscribedChannels) {
        log.info("channel={}, message={}");
    }
}
