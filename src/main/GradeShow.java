package main;

public class GradeShow {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade="C:\\\\Users\\\\Administrator\\\\Desktop\\\\grade.txt";		
		GradeManager gradeManager = new GradeManager();
		System.out.println(gradeManager.GetGrade(grade));
		/**
		 * subject:2:��ѧ��3�����ģ� 4��Ӣ��
		 * 
		 **/
		System.out.println("��ѧ�ɼ����ֵ��"+gradeManager.MaxGrade(gradeManager.getGradeInt(2, gradeManager.GetGrade(grade))));
		System.out.println("��ѧ�ɼ�ƽ��ֵ��"+gradeManager.AvgGrade(gradeManager.getGradeInt(2, gradeManager.GetGrade(grade))));
		System.out.println("���ܳɼ�����"+gradeManager.SortGrade(gradeManager.getSumGrade(gradeManager.GetGrade(grade))));
	}

}
