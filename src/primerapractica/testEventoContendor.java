package primerapractica;

//probando patron prototipo

public class testEventoContendor {
    
    public static void main(String[] args) {
        Evento evento= new Evento();
        
       
        System.out.println(evento.imprimirEvento());
        System.out.println(evento.gethora());

        Evento evento2=(Evento) evento.clonar();
        System.out.println(evento2.getNombre()+ " "+ evento2.getFecha());
        System.out.println(evento2.imprimirEvento());
    }
}
