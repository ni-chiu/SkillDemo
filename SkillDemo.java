public class SkillDemo {

	float sum = 0;
	float n = 0;

    public SkillDemo(int[] arr) {
    }

	public float average(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
            n++;
        }
        float average = sum/n;
        return average;
    }
}
