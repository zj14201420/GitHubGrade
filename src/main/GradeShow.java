package main;

public class GradeShow {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade="C:\\\\Users\\\\Administrator\\\\Desktop\\\\grade.txt";		
		GradeManager gradeManager = new GradeManager();
		System.out.println(gradeManager.GetGrade(grade));
		/**
		 * subject:2:数学，3：语文， 4：英语
		 * 
		 **/
		System.out.println("数学成绩最大值："+gradeManager.MaxGrade(gradeManager.getGradeInt(2, gradeManager.GetGrade(grade))));
		System.out.println("数学成绩平均值："+gradeManager.AvgGrade(gradeManager.getGradeInt(2, gradeManager.GetGrade(grade))));
		System.out.println("按总成绩排序"+gradeManager.SortGrade(gradeManager.getSumGrade(gradeManager.GetGrade(grade))));
	}

}
