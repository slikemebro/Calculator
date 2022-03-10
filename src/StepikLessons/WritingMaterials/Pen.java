package StepikLessons.WritingMaterials;

public class Pen extends WritingMaterials{
    int countColor = 1;
    boolean auto;

    {
        super.setName("Undefined");
        super.setColor("White");
    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }
}
