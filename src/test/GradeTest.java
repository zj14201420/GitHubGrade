package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

import main.GradeManager;

public class GradeTest {
	GradeManager grademanager = new GradeManager();
	@Test
	public void GetGradeTest() {
		String grade="C:\\\\Users\\\\Administrator\\\\Desktop\\\\grade.txt";
		ArrayList<String> test = new ArrayList<>();
		File file = new File(grade);
	    BufferedReader reader = null;
	    try {
	        reader = new BufferedReader(new FileReader(file));
	        String tempStr;
	        while ((tempStr = reader.readLine()) != null) {
	            test.add(tempStr);
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
		//assertArrayEquals(test.toArray(),grademanager.GetGrade(grade).toArray());
	}
	@Test
	public void MaxTest() {
		ArrayList<Integer> report = new ArrayList<>();
		report.add(40);
		report.add(10);
		report.add(20);
		assertEquals(40,grademanager.MaxGrade(report));
	}
	@Test
	public void AvgTest() {
		ArrayList<Integer> report = new ArrayList<>();
		report.add(40);
		report.add(30);
		report.add(20);		
		assertEquals(30,grademanager.AvgGrade(report));
	}
}
