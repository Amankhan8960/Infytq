// Implentation of BINARY SEARCH//

public class BinarySearch {
	
    public static void BSearch(int[] arr,int key,int first,int last) {
    	while(first<=last) {
    		int mid=(first+last)/2;
    		if(arr[mid]<key) {
    			first=mid+1;
    		}else if(arr[mid]==key) {
    			System.out.println("key Found at:"+mid);
    			break;
    		}else {
    			last=mid-1;
    		}
    	}
    	if(first>last) {
    		System.out.println("Key not Found");
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,9,17,23,25,35,48};
		int key=17;
		int last=arr.length;
		BSearch(arr,key,0,last);

}
  
  
 
