
//arry function Argument 

public class arryfunction {
    public static void updates(int marks[]){
        for( int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main (String args[]){
        int marks[]={88, 74, 81};
        updates (marks);

        //print our marks
        for(int i=0; i<marks.length; i++){

        System.out.println(marks[i]+ "");
    }
     System.out.println();
    
}
}
