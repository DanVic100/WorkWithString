public class WorkString {

    public static void main(String[] args)
    {
        String string="Я хороший разработчик авотестов";
        System.out.println(string);

        int indexGood = string.indexOf("хороший");
        System.out.println(indexGood);

        string = string.replace("хороший","не очень хороший");
        System.out.println(string);

        int indexDeveloper = string.indexOf("разработчик");
        String subString = string.substring(indexDeveloper,indexDeveloper+11);
        System.out.println(subString);
    }

}
