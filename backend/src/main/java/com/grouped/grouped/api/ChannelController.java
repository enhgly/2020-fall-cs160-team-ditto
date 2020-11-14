package com.grouped.grouped.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grouped.grouped.model.Channel;
import com.grouped.grouped.service.ChannelService;


@RequestMapping("/channels")
@RestController
public class ChannelController {
	
	private final ChannelService channelService;
	
	@Autowired
	public ChannelController(ChannelService channelService) {
		this.channelService = channelService; 
	}
	
	@PostMapping(value = "/post")
	public void addChannel(@Valid @NonNull @RequestBody Channel channel) {
		channelService.addChannel(channel);
	}
	
	@GetMapping(value = "/get")
	public List<Channel> getAllChannels() { 
		return channelService.getAllChannels();
	}

	@PostMapping(value = "/get_id")
	public List<Channel> getByGroupId(@RequestBody Channel channel) {
		System.out.println(channel.getGroupId()); 
		return channelService.getByGroupId(channel.getGroupId());
	}
	
	@DeleteMapping(path = "/channel/{id}")
	public void deleteChannelById(@PathVariable("id") Long id) {
		channelService.deleteChannel(id);
	}

}
