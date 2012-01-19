package stericson.busybox.donate.domain;

import java.io.Serializable;

public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	private String applet;
	private String appletPath;
	private String symlinkedTo = "";
	private boolean overwrite = true;
	private boolean found = false;
	private boolean recommend = true;
	private boolean remove = false;
	
	public void setApplet(String applet)
	{
		this.applet = applet;
	}

	public void setAppletPath(String appletPath)
	{
		this.appletPath = appletPath;
	}

	public void setSymlinkedTo(String symlinkedTo)
	{
		this.symlinkedTo = symlinkedTo;
	}

	public void setRecommend(boolean recommend)
	{
		this.recommend = recommend;
	}
	
	public void setFound(boolean found)
	{
		this.found = found;
	}
	
	public void setOverwrite(boolean overwrite)
	{
		this.overwrite = overwrite;
	}
	
	public void setRemove(boolean remove)
	{
		this.remove = remove;
	}
	
	public String getApplet()
	{
		return this.applet;
	}

	public String getAppletPath()
	{
		return this.appletPath;
	}

	public String getSymlinkedTo()
	{
		return this.symlinkedTo;
	}
	
	public boolean getRecommend()
	{
		return this.recommend;
	}
	
	public boolean getOverWrite()
	{
		return this.overwrite;
	}
	
	public boolean getFound()
	{
		return this.found;
	}
	
	public boolean getRemove()
	{
		return this.remove;
	}
}
