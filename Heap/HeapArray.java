public class HeapArray implements Heap{
    private int [] heap;
    private int size;
    private int capacity;

    public HeapArray (int capacity){
        this.capacity = capacity;
        this.heap = new int[capacity + 1];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            resizeHeap(); 
        }
        heap[++size] = value;
        upHeap(size);
    }
    
    private void resizeHeap() {
        capacity *= 2
            
        int newHeap[] = new int[capacity + 1];
        for (int i = 0; i < heap.length; i++){
            newHeap[i] = heap[i];
        }
        heap = newHeap;
    }
    
    public int removeMin() {
        if (isEmpty()){
            System.out.println("Heap está vazia");
            return 0;
        }
        int min = heap[1];
        heap[1] = heap[size--];
        
        downHeap(1); 

        return min; 
    }
    
    public int size() {
        return size; 
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int min(){
        if (isEmpty()) {
            System.out.println("Heap está vazia");
            return 0;
        }
        return heap[1];
    }

    private void upHeap(int index) {
        while (index > 1) {
            int parent = index / 2;

            if (heap[index] < heap[parent]){
                swapElements (index, parent);
                index = parent; 
            } else {
                break;
            }
        } 
    }
    
    private void downHeap(int index) {
        while (true) {
            int leftChild= index * 2; 
            int rightChild = (index * 2) + 1;
            int minorElement = index; 

            if (leftChild <= size && heap[leftChild] < heap[minorElement]) {
                minorElement = leftChild;
            }

            if (rightChild <= size && heap[rightChild] < heap[minorElement]) {
                minorElement = rightChild;
            }
        
            if (minorElement != index) {
                swapElements(index, minorElement);
                index = minorElement;
            } else {
                break;
            }
        } 
    }
    
    private void swapElements(int b, int c) {
        int temp = heap[b]; 
        heap[b] = heap[c];
        heap[c] = temp;
    }
}
