package move;

public class generator {
	static int arr[][];
generator()
{
	arr=new int[9][9];
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
			arr[i][j]=0;	
		}
	
	}
}
public static void setvalues(int x,int y,int value)
{
	arr[x-1][y-1]=value;
}
public static void getvalues()
{
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
public static int getplayer_x()
{
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
		if(arr[i][j]==5)
			return i+1;
		}
	}
	return 0;
}
public static int getplayer_y()
{
	for(int i=0;i<9;i++)
	{
		for(int j=0;j<9;j++)
		{
		if(arr[i][j]==5)
			return j+1;
		}
	}
	return 0;
}
}
