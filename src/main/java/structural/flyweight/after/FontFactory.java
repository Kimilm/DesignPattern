package structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

// flyweight 인스턴스에 접근할 수 있고 캐싱을 지원할 flyweight factory 에 해당
public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
