package principal;

import model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class programa {
    // METODO RUIM DE CRIAR EXCEÇÃO
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner tec = new Scanner(System.in);

        System.out.println("DIGITE O NUMERO DO QUARTO: ");
        Integer numQuarto = tec.nextInt();
        tec.nextLine();
        System.out.println("DIGITE UMA DATA CHECK-IN ");
        Date dateCheckIn = sdf.parse(tec.nextLine());
        System.out.println("DIGITE OUTRA DATA CHECK-OUT ");
        Date dateCheckOut = sdf.parse(tec.nextLine());

        if (!dateCheckOut.after(dateCheckIn)){
            System.out.println("ERRO NA RESERVA" +
                    "\n(A data de checkOut deve ser maior que a data de CheckIn)");
        }
        else {
            Reserva reserva = new Reserva(numQuarto, dateCheckIn,dateCheckOut);
            System.out.println(reserva.toString());
            System.out.println("=====================================================================");
            System.out.println("ATUALIZAÇÃO DE RESERVA");
            System.out.println("DIGITE UMA DATA CHECK-IN ");
            dateCheckIn = sdf.parse(tec.nextLine());
            System.out.println("DIGITE OUTRA DATA CHECK-OUT ");
            dateCheckOut = sdf.parse(tec.nextLine());
            Date dataa = new Date();
            if (dateCheckIn.before(dataa)||dateCheckOut.before(dataa)){
                System.out.println("ERRO DE RESERVA");
            }
            else if(!dateCheckOut.after(dateCheckIn)){
                System.out.println("ERRO DE RESERVA");
            }
            else {
                reserva.dataAtualizada(dateCheckIn,dateCheckOut);
                System.out.println(reserva.toString());
            }
        }



    }

}