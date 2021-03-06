package org.rss.ui.bean;

import org.rss.beans.flux.RssItem;

import java.util.List;

/**
 * Created by Alain on 01/11/2015.
 */
public class ChannelUi {


	private String url;
	private List<ItemUi> listeItem;
	private String title;
	private String description;
	private String language;
	private String lastBuildDate;
	private String pubDate;

	public ChannelUi() {
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<ItemUi> getListeItem() {
		return listeItem;
	}

	public void setListeItem(List<ItemUi> listeItem) {
		this.listeItem = listeItem;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLastBuildDate() {
		return lastBuildDate;
	}

	public void setLastBuildDate(String lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
}
