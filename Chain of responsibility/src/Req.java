public class Req {
    private Priority priority;

    public Req(Priority basic) {
        if(basic==Priority.Basic){
            this.priority=Priority.Basic;
        } else if (basic==Priority.intermidiate) {
            this.priority=Priority.intermidiate;
        }
        else
        {
            this.priority=Priority.Critical;
        }

    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
