package QnA;

public class Ticket {
    public static int currentNumber = 0;
    int ticketNum;
    String user, problem;
    boolean isResolved;

    public Ticket(String user, String problem) {
        this.user = user;
        this.problem = problem;
        ticketNum = currentNumber;
        isResolved = false;
        currentNumber++;
    }

    public void setIsResolved() { isResolved = true; }

    public int getTicketNum() { return ticketNum; }
    public String getUser() { return user; }
    public String getProblem() { return problem; }
    public boolean getIsResolved() { return isResolved; }
}
