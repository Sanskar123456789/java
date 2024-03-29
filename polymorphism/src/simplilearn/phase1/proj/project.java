package simplilearn.phase1.proj;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class project {
	public static void main(String[] args) {
		List<String> results = new ArrayList<String>();
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nChoose the option\n1.Get File Name\n2.Business Operation\n3.Exit");
			int a = sc.nextInt();
			if(a==1) {
				File[] files = new File("E:\\simplillearn\\projectdata").listFiles();
				//If this pathname does not denote a directory, then listFiles() returns null. 

				for (File file : files) {
				    if (file.isFile()) {
				        results.add(file.getName());
				    }
				}
				
				Collections.sort(results);
				System.out.println(results);
				
				results.clear();
				continue;
			}
			else if(a==2) {
				System.out.println(" 1.Add File\n 2. Delete File \n 3. Search File \n 4. Go back");
				int b = sc.nextInt();
				switch(b) {
					case 1:
						System.out.println("Enter the file name");
						String aString = sc.next();
						try {							
							File obj = new File("E:\\simplillearn\\projectdata\\"+aString+".txt");
							if(obj.createNewFile()) {
								
							}
						}catch(Exception e){
					         System.out.println("Given file path is not found"+e);
					    }
						break;
					case 2:
						System.out.println("Enter the file name");
						String bString = sc.next();
						try  
						{         
							File f = new File("E:\\simplillearn\\projectdata\\"+bString+".txt");
							if(f.delete())                       
								{  
								System.out.println(f.getName() + " deleted");    
								}  
							else  
							{  
								System.out.println("failed");  
							}  
						}catch(Exception e)  
						{  
							e.printStackTrace();
						}  
						break;
					case 3:
						System.out.println("Enter a file name to search");
						String filename = sc.next();
						File obj = new File("E:\\simplillearn\\projectdata\\"+filename+".txt");
						if(obj.exists()) {
							System.out.println("File exist");
						}else {
							System.out.println("File dont exist");
						}
						break;
					case 4: 
						continue;
					default:
						System.out.println("Please provide valid option");
						break;
				}
				continue;
			}
			else if(a==3) {
				break;
			}else {
				System.out.println("Please provide valid option");
			}
			sc.close();
		}
	}
}
