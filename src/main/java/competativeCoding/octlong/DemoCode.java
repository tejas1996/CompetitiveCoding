package competativeCoding.octlong;

import java.util.*;
import java.io.*;
import java.text.*;

//Solution Credits: Taranpreet Singh
public class DemoCode {
    static boolean multipleTC = true, memory = false;
    final int MAX = (int) 1e6 + 1, INF = (int) 2e9, root = 3;
    //SOLUTION ENDS
    long mod = (long) 1e9 + 7, IINF = (long) 1e17;
    DecimalFormat df = new DecimalFormat("0.000000000000");
    double PI = 3.1415926535897932384626433832792884197169399375105820974944, eps = 1e-8;
    FastReader in;
    PrintWriter out;

    public static void main(String[] args) throws Exception {
        if (memory) new Thread(null, new Runnable() {
            public void run() {
                try {
                    new DemoCode().run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 28).start();
        else new DemoCode().run();
    }

    //SOLUTION BEGIN
    void solve(int TC) throws Exception {
        int n = ni(), m = ni();
        char[][] g = new char[n][];
        for (int i = 0; i < n; i++) g[i] = n().toCharArray();
        boolean[][] col = new boolean[n][m];
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < m - 1; j++) {
                col[i][j] = true;
                for (int k = 0; k < 4; k++)
                    if (g[i + k / 2][j + k % 2] == '#') col[i][j] = false;
            }
        boolean yes = true;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (g[i][j] == '.') {
                    boolean f = false;
                    for (int k = 0; k < 4; k++)
                        if (i - k / 2 >= 0 && j - k % 2 >= 0 && col[i - k / 2][j - k % 2]) f = true;
                    yes &= f;
                }
        pn(yes ? "YES" : "NO");
    }

    void run() throws Exception {
        in = new FastReader();
        out = new PrintWriter(System.out);
        int T = (multipleTC) ? ni() : 1;
        //Solution Credits: Taranpreet Singh
        for (int i = 1; i <= T; i++) solve(i);
        out.flush();
        out.close();
    }

    long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    int bit(long n) {
        return (n == 0) ? 0 : (1 + bit(n & (n - 1)));
    }

    void p(Object o) {
        out.print(o);
    }

    void pn(Object o) {
        out.println(o);
    }

    void pni(Object o) {
        out.println(o);
        out.flush();
    }

    String n() {
        return in.next();
    }

    String nln() {
        return in.nextLine();
    }

    int ni() {
        return Integer.parseInt(in.next());
    }

    long nl() {
        return Long.parseLong(in.next());
    }

    double nd() {
        return Double.parseDouble(in.next());
    }

    class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception {
            br = new BufferedReader(new FileReader(s));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}        