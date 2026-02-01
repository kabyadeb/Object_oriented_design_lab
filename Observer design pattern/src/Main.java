public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer=new BinaryObserber(subject);
        Observer observer1=new HexaObserber(subject);
        System.out.println("Hello world!");

        subject.setNumber(2);
        subject.setNumber(765756);
    }
}