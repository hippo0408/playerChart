package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

/**
 * ファイルの形式を制約するクラス.
 * 
 * @version 1.0.0
 * @author k.ogiwara
 */
public class ImageFileExtensionValidator implements ConstraintValidator<ImageFileExtension, MultipartFile> {

	/**
	 * ファイル形式がjpeg(jpg),pngであるか検証処理.
	 * 
	 * @param multipartFile マルチパートファイル
	 * @param context       コンテキスト
	 * @return ファイルが空の場合もしくはファイル形式がjpeg(jpg),pngの場合、true
	 *         ファイルの形式がjpeg(jpg),png以外の場合、false
	 */
	@Override
	public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext context) {
		return multipartFile.isEmpty() || multipartFile.getContentType().equals("image/png")
				|| multipartFile.getContentType().equals("image/jpeg");
	}
}
