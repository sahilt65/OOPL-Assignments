package assignment1;

import java.util.*;

class Complex{
        float real, img;
        
        // public:
        public Complex(){
            real = 0;
            img = 0;
        }
        
        public Complex(float x){
            real = x;
            img = 0;
        }
        
        public Complex(float x, float y){
            real = x;
            img = y;
        }

        void addComplex(Complex c1, Complex c2){
            float real, img;
             this.real = c1.real + c2.real;
             this.img = c1.img + c2.img;
             System.out.println("Addition of the Given assignment1.Complex Number is : "+ this.real + " + " + this.img + "i" );
        }

        void substractComplex(Complex c1, Complex c2){
            float real, img;
            this.real = c1.real - c2.real;
            this.img = c1.img - c2.img;
            if(this.img  >= 0){
                System.out.println("Substraction of the Given assignment1.Complex Number is : "+ this.real + " + " + this.img  + "i" );
            }else{
                System.out.println("Substraction of the Given assignment1.Complex Number is : "+ this.real +" - " +(-1*this.img ) + "i" );
            }

        }

        void multiplyComplex(Complex c1, Complex c2){
            float real, img;
            this.real = c1.real*c2.real - c1.img*c2.img;
            this.img = c1.real*c2.img + c1.img*c2.real;
            System.out.println("multiplication of the Given assignment1.Complex Number is : "+ this.real  + " + " + this.img  + "i" );
        }

        void divideComplex(Complex c1, Complex c2){
            float real, img;
            this.real = ((c1.real*c2.real) + (c1.img*c2.img))/(c2.real * c2.real + c2.img * c2.img);
            this.img = (c1.img*c2.real) - (c1.real*c2.img)/(c2.real * c2.real + c2.img * c2.img);
            System.out.println("Division of the Given assignment1.Complex Number is : "+ this.real  + " + " + this.real  + "i" );
        }


}  

public class Assignment1
{
	public static void main(String[] args) {
        float a, b, c, d;

        Scanner sc = new Scanner(System.in);

        System.out.println("assignment1.Complex number 1");
        System.out.println("Enter Real Part ");
        a = sc.nextFloat();

        System.out.println("Enter Imaginary Part ");
        b = sc.nextFloat();
        Complex c1 = new Complex(a, b);

        System.out.println("assignment1.Complex number 2");
        System.out.println("Enter Real Part ");
        c = sc.nextFloat();

        System.out.println("Enter Imaginary Part ");
        d = sc.nextFloat();
        Complex c2 = new Complex(c, d);

        Complex cal = new Complex();
        int ch;

        do{
            System.out.println("Enter the Choice From the following");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    cal.addComplex(c1, c2);
                    break;

                case 2:
                    cal.substractComplex(c1, c2);
                    break;

                case 3:
                    cal.multiplyComplex(c1, c2);
                    break;

                case 4:
                    cal.divideComplex(c1, c2);
                    break;
            }
        }while(ch!=5);
	}
}

