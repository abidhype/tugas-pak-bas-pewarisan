package  pewarisan_coba_sendiri;

import java.util.Scanner;
public class Main_project{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
//membuat sebuah object

// "pegawai" merupakan class, lalu "Pegawai" merupakan objek yang akan dibuat, lalu "new pegawai();" merupakan constructor.

pegawai Pegawai = new pegawai();
manager Manager = new manager();
kasir Kasir = new kasir();
koki Koki = new koki();
pelayan Pelayan = new pelayan();
satpam Satpam = new satpam();



//nilai tersebut akan dimasukkan kedalam variabel yang ada pada superclass.
System.out.print("====DATA MANAGER====\n");
System.out.print("Masukkan Nama : ");
    Manager.nama = input.nextLine();
System.out.println("id pegawai :1 ");
System.out.println("gaji : 7 juta");
Manager.id_pegawai = 1;
Manager.gaji = "7 Juta";
System.out.print("=====================\n");

System.out.print("====DATA MANAGER====\n");
System.out.print("Masukkan Nama : ");
    Kasir.nama = input.nextLine();
System.out.println("id pegawai :2 ");
System.out.println("gaji : 1,2 juta");
Kasir.id_pegawai = 2;
Kasir.gaji = "1,2 Juta";
System.out.print("=====================\n");

System.out.print("====DATA MANAGER====\n");
System.out.print("Masukkan Nama : ");
    Koki.nama = input.nextLine();
System.out.println("id pegawai :3 ");
System.out.println("gaji : 2 juta");

Koki.id_pegawai = 3;
Koki.gaji = "2 Juta";
System.out.print("=====================\n");

System.out.print("====DATA MANAGER====\n");
System.out.print("Masukkan Nama : ");
    Pelayan.nama = input.nextLine();

System.out.println("id pegawai :4 ");
System.out.println("gaji : 1,2 juta");
Pelayan.id_pegawai = 4;
Pelayan.gaji = "1,2 Juta";
System.out.print("=====================\n");

System.out.print("====DATA MANAGER====\n");
System.out.print("Masukkan Nama : ");
    Satpam.nama = input.nextLine();

System.out.println("id pegawai :5 ");
System.out.println("gaji : 1 juta");
Satpam.id_pegawai = 5;
Satpam.gaji = "1 Juta";
System.out.print("=====================\n");
//memanggil fungsi pada superclass

Pegawai.menampilkan();

 

//memanggil nilai variabel pada superclass dan memasukkannya kedalam fungsi yang ada pada class;

Manager.menampilkan();

Manager.tugas();

Kasir.menampilkan();

Kasir.tugas();

Koki.menampilkan();

Koki.tugas();

Pelayan.menampilkan();

Pelayan.tugas();

Satpam.menampilkan();

Satpam.tugas();

}

}