public class Hesap implements Carpma,Bolme,Toplama,Cikarma,KareAlma,KareKokAlma{

    @Override
    public void Carpma(int a, int b) {
        int c=a*b;
        System.out.println("a x b ="+c);
    }

    @Override
    public void Bolme(int a, int b) {
        int c=a/b;
        System.out.println("a/b="+c);
    }

    @Override
    public void Cikarma(int a, int b) {
        int c= a-b;
        System.out.println("a-b="+c);
    }

    @Override
    public void Toplama(int a, int b) {
        int c=a+b;
        System.out.println("a+b="+c);
    }

    @Override
    public void TekSayiKareAlma(int a) {
        int b =a*a;
        System.out.println("a'nın karesi ="+b);

    }

    @Override
    public void parantezKareAlma(int a, int b) {

        System.out.println("iki sayının toplamının parentes karesi :"+Math.pow(a,b));

    }

    @Override
    public void KarekokAlma(int a) {
        System.out.println("bir a sayısının kökü  = "+Math.sqrt(a));


    }
}
