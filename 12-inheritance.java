class Student extends Person{
	private int[] testScores;
    
    Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.testScores = testScores;
    }
    
    public char calculate() {
        int total = 0;
        double average;
        char grade;

        for (int testScore : this.testScores) {
            total += testScore;
        }
        
        average = total / this.testScores.length;
        
        if (average >= 90) {
            grade = 'O';
        } else if (average >= 80) {
            grade = 'E';
        } else if (average >= 70) {
            grade = 'A';
        } else if (average >= 55) {
            grade = 'P';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'T';
        }
        
        return grade;
        
    }
