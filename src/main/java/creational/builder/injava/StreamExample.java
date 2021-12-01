package creational.builder.injava;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
        Stream<String> names = stringStreamBuilder.add("keesun").add("whiteShip").build();
        names.forEach(System.out::println);

        //이렇게 하면 안 됨
//        Stream<String> fail = Stream.builder().add("keesun").add("whiteShip").build();
        //이렇게 하면 됨 이걸 몰랐다면 자바 공부가 부족한..것.. TㅅT
        Stream<String> fail = Stream.<String>builder().add("keesun").add("whiteShip").build();
    }
}
