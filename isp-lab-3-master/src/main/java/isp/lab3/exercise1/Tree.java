package isp.lab3.exercise1;

public class Tree {
   int height {get; set;}
   
   
   Tree(){
       height = 15;
   }
   
   void grow(int meters){
       if (meters >=1){
            height = height + meters;
       }
   }
}
