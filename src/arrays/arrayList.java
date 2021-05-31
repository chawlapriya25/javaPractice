package arrays;

import java.util.ArrayList;

public class arrayList {
     private ArrayList<String>groceryList=new ArrayList<String>();

     public void addGroceryItem(String item){
         groceryList.add(item);

     }
     public void printGroceryList() {
         System.out.println("You have " + groceryList.size() + "items in the grocery");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+" "+groceryList.get(i));
        }
     }
     public void modifyGrocery(int position,String newItem){
         groceryList.set(position,newItem);
         System.out.println("groceryitem"+(position+1)+ " has been  modified");
     }
     public void removeGroceryItem(int position){
         String newItem=groceryList.get(position);
         groceryList.remove(position);
     }
     public String finItem(String searchItem){
      //    boolean exists=groceryList.contains(searchItem);
          int position=groceryList.indexOf(searchItem);
          if(position>=0){
              return groceryList.get(position);
          }
          return null;
     }



    }
