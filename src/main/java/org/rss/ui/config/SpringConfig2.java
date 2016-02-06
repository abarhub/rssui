package org.rss.ui.config;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Alain on 25/10/2015.
 */
@Configuration
@ComponentScan("org.rss.ui")
public class SpringConfig2 {

	/*@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TacheLecture getTache()
	{
		return new TacheLecture();
	}*/
}
