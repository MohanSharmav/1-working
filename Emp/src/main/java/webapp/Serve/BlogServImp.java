package webapp.Serve;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import webapp.Dao.BlogRep;
import webapp.Entity.BlogPojo;

@Service
public class BlogServImp implements BlogServe {
	
	@Autowired
	private BlogRep blogRep;

	@Override
	public List<BlogPojo> findByTitle(String Title) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<BlogPojo> getAllBlogs() {	
//////		public static final String FIND_PROJECTS = "SELECT projectId, projectName FROM projects";
////@Query(value = "select original_user_alias.* from SD_USER original_user_alias",nativeQuery = true,queryRewriter = BlogServImp.class)
////		List<BlogPojo> findByNativeQuery(String param);
////
//////		@Query(value = FIND_PROJECTS, nativeQuery = true)
////		public List<Object[]> findProjects();
//		return blogRep.findAll();
//	}
}
