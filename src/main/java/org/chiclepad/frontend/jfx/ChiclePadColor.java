package org.chiclepad.frontend.jfx;

import javafx.scene.paint.Color;

public class ChiclePadColor {

    public static final Color WHITE = Color.web("#fff");

    public static final Color GREY = Color.web("#eee");

    public static final Color GREY_TEXT = Color.web("#464947");

    public static final Color BORDER = Color.web("#e0e0e0");

    public static final Color BLACK = Color.web("#19261D");

    public static final Color PRIMARY = Color.web("#8DC44E");

    public static final Color SECONDARY = Color.web("#A24936");

    public static final Color TERTIARY = Color.web("#3E5641");

    public static final Color CATEGORY_DEFAULT = Color.web("#cccccc");

    public static String toHex(Color chiclePadColor) {
        return "#" + chiclePadColor.toString().substring(2, 8);
    }

}