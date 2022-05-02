public class SkillDemo {

	int sum = 0;
	int n = 0;

    public SkillDemo(int[] arr) {
    }

	public int average(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
            n++;
        }
        int average = sum/n;
        return average;
    }
}
