//////////////////////////////
/// Author: ChrisderWahre ///
////////////////////////////

package de.cdw.utils.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

import de.cdw.utils.cdwUtils;

public class weatherChangeListener implements Listener{
	
	public cdwUtils plugin;
	
	public weatherChangeListener(cdwUtils instance){
        plugin = instance;
    }

	@EventHandler(priority=EventPriority.HIGHEST)
    public void onWeatherChange(WeatherChangeEvent event) {
     
        boolean rain = event.toWeatherState();
        if(rain)
            event.setCancelled(true);
    }
 
    @EventHandler(priority=EventPriority.HIGHEST)
    public void onThunderChange(ThunderChangeEvent event) {
     
        boolean storm = event.toThunderState();
        if(storm)
            event.setCancelled(true);
    }

}
