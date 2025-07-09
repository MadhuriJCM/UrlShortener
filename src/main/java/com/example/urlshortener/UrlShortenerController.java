package com.example.urlshortener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;
import java.util.UUID;
import java.util.Map;

@RestController
public class UrlShortenerController {

    @Autowired
    private ShortUrlRepository repository;

    @PostMapping("/shorten")
    public String shortenUrl(@RequestBody Map<String, String> body) {
        String originalUrl = body.get("url");
        String shortId = UUID.randomUUID().toString().substring(0, 6);
        repository.save(new ShortUrl(shortId, originalUrl));
        return "http://localhost:8080/" + shortId;
    }

    // @GetMapping("/{shortId}")
    // public String redirect(@PathVariable String shortId) {
    //     Optional<ShortUrl> result = repository.findById(shortId);
    //     if (result.isPresent()) {
    //         String originalUrl = result.get().getOriginalUrl();
    //         return "Redirecting to: <a href=\"" + originalUrl + "\">" + originalUrl + "</a>";
    //     } else {
    //         return "Invalid short URL.";
    //     }
    // }

    @GetMapping("/{shortId}")
    public ResponseEntity<?> redirect(@PathVariable String shortId) {
        Optional<ShortUrl> result = repository.findById(shortId);
        if (result.isPresent()) {
            String originalUrl = result.get().getOriginalUrl();
            return ResponseEntity.status(302).header("Location", originalUrl).build();
        } else {
            return ResponseEntity.status(404).body("Invalid short URL.");
        }
    }

}


