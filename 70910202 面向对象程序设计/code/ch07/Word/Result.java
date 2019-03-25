public class Result implements Comparable {
        private String word;
        private int times;

        public Result() {
        }

        public void setWord(String word) {
            this.word = word;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        public String getWord() {
            return word;
        }

        public int getTimes() {
            return times;
        }

        public int compareTo(Object o) {
            Result r = (Result) (o);
            return this.times - r.times;
        }
    }