package com.xiangyue.moodshare.dao;

import java.util.List;
import com.xiangyue.moodshare.entity.Resource;

public interface ResourceMapper {

	public void saveResource(Resource resource);

	public List<Resource> selectAllResources();

	public void delectResource(Integer id);

	public List<Resource> selectAllResourcesAndUsers();

	public Resource selectResourceById(Integer id);

}
