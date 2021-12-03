package structural.flyweight.after;

// 익스트리짓 한 데이터를 가지고있는 클래스
public class Character {
    private char value;

    private String color;

    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
