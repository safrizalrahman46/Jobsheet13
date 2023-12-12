public class Experiment522 {
    
    static void show(String str, int... a){
    System.out.println("String: "+str);
    System.out.println("Total argunem/parameter: "+ a.length);
for (int i : a) {
    System.out.print(i+" ");
    }
        System.out.println();
    } public static void main(String[]args) {
    show("Daspro 2023 © SAPRII", 100,200);
    show("Bussines Information System", 1,2,3,4,5);
    show("Polythecnyc Malang");
    }
}

