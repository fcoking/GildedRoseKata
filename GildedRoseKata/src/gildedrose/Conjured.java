package gildedrose;

public class Conjured {

	public static void Actualizar (Item item){
		Quality(item);
		SellIn(item);
	}
	
	public static void Quality(Item item){
		if(item.getSellIn()>0 && item.getQuality()>1){
			item.setQuality(item.getQuality()-2);
		}else if (item.getSellIn()<=0 && item.getQuality()>3){
			item.setQuality(item.getQuality()-4);
		}
	}
	
	public static void SellIn(Item item){
		if(item.getSellIn()>0)
			item.setSellIn(item.getSellIn()-1);
	}
}