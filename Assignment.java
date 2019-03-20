import java.util.*;
import java.util.Scanner;
import java.io.*;
class details
{
	public static void main(String[] args)throws IOException
	{
		Scanner input=new Scanner(System.in);
		int n,k=0,k1=0;
		System.out.println("enter number");
		n=input.nextInt();
			String student[]=new String[n];
			for(int i=0;i<n;i++)
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String str=br.readLine();
				student[i]=str;				
			}
		String name[]=new String[n];
		float cgpa[]=new float[n];
		for(int j=0;j<n;j++)
		{
			StringTokenizer st=new StringTokenizer(student[j]," ");
			while(st.hasMoreTokens())
			{
					name[k]=st.nextToken();
					if(name[k].equals("served")){}
					else
					{
						cgpa[k]=Float.parseFloat(st.nextToken());
						int token=Integer.parseInt(st.nextToken());
						k++;
					}
			}
		}
		

    int l, j; 
    float key;
    String temp;
    for (l = 1;l<k;l++) { 
        key = cgpa[l]; 
        temp=name[l];
        j = l - 1; 
        while (j >= 0 && cgpa[j] < key) 
        { 
            cgpa[j + 1] =cgpa[j]; 
            name[j+1]=name[j];
            j = j-1; 
        } 
        cgpa[j + 1] = key; 
        name[j+1]=temp;

    } 
    int t1=0;
    for(int i=0;i<k-1;i++)
	{
			float t=cgpa[i];
			if(t==cgpa[i+1])
			{
				t1=1;
				if(name[i].compareTo(name[i+1])>0)
				{
						System.out.println(name[i]);
						i++;
				}
				else
				{
					System.out.println(name[i+1]);
					i++;
				}
			}
			else
			{
				System.out.println(name[i]);
			}
			k1=i;

	}
	if(t1==0)
		System.out.println(name[k1+1]);
	}
}