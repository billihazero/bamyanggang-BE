package jjon.bamyanggang.mafia.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import jjon.bamyanggang.model.MafiaRoom;
import jjon.bamyanggang.model.RoomUserInfo;
import jjon.bamyanggang.model.SetRoom;

@Mapper
public interface MafiaMapper {

	// [방 생성]
	public void createRoom(SetRoom setRoom);
	
	// [방 생성] 방 번호 조회
	public int getRoomNo(String randomCode);
	
	// [방 생성] mafia_role insert
	public void initRoom(SetRoom setRoom);
	
	// [방 생성] 중복 코드 확인
	public int cntCodeExists(String randomCode);
	
	// [방 목록]
	public List<MafiaRoom> getRoomList();
	
	// [방 입장] + join_cnt
	public void joinCntPlus(SetRoom setRoom);
	
	// [방 입장] mafia_role insert
	public void insertUser(SetRoom setRoom);
	
	// [방 입장] 방 번호 조회
	public int getJoinNo(SetRoom setRoom);
	
	// [방 대기] 방 정보 조회
	public Map<String, Object> getRoomInfo(MafiaRoom mafiaRoom);
	
	// [방 대기] 참여 사용자 정보 조회
	public List<RoomUserInfo> getUserInfo(MafiaRoom mafiaRoom);
	
	// [방 퇴장] master 조회
	public Integer getMaster(SetRoom setRoom);
	
	// [방 퇴장] join_cnt 조회
	public int getJoinCnt(SetRoom setRoom);
	
	// [방 퇴장] mafia_role delete
	public void userDel(SetRoom setRoom);

	// [방 퇴장] - join_cnt
	public void joinCntMinus(SetRoom setRoom);
	
	// [방 퇴장] mafia_room delete
	public void roomDel(SetRoom setRoom);
	
	// [방 퇴장] master update
	public void masterUpdate(SetRoom setRoom);
	
	
}
