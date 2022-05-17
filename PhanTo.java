import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class PhanTo
{
    public static void main(String[] args){
        
        Scanner soLuong=new Scanner(System.in);
        System.out.println("So luong sinh vien la:");
        int quantity=soLuong.nextInt();
        Scanner soLuongTo=new Scanner(System.in);
        System.out.println("So luong sinh vien trong mot to la:");
        int quantityGroup=soLuong.nextInt();
        ArrayList<Student> TH4 = new ArrayList<Student>();
        for(int i=0;i<quantity;i++){
            Scanner name=new Scanner(System.in);
            System.out.print("Tên sinh viên là: ");
            String ten=name.nextLine();
            Scanner old=new Scanner(System.in);
            System.out.print("Tuổi sinh viên: ");
            int tuoi=old.nextInt();
            Scanner school=new Scanner(System.in);
            System.out.print("Trường học: ");
            String truong=school.nextLine();
            TH4.add(new Student(ten,tuoi,truong));
        }
        int quantityMember;
        if(quantity%quantityGroup==0)
            quantityMember=quantity/quantityGroup;
        else
            quantityMember=quantity/quantityGroup+1;
        int x=quantity-1;
        Random rand = new Random();
        int ranNum;
        for(int i=0;i<quantityGroup;i++){
            System.out.println("To thu " + (i+1)+" la:");
            for (int j=0;i<quantityMember+1;j++) {
                if(TH4.size()>0){
                    ranNum=rand.nextInt(x);
                    x-=1;
                    System.out.println(TH4.get(ranNum).getName());
                    TH4.remove(ranNum);
                }
            }
        }
    }
}
