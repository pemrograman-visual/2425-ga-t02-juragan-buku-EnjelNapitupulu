// 12S24056-Enjel Ayuti Napitupulu
//12S24033- Doy Denggan Simanjuntak

import java.util.*;
import java.lang.Math;

public class  T02{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBuku, kategori;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        penerbit = input.nextLine();
        formatBuku = input.nextLine();
        int tahunTerbit, stok;

        tahunTerbit = Integer.parseInt(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        double harga, margin, rating;

        harga = Double.parseDouble(input.nextLine());
        margin = Double.parseDouble(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategori = "MustRead";
            } else {
                if (rating >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategori = "Average";
                    } else {
                        if (rating <= 3.0) {
                            kategori = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + toFixed(harga,2) + "|" + toFixed(margin,2) + "|" + stok + "|" + rating + "|" + kategori);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
