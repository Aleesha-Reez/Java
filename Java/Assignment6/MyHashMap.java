
public class MyHashMap {
	
	
	
	class ListNode {
		int val;
		int key;
		ListNode next;

		ListNode(int key, int val) {
			this.key = key;
			this.val = val;
		}
	}
	
    ListNode[] nodes = new ListNode[10000];
	 
	
    public MyHashMap() {
    }
    
   
    public void put(int key, int value) {
        
    	int index = getHashCode(key);
    	
    	if (nodes[index] == null){ 
    		nodes[index] = new ListNode(-1, -1);
    	}
    	ListNode node = findPos(nodes[index], key);
		if (node.next == null){
			node.next = new ListNode(key, value);
		}
		else 
			node.next.val = value;
    	    System.out.println(node.next.val);
    }
    
   
    public int get(int key) {
    	
    	int index = getHashCode(key);
    	if (nodes[index] == null) 
    		return -1;
		ListNode node = findPos(nodes[index], key);
	    if (node.next == null) 
			return -1;
		
	 
		return node.next.val;
    }
    
   
    public void remove(int key) {
    	
    	int index = getHashCode(key);
		if (nodes[index] == null) 
			return;
		ListNode node = findPos(nodes[index], key);
		if (node.next == null) 
			return;
		node.next = node.next.next;
        
    }

    
    public int getHashCode(int key){
        return key % nodes.length;
    }

   
    	
    public ListNode findPos(ListNode newnode, int key) {
    	
    	    ListNode current = newnode;
    		ListNode temp = null;
    		while(current!=null && current.key!=key){ 
    			 temp = current;
    			 current = current.next;
    		}
    		return temp;
    }
    
    
    public static void main(String[] args) {
    	
    	MyHashMap hashMap = new MyHashMap();
    	
    	hashMap.put(1, 1);          
    	hashMap.put(2, 2);         
    	int res = hashMap.get(1);
    	System.out.println(res);
    	
    	int res2 = hashMap.get(3);   
    	System.out.println(res2);
    	
    	hashMap.put(2, 1);
    	
    	int res3 = hashMap.get(2); 
    	System.out.println(res3);
    	
    	hashMap.remove(2);          
    	
    	int res4 = hashMap.get(2);           
    	System.out.println(res4);
	}
    
}
