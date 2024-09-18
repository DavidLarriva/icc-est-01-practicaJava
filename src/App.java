public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int xd;

        String cadena = "Hola mund o";
        int edad = 10;
        System.out.println(cadena);
        System.out.println("tamano de la cadena");
        System.out.println(cadena.split(" ")[2]);

        for (int index = 0; index < cadena.length(); index++) {
            if (index == cadena.length()-1) {
                System.out.print(cadena.charAt(index));
            } else {
                System.out.print(cadena.charAt(index) + ".");
            }
            
           
        }

       xd = cadena.split(" ").length;
       System.out.println();
       System.out.println(xd);
       
       int y = 0;
       for (int index = 0; index < cadena.length(); index++) {
        if ( 'a' == cadena.charAt(index) ) {
             y++;

        }
        
       
    }

    System.out.println(y);


    }
}
