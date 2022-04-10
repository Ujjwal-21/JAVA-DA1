package com.Dragon;

/*public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hi");
    }
}*/
import java.io.*;
        import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        try
        {
//the file to be opened for reading
            FileInputStream fis=new FileInputStream("Demo.txt");
            FileWriter fileWriter = new FileWriter("out.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
           // String s=new String();
            String[] str=new String[18];
            int temp=0;
          // int E=0,I=0,S=0,In=0,T=0,F=0,J=0,P=0;
            Scanner sc=new Scanner(fis);    //file to be scanned
//returns true if there is another line to read
            while(sc.hasNextLine())
            {
                // s=sc.nextLine();
                //System.out.println(sc.nextLine());      //returns the line that was skipped
                str[temp]=sc.nextLine();
                System.out.println(str[temp]);
                temp++;
            }
            sc.close();
            System.out.println(str[0].charAt(1));//closes the scanner
            for(int i=0;i<18;i++)
            {
                int E=0,I=0,S=0,In=0,T=0,F=0,J=0,P=0;
                if(i%2==1)
                {
                   // int E=0,I=0,S=0,In=0,T=0,F=0,J=0,P=0;
                    for(int j=0;j<70;j++)
                    {
                        if(j==0||j==7||j==14||j==21||j==28||j==35||j==42||j==49||j==56||j==63) {
                            if (str[i].charAt(j) == 'A'||str[i].charAt(j) == 'a') {
                                E++;
                            } else if (str[i].charAt(j) == 'B'||str[i].charAt(j) == 'b') {
                                I++;
                            }
                        }
                        if(j==1||j==2||j==8||j==9||j==15||j==16||j==22||j==23||j==29||j==30||j==36||j==37||j==43||j==44||j==50||j==51||j==57||j==58||j==64||j==65)
                        {
                            if (str[i].charAt(j) == 'A'||str[i].charAt(j) == 'a') {
                                S++;
                            } else if (str[i].charAt(j) == 'B'||str[i].charAt(j) == 'b') {
                                In++;
                            }
                        }
                        if(j==3||j==4||j==10||j==11||j==17||j==18||j==24||j==25||j==31||j==32||j==38||j==39||j==45||j==46||j==52||j==53||j==59||j==60||j==66||j==67)
                        {
                            if (str[i].charAt(j) == 'A'||str[i].charAt(j) == 'a') {
                                T++;
                            } else if (str[i].charAt(j) == 'B'||str[i].charAt(j) == 'b') {
                                F++;
                            }
                        }
                        if(j==5||j==6||j==12||j==13||j==19||j==20||j==26||j==27||j==33||j==34||j==40||j==41||j==47||j==48||j==54||j==55||j==61||j==62||j==68||j==69)
                        {
                            if (str[i].charAt(j) == 'A'||str[i].charAt(j) == 'a') {
                                J++;
                            } else if (str[i].charAt(j) == 'B'||str[i].charAt(j) == 'b') {
                                P++;
                            }
                        }
                    }
                    float per=E+I;
                    float x=(I/per)*100;
                    //System.out.println(E);
                    //System.out.println(I);
                    //System.out.println(x);
                    float per2=S+In;
                    float x2=(In/per2)*100;
                    //System.out.println();
                    //System.out.println(I);
                    //System.out.println(x2);
                    float per3=T+F;
                    float x3=(F/per3)*100;
                    //System.out.println();
                    //System.out.println(I);
                   // System.out.println(x3);
                    float per4=J+P;
                    float x4=(P/per4)*100;
                    //System.out.println();
                    //System.out.println(I);
                    //System.out.println(x4);
                    List<Float> list=new ArrayList<Float>();
                    list.add(x);
                    list.add(x2);
                    list.add(x3);
                    list.add(x4);
                    char[] ch=new char[4];
                    if(x>50)
                    {
                        ch[0]='I';
                    }
                    else if(x<50)
                    {
                        ch[0]='E';
                    }
                    else if(x==50)
                    {
                        ch[0]='X';
                    }
                    if(x2>50)
                    {
                        ch[1]='N';
                    }
                    else if(x2<50)
                    {
                        ch[1]='S';
                    }
                    else if(x2==50)
                    {
                        ch[1]='X';
                    }
                    if(x3>50)
                    {
                        ch[2]='F';
                    }
                    else if(x3<50)
                    {
                        ch[2]='T';
                    }
                    else if(x3==50)
                    {
                        ch[2]='X';
                    }
                    if(x4>50)
                    {
                        ch[3]='P';
                    }
                    else if(x4<50)
                    {
                        ch[3]='J';
                    }
                    else if(x4==50)
                    {
                        ch[3]='X';
                    }
                    String f = String.valueOf(ch);
                    System.out.println(str[i-1]+ ": "+ list +"= "+ f);

                    printWriter.print(str[i-1]+ ": "+ list +"= "+ f+"\n");
                    //printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);

                }
            }
           /* float per=E+I;
            float x=(I/per)*100;
            System.out.println(E);
            System.out.println(I);
            System.out.println(x);*/
            printWriter.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}