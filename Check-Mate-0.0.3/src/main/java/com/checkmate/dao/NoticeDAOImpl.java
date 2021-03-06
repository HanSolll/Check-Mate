package com.checkmate.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.checkmate.vo.GroupVO;
import com.checkmate.vo.NoticeVO;

@Repository
public class NoticeDAOImpl implements NoticeDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<NoticeVO> noticeList(GroupVO groupVO) throws Exception {
		return sqlSession.selectList("noticeMapper.noticeList", groupVO);
	}

	@Override
	public int noticeListCount(GroupVO groupVO) throws Exception {
		return sqlSession.selectOne("noticeMapper.noticeListCount", groupVO);
	}

	@Override
	public void noticeWrite(NoticeVO noticeVO) throws Exception {
		sqlSession.insert("noticeMapper.noticeWrite", noticeVO);
	}

	@Override
	public List<NoticeVO> noticeListMini(GroupVO groupVO) throws Exception {
		return sqlSession.selectList("noticeMapper.noticeListMini", groupVO);
	}

	@Override
	public NoticeVO noticeRead(NoticeVO noticeVO) throws Exception {
		return sqlSession.selectOne("noticeMapper.noticeRead", noticeVO);
	}

	@Override
	public void noticeDelete(NoticeVO noticeVO) throws Exception {
		sqlSession.delete("noticeMapper.noticeDelete", noticeVO);
	}

}
