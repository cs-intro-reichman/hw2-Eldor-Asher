public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addition = Integer.parseInt(args [1]);
        int total_minutes = hours * 60 + minutes + addition;
        int total_hours = total_minutes / 60;
        int new_hours = total_hours % 24;
        int new_minutes = total_minutes - (total_hours * 60);
        String neww_hours_s;
        String new_minutes_s;
        if (new_hours < 10)
        {
            neww_hours_s = "0" + new_hours;
        } 
        else
        {
            neww_hours_s = String.valueOf(new_hours);
        }
        if (new_minutes< 10)
        {
            new_minutes_s = "0" + new_minutes;
        } 
        else
        {
            new_minutes_s = String.valueOf(new_minutes);
        }
        System.out.println(neww_hours_s + ":" +new_minutes_s);

        
    }
}
