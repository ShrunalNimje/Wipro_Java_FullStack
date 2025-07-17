package Projects;

public class Project1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide an employee ID.");
            return;
        }

        int empId = Integer.parseInt(args[0]);

        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] desigCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        String[] desigName = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        char[] desigCodes = {'e', 'c', 'k', 'r', 'm'};
        int[] da = {20000, 32000, 12000, 15000, 40000};

        boolean found = false;

        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == empId) {
                found = true;

                String designation = "";
                int daAmount = 0;

                switch (desigCode[i]) {
                    case 'e':
                        designation = "Engineer";
                        daAmount = 20000;
                        break;
                    case 'c':
                        designation = "Consultant";
                        daAmount = 32000;
                        break;
                    case 'k':
                        designation = "Clerk";
                        daAmount = 12000;
                        break;
                    case 'r':
                        designation = "Receptionist";
                        daAmount = 15000;
                        break;
                    case 'm':
                        designation = "Manager";
                        daAmount = 40000;
                        break;
                    default:
                        designation = "Unknown";
                }

                int salary = basic[i] + hra[i] + daAmount - it[i];

                // Output
                System.out.println("Emp No.   Emp Name   Department   Designation   Salary");
                System.out.println(empNo[i] + "      " + empName[i] + "     " + department[i] + "     " + designation + "     " + salary);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + empId);
        }
    }
}
