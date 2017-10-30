package com.zuo.mosaic.backend.mapper;

import java.util.Map;


public interface UsInfoMapper{
	
	public int insert(Map<String, Object> params) throws Exception;

	public int update(Map<String, Object> params) throws Exception;

	public int delete(Map<String, Object> params) throws Exception;

	public Map<String, Object> selectUsInfo() throws Exception;

}
