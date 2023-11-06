package week5;

public class CivilService implements NationalService{
    private int daysLeft;

    public CivilService(int daysLeft){
        this.daysLeft = 362;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public void work(){
        daysLeft--;
    }
}
