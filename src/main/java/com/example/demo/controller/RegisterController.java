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

@Controller
public class RegisterController {

	@GetMapping("/chart")
	public String getChartRegistration(@ModelAttribute Form form, Model model) {
		model.addAttribute("form", form);
		return "html/registerchart";
	}

	@PostMapping("/chart")
	public String postChartRegistration(@ModelAttribute @Valid Form form, BindingResult bindingResult, Model model)
			throws IOException {
		if (bindingResult.hasErrors()) {
			return "html/registerchart";
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
		return "html/chart";
	}
}
