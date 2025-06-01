package tchos.store.store.controllers;

import lombok.RequiredArgsConstructor;
import tchos.store.store.services.EmployeService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/employes")
public class EmployeController {

    private final EmployeService employeService;

}