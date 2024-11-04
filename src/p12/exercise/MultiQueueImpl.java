package p12.exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiQueueImpl<T, Q> implements MultiQueue<T, Q>{

    Map<T,Q> queues = new HashMap<>();
    

    @Override
    public Set<Q> availableQueues() { 
        return new HashSet<>(this.queues.values());
    }

    @Override
    public void openNewQueue(Q queue) {
        for(Q controlQueue : this.queues.values()){
            if(controlQueue.equals(queue)){
                throw new IllegalArgumentException();
            }
           else{
                this.queues.values().add(queue);
                return;
            }
        }
    }

    @Override
    public boolean isQueueEmpty(Q queue) {
        if(this.queues.containsValue(queue)){
            for (T elem : this.queues.keySet()) {
                if(this.queues.get(elem).equals(queue)){
                    return false;
                }
            }
            return true;
        }
        else{
            throw new IllegalArgumentException();
        }
        
    }

    @Override
    public void enqueue(T elem, Q queue) {
        
    }

    @Override
    public T dequeue(Q queue) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public Map<Q, T> dequeueOneFromAllQueues() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeueOneFromAllQueues'");
    }

    @Override
    public Set<T> allEnqueuedElements() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'allEnqueuedElements'");
    }

    @Override
    public List<T> dequeueAllFromQueue(Q queue) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dequeueAllFromQueue'");
    }

    @Override
    public void closeQueueAndReallocate(Q queue) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'closeQueueAndReallocate'");
    }

}
