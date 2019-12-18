package com.lits.automation.hw8;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import main.java.com.lits.automation.hw8.Exchange;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.net.URL;
import java.util.stream.Collectors;

public class Jacson {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=&json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        Exchange exchange = new Exchange();

        List<Exchange> exchangeList = objectMapper.readValue(url, new TypeReference<List<Exchange>>() {});
        //System.out.println(exchangeList);

        List<Exchange> collect = exchangeList.stream()
                .filter(s -> s.getRate() > 15)
                .collect(Collectors.toList());

        System.out.println(collect);




//        objectMapper.writeValue(new File("target/car.json"), exchange);

//        String json = "{ \"name\" : \"product\", \"count\" : 12, \"adress\" : \"grove street\" }";
//        Shop shop = objectMapper.readValue(json, Shop.class);
//        System.out.println(shop);

//        String jsonCarArray = "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
//        List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
//        System.out.println(listCar);
    }
}
