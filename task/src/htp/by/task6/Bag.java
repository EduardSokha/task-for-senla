package htp.by.task6;

import java.util.ArrayList;
import java.util.List;

public class Bag {
	private int weight = 0;
	private int maxWeight;
	List<Article> list = new ArrayList<Article>();

	public Bag() {
	}

	public Bag(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public void add(Article article) {		
			list.add(article); 
			weight += article.getWeight();
	}

	public boolean status(Article article) {
		if(maxWeight>=(weight+article.getWeight())) {
			return true;
		}
		return false;		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public List<Article> getList() {
		return list;
	}

	public void setList(List<Article> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + maxWeight;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bag other = (Bag) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (maxWeight != other.maxWeight)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bag [weight=" + weight + ", maxWeight=" + maxWeight + ", list=" + list + "]";
	}
}

//public boolean add(Article article) {
//	if(maxWeight>=(weight+article.getWeight())) {
//		list.add(article); 
//		weight += article.getWeight()
//		return true;
//	}
//	return false;
//}
