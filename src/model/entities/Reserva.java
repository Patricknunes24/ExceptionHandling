package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numeroQuarto;
    private Date checkIn;
    private  Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {
    }

    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao(){
        long dur = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dur,TimeUnit.MILLISECONDS);
    }
    public String dataAtualizada(Date checkIn,Date checkOut){
        // alterações
        Date dataa = new Date();
        if (checkIn.before(dataa)||checkOut.before(dataa)){
            return "A data fornecida e anterior a Data atual";
        }
        if(!checkIn.after(checkOut)){
            return "A data de CheckIn não é anterior a data de CheckOut";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }
    @Override
    public String  toString(){
        return "Reserva: "+"Quarto: "+numeroQuarto+" CheckIn: "+sdf.format(checkIn)+" CheckOut: "+sdf.format(checkOut)+" Duração: "+duracao()+" Dias";
    }
}
