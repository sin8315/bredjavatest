package tw.org.iii.classroom;

public class TWid {
	private String id = "A123456789";
	
	//建構子
	TWid(String id){
		this.id = id;
	}
	
	//傳回身分證字串
	String getId(){
		return id;
	}
	//傳回性別
	boolean getGender(){
		return id.charAt(1) == '1';
	}
	//傳回地思
	String getArea(){
		return "台中市";
	}
	//是否正確 => 通過驗證
	static boolean isRight(String testID){
		boolean ret = false;
		if (testID.matches("^[A-Z][12][0-9]{9}$")){
			//TODO 革命尚未成功
			ret = true;
		}else{
			ret = false;
		}
		return ret;
//	static boolean preCheck(String testID){
//		if (testID.length()==10){
//			if(testID.charAt(1)=='1' || testID.charAt(1)=='2'){//抽出第一碼=> testID.charAt(0)
//				//是否為A~Z => "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexof();
//			}
//		}
	}
	
}
