package com.epam.hypermarket.selectable;

import java.util.Set;

public interface Factory {
    Set<Selectable> createProducts(Selectable productType);
}
