package generator;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Клас рядка тексту. Має такі властивості:
 * текст, горизонтальне розташування, вертикальне розташування, колір
 *
 * @author Hudemchuk Daria 24.11.2022 12 p.m.
 */
 
public class Item {

    private static int nextId = 1;

    /**
     * Номер екземпляру. Відображається в ListView
     */
     
    private final int id = nextId++;

    private final SimpleStringProperty text =
            new SimpleStringProperty(this, "text", "<no text>");

    private final SimpleDoubleProperty horizontalAlign =
            new SimpleDoubleProperty(this, "horizontalAlign", 2.0);

    private final SimpleDoubleProperty verticalAlign =
            new SimpleDoubleProperty(this, "verticalAlign", 2.0);

    private final SimpleObjectProperty<javafx.scene.paint.Color> color =
            new SimpleObjectProperty<>(this, "color", javafx.scene.paint.Color.WHITE);

    public String getText() {
        return text.get();
    }

    public SimpleStringProperty textProperty() {
        return text;
    }

    public double getHorizontalAlign() {
        return horizontalAlign.get();
    }

    public SimpleDoubleProperty horizontalAlignProperty() {
        return horizontalAlign;
    }

    public double getVerticalAlign() {
        return verticalAlign.get();
    }

    public SimpleDoubleProperty verticalAlignProperty() {
        return verticalAlign;
    }

    public javafx.scene.paint.Color getColor() {
        return color.get();
    }

    public SimpleObjectProperty<javafx.scene.paint.Color> colorProperty() {
        return color;
    }

    @Override
    public String toString() {
        return "Item #" + id;
    }
}
