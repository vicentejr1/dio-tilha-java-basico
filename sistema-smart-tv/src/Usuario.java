public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smarTv = new SmartTv();


        System.out.println("A TV está ligada? " + smarTv.ligada);
        System.out.println("Canal Atual " + smarTv.canal);
        System.out.println("Volume Atual " + smarTv.volume);
        System.out.println(" ");

        smarTv.aumentarVolume();
        System.out.println("Qual volume a TV está? " + smarTv.volume);

        smarTv.mudarCanal(26);

        System.out.println("Canal atual: " + smarTv.canal);


        
    }
}
