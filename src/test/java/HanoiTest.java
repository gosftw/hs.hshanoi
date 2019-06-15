import static org.junit.Assert.*;

import org.junit.Test;

public class HanoiTest {

    @Test
    public void solveOneDisk() {
        Hanoi h = new Hanoi(1);
        String expected = "Slide Disk 1 from rod S to rod D";
        String result = h.solve();
        assertEquals(expected, result);
    }

    @Test
    public void solveThreeDisks() {
        Hanoi h = new Hanoi(3);
        String expected = "Slide Disk 1 from rod S to rod D\n" +
                "Slide Disk 2 from rod S to rod A\n" +
                "Slide Disk 1 from rod D to rod A\n" +
                "Slide Disk 3 from rod S to rod D\n" +
                "Slide Disk 1 from rod A to rod S\n" +
                "Slide Disk 2 from rod A to rod D\n" +
                "Slide Disk 1 from rod S to rod D\n";
        String result = h.solve();
        assertEquals(expected.trim(), result);
    }

    @Test
    public void solveFourDisksWithTrim() {
        Hanoi h = new Hanoi(4);
        String expected = "Slide Disk 1 from rod S to rod A\n" +
                "Slide Disk 2 from rod S to rod D\n" +
                "Slide Disk 1 from rod A to rod D\n" +
                "Slide Disk 3 from rod S to rod A\n" +
                "Slide Disk 1 from rod D to rod S\n" +
                "Slide Disk 2 from rod D to rod A\n" +
                "Slide Disk 1 from rod S to rod A\n" +
                "Slide Disk 4 from rod S to rod D\n" +
                "Slide Disk 1 from rod A to rod D\n" +
                "Slide Disk 2 from rod A to rod S\n" +
                "Slide Disk 1 from rod D to rod S\n" +
                "Slide Disk 3 from rod A to rod D\n" +
                "Slide Disk 1 from rod S to rod A\n" +
                "Slide Disk 2 from rod S to rod D\n" +
                "Slide Disk 1 from rod A to rod D";
        String result = h.solve();
        assertEquals(expected, result);
    }

}