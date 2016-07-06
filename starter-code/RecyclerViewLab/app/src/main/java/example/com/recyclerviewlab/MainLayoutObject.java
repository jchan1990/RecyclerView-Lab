package example.com.recyclerviewlab;

/**
 * Created by Qube on 7/6/16.
 */
public class MainLayoutObject {
    private String color, title, decription;

    public MainLayoutObject() {
    }

    public MainLayoutObject(String c, String t, String d) {
        this.color = c;
        this.title = t;
        this.decription = d;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
