package anmeldung.obj;
//-	Student hinzufügen		(Name Vorname Fach Wunschuhrzeit)
//-	Prüfer und Fach hinzufügen	(Name Vorname Fach Wunschuhrzeit)
//-	Tauschen von Terminen.	
//-	Einfügen einer Pause.		(Leer Zeile)
//-	Löschen von Terminen		(Termine die folgen werden automatisch vorgezogen)
//-	Hinzufügen von Terminen	(Student Prüfer Fach Uhrzeit)
//-	Erzeugen eines Masterplans für die Bearbeitung.
//-	PDF mit Master-, Prüfer- und Studentenplan ausdrucken.

public interface Methoden {
	
	public void addStudent() throws Exception;
	
	public void removeStudent();
	
	public void addPorfessor();
	
	public void removeProfessor();
	
	public void addSubject();
	
	public void swapLines();
	
	public void removeLine();
	
	
	
}
