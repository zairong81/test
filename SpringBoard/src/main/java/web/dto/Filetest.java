package web.dto;

public class Filetest {
	private int fileNo;
	private int boardNo;
	private String originName;
	private String storedName;
	@Override
	public String toString() {
		return "Filetest [fileNo=" + fileNo + ", boardNo=" + boardNo + ", originName=" + originName + ", storedName="
				+ storedName + "]";
	}
	public int getFileNo() {
		return fileNo;
	}
	public void setFileNo(int fileNo) {
		this.fileNo = fileNo;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public String getStoredName() {
		return storedName;
	}
	public void setStoredName(String storedName) {
		this.storedName = storedName;
	}
	
	

	
	
}
