package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Form;

/**
 * 選手情報画面を表示及び情報を登録するコントローラー.
 * 
 * @version 1.0.0
 * @author k.ogiwara
 */
@Controller
public class RegisterController {

	/**
	 * 選手情報登録画面を表示する.
	 *
	 * @param form  選手情報
	 * @param model モデル
	 * @return タスク情報更新画面
	 */
	@GetMapping("/chart")
	public String getChartRegistration(@ModelAttribute Form form, Model model) {
		model.addAttribute("form", form);
		return "/registerchart";
	}

	/**
	 * 選手情報を登録し、選手情報照会画面に遷移する.
	 *
	 * @param form          選手情報
	 * @param bindingResult バインド結果
	 * @param model         モデル
	 * @return バインド結果でエラーが発生した場合、選手情報登録画面に遷移
	 *         選手情報が登録された場合、選手情報照会画面に遷移
	 * @throws IOException 入出力処理時に起こりうる例外
	 */
	@PostMapping("/chart")
	public String postChartRegistration(@ModelAttribute @Valid Form form, BindingResult bindingResult, Model model)
			throws IOException {
		if (bindingResult.hasErrors()) {
			return "/registerchart";
		}

		if (!form.getUploadFile().isEmpty()) {
			form.setImgByte(form.getUploadFile().getBytes());
		}
		if (form.getImgByte() != null) {
			form.setImgBase(new String(Base64.getEncoder().encode(form.getImgByte())));
		}

		List<String> labels = new ArrayList<String>();
		labels.add(form.getLabel1());
		labels.add(form.getLabel2());
		labels.add(form.getLabel3());
		labels.add(form.getLabel4());
		labels.add(form.getLabel5());
		labels.add(form.getLabel6());
		labels.add(form.getLabel7());
		labels.add(form.getLabel8());
		labels.add(form.getLabel9());
		labels.add(form.getLabel10());
		String label[] = labels.toArray(new String[labels.size()]);
		int score[] = { form.getScore1(), form.getScore2(), form.getScore3(), form.getScore4(), form.getScore5(),
				form.getScore6(), form.getScore7(), form.getScore8(), form.getScore9(), form.getScore10() };
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		int avg = sum / score.length;
		model.addAttribute("label", label);
		model.addAttribute("score", score);
		model.addAttribute("avg", avg);
		model.addAttribute("form", form);
		return "/chart";
	}
}
