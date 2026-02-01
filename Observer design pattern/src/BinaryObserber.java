public class BinaryObserber implements Observer{
    private Subject subject;
    public BinaryObserber(Subject subject) {
        this.subject=subject;
        Subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println("BinaryObserber:"+Integer.toBinaryString(subject.getNumber()));
    }
}
