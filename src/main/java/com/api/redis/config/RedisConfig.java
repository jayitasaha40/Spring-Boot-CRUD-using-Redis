package com.api.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public RedisConnectionFactory connectionFactory(){
        return new LettuceConnectionFactory();
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate(){

        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();

        //Connection Factory
        redisTemplate.setConnectionFactory(connectionFactory());

        //Key Serializer
        redisTemplate.setKeySerializer(new StringRedisSerializer()); //String to byte[] & Vice-versa

        //Value Serializer
        redisTemplate.setValueSerializer (new GenericJackson2JsonRedisSerializer()); //Convert Object to JSON

        return redisTemplate;
    }
}
