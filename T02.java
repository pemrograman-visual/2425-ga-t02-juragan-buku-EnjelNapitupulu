// 12S24056-Enjel Ayuti Napitupulu
//12S24033- Doy Denggan Simanjuntak

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatbuku, ket;
        int stok, tahunterbit;
        double minimummargin, rating, hargabeli;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        hargabeli = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            ket = "Best Pick";
        } else {
            if (rating >= 4.5) {
                ket = "Must Read";
            } else {
                if (rating >= 4.0) {
                    ket = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        ket = "Average";
                    } else {
                        ket = "Low";
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargabeli + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + ket);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
