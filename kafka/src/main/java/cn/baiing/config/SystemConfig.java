package cn.baiing.config;


public class SystemConfig {
	
	//训练url
	private String trainHttpRequestUrl;
	
	private String httpRequestUrl; 
	
	//用来实现从配置文件获取地区ID
	private String locationId;

	private String channelNum;
	
	private String groupName;
	
	private String excludeGroupName;
	
	private int pageSize;
	
	private String wwyUrl;
	
	private String imgServerAddress;
	
	private String imgRelationAddress;
	
	private String mainTemplateAndNode;

	public String getMainTemplateAndNode() {
		return mainTemplateAndNode;
	}

	public void setMainTemplateAndNode(String mainTemplateAndNode) {
		this.mainTemplateAndNode = mainTemplateAndNode;
	}

	public String getImgServerAddress() {
		return imgServerAddress;
	}

	public void setImgServerAddress(String imgServerAddress) {
		this.imgServerAddress = imgServerAddress;
	}

	public String getImgRelationAddress() {
		return imgRelationAddress;
	}

	public void setImgRelationAddress(String imgRelationAddress) {
		this.imgRelationAddress = imgRelationAddress;
	}

	public String getWwyUrl() {
		return wwyUrl;
	}

	public void setWwyUrl(String wwyUrl) {
		this.wwyUrl = wwyUrl;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getExcludeGroupName() {
		return excludeGroupName;
	}

	public void setExcludeGroupName(String excludeGroupName) {
		this.excludeGroupName = excludeGroupName;
	}

	public String getChannelNum() {
		return channelNum;
	}

	public void setChannelNum(String channelNum) {
		this.channelNum = channelNum;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getHttpRequestUrl() {
		return httpRequestUrl;
	}

	public void setHttpRequestUrl(String httpRequestUrl) {
		this.httpRequestUrl = httpRequestUrl;
	}

	public String getTrainHttpRequestUrl() {
		return trainHttpRequestUrl;
	}

	public void setTrainHttpRequestUrl(String trainHttpRequestUrl) {
		this.trainHttpRequestUrl = trainHttpRequestUrl;
	}

}
