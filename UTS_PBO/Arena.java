package UTS_PBO;

public class Arena {

    public static String duel(Prajurit prajurit, Penyihir penyihir) {
        int ronde = 1;
        while (prajurit.isHidup() && penyihir.isHidup()) {
            System.out.println("Ronde " + ronde);

            int damagePrajurit = prajurit.hitungDamage();
            penyihir.terimaDamage(damagePrajurit);
            System.out.println(prajurit.getNama() + " menyerang " + penyihir.getNama() + ":");
            System.out.println(damagePrajurit + " -> sisa HP " + penyihir.getHp());

            if (!penyihir.isHidup()) {
                break;
            }

            int damagePenyihir = penyihir.hitungDamage();
            prajurit.terimaDamage(damagePenyihir);
            System.out.println(penyihir.getNama() + " menyerang " + prajurit.getNama() + ":");
            System.out.println(damagePenyihir + " -> sisa HP " + prajurit.getHp());

            ronde++;
        }

        if (prajurit.isHidup()) {
            return prajurit.info();
        } else {
            return penyihir.info();
        }
    }
}

