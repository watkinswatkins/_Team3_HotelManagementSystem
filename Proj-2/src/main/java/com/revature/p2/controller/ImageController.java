package com.revature.p2.controller;


import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.revature.p2.model.Image;
import com.revature.p2.repository.ImageRepository;
import com.revature.p2.service.ImageService;

@RestController
@CrossOrigin(origins = "http://localhost:8095") 
//@CrossOrigin() // open for all ports
public class ImageController {

  @Autowired
  ImageRepository imageRepository;

  @PostMapping("/upload/image")
  public ResponseEntity<ImageUploadResponse> uploadImage(@RequestParam("image") MultipartFile file)
          throws IOException {

      imageRepository.save(Image.builder()
              .name(file.getOriginalFilename())
              .type(file.getContentType())
              .image(ImageService.compressImage(file.getBytes())).build());
      return ResponseEntity.status(HttpStatus.OK)
              .body(new ImageUploadResponse("Image uploaded successfully: " +
                      file.getOriginalFilename()));
  }

  @GetMapping(path = {"/get/image/info/{name}"})
  public Image getImageDetails(@PathVariable("name") String name) throws IOException {

      final Optional<Image> dbImage = imageRepository.findByName(name);

      return Image.builder()
              .name(dbImage.get().getName())
              .type(dbImage.get().getType())
              .image(ImageService.decompressImage(dbImage.get().getImage())).build();
  }

  @GetMapping(path = {"/get/image/{name}"})
  public ResponseEntity<byte[]> getImage(@PathVariable("name") String name) throws IOException {

      final Optional<Image> dbImage = imageRepository.findByName(name);

      return ResponseEntity
              .ok()
              .contentType(MediaType.valueOf(dbImage.get().getType()))
              .body(ImageService.decompressImage(dbImage.get().getImage()));
  }
}
