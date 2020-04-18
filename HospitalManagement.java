import java.io.*;

import java.util.*;

import java.util.Calendar;

class staff

{

 String sid, sname, desg, sex;

 int salary;

 void new_staff()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Id:-");
  sid = input.nextLine();

  System.out.print("Name:-");
  sname = input.nextLine();

  System.out.print("Desigination:-");
  desg = input.nextLine();

  System.out.print("Sex:-");
  sex = input.nextLine();

  System.out.print("Salary:-");
  salary = input.nextInt();

 }

 void staff_info()

 {

  System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);

 }

}



class doctor

{

 String did, dname, specilist, appoint, doc_qual;

 int droom;



 void new_doctor()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Id:-");
  did = input.nextLine();

  System.out.print("Name:-");
  dname = input.nextLine();

  System.out.print("Specilization:-");
  specilist = input.nextLine();

  System.out.print("Work Time:-");
  appoint = input.nextLine();

  System.out.print("Qualification:-");
  doc_qual = input.nextLine();

  System.out.print("Room No.:-");
  droom = input.nextInt();

 }

 void doctor_info()

 {

  System.out.println(did + "\t" + dname + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + droom);


 }

}



class patient

{

 String pid, pname, disease, sex, admit_status;

 int age;



 void new_patient()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Id:-");
  pid = input.nextLine();

  System.out.print("Name:-");
  pname = input.nextLine();

  System.out.print("Disease:-");
  disease = input.nextLine();

  System.out.print("Sex:-");
  sex = input.nextLine();

  System.out.print("Admit_Status:-");
  admit_status = input.nextLine();

  System.out.print("Age:-");
  age = input.nextInt();

 }

 void patient_info()

 {

  System.out.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);

 }

}



class medical

{

 String med_name, med_comp, exp_date;

 int med_cost, count;


 void new_medi()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Name:-");
  med_name = input.nextLine();

  System.out.print("Company:-");
  med_comp = input.nextLine();

  System.out.print("Exp_Date:-");
  exp_date = input.nextLine();

  System.out.print("Cost:-");
  med_cost = input.nextInt();

  System.out.print("No of Unit:-");
  count = input.nextInt();

 }

 void find_medi()

 {

  System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);

 }

}


class lab

{

 String fecility;

 int lab_cost;


 void new_feci()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Facility:-");
  fecility = input.nextLine();

  System.out.print("Cost:-");
  lab_cost = input.nextInt();

 }

 void feci_list()

 {

  System.out.println(fecility + "\t\t" + lab_cost);

 }

}



class fecility  

{



 String fec_name;

 void add_feci()

 {

  Scanner input = new Scanner(System.in);

  System.out.print("Facility:-");
  fec_name = input.nextLine();


 }

 void show_feci()

 {

  System.out.println(fec_name);

 }

}



public class HospitalManagement

{

 public static void main(String args[])

