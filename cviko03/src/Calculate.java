public class Calculate {
    private int weight;
    private int height;

    public Calculate(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public String add(){
        double BMI = this.weight / this.height;
        if (BMI < 16.0){
            return "Underweight (Severe thinness)";
        } else if ( BMI < 16.9) {
            return "Underweight (Moderate thinness)";
        }else if ( BMI < 24.9) {
            return "Normal range";
        }else if ( BMI < 29.9) {
            return "Overweight (Pre-obese)";
        }else if ( BMI < 34.9) {
            return "Obese (Class I)";
        }else if ( BMI < 39.9) {
            return "Obese (Class II)";
        }else  {
            return "Obese (Class III)";
        }


    }

    @Override
    public String toString() {
        return "BMI{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
