package ua.com.gleb.carmaneger;

public interface Serviceable {

    public boolean isReadyToService();

    public int getDistanceOnService();

    public void adDistance(int additinalDistance);

    public void adDistance(double additinalDistance);

}
