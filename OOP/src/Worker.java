/**
 * Created by vili on 9/29/2016.
 */
class Worker extends Human implements Comparable<Worker>{
    int daily_wage;
    int hours_spent_at_work;

    Worker(String first_name, String last_name) {
        super(first_name, last_name);
    }

    void setHours_spent_at_work(int hours_spent_at_work) {
        this.hours_spent_at_work = hours_spent_at_work;
    }

    int getHours_spent_at_work() {
        return hours_spent_at_work;
    }

    int getDaily_wage() {
        return daily_wage;
    }

    void setDaily_wage(int daily_wage) {
        this.daily_wage = daily_wage;
    }

    int calculate_wage_per_hour(){
        return this.daily_wage/this.hours_spent_at_work;
    }

    @Override
    public int compareTo(Worker comparedworker) {
        return comparedworker.calculate_wage_per_hour() > this.calculate_wage_per_hour() ? -1 : 0;
    }
}
