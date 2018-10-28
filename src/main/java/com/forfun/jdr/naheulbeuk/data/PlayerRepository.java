package com.forfun.jdr.naheulbeuk.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.forfun.jdr.naheulbeuk.model.Player;

public interface PlayerRepository extends MongoRepository<Player, Long>{}
