package creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws Exception {
        // ver.01
//        Settings settings = new Settings();
//        Settings settings1 = new Settings();
//        System.out.println(settings != settings1);

        // ver.02
//        Settings settings = Settings.getInstance();
//        System.out.println(settings == settings.getInstance());

        // ver.04 의 문제점
        SettingSolution05 settings = SettingSolution05.getInstance();

        // 1. reflection을 사용하면 깨진다.
        Constructor<SettingSolution05> constructor = SettingSolution05.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingSolution05 settings1 = constructor.newInstance();

        System.out.println("use reflection can avoid singleton");
        System.out.println((settings == settings1) + "\n");

        // 2. 직렬화 / 역직렬화를 사용하면 깨진다
        // 직렬화하여 오브젝트를 파일에 쓰기
        try (ObjectOutput out = new ObjectOutputStream((new FileOutputStream("settings.obj")))) {
            out.writeObject(settings);
        }
        // 역직렬화하여 파일을 오브젝트로 읽기 -> 역직렬화를 할 때 반드시 생성자가 새로 만들어짐
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (SettingSolution05) in.readObject();
        }
        // 직렬화/역직렬화는 많이 사용되는 코드가 아니긴 한데 이런 가능성이 존재하긴 한다.
        // 지금은 readResolver를 오버라이딩해서 해결됨
        System.out.println("class 직렬화/역직렬화");
        System.out.println((settings == settings1) + "\n");

        // solution06
        // reflection 단에서 enum 의 생성자에 대한 접근은 막혀있다.
        SettingSolution06 settingSolution06 = SettingSolution06.INSTANCE;
        SettingSolution06 settingSolution06_1 = null;

        try {
            Constructor<?>[] declaredConstructors = SettingSolution06.class.getDeclaredConstructors();
            for (Constructor<?> declaredConstructor : declaredConstructors) {
                declaredConstructor.setAccessible(true);
                settingSolution06_1 = (SettingSolution06) declaredConstructor.newInstance("INSTANCE");
            }
        } catch (Exception e) {
            System.out.println("reflection can not access enum constructor\n");
        }

        // enum 은 자체로 Serializable 을 구현하고 있어서 별다른 처리 없이도 직렬화/역직렬화에 안전하다.
        try (ObjectOutput out = new ObjectOutputStream((new FileOutputStream("settings.obj")))) {
            out.writeObject(settingSolution06);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settingSolution06_1 = (SettingSolution06) in.readObject();
        }
        System.out.println("enum 직렬화/역직렬화");
        System.out.println((settings == settings1) + "\n");
    }
}
