public class Level3SupportHandler implements SupportHandeler {
    private SupportHandeler nextHandler;

    @Override
    public void setHandeler(SupportHandeler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public void HandleRequest(Req req) {
        if(req.getPriority()==Priority.Critical)
        {
            System.out.println("Hanled By 3 NO ");
        }
    }
}
