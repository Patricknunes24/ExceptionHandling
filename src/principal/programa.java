package principal;

import model.entities.Reserva;
import model.exception.MainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programa {
    // METODO RUIM DE CRIAR EXCEÇÃO
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner tec = new Scanner(System.in);
        try{
            System.out.println("DIGITE O NUMERO DO QUARTO: ");
            Integer numQuarto = tec.nextInt();
            tec.nextLine();
            System.out.println("DIGITE UMA DATA CHECK-IN ");
            Date dateCheckIn = sdf.parse(tec.nextLine());
            System.out.println("DIGITE OUTRA DATA CHECK-OUT ");
            Date dateCheckOut = sdf.parse(tec.nextLine());
            // INSTANCIAMENTO
            Reserva reserva = new Reserva(numQuarto, dateCheckIn, dateCheckOut);
            System.out.println(reserva.toString());
            System.out.println("=====================================================================");
            System.out.println("ATUALIZAÇÃO DE RESERVA");
            System.out.println("DIGITE UMA DATA CHECK-IN ");
            dateCheckIn = sdf.parse(tec.nextLine());
            System.out.println("DIGITE OUTRA DATA CHECK-OUT ");
            dateCheckOut = sdf.parse(tec.nextLine());
            reserva.dataAtualizada(dateCheckIn, dateCheckOut);
            System.out.println("RESERVA : "+ reserva);
        }
        catch (ParseException e){
            System.out.println("DATA INVALIDA !"+e.getMessage());
        }
        catch (MainException e){
            System.out.println("ERROR EM RESERVA" + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("ERROR INVALIDO");
        }




    }
}




