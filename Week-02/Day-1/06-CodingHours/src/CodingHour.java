class CodingHours {
    public static void main(String[] args) {

        int dailyCoding  = 6;
        int weeksSemester = 17;
        int workingDays = 5;
        int weeklyWorkHours = 52;
        float hoursOfCoding = dailyCoding * weeksSemester * workingDays;

        String codingHours = "Days spent with coding by the average Green Fox attendee is: " + hoursOfCoding;

        System.out.println(codingHours);

        // This below seem terribly wrong

        String percentageOfHours = "Percentage of the coding hours in the semester is: " + weeklyWorkHours / hoursOfCoding * 100;

        System.out.println(percentageOfHours);

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
    }
}