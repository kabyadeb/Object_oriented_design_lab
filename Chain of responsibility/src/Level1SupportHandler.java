public class Level1SupportHandler implements SupportHandeler {
    @Override
    public void HandleRequest(Req req) {
        if(req.getPriority()==Priority.Basic)
        {
            System.out.println("Level1 handler handle the request");
        }
        else{
            nextHandler.HandleRequest(req);
        }
    }
    private SupportHandeler nextHandler;

    public void setHandeler(SupportHandeler nextHandler) {
        this.nextHandler=nextHandler;
    }

}
