import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class Jacson {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        Car car = new Car("white", "KIA");
        objectMapper.writeValue(new File("target/car.json"), car);

//        String json = "{ \"name\" : \"product\", \"count\" : 12, \"adress\" : \"grove street\" }";
//        Shop shop = objectMapper.readValue(json, Shop.class);
//        System.out.println(shop);

        String jsonCarArray = "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
        List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
        System.out.println(listCar);
    }
}
