package gildedrose;

public class Backstage {

	public static void Actualizar (Item item){
		Quality(item);
		SellIn(item);
	}
	
	public static void Quality(Item item){
		if ((item.getSellIn() <= 10 && item.getSellIn()>=6) && item.getQuality() <= 50) {							
			item.setQuality(item.getQuality()+2);
		}
		else if ((item.getSellIn() <= 5 && item.getSellIn()>0) && item.getQuality() <=50) {							
			item.setQuality(item.getQuality()+3);
		} else if (item.getSellIn() <= 0){
			item.setQuality(0);
		} else if (item.getSellIn()>=11 && item.getQuality()<50) {							
			item.setQuality(item.getQuality()+1);
		}
		
	}
	
	public static void SellIn(Item item){
		if(item.getSellIn()>0)
			item.setSellIn(item.getSellIn()-1);
	}
}