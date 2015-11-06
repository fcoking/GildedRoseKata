package gildedrose;

public class Normal {

	public static void Actualizar (Item item){
		Quality(item);
		SellIn(item);
	}
	
	public static void Quality(Item item){
		if(item.getQuality()>0 && item.getSellIn()<=0){
			item.setQuality(item.getQuality()-2);
		}else if (item.getQuality()>0 && item.getSellIn()>0){
			item.setQuality(item.getQuality()-1);
		}
	}
	
	public static void SellIn(Item item){
		if(item.getSellIn()>0)
			item.setSellIn(item.getSellIn()-1);
	}
}