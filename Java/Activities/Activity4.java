package Activities;

class Activity4 {
    
    public static void main(String args[]) {
        int arrlist[] = {5,2,6,8,4,7,1,3};
        int temp = 0;
        //---------------original Array list-------------------
        
        for (int i=0;i<arrlist.length;i++)
        {
        	System.out.println("The original List of Array are :" +arrlist[i]);
        }
        //---------------Sorting Array list in Ascending order----------------
        
        for (int i=0;i<arrlist.length;i++) {
        	for (int j=i+1;j<arrlist.length;j++)
        	{
        		if(arrlist[i]>arrlist[j])
        		{
        			temp=arrlist[i];
        			arrlist[i]=arrlist[j];
        			arrlist[j]=temp;
        		
        		}
        		
        	}
        	
        	
        }
        //---------------Printing Sorted Array list---------------------
        for (int i=0;i<arrlist.length;i++) {
        	System.out.println("The Ascending order Array list are is "+arrlist[i]);
        }
    }
}