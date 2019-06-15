public class Hanoi {

    private int n;
    private StringBuilder builder = null;

    public Hanoi(int n) {
        this.n = n;
    }

    public void solve(int n, String source, String auxiliary, String destination){
        if(n == 1){
            builder.append(String.format("Slide Disk %d from rod %s to rod %s\n", n, source, destination));
        }
        else{
            solve(n - 1, source, destination, auxiliary);
            builder.append(String.format("Slide Disk %d from rod %s to rod %s\n", n, source, destination));
            solve(n - 1, auxiliary, source, destination);
        }
    }

    public String solve(){
        if(builder == null){
            builder = new StringBuilder();
            solve(this.n, "S", "A", "D");
        }
        return builder.toString().trim();
    }
}