 {

  String months[] = {

   "Jan",
   "Feb",
   "Mar",
   "Apr",

   "May",
   "Jun",
   "Jul",
   "Aug",

   "Sep",
   "Oct",
   "Nov",
   "Dec"
  };

  Calendar calendar = Calendar.getInstance();

  //System.out.println("--------------------------------------------------------------------------------");

  int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;


  System.out.println("--------------------------------------------------------------------------------");

  System.out.println("                          *****HOSPITAL MANAGEMENT SYSTEM****");

  System.out.println("--------------------------------------------------------------------------------");

  System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

  System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));


  doctor[] d = new doctor[25];

  patient[] p = new patient[100];

  lab[] l = new lab[20];

  fecility[] f = new fecility[20];

  medical[] m = new medical[100];

  staff[] s = new staff[100];

  int i;

  for (i = 0; i < 25; i++)

   d[i] = new doctor();

  for (i = 0; i < 100; i++)

   p[i] = new patient();

  for (i = 0; i < 20; i++)

   l[i] = new lab();

  for (i = 0; i < 20; i++)

   f[i] = new fecility();

  for (i = 0; i < 100; i++)

   m[i] = new medical();

  for (i = 0; i < 100; i++)

   s[i] = new staff();


  d[0].did = "25";
  d[0].dname = "Dr.Pradeep";
  d[0].specilist = "Surgery";
  d[0].appoint = "9-2";
  d[0].doc_qual = "mbbs,Ms";
  d[0].droom = 10;

  d[1].did = "30";
  d[1].dname = "Dr.Niharika";
  d[1].specilist = "Orthologist";
  d[1].appoint = "10-3";
  d[1].doc_qual = "mbbs,md,FICS";
  d[1].droom = 18;

  d[2].did = "25";
  d[2].dname = "Dr.Smiti";
  d[2].specilist = "Gynaecologist";
  d[2].appoint = "9-1";
  d[2].doc_qual = "MBBS,MD,MS";
  d[2].droom = 19;

  d[3].did = "44";
  d[3].dname = "Dr.Vivek";
  d[3].specilist = "Cancer & Radiology";
  d[3].appoint = "10-4";
  d[3].doc_qual = "MBBS,MS,FACS";
  d[3].droom = 47;


  p[0].pid = "8";
  p[0].pname = "Parmood";
  p[0].disease = "Cancer";
  p[0].sex = "male";
  p[0].admit_status = "y";
  p[0].age = 37;

  p[1].pid = "11";
  p[1].pname = "Ram";
  p[1].disease = "Cough & Cold";
  p[1].sex = "male";
  p[1].admit_status = "y";
  p[1].age = 23;

  p[2].pid = "14";
  p[2].pname = "Gautam";
  p[2].disease = "Dengue";
  p[2].sex = "male";
  p[2].admit_status = "y";
  p[2].age = 28;

  p[3].pid = "15";
  p[3].pname = "Ramesh";
  p[3].disease = "Diabetes";
  p[3].sex = "male";
  p[3].admit_status = "y";
  p[3].age = 29;


  m[0].med_name = "Corex";
  m[0].med_comp = "corex pvt lmt.";
  m[0].exp_date = "9-12-22";
  m[0].med_cost = 25;
  m[0].count = 18;

  m[1].med_name = "Chakshu";
  m[1].med_comp = "eyeseva pvt lmt.";
  m[1].exp_date = "4-4-23";
  m[1].med_cost = 50;
  m[1].count = 52;

  m[2].med_name = "Paracitamol";
  m[2].med_comp = "reckitt";
  m[2].exp_date = "12-7-20";
  m[2].med_cost = 50;
  m[2].count = 56;

  m[3].med_name = "pride";
  m[3].med_comp = "ddf pvt";
  m[3].exp_date = "12-4-12";
  m[3].med_cost = 1100;
  m[3].count = 100;


  l[0].fecility = "x-ray     ";
  l[0].lab_cost = 800;

  l[1].fecility = "ct scan   ";
  l[1].lab_cost = 1200;

  l[2].fecility = "or scan   ";
  l[2].lab_cost = 500;

  l[3].fecility = "blood bank";
  l[3].lab_cost = 50;


  f[0].fec_name = "ambulane";

  f[1].fec_name = "admit fec";

  f[2].fec_name = "canteen";

  f[3].fec_name = "free camp";


  s[0].sid = "22";
  s[0].sname = "ravi";
  s[0].desg = "worker";
  s[0].sex = "male";
  s[0].salary = 5000;

  s[1].sid = "23";
  s[1].sname = "komal";
  s[1].desg = "nurse";
  s[1].sex = "female";
  s[1].salary = 2000;

  s[2].sid = "24";
  s[2].sname = "raju";
  s[2].desg = "worker";
  s[2].sex = "male";
  s[2].salary = 5000;

  s[3].sid = "25";
  s[3].sname = "rani";
  s[3].desg = "nurse";
  s[3].sex = "female";
  s[3].salary = 20000;


  Scanner input = new Scanner(System.in);


  int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;

  while (status == 1)

  {

   System.out.println("\n                                    MAIN MENU");

   System.out.println("--------------------------------------------------------------------------------");

   System.out.println("1.DOCTOR  2. PATIENT  3.MEDICAL  4.LAB  5. FACILITY  6.STAFF 7.EXIT");

   System.out.println("--------------------------------------------------------------------------------");


   choice = input.nextInt();

   switch (choice)

   {

    case 1:

     {

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                      ***DOCTOR'S SECTION***");

      System.out.println("--------------------------------------------------------------------------------");

      s1 = 1;

      while (s1 == 1)

      {

       System.out.println("1.new entry\n2.doctor list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:

         {

          d[count1].new_doctor();count1++;

          break;

         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("id \t name\t specilist \t timing \t qualification \t room no");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count1; j++)

          {

           d[j].doctor_info();

          }

          break;

         }

       }



       System.out.println("RETURN BACK press (1/0) for more");

       s1 = input.nextInt();

      }

      break;

     }

    case 2:

     {

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                     ***PATIENT'S SECTION***");

      System.out.println("--------------------------------------------------------------------------------");

      s2 = 1;

      while (s2 == 1)

      {

       System.out.println("1.new entry\n2.patient list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          p[count2].new_patient();count2++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("id \t name \t disease \t sex \t admit_status \t age");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count2; j++) {
           p[j].patient_info();
          }
          break;
         }

       }

       System.out.println("RETURN BACK press (1/0) for more");

       s2 = input.nextInt();

      }

      break;

     }

    case 3:

     {

      s3 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                     ***MEDICAL'S SECTION***");

      System.out.println("--------------------------------------------------------------------------------");

      while (s3 == 1)

      {

       System.out.println("1.new entry\n2.medicine list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          m[count3].new_medi();count3++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("name \t company \t expirity date \t cost");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count3; j++) {
           m[j].find_medi();
          }
          break;
         }

       }

       System.out.println("RETURN BACK press (1/0) for more");

       s3 = input.nextInt();

      }

      break;

     }

    case 4:

     {

      s4 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                    ***LABORATRY'S SECTION***");

      System.out.println("--------------------------------------------------------------------------------");

      while (s4 == 1)

      {

       System.out.println("1.new entry \n2.lab list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          l[count4].new_feci();count4++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("fecility\t\tcost");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count4; j++) {
           l[j].feci_list();

          }

          break;

         }

       }

       System.out.println("RETURN BACK press (1/0) for more");

       s4 = input.nextInt();

      }

      break;

     }

    case 5:

     {

      s5 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("          ***HOSPILITY FACILITIES***");

      System.out.println("--------------------------------------------------------------------------------");

      while (s5 == 1)

      {

       System.out.println("1.new entry\n2.fecility list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          f[count5].add_feci();count5++;
          break;
         }

        case 2:
         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("hospility facility are:-");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count5; j++) {
           f[j].show_feci();
          }
          break;
         }

       }

       System.out.println("RETURN BACK press (1/0) for more");

       s5 = input.nextInt();

      }

      break;

     }

    case 6:

     {

      s6 = 1;

      System.out.println("--------------------------------------------------------------------------------");

      System.out.println("                       **STAFF SECTION**");

      System.out.println("--------------------------------------------------------------------------------");

      while (s6 == 1)

      {


       String a = "nurse", b = "worker", c = "security";

       System.out.println("1.new entry\n2.nurse list\n3.worker list \n4.securuty list");

       c1 = input.nextInt();

       switch (c1)

       {

        case 1:
         {
          s[count6].new_staff();count6++;
          break;
         }

        case 2:

         {

          System.out.println("--------------------------------------------------------------------------------");


          System.out.println("id \t name \t sex \t salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (a.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

        case 3:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("id \t name \t sex \t salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (b.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

        case 4:

         {

          System.out.println("--------------------------------------------------------------------------------");

          System.out.println("id \t name \t sex \t salary");

          System.out.println("--------------------------------------------------------------------------------");

          for (j = 0; j < count6; j++)

          {

           if (c.equals(s[j].desg))

            s[j].staff_info();

          }

          break;

         }

       }

       System.out.println("RETURN BACK press (1/0) for more");

       s6 = input.nextInt();

      }

      break;

     }

    case 7:

     {

      break;

     }

    default:

     {

      System.out.println("enter wrong choice!");

     }

   }

   System.out.println("RETURN MAIN MENU press (1/0) for more");

   status = input.nextInt();

  }

 }

}