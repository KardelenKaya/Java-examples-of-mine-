package logic.gate;

/**
 *
 * @author Kardelen Kaya
 */
public class LogicGate {
    public static int NOT (int a){
        int q;
        System.out.print(" NOT : ");
        if(a==0){
            q=1;
            System.out.print(q+" ");}
        else{
            q=0;
            System.out.print(q+" ");}
        return q;
    }
    public static int AND (int  a ,int b ){
        int q ;
        System.out.print(" AND : ");
        if(a == 1 && b == 1){
            q=1;   
            System.out.print(q+" ");}
        else{
            q=0;
            System.out.print(q+" ");
        }
        return q ;}
    public static int AND (int a , int b ,int c){
        int q ;
        System.out.print(" AND : ");
        if(a==1 && b==1 && c==1 ){
            q=1;
            System.out.print(q+" ");}
        else{
             q=0;
             System.out.print(q+" ");}
        return q;
    }
    public static int OR (int a , int b){
        int q ;
        System.out.print(" OR : ");
        if(a == 0 && b == 0){
            q=0;   
            System.out.print(q+" ");}
        else{
            q=1;
            System.out.print(q+" ");}
return q;
    }
    public static int OR (int a , int b,int c){
         int q;
         System.out.print(" OR : ");
         if(a==0 && b==0 && c==0 ){
            q=0;
            System.out.print(q+" ");}
        else{
             q=1;
             System.out.print(q+" ");}
         return q;
     }
    public static int XOR(int a, int b){
        int q;
        System.out.print(" XOR : ");
        if(a==0 && b ==0 || a==1 && b==1){
            q=0;
            System.out.print(q+" ");}
        else{
            q=1;
            System.out.print(q+" ");}
        return q;
    }
    public static int XOR (int a, int b , int c){
        int q;
        System.out.print(" XOR : ");
        if(a==0 && b==0 && c==0 ){
            q=0;
            System.out.print(q+" ");}
        else if(a==1 && b==0 && c==0 ){
            q=1;
            System.out.print(q+" ");}
        else if(a==0 && b==1 && c==0 ){
            q=1;
            System.out.print(q+" ");}
        else if(a==0 && b==0 && c==1 ){
            q=1;
            System.out.print(q+" ");}
        else if(a==0 && b==1 && c==1 ){
            q=0;
            System.out.print(q+" ");}
        else if(a==1 && b==0 && c==1 ){
            q=0;
            System.out.print(q+" ");}
        else if(a==1 && b==1 && c==0 ){
            q=0;
            System.out.print(q+" ");}
        else{
            q=0;
            System.out.print(q+" ");}        
        return q;     
    }
    public static int XNOR(int a , int b){
        System.out.print(" XNOR : ");
        NOT(XOR(a,b));
        return 0;
    }
    public static int XNOR (int a, int b, int c){                 
        
        return NOT(XOR(a,b,c));
    }
     public static int NAND (int a, int b){
        NOT(AND(a,b));
        return 0;
    }
     public static int NAND (int a, int b, int c){
        NOT(AND(a,b,c));
        return 0;
    }
      public static int NOR (int a, int b, int c){
        NOT(OR(a,b,c));
        return 0;
    }
       public static int NOR (int a, int b){
        NOT(OR(a,b));
        return 0;
    }
    
    
    
    public static void main(String[] args) {
        // Hİ guys , I am gonna do my first repo so , I am litte bit execited. I hope this is gonna help you. If you want to inspect it and advise , please do .
        
        /*
        Okey guys , ı used java methods to make seven basic logic gate  (AND+ , OR+ , NOT+ , XOR+ , NAND+ ,NOR+ and XNOR+ ) and use 0 and 1 for ınputs. 
        I wrote these logic gates by taking a maximum of 3 inputs. I think it's a good example for if structure and methods.
        */
          /* THİS İS İMPORTANT :
            XNOR = XOR + NOT
            NAND = AND + NOT
            NOR  = OR  + NOT */
        System.out.println("Please write your inputs. İnputs must be 0 or 1");
        
   
    }
    
}
