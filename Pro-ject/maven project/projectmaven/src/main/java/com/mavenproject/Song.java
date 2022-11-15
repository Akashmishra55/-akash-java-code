// java prg to illustrate of creating a POJO class
package com.mavenproject;

import javax.persistence.*;

@Entity
@Table(name="song")
//POJO Class
public class Song
{
	@Id
	//column name songId
	@Column(name="songId")
	private int id;
	
	//column name songName
	@Column(name="songName")
	private String songName;
	
	//column name singer
	@Column(name="singer")
	private String artist;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getSongName()
	{
		return songName;
	}

	public void setSongName(String songName) 
	{
		this.songName = songName;
	}

	public String getArtist()
	{
		return artist;
	}

	public void setArtist(String artist) 
	{
		this.artist = artist;
	}
	
	
	

}
