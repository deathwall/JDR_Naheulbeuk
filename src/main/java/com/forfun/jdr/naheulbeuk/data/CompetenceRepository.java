package com.forfun.jdr.naheulbeuk.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.forfun.jdr.naheulbeuk.model.Competence;

public interface CompetenceRepository extends MongoRepository<Competence, Long>{}