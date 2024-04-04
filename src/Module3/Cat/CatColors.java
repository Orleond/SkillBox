package Module3.Cat;

public enum CatColors {
    WHITE("Белый"),
    BLACK("Черный"),
    YELLOW("Желтый"),
    GREY("Серый");

    private String color;
    CatColors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
