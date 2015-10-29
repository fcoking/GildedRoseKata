package gildedrose;

import java.util.List;

public class GildedRose {
	
	public void decQuality(Item item){
		item.setQuality(item.getQuality() - 1);
	}
	
	public void incQuality(Item item){
		item.setQuality(item.getQuality() + 1);
	}
	
	public void updateQuality(List<Item> items) {
		for (Item item : items) {
			/*
			 if (item.getName().equals("Aged Brie")){
			 	AgedBrie.Actualizar(item);
			 } else if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")){
				 Backstage.Actualizar(item);
			 } else if (item.getName().equals("Sulfuras, Hand of Ragnaros")){
				 Sulfuras.Actualizar(item);
			 } else if (item.getName().equals("Conjured Mana Cake")){
				 Conjured.Actualizar(item);
			 } else {
				 Normal.Actualizar(item);
			 }
			*/ 
			if (!item.getName().equals("Aged Brie") && !item.getName().equals("Backstage passes to a TAFKAL80ETC concert") && !item.getName().equals("Sulfuras, Hand of Ragnaros")) {
				if (item.getQuality() > 0) {					
					decQuality(item);					
				}
				if(item.getName().equals("Conjured Mana Cake") && item.getQuality() > 0){
					decQuality(item);
				}
			} else {
				if (item.getQuality() < 50) {
					item.setQuality(item.getQuality() + 1);
					if (item.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
						if (item.getSellIn() < 11 && item.getQuality() < 50) {							
							incQuality(item);							
						}
						if (item.getSellIn() < 6 && item.getQuality() < 50) {							
							incQuality(item);							
						}
					}
				}
			}
			if (item.getName() != "Sulfuras, Hand of Ragnaros") {
				item.setSellIn(item.getSellIn() - 1);
			}
			if (item.getSellIn() < 0) {
				if (item.getName() != "Aged Brie") {
					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {
						if (item.getQuality() > 0 && item.getQuality() != 80) {							
							decQuality(item);							
						}
						if (item.getQuality() > 0 && item.getQuality() != 80 && item.getName().equals("Conjured Mana Cake") && item.getQuality() > 0) {							
							decQuality(item);							
						}
					} else {
						item.setQuality(0);
					}
				} else {
					if (item.getQuality() < 50) {
						incQuality(item);
					}
				}
			}						
		}		
	}
}