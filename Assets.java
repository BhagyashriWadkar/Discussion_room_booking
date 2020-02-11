package beans;

public class Assets {
	int Asset_id;
	String Asset_name;
	int Asset_count;
	boolean Asset_status;
	public int getAsset_id() {
		return Asset_id;
	}
	public void setAsset_id(int asset_id) {
		Asset_id = asset_id;
	}
	public String getAsset_name() {
		return Asset_name;
	}
	public void setAsset_name(String asset_name) {
		Asset_name = asset_name;
	}
	public int getAsset_count() {
		return Asset_count;
	}
	public void setAsset_count(int asset_count) {
		Asset_count = asset_count;
	}
	public boolean isWorking() {
		return Asset_status;
	}
	public void setAsset_status(boolean asset_status) {
		Asset_status = asset_status;
	} 
	
	
}
