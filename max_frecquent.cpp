#include <bits/stdc++.h>
using namespace std;

int frequent(int a[], int n)
{
    // qsort(a, a + n);
    // sort(a, a + n);

    // int maxcount = 0;
    // int count = 0;

    // for (int i = 0; i < n; i++)
    // {

    //     if (a[i] == a[i + 1])
    //     {
    //         count++;
    //     }
    //     else
    //     {
    //         count = 0;
    //     }

    //     if (maxcount < count)
    //     {
    //         maxcount = count;
    //     }
    // }
    // return maxcount;

    int b[50] = {0};
    for(int i = 0; i < n; i++)
    {
        b[a[i]]++;
    }
    
    
    int maxi = b[0], ind = 0;
    
    for(int i = 0; i < 50; i++)
    {
        if(b[i] > maxi)
        {
            maxi = b[i];
            ind = i;
        }
    }
    return ind;
}

int main()
{
    int n;
    cout << "Enter the size of the array : ";
    cin >> n;

    int a[n];

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    cout << frequent(a, n) << endl;
}