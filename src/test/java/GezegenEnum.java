public enum GezegenEnum {
    MERKUR(1, "Merkür", 57, 24, 58.6),
    VENUS(2, "Venüs", 10, 60, 243),
    DUNYA(3, "Dünya", 14, 63, 1),
    MARS(4, "Mars", 22, 33, 1.03);

    private final int siraNumarasi;
    private final String adi;
    private final double uzaklik;
    private final double yaricap;
    private final double donmeSuresi;

    GezegenEnum(int siraNumarasi, String adi, double uzaklik, double yaricap, double donmeSuresi) {
        this.siraNumarasi = siraNumarasi;
        this.adi = adi;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    @Override
    public String toString() {
        return String.format("%s - Sıra Numarası: %d, Uzaklık: %.2f km, Yarıçap: %.2f km, Dönme Süresi: %.2f gün",
                adi, siraNumarasi, uzaklik, yaricap, donmeSuresi);
    }

    // Örnek
    public static void main(String[] args) {
        System.out.println(GezegenEnum.MERKUR);
        System.out.println(GezegenEnum.VENUS);
        System.out.println(GezegenEnum.DUNYA);
        System.out.println(GezegenEnum.MARS);
    }
}
