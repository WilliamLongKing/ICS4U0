package LinkedList;

public class myLL {
	private StudentInfo frontOfList;
	private int listSize;
	private StudentInfo rearOfList;
	
	public myLL () {
		frontOfList = null;
		listSize = 0;
	}
	public StudentInfo returnFrontOfList() {
		return frontOfList;
	}
	
	public StudentInfo returnRearofList() {
		return rearOfList;
	}
		
	public int returnSize() {
		return listSize;
	}
	
	public boolean add(StudentInfo add) {
        if(this.listSize == 0) {
            this.frontOfList = add;
            this.rearOfList = add;
            this.listSize++;
            return true;
        } else {
            rearOfList.setNext(add);
            this.rearOfList = add;
            this.listSize++;
            return true;
        }
    }
	
	public StudentInfo removeFromRear() {
		StudentInfo currentItem = frontOfList;
		StudentInfo removedItem = this.rearOfList;
		if(this.listSize == 1 ) {
			this.frontOfList = this.frontOfList.getNext();
			return(null);
		} 
		
		else if(this.listSize == 0) {
			return(null);	
		}
		
		else {
			for(int i = 1; i < this.listSize; i++) {
				currentItem = currentItem.getNext();
				
				
			}
			currentItem.setNext(null);
			this.listSize -=1;
			
		}
		System.out.println("Student Removed:" + removedItem);
		return removedItem;
		
		
		// Remove the current rear item from the LL and
		// return its reference value to the caller.
		// Return null if the LL is empty and nothing to remove.
		
	}
			
	public StudentInfo removeFromFront() {
		StudentInfo removedStudent = this.frontOfList;
		this.frontOfList = this.frontOfList.getNext();
		this.listSize -=1;
		System.out.println("Student Removed:" + removedStudent);
		return(removedStudent);
	}
	
	public void studentsOutput() {
        StudentInfo someStudent = this.frontOfList;
        int i = 0;
         while (++i < this.listSize){
            someStudent.outputStudent(i);
            someStudent = someStudent.getNext();
        }
        someStudent.outputStudent(i);
        System.out.println();
    }
}
