package com.forfun.jdr.naheulbeuk.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.forfun.jdr.naheulbeuk.model.Objet;

public interface ObjetRepository extends MongoRepository<Objet, Long>{

}
