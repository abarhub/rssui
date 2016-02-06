package org.rss.ui.rest;


import com.google.common.collect.Lists;
import org.rss.ui.bean.ChannelUi;
import org.rss.ui.bean.ItemUi;
import org.rss.ui.bean.ListChannelUi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by Alain on 24/10/2015.
 */
@RestController
public class ListeController {

	public static final Logger logger = LoggerFactory.getLogger(ListeController.class);


	//private static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/liste")
	public ListChannelUi greeting() {

		return getListe();
	}

	private ListChannelUi getListe() {
		ListChannelUi res;
		ChannelUi c;
		ItemUi item;

		res=new ListChannelUi();

		res.setListe_channel(Lists.newArrayList());

		for(int i=0;i<10;i++) {
			c = new ChannelUi();
			c.setDescription("AAAA"+i);
			c.setLanguage("en");
			c.setLastBuildDate("2001-01-01");
			c.setPubDate("2001-01-02");
			c.setTitle("BBBBBB"+i);
			c.setUrl("http://www.google.fr/"+i);

			c.setListeItem(Lists.newArrayList());

			for(int j=0;j<3;j++)
			{
				item=new ItemUi();
				item.setDescription("GGGG"+i+"-"+j);
				item.setGuid("HHHH"+i+"-"+j);
				item.setLink("http://www.yahoo.fr/"+j);
				item.setPubDate("2001-01-03");
				item.setTitle("KKKKKK"+i+"-"+j);

				c.getListeItem().add(item);
			}

			res.getListe_channel().add(c);
		}

		return res;
	}
}
