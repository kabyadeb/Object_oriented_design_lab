public class Main {
    public static void main(String[] args) {
        SupportHandeler supportHandeler1 = new Level1SupportHandler();
        SupportHandeler supportHandeler2= new Level2SupportHandler();
        SupportHandeler supportHandeler3 = new Level3SupportHandler();

        supportHandeler1.setHandeler(supportHandeler2);
        supportHandeler2.setHandeler(supportHandeler3);

        Req req1=new Req(Priority.Basic);
        Req req2=new Req(Priority.intermidiate);
        Req req3 = new Req(Priority.Critical);

        supportHandeler1.HandleRequest(req1);
        supportHandeler2.HandleRequest(req2);
        supportHandeler3.HandleRequest(req3);

        System.out.println("Hello world!");
    }
}