public enum Calc {
    SUM {
        @Override
        public int action(int a, int b) {
            return a + b;
        }
    },
    SUB {
        @Override
        public int action(int a, int b) {
            return a - b;
        }
    },
    MULT {
        @Override
        public int action(int a, int b) {
            return a * b;
        }
    },
    DIV {
        @Override
        public int action(int a, int b) {
            return a / b;
        }
    },
    POW {
        @Override
        public int action(int a, int b) {
            return (int) Math.pow(a, b);
        }
    };

    public abstract int action(int a, int b);

}
