package ua.com.gleb.motorcyclemanager;

public enum Color {
    BLACK ("Black"),
    ORANGE ("Orange"),
    WHITE ("White"),
    YELLOW ("Yellow"),
    BLUE ("Blue"),
    GREEN ("Green");

    private  final String color;

    Color(String color){
        this.color = color;
    }


    public String getColor(){
        return color;
    }
}
