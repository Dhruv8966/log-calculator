import java.util.Scanner;
  
class mlog{

float[] decimal(float a){
float[] k=new float[2];
float b=1,d=1;
int c,i;
for(i=1;b>0;i++){
a=a*10;
d=d*10;
c=(int) a;
b=a-c;
}
k[0]=a;
k[1]=d;

return k;
}

float loop(float x){
float v=x;
for(int j=1;j<10;j++){
x=v*x;
}
return x;

}
float[] partition(float a,float b,float c){
float[] r=new float[2];
float i;
for(i=1;b<a;i++){
b=c*b;
}
r[0]=i-1;
r[1]=b/c;
return r;
}
float lego(float a,float b){
mlog q = new mlog();
float[] v=new float[2];

float c=b;
float i,j,k,m,n,o;
v=q.partition(a,b,c);
i=v[0];
float x=a/v[1];

x=q.loop(x);
v=q.partition(x,b,c);
j=v[0]/10;
x=x/v[1];

x=q.loop(x);
v=q.partition(x,b,c);
k=v[0]/100;
x=x/v[1];

x=q.loop(x);
v=q.partition(x,b,c);
m=v[0]/1000;
x=x/v[1];

x=q.loop(x);
v=q.partition(x,b,c);
n=v[0]/10000;
x=x/v[1];

x=q.loop(x);
v=q.partition(x,b,c);
o=v[0]/100000;
x=x/v[1];

float p=c;
float l;
for(l=1;p<x;l++){
p=p*c;
}
l=l/1000000;
i=i+j+k+l+m+n+o;

return i;
}

public static void main(String[] j){
Scanner in = new Scanner(System.in);
mlog l = new mlog();
float x,y,d;
float[] g=new float[2];
System.out.println("enter the no. log "); 
x=in.nextFloat();
System.out.println("enter the base of log");
y=in.nextFloat();
if(x<1 && y>=1){
g=l.decimal(x);
x=l.lego(g[0],10);
d=l.lego(g[1],10);
y=l.lego(y,10);
x=(x-d)/y;
}
else 
if(y<1 && x>=1){
g=l.decimal(y);
y=l.lego(g[0],10);
d=l.lego(g[1],10);
x=l.lego(x,10);
y=y-d;
x=x/y;
}
else
if(y<1 && x<1){
g=l.decimal(x);
x=l.lego(g[0],10);
d=l.lego(g[1],10);
x=x-d;
g=l.decimal(y);
y=l.lego(g[0],10);
d=l.lego(g[1],10);
y=y-d;
x=x/y;
}
else
if(x>=1 && y>=1){
x=l.lego(x,y);}
System.out.println("the log value is = "+x+"\n *this calculator precison is upto 5 decimal point and for log a where a<1 precison is upto 4 decimal places*");}
}
 