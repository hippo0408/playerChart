package com.example.demo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * ファイルの形式を制約するカスタムアノテーションを定義するクラス.
 * 
 * @version 1.0.0
 * @author k.ogiwara
 */
@Constraint(validatedBy = { ImageFileExtensionValidator.class })
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ImageFileExtension {
	/**
	 * エラー時に例外オブジェクトに設定されるメッセージ.
	 * 
	 * @return エラーメッセージ
	 **/
	String message() default "{EMSG101}";

	/**
	 * バリデーションをグループ化する.
	 * 
	 * @return グループ化したバリデーション
	 *
	 **/
	Class<?>[] groups() default {};

	/**
	 * エラー時に例外オブジェクトに設定されるメッセージ.
	 * 
	 * @return 対象のオブジェクトに与えたメタ情報
	 **/
	Class<? extends Payload>[] payload() default {};
}