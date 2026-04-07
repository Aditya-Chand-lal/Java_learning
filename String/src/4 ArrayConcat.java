class ArrayConcat {
    public static void main(String[] args) {
        String []str = {"Aditya", "Kalash","Shubham","Aman"};
        int i =  0;
        StringBuilder st = new StringBuilder();
        while(i < str.length){
            System.out.println(str[i]);
            st.append(str[i]).append(" ");
            i++;
        }
        System.out.println(st);
    }
}
