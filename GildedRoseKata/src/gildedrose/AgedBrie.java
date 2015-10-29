package gildedrose;

public class AgedBrie implements ItemType{

		public static void Actualizar (Item item){
			Quality(item);
			SellIn(item);
		}
		
		public static void Quality(Item item){
			if(item.getQuality()<=49){
				item.setQuality(item.getQuality()+1);
			}
		}
		
		public static void SellIn(Item item){
			if(item.getSellIn()>0)
				item.setSellIn(item.getSellIn()-1);
		}
}