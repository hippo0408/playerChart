package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class RadarChartApplication {

	/** メッセージプロパティの呼び出し */
	@Autowired
	private MessageSource messageSource;

	public static void main(String[] args) {
		SpringApplication.run(RadarChartApplication.class, args);
	}

	/**
	 * バリデーションエラー時のメッセージをmessages.propertiesに設定するメソッド.
	 * LocalValidatorFactoryBeanのsetValidationMessageSourceで
	 * バリデーションメッセージをValidationMessages.propertiesからSpringの
	 * MessageSource(messages.properties)に上書きする
	 * 
	 * @return messages.propertiesに設定したバリデーションメッセージ
	 * 
	 */
	@Bean
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
		localValidatorFactoryBean.setValidationMessageSource(messageSource);
		return localValidatorFactoryBean;
	}

	/**
	 * validatorメソッドで設定した内容をアプリケーションに読み込ませる.
	 * 
	 * @return 入力チェック
	 */
	public org.springframework.validation.Validator getValidator() {
		return validator();
	}

}
