package com.br.rebecacorp.pessoal.services;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.params.SetParams;

public class RedisService {
    private Jedis jedis;

    public RedisService(){
        jedis = new Jedis("http://localhost:6379");
    }


    public void write(String key, String value, long expireInSeconds){
        var params = new SetParams();
        params.ex(expireInSeconds);
        jedis.set(key, value, params);
    }


    public String read(String key){
        return jedis.get(key);
    }
    
    public void close(){
        jedis.close();
    }

}
