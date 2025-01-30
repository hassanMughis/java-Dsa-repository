class AddressCalculation {
    public static void main(String[] args) {
        // PART (A)
        int[] AAA = new int[50 - 5 + 1]; 
        int[] BBB = new int[10 - (-5) + 1];
        int[] CCC = new int[18];

        System.out.println("Number of elements in AAA: " + AAA.length);
        System.out.println("Number of elements in BBB: " + BBB.length);
        System.out.println("Number of elements in CCC: " + CCC.length);

        // PART (B)
        int baseAAA = 300; 
        int lowerBoundAAA = 5; 
        int wordSize = 4;
    
        int addressAAA15 = baseAAA + (15 - lowerBoundAAA) * wordSize;
        int addressAAA35 = baseAAA + (35 - lowerBoundAAA) * wordSize;
        int addressAAA55 = baseAAA + (55 - lowerBoundAAA) * wordSize;

        System.out.println("Address of AAA[15]: " + addressAAA15);
        System.out.println("Address of AAA[35]: " + addressAAA35);
        

        if ((55 - lowerBoundAAA) >= AAA.length) {
            System.out.println("Error: Index 55 is out of bounds for array AAA!");
    } else {
        System.out.println("Address of AAA[55]: " + addressAAA55);
    }
}
}