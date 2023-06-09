package com.evgeniykudashov.adservice.controller.rest;


import com.evgeniykudashov.adservice.service.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor(onConstructor_ = @Autowired)
@RestController
@RequestMapping(value = "api/v1/users/{userId}/chats",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class UserChatController {

    private ChatService chatService;

    @GetMapping()
    public ResponseEntity<?> findAll(@PathVariable long userId,
                                     @PageableDefault Pageable pageable) {
        return ResponseEntity.ok(chatService.findAllByUserId(userId, pageable));
    }
}
