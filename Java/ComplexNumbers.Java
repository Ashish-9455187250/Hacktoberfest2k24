public class ComplexNumbers {
    int real, image;
    public ComplexNumbers(int r, int i){
        this.real = r;
        this.image = i;
    }
    public void ShowC(){
        System.out.println(this.real + " + i"+this.image);
    }

    public static ComplexNumbers AddComplex(ComplexNumbers n1, ComplexNumbers n2){
        ComplexNumbers result = new ComplexNumbers(0,0);
        result.real = n1.real + n2.real;
        result.image = n1.image + n2.image;

        return result;
    }

    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(4,5);
        ComplexNumbers c2 = new ComplexNumbers(2,6);

        System.out.println("First Complex number " );
        c1.ShowC();

        System.out.println("First Complex number " );
        c2.ShowC();

        ComplexNumbers res = AddComplex(c1,c2);

        System.out.println("\nAddition is ");
        res.ShowC();

    }
}
