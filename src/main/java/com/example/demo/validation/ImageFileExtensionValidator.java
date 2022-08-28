package com.example.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.web.multipart.MultipartFile;

public class ImageFileExtensionValidator implements ConstraintValidator<ImageFileExtension, MultipartFile> {

	@Override
	public boolean isValid(MultipartFile multipartFile, ConstraintValidatorContext context) {
		return multipartFile.isEmpty() || multipartFile.getContentType().equals("image/png")
				|| multipartFile.getContentType().equals("image/jpeg");
	}
}
