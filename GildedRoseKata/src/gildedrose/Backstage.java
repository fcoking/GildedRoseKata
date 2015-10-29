package gildedrose;

public class Backstage {

	public static void Actualizar (Item item){
		
	}
	
	public static void SellIn(Item item){
		if(item.getSellIn()>0)
			item.setSellIn(item.getSellIn()-1);
	}
}