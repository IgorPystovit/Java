package com.epam.hypermarket;

import java.util.List;

public interface Selectable{
    List<Tunable> formRecommendationList(Tunable productType);
}
