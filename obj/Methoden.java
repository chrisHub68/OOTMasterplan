package anmeldung.obj;
//-	Student hinzuf�gen		(Name Vorname Fach Wunschuhrzeit)
//-	Pr�fer und Fach hinzuf�gen	(Name Vorname Fach Wunschuhrzeit)
//-	Tauschen von Terminen.	
//-	Einf�gen einer Pause.		(Leer Zeile)
//-	L�schen von Terminen		(Termine die folgen werden automatisch vorgezogen)
//-	Hinzuf�gen von Terminen	(Student Pr�fer Fach Uhrzeit)
//-	Erzeugen eines Masterplans f�r die Bearbeitung.
//-	PDF mit Master-, Pr�fer- und Studentenplan ausdrucken.

public interface Methoden {
	
	public void addStudent() throws Exception;
	
	public void removeStudent();
	
	public void addPorfessor();
	
	public void removeProfessor();
	
	public void addSubject();
	
	public void swapLines();
	
	public void removeLine();
	
	
	
}
