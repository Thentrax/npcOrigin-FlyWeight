package npcOrigin;

import java.util.HashMap;
import java.util.Map;

public class OriginFactory {
    private static final Map<String, Origin> origins = new HashMap<>();

    public static Origin getOrigin(String name, String feature){
        Origin origin = origins.get(name);
        if (origin == null){
            origin = new Origin(name, feature);
            origins.put(name, origin);
        }
        return origin;
    }

    public static int getOriginsLength(){
        return origins.size();
    }
}
