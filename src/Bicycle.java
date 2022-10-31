 class Bicycle
{
	private String ownerName , TagNo;
	

	
	public Bicycle() {
		ownerName = "Unknown";
        TagNo = "Unknown";
		
	}
	
	public Bicycle (String TagNo, String name){
		ownerName = name;
	    this.TagNo = TagNo;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public void setOwnerName(String name){
	
		ownerName = name ;
	}
	public void setTagNo(String name){
		
		TagNo = name;
	}

}

