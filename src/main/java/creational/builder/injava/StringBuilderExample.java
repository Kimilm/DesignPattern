package creational.builder.injava;

public class StringBuilderExample {
    public static void main(String[] args) {
        //StringBuilder 와 StringBuffer의 차이는 synchronized 차이, StringBuilder가 synchronized를 사용하지 않는다.
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteShip").append("keesun").toString();
        System.out.println(result);
    }
}
