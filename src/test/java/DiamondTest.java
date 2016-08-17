import org.junit.*;
import static org.junit.Assert.*;

import static java.util.stream.Collectors.*;
import static java.util.stream.IntStream.*;
import static org.assertj.core.api.Assertions.*;


public class DiamondTest {

    @Test
    public void single() {
        Diamond diamond = new Diamond(1);

        String print = diamond.print();

        assertThat(print).isEqualTo("A");
    }

    @Test
    public void first_row_of_2() {
        Diamond diamond = new Diamond(2);

        String print = diamond.print();

        assertThat(firstRow(print)).isEqualTo("-A-");
    }

    @Test
    public void last_row_of_2() {
        Diamond diamond = new Diamond(2);

        String print = diamond.print();

        assertThat(lastRow(print)).isEqualTo("-A-");
    }

    @Test
    public void first_row_of_3() {
        Diamond diamond = new Diamond(3);

        String print = diamond.print();

        assertThat(firstRow(print)).isEqualTo("--A--");
    }

    @Test
    public void second_row_of_2() {
        Diamond diamond = new Diamond(2);

        String print = diamond.print();

        assertThat(secondRow(print)).isEqualTo("B-B");
    }

    @Test
    public void second_row_of_3() {
        Diamond diamond = new Diamond(3);

        String print = diamond.print();

        assertThat(secondRow(print)).isEqualTo("-B-B-");
    }

    @Test
    public void third_row_of_3() {
        Diamond diamond = new Diamond(3);

        String print = diamond.print();

        assertThat(row(print, 3)).isEqualTo("C---C");
    }

    @Test
    public void fourth_row_of_3() {
        Diamond diamond = new Diamond(3);

        String print = diamond.print();

        assertThat(row(print, 4)).isEqualTo("-B-B-");
    }

    @Test
    public void last_row_of_3() {
        Diamond diamond = new Diamond(3);

        String print = diamond.print();

        assertThat(lastRow(print)).isEqualTo("--A--");
    }

    private String secondRow(String print) {
        return row(print, 2);
    }

    private String firstRow(String print) {
        return row(print, 1);
    }

    private String lastRow(String print) {
        String[] rows = print.split("\n");
        return rows[rows.length - 1];
    }

    private String row(String print, int rownum) {
        return print.split("\n")[rownum - 1];
    }
}
