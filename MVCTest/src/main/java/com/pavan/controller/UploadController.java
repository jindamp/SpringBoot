package com.pavan.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/")
public class UploadController {

	public static final String ROOT = "upload-dir";

	private final ResourceLoader resourceLoader;
	
	/* http://localhost:8080/upload/file */

	
	
	

	@RequestMapping(method = RequestMethod.POST, value = "/upload")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		if (!file.isEmpty()) {
			try {
				Files.copy(file.getInputStream(), Paths.get(ROOT, file.getOriginalFilename()));
				redirectAttributes.addFlashAttribute("message",
						"You successfully uploaded " + file.getOriginalFilename() + "!");
			} catch (IOException | RuntimeException e) {
				redirectAttributes.addFlashAttribute("message",
						"Failued to upload " + file.getOriginalFilename() + " => " + e.getMessage());
			}
		} else {
			redirectAttributes.addFlashAttribute("message",
					"Failed to upload " + file.getOriginalFilename() + " because it was empty");
		}

		return "redirect:/";
	}
	
	@Autowired
	public UploadController(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}


	@RequestMapping(method = RequestMethod.GET, value = "/{filename:.+}")
	@ResponseBody
	public ResponseEntity<?> getFile(@PathVariable String filename) {

		try {
			return ResponseEntity.ok(resourceLoader.getResource("file:" + Paths.get(ROOT, filename).toString()));
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
	}

}
