package tenthChapter.nested;

public interface Temp {
    int getValue(int i);

    String getName();

    class Nest {
        public Temp getTemp() {
            return new Temp() {
                public int getValue(int i) {
                    return i;
                }

                public String getName() {
                    return "Nest";
                }
            };
        }

        public static void getResults(Temp a) {
            System.out.println(a.getValue(5));
            System.out.println(a.getName());
        }

        public static void main(String[] args) {
            getResults(new Nest().getTemp());
        }

    }
}
