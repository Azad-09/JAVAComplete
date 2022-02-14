
        File f=new File("input.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
         String str=br.readLine();
         String[] output =str.split(",");
         String[] output1=new String[output.length];
         String result = "";

    // OUTPUT----Jenny,Jonathan,Harry,Jonny,Samatha,Michael,Robert,David,Smith,Garcia,William,Thomas,Daniel,Matthew,Anthony
    // code to get the name in the expected format....
          
           for(int i=0;i<output.length;i++ )
         {
             output1[i] =output[i].substring(0,1).toUpperCase() + output[i].substring(1,output.length).toLowerCase();
             result = result+","+output1[i];
         }
   
         BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
         bw.write(result);
         bw.close();
    }
}