import java.util.*;

class TresureRoomEasy{

	static void findPair(int[] arr, int n, int total){
		LinkedHashMap<Integer,List<Integer>> hm=new LinkedHashMap<Integer,List<Integer>>();
		for(int i=0;i<n;i++){
		    if(hm.containsKey(arr[i])){
		        hm.get(arr[i]).add(i);
		    }else{
		    hm.put(arr[i],new ArrayList<Integer>());
		    hm.get(arr[i]).add(i);
		    }
		}
		
		for(int i=0;i<n;i++){
		    int temp = total-arr[i];
		    if(hm.containsKey(temp)){
		        System.out.println((i+1)+" "+(hm.get(temp).get(0)+1));
		        return;
		    }
		}
		System.out.println("-1");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int total=sc.nextInt();

		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		findPair(arr,n,total);

	}
}	
