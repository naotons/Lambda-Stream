import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Chapter10 {
    public static void main(String[] args) throws Exception {
        List<Task> list = new ArrayList<>();
        list.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う", true));
        list.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接", false));
        list.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う", true));
        list.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く", false));
        list.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く", false));

        // 以下記述
        //1. 未完了のタスクの個数を表示
       // 2. 未完了のタスク一覧を日時の昇順に並べて表示
       //Streamを使用
       list.stream()
       		.filter(f -> f.isDone() == false)
       		.sorted((f1, f2) -> f1.getDate().compareTo(f2.getDate()))
       		.forEach(System.out::println);
        //
    
    }
}