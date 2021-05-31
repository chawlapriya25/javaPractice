package composition;

public class Bed {
    private String Style;
    private int pillows;
    private int sheets;
    private int quilt;
    private int height;

    public Bed(String style, int pillows, int sheets, int quilt, int height) {
       this.Style = style;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilt = quilt;
        this.height = height;
    }

    public void make() {
        System.out.println("Making");
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String style) {
        Style = style;
    }

    public int getPillows() {
        return pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void setQuilt(int quilt) {
        this.quilt = quilt;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

    }
}
