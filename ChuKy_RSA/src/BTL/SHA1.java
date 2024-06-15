/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTL;

/**
 *
 * @author ADMIN
 */
import java.io.*;
import java.security.*;

public class SHA1 {
    public static String hash(String text) throws NoSuchAlgorithmException {
        // Tạo đối tượng MessageDigest với thuật toán SHA-1
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
       
        // Cập nhật đối tượng MessageDigest với dữ liệu đầu vào
        sha1.update(text.getBytes());

        // Hoàn thành quá trình băm và lấy giá trị băm
        byte[] hash = sha1.digest();   //Mảng byte này có độ dài cố định là 20 byte cho SHA-1.
        
        // Chuyển đổi giá trị băm từ dạng byte sang dạng hex
        StringBuilder hexHash = new StringBuilder();
        for (byte b : hash) {
            hexHash.append(String.format("%02x", b));
        }
        return hexHash.toString();
    }
    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(hash("Manh"));
    }
}


