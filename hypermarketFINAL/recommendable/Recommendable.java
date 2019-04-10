package com.epam.hypermarket.recommendable;

import com.epam.hypermarket.selectable.Selectable;
import java.util.List;
import java.util.Set;

public interface Recommendable {
    List<Selectable> formRecommendationList(Set<Selectable> productSet);
}
