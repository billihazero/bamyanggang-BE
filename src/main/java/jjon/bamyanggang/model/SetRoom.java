package jjon.bamyanggang.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("set_room")
public class SetRoom {
	
	private String userId;
	private int roomNo;
	private String roomNm;
	private String roomCd;
	private int roomSt;
	private String roomPw;
	private int joinCnt;
	private int isOnGame;
	
}