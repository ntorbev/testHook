/**
 * Created by vili on 9/29/2016.
 */
class Worker extends Human {
    private int daily_wage;
    private int hours_spent_at_work;

    Worker(String first_name, String last_name) {
        super(first_name, last_name);
    }

    public void setHours_spent_at_work(int hours_spent_at_work) {
        this.hours_spent_at_work = hours_spent_at_work;
    }

    public int getHours_spent_at_work() {
        return hours_spent_at_work;
    }

    public int getDaily_wage() {
        return daily_wage;
    }
    public void setDaily_wage(int daily_wage) {
        this.daily_wage = daily_wage;
    }

    public Integer calculate_wage_per_hour(int wage, int hours){
        return wage/hours;
    }
}
