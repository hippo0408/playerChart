package com.example.demo.entity;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.validation.ImageFileExtension;

import lombok.Data;

/**
 * 選手情報を格納するクラス.
 * 
 * @version 1.0.0
 * @author k.ogiwara
 *
 */
@Data
public class Form implements Serializable {
	/** シリアルバージョンUID生成 */
	private static final long serialVersionUID = -8130946693797651831L;

	/** 苗字 */
	@NotBlank
	@Size(max = 15)
	private String firstName;

	/** 名前 */
	@NotBlank
	@Size(max = 15)
	private String lastName;

	/** 背番号 */
	@NotNull
	@Max(value = 999)
	private Integer number;

	/** ポジション */
	@NotBlank
	private String position;

	/** MultipartFile型の選手画像 */
	@ImageFileExtension
	private MultipartFile uploadFile;

	/** String型の選手画像 */
	private String imgBase;

	/** byte型の選手画像 */
	private byte[] imgByte;

	/** インサイド得点能力 */
	@NotBlank
	private String label1 = "Inside Scoring";

	/** アウトサイド得点能力 */
	@NotBlank
	private String label2 = "Outside Scoring";

	/** インサイドDF力 */
	@NotBlank
	private String label3 = "Inside Difending";

	/** アウトサイドDF力 */
	@NotBlank
	private String label4 = "Outside Difending";

	/** 速さ */
	@NotBlank
	private String label5 = "Speed";

	/** 強さ */
	@NotBlank
	private String label6 = "Strength";

	/** リバウンド */
	@NotBlank
	private String label7 = "Rebounding";

	/** プレイメイク力 */
	@NotBlank
	private String label8 = "Playmaking";

	/** IQ */
	@NotBlank
	private String label9 = "IQ";

	/** ハッスル */
	@NotBlank
	private String label10 = "Hustle";

	/** スコア1 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score1 = 50;

	/** スコア2 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score2 = 50;

	/** スコア3 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score3 = 50;

	/** スコア4 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score4 = 50;

	/** スコア5 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score5 = 50;

	/** スコア6 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score6 = 50;

	/** スコア7 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score7 = 50;

	/** スコア8 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score8 = 50;

	/** スコア9 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score9 = 50;

	/** スコア10 */
	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score10 = 50;

	/** 備考 */
	private String comment;

	/** イメージカラー */
	private String color = "#FFFF00";
}
