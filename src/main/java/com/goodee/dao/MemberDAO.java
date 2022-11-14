package com.goodee.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.goodee.vo.MemberVO;
import com.goodee.vo.SeparateVO;



@Mapper
public interface MemberDAO {
	public int idCheck(MemberVO vo);
	
	public int insertmembership(MemberVO vo);

	public int ismember2(MemberVO vo);
	public int isadmin(MemberVO vo);
	public MemberVO getmemberinfo(MemberVO vo);

	public SeparateVO separate(MemberVO vo);
	

	public int updateinfo(MemberVO vo);
	/* public MemberVO getmemberinfo(@Param("memId") String id); */

	public MemberVO findidmail(MemberVO vo);
	public MemberVO findidphone(MemberVO vo);

}
