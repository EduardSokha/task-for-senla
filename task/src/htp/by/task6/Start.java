package htp.by.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		List<Article> list = new ArrayList<Article>();
		list.add(new Article(3, 9));
		list.add(new Article(12, 45));
		list.add(new Article(43, 4));
		list.add(new Article(444, 4));
		list.add(new Article(700, 2));
		list.add(new Article(9000, 2));
		
		
		Bag bag = new Bag(10);
		
		Collections.sort(list, new Comparator<Article>() {
			public int compare(Article o1, Article o2) {
				return o2.getIndex()-o1.getIndex();
			}
		});
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
            if (bag.status(list.get(i))) {
            	bag.add(list.get(i));
            }
        }
		
		System.out.println("-----------------------------");
		System.out.println(bag.getList());
	}
}
