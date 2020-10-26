package com.grouped.grouped.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grouped.grouped.model.Channel;
import com.grouped.grouped.model.ChannelRepo;


@Service
public class ChannelService {
	

	@Autowired
	private ChannelRepo channelRepo;
	
	public Long addChannel(Channel channel) {
		return channelRepo.save(channel).getChannelId();
	}
	

	public List<Channel> getAllChannels(){
		List<Channel> channels = new ArrayList<Channel>();
		channelRepo.findAll().forEach(channels::add);
        return channels;
    }

	public void deleteChannel(Long id) {
		channelRepo.deleteById(id);
	}

	
}
