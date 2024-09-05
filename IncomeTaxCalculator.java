public class IncomeTaxCalculator
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  //Creating a new instance of the scanner object
        System.out.print("Kindly input your monthly salary:");//prompt for user input
        double grossIncome = keyboard.nextInt(); //taking user input
        double netIncome = incomeTax(grossIncome); //method call for the income tax
        System.out.println("your net income is " +netIncome);           //display result of computation
    }

    public static double incomeTax(double grossIncome) {
        double netIncome,income_tax = 0;    //initializing variables

        if (grossIncome <= 402) {
            income_tax = 0;
            netIncome = grossIncome;
            return netIncome;

        } else if (grossIncome <= 512) {
            income_tax = (grossIncome - 402) * (5/(double)100); //computation when income is less or equal to 512
            netIncome = grossIncome - income_tax; //computation of net income using income tax
            return netIncome;

        } else if (grossIncome <= 642) {
            income_tax = (grossIncome - 512) * (10 /(double)100); //computation of tax when gross income is less or equal to 642
            netIncome = grossIncome - (income_tax + 5.5); //computation of net income using income tax
            return netIncome;

        } else if (grossIncome <= 3642) {
            income_tax = (grossIncome - 642) * (17.5 / 100);//computation of tax when gross income is less or equal to 3642
            netIncome = grossIncome - (income_tax + 18.5);//computation of net income using income tax
            return netIncome;

        } else if (grossIncome <= 20037) {
            income_tax = (grossIncome - 3642) * (25 /(double)100);//computation of tax when gross income is less or equal to 20037
            netIncome = grossIncome - (income_tax + 543.5);//computation of net income using income tax
            return netIncome;

        } else if (grossIncome <= 50000) {
            income_tax = (grossIncome - 20037) * (30 /(double)100);//computation of tax when gross income is less or equal to 50000
            netIncome = grossIncome - (income_tax+ 4642.25);//computation of net income using income tax
            return netIncome;

        } else  {
            income_tax = (grossIncome - 50000) * (35 /(double)100);//computation of tax when gross income is more than 50,000
            netIncome = grossIncome - (income_tax + 13631.15);//computation of net income using income tax
            return netIncome;
        }

    }

}