package ua.com.gleb.motorcyclemanager;

public enum TypeOfWheel {
    STREET ("Street"),
    HARD ("Hard"),
    SPORT ("Sport"),
    SOFT ("Soft");


    private  final String typeOfWheel;

    TypeOfWheel(String typeOfWheel){
        this.typeOfWheel = typeOfWheel;
    }


    public String getTypeOfWheel(){
        return typeOfWheel;
    }
}
