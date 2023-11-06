package week5;

public class MilitaryService implements NationalService{
    private int daysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
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
