package com.zx.once;
import java.util.Comparator;

    class StudentComparator implements Comparator<Student>//����һ��Student�Ƚ���
    {

		public int compare(Student stu1, Student stu2) {
			if(stu1 == stu2){
			return 0;
			}
		    if(stu1.age>stu2.age){
				return 1;
			}else if(stu1.age<stu2.age){
				return -1;
			}else{
				return 0;
			}
		}
    }
    

