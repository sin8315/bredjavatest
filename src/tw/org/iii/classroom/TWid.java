package tw.org.iii.classroom;

public class TWid {
	private String id = "A123456789";
	
	//�غc�l
	TWid(String id){
		this.id = id;
	}
	
	//�Ǧ^�����Ҧr��
	String getId(){
		return id;
	}
	//�Ǧ^�ʧO
	boolean getGender(){
		return id.charAt(1) == '1';
	}
	//�Ǧ^�a��
	String getArea(){
		return "�x����";
	}
	//�O�_���T => �q�L����
	static boolean isRight(String testID){
		boolean ret = false;
		if (testID.matches("^[A-Z][12][0-9]{9}$")){
			//TODO ���R�|�����\
			ret = true;
		}else{
			ret = false;
		}
		return ret;
//	static boolean preCheck(String testID){
//		if (testID.length()==10){
//			if(testID.charAt(1)=='1' || testID.charAt(1)=='2'){//��X�Ĥ@�X=> testID.charAt(0)
//				//�O�_��A~Z => "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexof();
//			}
//		}
	}
	
}
