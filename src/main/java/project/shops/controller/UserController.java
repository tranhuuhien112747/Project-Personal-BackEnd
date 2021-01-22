package project.shops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.shops.dto.GetUserDTO;
import project.shops.model.User;
import project.shops.service.UserService;

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{idUser}")
    public ResponseEntity<GetUserDTO> findUserById(@PathVariable Long idUser) {
        User user = userService.findById(idUser);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        GetUserDTO getUserDTO = new GetUserDTO();
        getUserDTO.setIdUser(user.getIdUser());
        getUserDTO.setUsername(user.getUsername());
        getUserDTO.setPassword(user.getPassword());
        getUserDTO.setFullName(user.getFullName());
        getUserDTO.setEmail(user.getEmail());
        getUserDTO.setAddress(user.getAddress());
        getUserDTO.setPhoneNumber(user.getPhoneNumber());
        getUserDTO.setEmail(user.getEmail());
        getUserDTO.setStatus(user.getStatus());
        return new ResponseEntity<>(getUserDTO, HttpStatus.OK);
    }
}
