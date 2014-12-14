Class IO {
  public static void main(String[] args) {
        String inputString = "";
        for (int i = 0; i < args.length; i++) {
                inputString += args[i];
        }
        StringBuffer a = new StringBuffer(inputString);

        System.out.println("The number of words in the string: " + args.length);
        System.out.println("The length of the string: " + inputString.length());
        System.out.println("The original string in reverse: " +  a.reverse());
  }
}
