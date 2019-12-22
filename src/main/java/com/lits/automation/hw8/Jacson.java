package com.lits.automation.hw8;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

        List<Exchange> collect = exchangeList.stream()
                .filter(s -> s.getRate() > 15)
                .collect(Collectors.toList());

        System.out.println(collect);

        for (Exchange element : collect) {

        }
    }
}
