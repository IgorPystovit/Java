package com.epam.hypermarket.selectable;

import com.epam.hypermarket.tuningparameters.Colors;
import com.epam.hypermarket.tuningparameters.Material;
import com.epam.hypermarket.tuningparameters.Shape;
import com.epam.hypermarket.tuningparameters.Size;

public interface Selectable{
    Colors getColor();
    Shape getShape();
    Material getMaterial();
    Double getCost();
    Size getSize();
}
