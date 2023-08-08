package io.galaxee.mythicplus.persistence.repository;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import io.galaxee.mythicplus.MythicPlusApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MythicPlusApplication.class)
class InfoRepositoryTest {
	
	private static String TEST_LABEL = "testLabel";
	private static String CONTENT_LABEL = "testContent";
	
	@Autowired
	private InfoRepository infoRepository;

	@Test
	void testListInfosIsNotEmpty() {
		assertTrue(!CollectionUtils.isEmpty(infoRepository.findAll()));
	}
	
	@Test
	void testListInfosByLabelIsNotEmpty() {
		assertTrue(!CollectionUtils.isEmpty(infoRepository.findByLabel(TEST_LABEL)));
	}
	
	@Test
	void testListInfosByContentIsNotEmpty() {
		assertTrue(!CollectionUtils.isEmpty(infoRepository.findByContent(CONTENT_LABEL)));
	}
	
	@Test
	void testListInfosByLabelAndContentIsNotEmpty() {
		assertTrue(!CollectionUtils.isEmpty(infoRepository.findByLabelAndContent(TEST_LABEL, CONTENT_LABEL)));
	}

}
