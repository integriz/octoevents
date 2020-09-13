package com.marques.marcos.octoevent;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marques.marcos.octoevent.domain.Event;
import com.marques.marcos.octoevent.service.EventService;
import com.marques.marcos.octoevent.vo.ConfigVo;
import com.marques.marcos.octoevent.vo.HookVo;
import com.marques.marcos.octoevent.vo.LastResponseVo;
import com.marques.marcos.octoevent.vo.OwnerVo;
import com.marques.marcos.octoevent.vo.RepositoryVo;
import com.marques.marcos.octoevent.vo.SenderVo;


@SpringBootTest
@AutoConfigureMockMvc
class OctoeventApplicationTests {

	@Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private EventService service;
	
	@Test
	void case1() throws Exception {
		
		Date dataAtual = new Date();
		
		List<String> events = new ArrayList<>();
		events.add("*");
		
		ConfigVo config = new ConfigVo("json","0","********","http://ceb9e5400cd9.ngrok.io/events");
		
		LastResponseVo last_response = new LastResponseVo(null,"unused",null);
		
		HookVo hook = new HookVo("Repository",248075499,"web",true,events,config,dataAtual,dataAtual,
				"https://api.github.com/repos/integriz/octoevents/hooks/248075499",
				"https://api.github.com/repos/integriz/octoevents/hooks/248075499/test",
				"https://api.github.com/repos/integriz/octoevents/hooks/248075499/pings",last_response);
		
		OwnerVo owner = new OwnerVo("integriz",1864908799,"MDQ6VXNlcjE4NjQ5MDg399",
				"https://avatars3.githubusercontent.com/u/1864908799?v=4",
				"","https://api.github.com/users/integriz","https://github.com/integriz",
				"https://api.github.com/users/integriz/followers",
				"https://api.github.com/users/integriz/following{/other_user}",
				"https://api.github.com/users/integriz/gists{/gist_id}",
				"https://api.github.com/users/integriz/starred{/owner}{/repo}",
				"https://api.github.com/users/integriz/subscriptions",
				"https://api.github.com/users/integriz/orgs",
				"https://api.github.com/users/integriz/repos",
				"https://api.github.com/users/integriz/events{/privacy}",
				"https://api.github.com/users/integriz/received_events",
				"User",false);
		
		RepositoryVo repository = new RepositoryVo(294704499,"MDEwOlJlcG9zaXRvcnkyOTQ3MDQ0MDU=99","octoevents",
				"integriz/octoevents",owner,"https://github.com/integriz/octoevents",
				"Octo Events é uma aplicação que recebe eventos do Github Events via webhooks e os expõe via API para uso futuro.",
				false,"https://api.github.com/repos/integriz/octoevents",
				"https://api.github.com/repos/integriz/octoevents/forks",
				"https://api.github.com/repos/integriz/octoevents/keys{/key_id}",
				"https://api.github.com/repos/integriz/octoevents/collaborators{/collaborator}",
				"https://api.github.com/repos/integriz/octoevents/teams",
				"https://api.github.com/repos/integriz/octoevents/hooks",
				"https://api.github.com/repos/integriz/octoevents/issues/events{/number}",
				"https://api.github.com/repos/integriz/octoevents/events",
				"https://api.github.com/repos/integriz/octoevents/assignees{/user}",
				"https://api.github.com/repos/integriz/octoevents/branches{/branch}",
				"https://api.github.com/repos/integriz/octoevents/tags",
				"https://api.github.com/repos/integriz/octoevents/git/blobs{/sha}",
				"https://api.github.com/repos/integriz/octoevents/git/tags{/sha}",
				"https://api.github.com/repos/integriz/octoevents/git/refs{/sha}",
				"https://api.github.com/repos/integriz/octoevents/git/trees{/sha}",
				"https://api.github.com/repos/integriz/octoevents/statuses/{sha}",
				"https://api.github.com/repos/integriz/octoevents/languages",
				"https://api.github.com/repos/integriz/octoevents/stargazers",
				"https://api.github.com/repos/integriz/octoevents/contributors",
				"https://api.github.com/repos/integriz/octoevents/subscribers",
				"https://api.github.com/repos/integriz/octoevents/subscription",
				"https://api.github.com/repos/integriz/octoevents/commits{/sha}",
				"https://api.github.com/repos/integriz/octoevents/git/commits{/sha}",
				"https://api.github.com/repos/integriz/octoevents/comments{/number}",
				"https://api.github.com/repos/integriz/octoevents/issues/comments{/number}",
				"https://api.github.com/repos/integriz/octoevents/contents/{+path}",
				"https://api.github.com/repos/integriz/octoevents/compare/{base}...{head}",
				"https://api.github.com/repos/integriz/octoevents/merges",
				"https://api.github.com/repos/integriz/octoevents/{archive_format}{/ref}",
				"https://api.github.com/repos/integriz/octoevents/downloads",
				"https://api.github.com/repos/integriz/octoevents/issues{/number}",
				"https://api.github.com/repos/integriz/octoevents/pulls{/number}",
				"https://api.github.com/repos/integriz/octoevents/milestones{/number}",
				"https://api.github.com/repos/integriz/octoevents/notifications{?since,all,participating}",
				"https://api.github.com/repos/integriz/octoevents/labels{/name}",
				"https://api.github.com/repos/integriz/octoevents/releases{/id}",
				"https://api.github.com/repos/integriz/octoevents/deployments",dataAtual,dataAtual,dataAtual,
				"git://github.com/integriz/octoevents.git","git@github.com:integriz/octoevents.git",
				"https://github.com/integriz/octoevents.git",
				"https://github.com/integriz/octoevents",null,0,0,0,null,true,true,true,true,false,0,null,false,false,0,null,0,0,0,"master");
		
		SenderVo sender = new SenderVo("integriz",1864908799,"MDQ6VXNlcjE4NjQ5MDg399",
				"https://avatars3.githubusercontent.com/u/1864908799?v=4",
				"","https://api.github.com/users/integriz",
				"https://github.com/integriz","https://api.github.com/users/integriz/followers",
				"https://api.github.com/users/integriz/following{/other_user}",
				"https://api.github.com/users/integriz/gists{/gist_id}",
				"https://api.github.com/users/integriz/starred{/owner}{/repo}",
				"https://api.github.com/users/integriz/subscriptions",
				"https://api.github.com/users/integriz/orgs",
				"https://api.github.com/users/integriz/repos",
				"https://api.github.com/users/integriz/events{/privacy}",
				"https://api.github.com/users/integriz/received_events", "User",false);
		
		 
		
		Event event = new Event(0,"Anything added dilutes everything else.",248075499,hook,repository,sender);
		
	    

	    mockMvc.perform(post("/events")
	            .contentType("application/json")
	            .content(objectMapper.writeValueAsString(event)))
	            .andExpect(status().isCreated());

	    event = service.find(248075499);
	   
	   
	    Assertions.assertEquals(event.getHook_id(), 248075499);
	   
	}
	
	@Test
	void case2() throws Exception {
		MvcResult result = mockMvc.perform(get("/issues/248075499/events").accept("application/json")).andDo(print()).andReturn();
		Assertions.assertEquals(result.getResponse().getStatus(), 200);
	}
}
