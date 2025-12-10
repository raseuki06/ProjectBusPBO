import java.util.Scanner;

public class TestBus {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Bus bus=new Bus();

        while(true){
            System.out.println("\n===== MENU BUS TRANS KOETARADJA =====");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");

            int p=in.nextInt();

            if(p==1){
                System.out.print("ID: "); int id=in.nextInt();
                System.out.print("Umur: "); int umur=in.nextInt();
                System.out.print("Hamil (y/n): "); boolean h=in.next().equalsIgnoreCase("y");

                Penumpang pen=new Penumpang(id,umur,h);

                if(bus.naikkanPenumpang(pen))
                    System.out.println("Penumpang Berhasil Naik!");
                else
                    System.out.println("Gagal Naik!");
            }
            else if(p==2){
                System.out.print("ID Penumpang Turun: ");
                int id=in.nextInt();
                if(bus.turunkanPenumpang(id))
                    System.out.println("Penumpang Turun!");
                else
                    System.out.println("Penumpang Tidak Ditemukan!");
            }
            else if(p==3){
                System.out.println(bus);
            }
            else if(p==4){
                break;
            }
        }
    }
}
