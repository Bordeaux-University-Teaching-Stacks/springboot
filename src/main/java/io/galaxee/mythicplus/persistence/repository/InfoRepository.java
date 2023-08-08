package io.galaxee.mythicplus.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.galaxee.mythicplus.persistence.entity.Info;

public interface InfoRepository extends JpaRepository<Info, Integer>{

	public List<Info> findByLabel(String label);
	
	public List<Info> findByContent(String content);
	
	public List<Info> findByLabelAndContent(String label, String content);
}
