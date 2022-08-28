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

@Data
public class Form implements Serializable {

	private static final long serialVersionUID = -8130946693797651831L;

	@NotBlank
	@Size(max = 15)
	private String firstName;

	@NotBlank
	@Size(max = 15)	
	private String lastName;

	@NotNull
	@Max(value =999 )
	private Integer number;

	@NotBlank
	private String position;

	@ImageFileExtension
	private MultipartFile uploadFile;

	private String imgBase;

	private byte[] imgByte;

	@NotBlank
	private String label1 = "Inside Scoring";

	@NotBlank
	private String label2 = "Outside Scoring";

	@NotBlank
	private String label3 = "Inside Difending";

	@NotBlank
	private String label4 = "Outside Difending";

	@NotBlank
	private String label5 = "Speed";

	@NotBlank
	private String label6 = "Strength";

	@NotBlank
	private String label7 = "Rebounding";

	@NotBlank
	private String label8 = "Playmaking";

	@NotBlank
	private String label9 = "IQ";

	@NotBlank
	private String label10 = "Hustle";

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score1 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score2 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score3 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score4 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score5 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score6 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score7 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score8 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score9 = 50;

	@Max(value = 100)
	@Min(value = 0)
	@NotNull
	private Integer score10 = 50;

	private String comment;
	
	private String color="#FFFF00";
}
