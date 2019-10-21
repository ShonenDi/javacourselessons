package net.ukr.shonen;

public class Group {

	private Student [] group = new Student[10];

	public Group(Student[] group) {
		super();
		this.group = group;
	}

	public Group() {
		super();
	}
	
	public void addStudent (Student noob ) {
		for (int i = 0; i < group.length; i++) {
			if(group[i]!= null) {
				group[i]=noob;
			}
		}
		
			}
	
	
}
