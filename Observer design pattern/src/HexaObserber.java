public class HexaObserber implements Observer{
    private Subject subject;
    HexaObserber(Subject subject){
        this.subject=subject;
        Subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("IN hexadecimal :"+Integer.toHexString(subject.getNumber()));
    }
}
