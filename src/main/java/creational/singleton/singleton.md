1. 자바에서 enum을 사용하지 않고 싱글톤 패턴을 구현하는 방법은?  
    ```java
    class Singleton { 
        private static Singleton singleton;
   
        private SingleTon() {};
   
        public static Singleton getInstance() {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
    ``` 
    ```java
    class Singleton { 
        private static final Singleton SINGLETON = new Singleton();
   
        private SingleTon() {}
        
        public static Singleton getInstance() {
            return SINGLETON;
        }
    }
    ``` 
    ```java
    class Singleton { 
        private Singleton() {}
   
        private static SingletonHolder {
            private static final Singleton SINGLETON = new Singleton();
        }
   
        public static Singleton getInstance() {
            return SingletonHolder.SINGLETON;
        }   
    }
    ```  

2. private 생성자와 static 메서드를 사용하는 방법의 단점은?
   - Multi-Thread에 안전하지 않음
     + synchronized를 사용하여 해결
   - Serialization / Deserialization
     + readResolve 메서드를 오버라이딩하여 해결
   - reflection
     + enum을 사용하여 해결


3. enum을 사용해 싱글톤 패턴을 구현하는 방법의 장점과 단점은?
   - 장점
     + reflection, serialization/deserialization에 안전하다
   - 단점
     + eager initialization
     + 상속을 사용하기 어렵다 (컴파일시 enum 끼리만 상속 가능)


4. static inner 클래스를 사용해 싱글톤 패턴을 구현하는 방법은?
   - 1의 3번
   - 일반적으로는 이 방법이 가장 무난하다

5. 싱글톤 패턴은 다른 디자인 패턴(빌더, 퍼사드, 추상 팩토리 등) 구현체의 일부로 쓰이기도 한다.