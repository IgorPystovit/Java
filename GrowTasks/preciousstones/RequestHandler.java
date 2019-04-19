package growepam.preciousstones;

import java.util.Map;

public interface RequestHandler {
    Map<Gemstone,Double> performRequest(Map<Gemstone,Double> components);
}
