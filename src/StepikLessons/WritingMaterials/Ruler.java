package StepikLessons.WritingMaterials;

public class Ruler extends WritingMaterials{
    boolean wood;

    {
        super.setName("Undefined");
        super.setColor("White");
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }
}
