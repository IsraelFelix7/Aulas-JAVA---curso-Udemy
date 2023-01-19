package aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 =  LocalDate.now(); // data local
		System.out.println("d01 --- "+d01);
		
		LocalDateTime d02 = LocalDateTime.now(); // data e horário local  
		System.out.println("d02 --- "+d02);
		
		Instant d03 = Instant.now();
		System.out.println("d03 --- "+d03);   // data e horário mundial
		
		DateTimeFormatter horaConvertida = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("horário convertido: " + horaConvertida.format(d03));
		System.out.println("horário de Londres: "+d03);
	
	}

}
