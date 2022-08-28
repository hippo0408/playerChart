package com.example.demo.enums;

public enum GenreEnum {
PG("PG"),
PGSG("PG/SG"),
SG("SG"),
SGSF("SG/SF"),
SF("SF"),
SFPF("SF/PF"),
PF("PF"),
PFC("PF/C"),
C("C");
	
private String positionName;

private GenreEnum(String positionName) {
	this.positionName=positionName;
}

public String getPositionName() {
	return this.positionName;
}
}
