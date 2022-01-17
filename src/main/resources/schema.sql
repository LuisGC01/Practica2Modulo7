drop table if exists `countries`;
/*!40101 set @saved_cs_client     = @@character_set_client */;
/*!40101 set character_set_client = utf8 */;
create table `countries` (
  `code` char(3) not null default '',
  `name` char(52) not null default '',
  `continent` enum('asia','europe','north america','africa','oceania','antarctica','south america') not null default 'asia',
  `region` char(26) not null default '',
  `surfacearea` float(10,2) not null default '0.00',
  `indepyear` smallint(6) default null,
  `population` int(11) not null default '0',
  `lifeexpectancy` float(3,1) default null,
  `gnp` float(10,2) default null,
  `gnpold` float(10,2) default null,
  `localname` char(45) not null default '',
  `governmentform` char(45) not null default '',
  `headofstate` char(60) default null,
  `capital` int(11) default null,
  `code2` char(2) not null default '',
  primary key (`code`)
) engine=innodb ;
/*!40101 set character_set_client = @saved_cs_client */;
