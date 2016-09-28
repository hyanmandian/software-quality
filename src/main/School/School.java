package School;

public class School {

    public double avg(double firstNote, double secondNote, double thirdNote) {
        double sum = firstNote + secondNote + thirdNote;
        double avg = sum / 3;
        
        return (double) Math.round(avg * 100000d) / 100000d;
    }

    public String getStudentStatus(double firstNote, double secondNote, double thirdNote) {
        double media = this.avg(firstNote, secondNote, thirdNote);

        if (media >= 7) {
            return "Approved!";
        } else if (media >= 5 && media <= 6.9) {
            return "In examination!";
        }

        return "Disapproved!";
    }

}
