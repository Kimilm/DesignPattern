package creational.builder.injava;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        //uri를 문자열로 만드는것보다 안전하게 생성 가능
        //스프링에 구현되어있는 xxxBuilder 네이밍을 가진 친구들은 거진 이런 형태로 구현되어있다.
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java-playlist-ep1")
                .build();
        System.out.println(howToStudyJava);

        //이후에 추가적인 기능을 제공하기도 한다
        UriComponents alsoCanThis = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java playlist ep1")
                .build()
                .encode();
        System.out.println(alsoCanThis);
    }
}
