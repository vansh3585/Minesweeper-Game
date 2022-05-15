/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//PROJECT FILE-GAME-MINESWEEPER//
import java.io.*;
class vansh8
{
public static void main(String at[])throws Exception
{
DataInputStream z=new DataInputStream(System.in);
int co2=0,r2=0;
System.out.println();
System.out.println("#           #  ######  #      ######  #####  #     #  ######");
Thread.sleep(500);
System.out.println(" #         #   #       #      #       #   #  # # # #  #     ");
Thread.sleep(500);
System.out.println("  #   #   #    ######  #      #       #   #  #  #  #  ######");
Thread.sleep(500);
System.out.println("   # # # #     #       #      #       #   #  #     #  #     ");
Thread.sleep(500);
System.out.println("    #   #      ######  #####  ######  #####  #     #  ######");
System.out.println();
Thread.sleep(500);
System.out.println("Enter choice");
System.out.println("1- You want to play");
System.out.println("2-You don't want to play");
int ch=Integer.parseInt(z.readLine());
if(ch==2)
System.exit(0);
else if(ch==1)
{
System.out.println();
System.out.println("RULES/INSTRUCTION");
System.out.println("1-You will be asked to enter no of rows and colums and no of mines.");
System.out.println("2-Then randomly no of  mines you have entered  will be placed in the grid.");
System.out.println("3-One will be added to all the boxes around the mine");
System.out.println("4-Then you will be asked to enter the index of the cell on which you want");
System.out.println("  to play");
System.out.println("5-If you are confirmed that this block has mine then you can put a flag ");
System.out.println("6-If you have a doubt that the mine is in this block then you can put a");
System.out.println("  question mark");
System.out.println("7-No of chances that you will get=no of rows*no of colums");
System.out.println("8-'*' Represent empty space. '_|' Represent the blocks on which you have.");
System.out.println("  not played");
System.out.println("9-Your game will be ended if you play on the block which has mine");
System.out.println("10-Points will be given accordingly");
System.out.println(" a-If you have put flag at the correct box then for each correct flag ");
System.out.println("   20 will be added to your points");
System.out.println(" b-If you have put question mark at the correct box then for each     ");
System.out.println("   correct question mark 10 will be added to your points");
System.out.println(" c-For each box where you have played and mine was not their, 30 will ");
System.out.println("   be added to your points");
System.out.println("11-You will get 0 points if you put flag aur question mark on all the blocks");
}
else
{
}
System.out.println();
Thread.sleep(5000);
System.out.println("No of rows");
int row=Integer.parseInt(z.readLine());
System.out.println("No of colums");
int col=Integer.parseInt(z.readLine());
int arr[][]=new int[row][col];
System.out.println("Enter no of mines");
int mines=Integer.parseInt(z.readLine());
int condr[]=new int[mines],condc[]=new int[mines];
for(int i=1;i<=mines;i++)
{
int v=20;
while(v!=0)//while loop to randomly put mines in the grid//
{
double r=Math.random();
double r1=r*row;
r2=(int)r1;
double co=Math.random();
double co1=co*col;
co2=(int)co1;
if(arr[r2][co2]==10)
v=v;
else
v=0;
}
arr[r2][co2]=10;
}
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
if(arr[i][j]>=10)
{
try
{
arr[i][j+1]++;
}
catch(ArrayIndexOutOfBoundsException B)
{
arr[i][j]=arr[i][j];
}
try
{
arr[i+1][j]++;
}
catch(ArrayIndexOutOfBoundsException B)
{
arr[i][j]=arr[i][j];
}
try
{
arr[i-1][j]++;
}
catch(ArrayIndexOutOfBoundsException B)
{
arr[i][j]=arr[i][j];
}
try
{
arr[i][j-1]++;
}
catch(ArrayIndexOutOfBoundsException B)
{
arr[i][j]=arr[i][j];
}
try
{
arr[i+1][j+1]++;
}
catch(ArrayIndexOutOfBoundsException B)
{
arr[i][j]=arr[i][j];
}
try
{
arr[i-1][j-1]++;
}
catch(ArrayIndexOutOfBoundsException B)
{
arr[i][j]=arr[i][j];
}
try
{
arr[i+1][j-1]++;
}
catch(ArrayIndexOutOfBoundsException B)
{
arr[i][j]=arr[i][j];
}
try
{
arr[i+1][j-1]++;
}
catch(ArrayIndexOutOfBoundsException B)
{
arr[i][j]=arr[i][j];
}
}
}
}
System.out.println();
char  c[][]=new char[row][col];
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print("_"+"|"+" ");
}
System.out.println();
}
System.out.println();
out : for(int k=1;k<=row*col;k++)//for loop to see on which index there is mine and on which index mine is not their//
{
System.out.println("Enter index of cell");
String g=z.readLine();
System.out.println();
String g1[]=g.split(",");
int f1[]=new int[2];
f1[0]=Integer.parseInt(g1[0]);
f1[1]=Integer.parseInt(g1[1]);
System.out.println("Play-0 Flag-1 ?-2");
int f2=Integer.parseInt(z.readLine());
System.out.println();
if(f2==0)
{
if(arr[f1[0]][f1[1]]>9)//loop to play on the index input by the user//
break out;
else
{
if(arr[f1[0]][f1[1]]==0)
c[f1[0]][f1[1]]='*';
else
c[f1[0]][f1[1]]=(char)arr[f1[0]][f1[1]];
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
if(c[i][j]=='\u0000')
System.out.print("_"+"|"+" ");
else if(c[i][j]!='#' && c[i][j]!='?' && c[i][j]!='*')
System.out.print((int)c[i][j]+" ");
else
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
else if(f2==1)
{
c[f1[0]][f1[1]]='#';
for(int i=0;i<row;i++)//loop to put flag on the index input by the user//
{
for(int j=0;j<col;j++)
{
if(c[i][j]=='\u0000')
System.out.print("_"+"|"+" ");
else if(c[i][j]!='#' && c[i][j]!='?' && c[i][j]!='*')
System.out.print((int)c[i][j]+" ");
else
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
else if(f2==2)                                         
{
c[f1[0]][f1[1]]='?';
for(int i=0;i<row;i++)//loop to put question mark on the index input by the user//
{
for(int j=0;j<col;j++)
{
if(c[i][j]=='\u0000')
System.out.print("_"+"|"+" ");
else if(c[i][j]!='#' && c[i][j]!='?' && c[i][j]!='*')
System.out.print((int)c[i][j]+" ");
else
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
else
System.out.println("Wrong choice");
}
System.out.println();
int points=0;
int pint=0;
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
if(c[i][j]=='#' || c[i][j]=='?')
pint++;
}
}
if(pint==row*col)
{
System.out.println("Points=0");
System.exit(0);
}
for(int i=0;i<row;i++)//loop to print the score//
{
for(int j=0;j<col;j++)
{
if(c[i][j]=='#' && arr[i][j]>9)
points=points+20;
else if(c[i][j]=='?' && arr[i][j]>9)
points=points+10;
else if((int)c[i][j]!=0 || c[i][j]=='*')
points=points+30;
else
points=points;
}
}
FileWriter fw=new FileWriter("Vansh.Dat");
PrintWriter pw=new PrintWriter(fw);
pw.println("POINTS"+" "+points);
pw.close();
fw.close();
}
}
