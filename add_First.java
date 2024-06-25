 import java.util.LinkedList;
 class add_First{
    public static void main(String args[]){
        LinkedList<String>colors=new LinkedList<>();{
            colors.add("red");
            colors.add("white");
            colors.add("black");
            System.out.println("LinkedList :" +colors);
            colors.addFirst("brown");
            System.out.println("After adding the First Element :" + colors);
        }
    }
}
/*
 OUTPUT:
LinkedList :[red, white, black]
After adding the First Element :[brown, red, white, black]
 */

