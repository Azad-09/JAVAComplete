import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;
import java.io.IOException;

 class RoutesMain{

    public static void main(String [] args){
        Routes obj1 = new Routes();
        List<RouteRecords> routeInfo =  obj1.readRouteData();
        List<RouteRecords> showDirect = obj1.showDirectFlights(routeInfo,"Delhi");
        obj1.sortDirectFlights(showDirect);
        obj1.showAllFlights(routeInfo,"Delhi","London");
    }
    }

    



 class Routes {
    //This method read the data from routes.csv and return the value.
    public List<RouteRecords> readRouteData()                           //method (readroutedata)
    {
        List<RouteRecords> Routesdata = new ArrayList<RouteRecords>();    // arraylist obj(routesdata)
         String data = "";
          try{
                FileReader file = new FileReader("routes.csv");
                BufferedReader br = new BufferedReader(file);
                int i = 0;
                while ((data=br.readLine())!= null)
                {
                    String data1[]= data.split(",");
                    Routesdata.add(new RouteRecords((data1[0]),(data1[1]),(data1[2]),(data1[3]),(data1[4])));
                    i++;
                }
                 System.out.println("Number of records: "+i);
            }
           
            catch(IOException e)
            {
                e.printStackTrace();
            }
            
 // printing values ...
   System.out.println("Welcome to ROUTE PLANNER PEROJECT 2---");
        System.out.format("%1s%16s%20s%15s%20s","From","To","Distance in km","Travel Time","Typical Airfare");
        System.out.println("\n");
         
         for(int j=0;j<Routesdata.size();j++){
             System.out.format("%15s%15s%19s%15s%14s",Routesdata.get(j).fromcity,Routesdata.get(j).tocity,Routesdata.get(j).distance,Routesdata.get(j).time,Routesdata.get(j).currency);
             System.out.print("\n");
    }
    return Routesdata;    // size - 24 and contain the whole details
}
// task 1 completed------------------------------------------------------------

public List<RouteRecords> showDirectFlights(List<RouteRecords>routeInfo,String fromCity){    // method (showDirectFlights)
          int n = 0;
         System.out.println("============================= TASK 2 ================================");
         System.out.println("Direct Flight from source  \n");
         List<RouteRecords> list = new ArrayList<RouteRecords>();
         // List<RouteRecords> Routesdata = new ArrayList<RouteRecords>();
          for(int i=0; i<routeInfo.size(); i++){
           if(routeInfo.get(i).fromcity.equals(fromCity)){
            list.add(routeInfo.get(i));
            n++;
        }
    }
    System.out.println("Number of records for task2--" +n);
        System.out.format("%1s%16s%20s%15s%20s","From","To","Distance in km","Travel Time","Typical Airfare");
        System.out.println("\n");
         for(int j=0;j<list.size();j++){
             System.out.format("%15s%15s%19s%15s%14s",list.get(j).fromcity,list.get(j).tocity,list.get(j).distance,list.get(j).time,list.get(j).currency);
             System.out.print("\n");
         }
         if(n==0)
         {
         System.out.println("NO RECORDS......");
         System.out.println("We are sorry. At this point of time, we do not have any information on flights originating from "+fromCity);
         }
         return list;
}
//TASK 2 COMPLETED=================================================================================
public void sortDirectFlights(List <RouteRecords> showDirectFlights)
    {
        Collections.sort(showDirectFlights);
        System.out.println("=============================TASK 3================================");
         System.out.println("Sorted Direct Flight from source  \n");
        
        for(int j=0;j<showDirectFlights.size();j++){
             System.out.format("%15s%15s%19s%15s%14s",showDirectFlights.get(j).fromcity,showDirectFlights.get(j).tocity,showDirectFlights.get(j).distance,showDirectFlights.get(j).time,showDirectFlights.get(j).currency);
             System.out.print("\n");
        }

    }
//TASK 3 COMPLETED===============================================================================
public int showAllFlights(List<RouteRecords> routeInfo,String fromcity,String tocity) {
    System.out.println("============================== TASK 4 ===============================");

    System.out.println("DIRECT AND INDIRECT FLIGHTS...\n");
    // declare a reference to recordCollection and lambda expression
     RecordCollection obj = (data2,from,to)->
     // lambda body
        { 
         int total=0;
         int num=0;
         System.out.println("<<<<<<<<<<<<DIRECT FLIGHTS>>>>>>>>");
         for(int j=0; j<data2.size();j++)
         {
            if(data2.get(j).fromcity.trim().equals(from) && data2.get(j).tocity.trim().equals(to))
            { 
                System.out.format("%15s%15s%19s%15s%14s",data2.get(j).fromcity,data2.get(j).tocity,data2.get(j).distance,data2.get(j).time,data2.get(j).currency);
                System.out.print("\n");
                total++;
            }
         }
         if(total ==0)
         {
             System.out.println("We are sorry. At this point of time, we do not have any information on flights originating from "+fromcity+" to "+tocity);
         }
        System.out.println("<<<<<<<<<<<< INDIRECT FLIGHTS >>>>>>>>");
          for(int i=0; i<data2.size();i++)
        {
            for(int j=i+1;j<data2.size();j++)
            {
                 if(data2.get(i).fromcity.equals(from)&& data2.get(i).tocity.trim().equals(data2.get(j).fromcity) &&data2.get(j).tocity.trim().equals(to))
                 {
                  System.out.format("%1s%15s%19s%15s%14s",data2.get(i).fromcity,data2.get(i).tocity,data2.get(i).distance,data2.get(i).time,data2.get(i).currency);
                  System.out.println();
                  System.out.format("%1s%15s%19s%15s%14s",data2.get(j).fromcity,data2.get(j).tocity,data2.get(j).distance,data2.get(j).time,data2.get(j).currency);
                  System.out.println();
                  num++;
                
            }

        }
    }
    if(num ==0)
         {
             System.out.println("We are sorry. At this point of time, we do not have any information on flights originating from "+fromcity+" to "+tocity);
         }
         
         return 1;

    };
obj.showAllFlights(routeInfo,fromcity,tocity);

   return 1;     
}
 
    
}// class close




 class RouteRecords implements Comparable <RouteRecords> {
    public String fromcity;
    public String tocity;
    public String distance;
    public String time;
    public String currency;

    public RouteRecords(String fromcity,String tocity,String distance,String time,String currency)
    {
        this.fromcity = fromcity;
        this.tocity = tocity;
        this.distance = distance;
        this.time = time;
        this.currency = currency;
    }

    //getters

    public String getFrom(){
        return fromcity;
    }

    public String getTo(){
        return tocity;
    }

    public String getDistance(){
        return distance;
    }

    public String getTime(){
        return time;
    }

    public String getCurrency(){
        return currency;
    }
    public int compareTo(RouteRecords e) {
		return this.tocity.compareTo(e.tocity);
    }
    

}





 interface RecordCollection {
   // define the abstract method for getting all the indirect and direct flights..
   int showAllFlights(List<RouteRecords> routeInfo,String fromcity,String tocity);
}
