package com.example.demo.enums;

/**
 * 選手のポジションを現すenum.
 * 
 * @version 1.0.0
 * @author k.ogiwara
 */
public enum GenreEnum {
	/** 「ポジション」PG */
	PG("PG"),
	/** 「ポジション」PG/SG */
	PGSG("PG/SG"),
	/** 「ポジション」SG */
	SG("SG"),
	/** 「ポジション」SG/SF */
	SGSF("SG/SF"),
	/** 「ポジション」SF */
	SF("SF"),
	/** 「ポジション」SF/PF */
	SFPF("SF/PF"),
	/** 「ポジション」PF */
	PF("PF"),
	/** 「ポジション」PF/C */
	PFC("PF/C"),
	/** 「ポジション」C */
	C("C");

	/** ポジション名 */
	private String positionName;

	/**
	 * ポジション名を生成
	 * 
	 * @param positionName ポジション名
	 */
	private GenreEnum(String positionName) {
		this.positionName = positionName;
	}

	/**
	 * ポジション名を取得.
	 * 
	 * @return ポジション名
	 */
	public String getPositionName() {
		return this.positionName;
	}
}
