class ej13 {
    public int romanToInt(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int actual = valor(s.charAt(i));

            if (i < s.length() - 1) {
                int siguiente = valor(s.charAt(i + 1));

                if (actual < siguiente) {
                    total -= actual;
                } else {
                    total += actual;
                }
            } else {
                total += actual;
            }
        }

        return total;
    }

    public int valor(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }
}