package excercise;

public class Address {
        int streetno;
        String city;
        String state;
        String country;

        Address(int streetno, String city, String state, String country) {
            this.streetno = streetno;
            this.city = city;
            this.country = country;
            this.state = state;
        }
    }

    class StudentClass {
        int rollNum;
        String Studentname;
        Address studentAddr;

        StudentClass(int roll, String name, Address adr) {
            this.rollNum = roll;
            this.Studentname = name;
            this.studentAddr = adr;
        }
    }
        class College {
            String collegeName;
            Address collegeAddress;

            College(String name, Address adr) {
                this.collegeName = name;
                this.collegeAddress = adr;
            }

        }
        class Staff{
     int employeeNo;
     String  subject;
     Address Staffad;

      Staff(int employeeNo,String subject, Address adr ){
          this.employeeNo=employeeNo;
          this.subject=subject;
          this.Staffad=adr;
      }



        public static void main(String[] args) {
            Address ad = new Address(55, "Agra", "UP", "iNDIA");
            StudentClass obj = new StudentClass(123, "Chaintyana", ad);
            College col= new College("abc College", ad);
            Staff staff =new Staff(23,"Math",ad);
            System.out.println(obj.rollNum);
            System.out.println(obj.Studentname);
            System.out.println(obj.studentAddr.streetno);
            System.out.println(obj.studentAddr.city);
            System.out.println(obj.studentAddr.state);
            System.out.println(obj.studentAddr.country);
            System.out.println(col.collegeName);
            System.out.println(col.collegeAddress.country);
            System.out.println(col.collegeAddress.state);
            System.out.println(col.collegeAddress.city);
            System.out.println(staff.employeeNo);
            System.out.println(staff.subject);
            System.out.println(staff.Staffad.city);
            System.out.println(staff.Staffad.state);
        }
    }


