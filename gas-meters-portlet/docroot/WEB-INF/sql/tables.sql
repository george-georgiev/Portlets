create table GasMeters_Available (
	serialNums LONG not null primary key,
	groupID INTEGER
);

create table GasMeters_Installed (
	serialNums LONG not null primary key,
	date_ DATE null,
	currInd LONG,
	groupID INTEGER
);