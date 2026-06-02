public class Test {
    public static void main(String[] args) {
        Status status = Status.APPROVED;

        switch(status) {
            case PENDING:
                System.out.println("Request is pending");
                break;

            case APPROVED:
                System.out.println("Request approved");
                break;

            case REJECTED:
                System.out.println("Request rejected");
                break;
        }
    }
}
