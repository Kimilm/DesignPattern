package structural.flyweight.before;

public class Client {

    //편집기를 만든다고 가정
    public static void main(String[] args) {
        // 각 글자의 속성을 나타내는 객체가 있다고 가정
        // 편집기에 글을 많이 쓸 수록 편집기가 점유하는 메모리가 급속도로 증가함
        Character c1 = new Character('h', "white", "Nanum", 12);
        Character c2 = new Character('e', "white", "Nanum", 12);
        Character c3 = new Character('l', "white", "Nanum", 12);
        Character c4 = new Character('l', "white", "Nanum", 12);
        Character c5 = new Character('o', "white", "Nanum", 12);
    }
}
