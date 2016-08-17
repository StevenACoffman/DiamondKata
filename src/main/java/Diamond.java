import static java.util.stream.Collectors.*;
import static java.util.stream.IntStream.*;

class Diamond {
    public static final String SPACE = "-";
    public static final int ALPHABET_OFFSET = 64;
    private int size;

        public Diamond(int size) {
            this.size = size;
        }

        public String print() {
            return range(1, 2 * size)
                    .mapToObj(this::row)
                    .collect(joining("\n"));
        }

        private String row(int rowNum) {
            return range(1, 2 * size)
                    .mapToObj((position) -> {
                        int num = rowNum < size ? rowNum : size - rowNum % size;
                        if (size - num + 1 == position) {
                            return letterByOffset(num) + "";
                        }
                        if (size + num - 1 == position) {
                            return letterByOffset(num) + "";
                        }
                        return SPACE;
                    }).collect(joining());
        }

        private char letterByOffset(int offset){
            return (char) (offset + ALPHABET_OFFSET);
        }
}
