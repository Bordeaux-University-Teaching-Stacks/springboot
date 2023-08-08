-- io.galaxee.persistence.repository.InfoRepositoryTest
--
-- InfoRepositoryTest::testListInfosIsNotEmpty
INSERT INTO infos(label, content) VALUES('test', 'test');
-- InfoRepositoryTest::testListInfosByLabelIsNotEmpty
INSERT INTO infos(label, content) VALUES('testLabel', 'testLabel');
-- InfoRepositoryTest::testListInfosByContentIsNotEmpty
INSERT INTO infos(label, content) VALUES('testContent', 'testContent');
-- InfoRepositoryTest::testListInfosByLabelAndContentIsNotEmpty
INSERT INTO infos(label, content) VALUES('testLabel', 'testContent');