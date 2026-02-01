public class Level2SupportHandler implements SupportHandeler {

    public void HandleRequest(Req req) {
        if (Priority.intermidiate != req.getPriority()) {
            nexthandler.HandleRequest(req);
        }
        else {
            System.out.println("Level2 handler Handle the file");
        }


    }
    private SupportHandeler nexthandler;
    public void setHandeler(SupportHandeler nextHandler) {
        this.nexthandler=nextHandler;
    }
}
