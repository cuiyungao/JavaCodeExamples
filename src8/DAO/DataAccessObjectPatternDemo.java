package DAO;

public class DataAccessObjectPatternDemo {
    public static void main(String[] args) {
        StudentDAO studentDao = new StudentDaoImpl();
        //输出所有的学生  
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "+ student.getRollNo() + ", Name : " + student.getName() + " ]");
        }
        System.out.println();
 	   //更新学生  
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);
        System.out.println();
        //获取学生  
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");

    }
}
