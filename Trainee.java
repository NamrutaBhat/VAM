class Trainee{
  String s,t,n,dob;
  
  double height;
     
void javaCourse(){
System.out.println(s+" "+t+" "+"and"+" "+n+" "+"are attending the java classes at X-workz and our trainee is Asha mam");
}

void quali(){
System.out.println("We are from Engineering background");
}

void basicDetails(){
   System.out.println(s+" "+"is a"+" "+dob+" "+"kid"+" "+"having height"+" "+height);
}

public static void main(String[] args){
   Trainee sh=new Trainee();
    sh.s="Shweta";
    sh.t="Tejas";
     sh.n="Namruta";
     sh.javaCourse();
  sh.quali();
     Trainee n=new Trainee();


       n.s="swati";
        n.height=5.5;
	n.dob="12-05-1997";
	n.basicDetails();

}
}