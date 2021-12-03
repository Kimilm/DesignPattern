package structural.flyweight.after;

// flyweight에 해당하는 클래스
public final class Font {
    // 주의! flyweight 에 해당하는 인스턴스는 Immutable 해야함 공유하는 데이터이기 때문에 변경이 일어나면 사용하는 모든 클래스에서 변경이 일어남. 변경 불가능하게!
    // 인트리짓 한 데이터를 가지고있는 클래스의 인스턴스는 변경이 가능해서는 안 됨
    // final 키워드를 사용하면 됨
    // 상속을 막아야하기 때문에 클래스에도 final
    private final String family;

    private final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
