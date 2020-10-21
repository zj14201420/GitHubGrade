package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public interface GradeFunction {
	public ArrayList<String> GetGrade(String filePath);
	public int MaxGrade(ArrayList<Integer> arrayList);
	public int AvgGrade(ArrayList<Integer> arrayList);
	public ArrayList<Integer> SortGrade(ArrayList<Integer> arrayList);
}
