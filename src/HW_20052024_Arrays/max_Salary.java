package HW_20052024_Arrays;

public class max_Salary {

    // Find the max salary in the input arrays {30,50,60,90,10, 100,999}

    public static void main(String[] args) {

        int [] salary = {30,50,60,90,100,999};

        int max =0;
        for (int i=0; i<salary.length; i++){
            if (salary[i]>max){
                max = salary[i];
            }
        }
        System.out.println("Maximum of given salary is " +max);
    }
}
