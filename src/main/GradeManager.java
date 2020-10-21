package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class GradeManager implements GradeFunction{

	@Override
	public  ArrayList<String>  GetGrade(String filePath) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<>();
		HashMap<String,String> gradeMap = new HashMap<>();
		File file = new File(filePath);
	    BufferedReader reader = null;
	    try {
	        reader = new BufferedReader(new FileReader(file));
	        String tempStr;
	        while ((tempStr = reader.readLine()) != null) {
	            arrayList.add(tempStr);
	        }
	        reader.close();
	        //return sbf.toString();
	 	  //System.out.println(arrayList);
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e1) {
	                e1.printStackTrace();
	            }
	        }
	    }
	    return arrayList;
	}
	@Override
	public int MaxGrade(ArrayList<Integer> arrayList) {
		// TODO Auto-generated method stub
		Collections.sort(arrayList, new Comparator<Integer>() {

			@Override
			public int compare(Integer grade1, Integer grade2) {
				// TODO Auto-generated method stub
				if(grade1>grade2) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		
		return arrayList.get(arrayList.size()-1);
	}

	@Override
	public int AvgGrade(ArrayList<Integer> arrayList) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arrayList.size();i++) {
			sum+=arrayList.get(i);
		}
		//System.out.println(sum);
		return sum/arrayList.size();
	}

	@Override
	public ArrayList<Integer> SortGrade(ArrayList<Integer> arrayList) {
		// TODO Auto-generated method stub
		Collections.sort(arrayList, new Comparator<Integer>() {

			@Override
			public int compare(Integer grade1, Integer grade2) {
				// TODO Auto-generated method stub
				if(grade1>grade2) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		return arrayList;
	}
	
	
	public ArrayList<Integer> getGradeInt(int subject, ArrayList<String> arrayList) {
		// TODO Auto-generated method stub
		ArrayList<String> GradeList = new ArrayList<>();
		for(int i=subject;i<arrayList.size();i=i+5) {
			GradeList.add(arrayList.get(i));
		}
		//System.out.println(GradeList);
		ArrayList<Integer> GradeInt = new ArrayList<>();
		for(int i=0;i<GradeList.size();i++) {
			GradeInt.add(Integer.parseInt(GradeList.get(i)));
		}		
		return GradeInt;
	}

	public ArrayList<Integer> getSumGrade(ArrayList<String> arrayList){
		ArrayList<String> GradeList = new ArrayList<>();
		for(int i=0;i<arrayList.size()/5;i++) {
			for(int j=i*5+2;j<i*5+5;j++) {
				GradeList.add(arrayList.get(j));
			}
		}
		System.out.println(GradeList);
		ArrayList<Integer> GradeInt = new ArrayList<>();
		for(int i=0;i<GradeList.size();i++) {
			GradeInt.add(Integer.parseInt(GradeList.get(i)));
		}		
		ArrayList<Integer> GradeSum = new ArrayList<>();
		for(int i=0;i<GradeInt.size();i=i+3) {
			GradeSum.add(GradeInt.get(i)+GradeInt.get(i+1)+GradeInt.get(i+2));
		}
		return GradeSum;
		
	}

}
