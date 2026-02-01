import java.util.ArrayList;

public class Subject {
    static ArrayList<Observer> list = new ArrayList<>();
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        NotifyALLObserver();
    }
    public static void attach(Observer observer){
        list.add(observer);
    }

    public void NotifyALLObserver(){
        for (Observer ob:list) {
            ob.update();
        }
    }
}
