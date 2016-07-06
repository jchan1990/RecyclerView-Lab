package example.com.recyclerviewlab;

/**
 * Created by Qube on 7/6/16.
 */
public class SecondaryLayoutObject {
    private String color, title, decription;
    private boolean check;


    public SecondaryLayoutObject() {
    }

    public SecondaryLayoutObject(String c, String t, String d, boolean checked) {
        this.color = c;
        this.title = t;
        this.decription = d;
        this.check = checked;
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

    public boolean isChecked() {
        return check;
    }

    public void setChecked(boolean checked) {
        this.check = checked;
    }
}
