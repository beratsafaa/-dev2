public class ogrenciTest {
    public static void main(String[] args) {
        ogrenci[] ogrenciler = {

                new ogrenci("Ali", "Bilgisayar Müh", 3.0, 2022, "341", "034"),
                new ogrenci("Ayşegül", "Makine Müh", 3.30, 2021, "143", "036"),
                new ogrenci("Mehmet", "Endüstri Müh", 2.97, 2020, "121", "018"),
                new ogrenci("Nur", "Kimya Müh", 3.80, 2019, "234", "03")};
        for (ogrenci o : ogrenciler) {
            if (o.getGano() < 0 || o.getGano() > 4)
                throw new IllegalArgumentException("GANO geçersiz");
        }
            System.out.println("OGR 1 :" + ogrenciler[0].getAd() + " " + ogrenciler[0].getBolum() + " " + ogrenciler[0].getGano() + " " + ogrenciler[0].ogrenciNoOlustur());
            System.out.println("OGR 2 :" + ogrenciler[1].getAd() + " " + ogrenciler[1].getBolum() + " " + ogrenciler[1].getGano() + " " + ogrenciler[1].ogrenciNoOlustur());
            System.out.println("OGR 3 :" + ogrenciler[2].getAd() + " " + ogrenciler[2].getBolum() + " " + ogrenciler[2].getGano() + " " + ogrenciler[2].ogrenciNoOlustur());
            System.out.println("OGR 4 :" + ogrenciler[3].getAd() + " " + ogrenciler[3].getBolum() + " " + ogrenciler[3].getGano() + " " + ogrenciler[3].ogrenciNoOlustur());
            System.out.println("3. öğrencinin ödeyeceği harç: " + ogrenciler[2].harcHesaplama(9));
            System.out.println("4. öğrencinin ödeyeceği harç: " + ogrenciler[3].harcHesaplama(8, 2));
        }
    }
