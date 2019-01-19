package competativeCoding.janLong;

import java.util.Scanner;

public class MGAME {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {

            int n = scanner.nextInt();
            int p = scanner.nextInt();
            if (n == 1 || n == 2) {
                System.out.println(p * p * p);
                continue;
            }
            int m = (n / 2) + 1;
            int k = n % m;
            int answer = 0;
            int moreThanI = p - k;
            int moreThanN = p - n;
            answer = answer + (moreThanI * moreThanI) + (moreThanN * moreThanI) + (moreThanN * moreThanN);
            System.out.println(answer);

            t--;
        }

    }
}

/*


#include <iostream>
using namespace std;

int main() {
	// your code goes here


	int t,n,m,k,answer,moreThanI,moreThanN,p;
    cin>>t;
    while (t>0){

        cin>>n;
        cin>>p;
        m = (n/2) +1;
        k = n % m;
        answer = 0;
        moreThanI = p-k;
        moreThanN = p-n;
        answer = answer + (moreThanI * moreThanI) + (moreThanN * moreThanI) + (moreThanN * moreThanN);
        cout<<answer<<endl;

        t--;
    }

	return 0;
}


111
112
122
121
211
212
221
222

3 3

222
232
233
223




 */
