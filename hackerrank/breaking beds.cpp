/**
 *    author:  tourist
 *    created: 14.12.2017 19:11:30       
**/
#include <bits/stdc++.h>

using namespace std;

int main() {
  int tt;
  cin >> tt;
  long long ans = 0;
  while (tt--) {
    long long x;
    cin >> x;
    ans += (x > 1 ? x : 0);
    while (x > 1) {
      bool found = false;
      for (long long i = 2; i * i <= x; i++) {
        if (x % i == 0) {
          found = true;
          x /= i;
          ans += x;
          break;
        }
      }
      if (!found) {
        break;
      }
    }
    ans += 1;
  }
  cout << ans << endl;
  return 0;
}
