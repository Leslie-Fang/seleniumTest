class animal{
    private static int numbers=0;
    public animal(){
        numbers +=1;
    }
    public void sayNumber(){
        System.out.println(String.format("There are %d animals",numbers));
    }
}
class person extends animal{
    public person(){
        super();
    }
}
class test{
    public static void main(String[] args){
        System.out.println("hello world");
        animal firstOne = new animal();
        firstOne.sayNumber();
        animal firstTwo = new animal();
        firstOne.sayNumber();
        animal firstThree = new person();
        firstOne.sayNumber();
    }
}
