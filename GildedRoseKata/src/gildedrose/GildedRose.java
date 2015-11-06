package gildedrose;

import java.util.List;

public class GildedRose {

	public void updateQuality(List<Item> items) {
		for (Item item : items) {
			
			 if (item.getName().equals("Aged Brie")){
			 	AgedBrie.Actualizar(item);
			 } else if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")){
				 Backstage.Actualizar(item);
			 } else if (item.getName().equals("Sulfuras, Hand of Ragnaros")){
				 Sulfuras.Actualizar(item);
			 } else if (item.getName().equals("Conjured Mana Cake")){
				 Conjured.Actualizar(item);
			 } else if (item.getName().equals("NORMAL ITEM")){
				 Normal.Actualizar(item);
			 }			
			 
			 if(item.getQuality()>50 && !item.getName().equals("Sulfuras, Hand of Ragnaros")){
					item.setQuality(50);
				}
		}		
	}
}