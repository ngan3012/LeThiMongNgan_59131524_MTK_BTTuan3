/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author KetNgan
 */
public class Main {
    public static void main(String[] args) {
        context pheptinh1 = new context();
        ITinh cong = new Cong();
        pheptinh1.setTinhToan(cong);
        System.out.println("Kết quả phép tính cộng là: " + pheptinh1.tinh(3, 4));
        
        context pheptinh2 = new context();
        ITinh tru = new Tru();
        pheptinh2.setTinhToan(tru);
        System.out.println("Kết quả phép tính trừ là: " + pheptinh2.tinh(8, 2));
        
        context pheptinh3 = new context();
        ITinh nhan = new Nhan();
        pheptinh3.setTinhToan(nhan);
        System.out.println("Kết quả phép tính nhân là: " + pheptinh3.tinh(5, 14));
        
        context pheptinh4 = new context();
        ITinh chia = new Chia();
        pheptinh4.setTinhToan(chia);
        System.out.println("Kết quả phép tính chia là: " + pheptinh4.tinh(10, 4));
    }   
}
