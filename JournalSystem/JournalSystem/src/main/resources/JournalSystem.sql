create database journalsystem;

use journalsystem;

create table User(
	id varchar(40) Not Null,
	userName varchar(40) not null,
	password varchar(20) not null,
	primary key(ID)
);

insert into User(id,userName,password) values('1','f5','123456');
	
create table MagazineSub(
	id int not null AUTO_INCREMENT,
	postNumber varchar(40) not null,
	journalName varchar(40) not null,
	subscriptYear varchar(40) not null,
	primary key(id)	
);

create table MagazineMenu(
	id int not null AUTO_INCREMENT,
	journalName varchar(40) not null,
	CNnumber varchar(10) not null,
	ISSN varchar(10) not null,
	postNumber varchar(40) not null,
	pubcycle varchar(40) not null,
	pubplace varchar(40) not null,
	pubhost varchar(100) not null,
	primary key(id)
);

create table MagazineReg(
	id int not null AUTO_INCREMENT,
	journalName varchar(40) not null,
	pubyear int not null,
	pubvolume int not null,
	pubphase int not null,
	pubbor int not null,
	pubnumer int not null,
	primary key(id)
);

create table MagazineDetials(
	id int not null AUTO_INCREMENT,
	journalName varchar(40) not null,
	pubyear int not null,
	pubvolume int not null,
	pubphase int not null,
	papertitle varchar(100) not null,
	paperauthor varchar(100) not null,
	paperkeyword varchar(200) not null,
	paperpagestart int not null,
	paperpageend int not null,
	regid int not null,
	primary key(id)
);

create table borrow_back(
	id int not null AUTO_INCREMENT,
	userid varchar(40) not null,
	username varchar(40) not null,
	journalname varchar(40) not null,
	pubyear int not null,
	pubvolume int not null,
	pubphase int not null,
	borrowdate datetime NULL DEFAULT CURRENT_TIMESTAMP,
	backdate timestamp NULL ON UPDATE CURRENT_TIMESTAMP,
	regid int not null,
	state int not null,
	primary key(id)
);
 insert into borrow_back(userid,username,journalname,pubyear,pubvolume,pubphase,regid,state) values('E11614076','fanl','自动化学报',2018,4,1,1,0);
 insert into borrow_back(userid,username,journalname,pubyear,pubvolume,pubphase,regid,state) values('E11614080','fanl1','自动化学报',2018,4,1,1,0);
 insert into borrow_back(userid,username,journalname,pubyear,pubvolume,pubphase,regid,state) values('E11614076','fanl','自动化学报',2018,4,1,1,0);
 insert into borrow_back(userid,username,journalname,pubyear,pubvolume,pubphase,regid,state) values('E11614080','fanl1','自动化学报',2018,4,1,1,0);
 insert into borrow_back(userid,username,journalname,pubyear,pubvolume,pubphase,regid,state) values('E11614080','fanl1','自动化学报',2018,4,1,1,0);
 insert into borrow_back(userid,username,journalname,pubyear,pubvolume,pubphase,regid,state) values('E11614076','fanl','自动化学报',2018,4,1,1,0);
 insert into borrow_back(userid,username,journalname,pubyear,pubvolume,pubphase,regid,state) values('E11614076','fanl','自动化学报',2018,4,1,1,0);
 insert into borrow_back(userid,username,journalname,pubyear,pubvolume,pubphase,regid,state) values('E11614076','fanl','自动化学报',2018,4,1,1,0);