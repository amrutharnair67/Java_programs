class Thread2{
System.out.println("Thread2");

}
class Thread1{

System.out.println("thread1");
Thread1(){

System.out.println("value");

}

class LabExam2Amrutha{
public static void main(String args[]){
Thread1 = new Thread1();
Thread2 = new Thread2();
 
System.out.println("Main method");

}
}
