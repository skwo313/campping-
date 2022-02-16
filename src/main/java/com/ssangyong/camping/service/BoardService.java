package com.ssangyong.camping.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ssangyong.camping.vo.BoardVO;
import com.ssangyong.camping.vo.Criteria;
import com.ssangyong.camping.vo.SearchCriteria;

public interface BoardService {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;

	// 게시물 목록 조회
	public List<BoardVO> list(SearchCriteria scri) throws Exception;

	// 게시물 총 갯수
	public int listCount(SearchCriteria scri) throws Exception;

	// 게시물 조회
	public BoardVO read(int bno) throws Exception;

	// 게시물 수정
	public void update(BoardVO boardVO) throws Exception;

	// 게시물 삭제
	public void delete(int bno) throws Exception;
}