package sampleanno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myFood")  //default : myFoodMgr (디폴트값이 있지만 원하는 값 있으면 직접 주면 돼)
public class MyFoodMgr{
	@Autowired
	//@Qualifier(value="unFavoriteFood")//이러면 둘 다 unFavoriteFood로 인식 noodle나옴
	private Food favoriteFood;     
	@Autowired/*멤버변수 필드에 정의한 예 1. 타입에 알맞는 객체를 찾음 만약에 맞는 타입이 없으면 에러 */
	private Food unFavoriteFood;
	                 
	
	@Override
	public String toString() {
		return "[favoriteFood=" + favoriteFood + ", unFavoriteFood=" + unFavoriteFood + "]";
	}
}
