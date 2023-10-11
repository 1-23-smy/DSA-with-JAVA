package OOPs;
class test{
   Object i;
    public void getnum(int i){
        this.i=i;
    }
    public void printnum(){
        System.out.println(i);
    }
}
class this_keyword_example {
    public static void main(String[] args) {
        test t=new test();
        t.getnum(10);
        t.printnum();
    }
}
