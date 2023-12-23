package com.example.filehandling.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

// Cite: https://www.tutorialspoint.com/spring_boot/spring_boot_file_handling.htm
// Cite: https://spring.io/guides/gs/uploading-files/

@RestController
public class FileUploadController {
	
	// http://localhost:8080/upload
   //@PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
   @PostMapping(value = "/upload")   
   public String fileUpload(@RequestParam("file") MultipartFile file) throws IOException {
	   System.out.println(file.getOriginalFilename());
      File convertFile = new File("/var/tmp/"+file.getOriginalFilename());
      convertFile.createNewFile();
      FileOutputStream fout = new FileOutputStream(convertFile);
      fout.write(file.getBytes());
      fout.close();
      return "File is upload successfully";
   }
}