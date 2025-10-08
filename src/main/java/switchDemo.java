public class switchDemo {
    public static void main(String[] args) {
        int month = 8;
        String monthString;
        switch (month){
            case 1: monthString = "januari";
            break;
            case 2: monthString = "februari";
            break;
            case 3: monthString = "maret";
            break;
            case 4: monthString = "april";
            break;
            case 5: monthString = "mei";
            break;
            case 6: monthString = "juni";
            break;
            case 7: monthString = "juli";
            break;
            case 8: monthString = "agustus";
            break;
            case 9: monthString = "september";
            break;
            case 10: monthString = "oktober";
            break;
            case 11: monthString = "november";
            break;
            case 12: monthString = "desember";
            break;
            default: monthString ="invalid month";
            break;
        }
        System.out.println(monthString);
    }
}
