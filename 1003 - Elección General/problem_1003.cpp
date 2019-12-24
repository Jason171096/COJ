#include <cstdlib>
#include <iostream>

using namespace std;

int main()
{   int  T,n,m,votos[10][101];
    while((cin>>T)&& T){
        while(T--){            
           cin>>n>>m;
           for(int i=0;i<m;i++){
              for(int j=0;j<n;j++){
                 cin>>votos[i][j];
              }
           }
           int sum,may=0, candidato=0;
           for(int i=0;i<n;i++){
               sum=0;
               for(int j=0;j<m;j++){
                    sum+=votos[j][i];
              }
              if(sum>may){
                   may = sum;
                   candidato=i+1;
              }
           }
           cout<<candidato<<endl;
        }        
    }
    return 0;
}
