package StepikLessons.WritingMaterials;

public class Divider extends WritingMaterials{
    String dividerType;
    boolean metal;

    {
        super.setName("Undefined");
        super.setColor("White");
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }
}
