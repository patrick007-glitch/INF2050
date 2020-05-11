package minischeme.web.controller;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.*;

@Controller
@RequestMapping("/")
@lombok.extern.slf4j.Slf4j
public class EvaluatorController {

  @GetMapping
  public String show(final Model model) {
    if (! model.containsAttribute("command")) {
      model.addAttribute("command", new RunCommand());
    }
    return "show";
  }

  @PostMapping
  public String run(
        @Valid final RunCommand command
      , final BindingResult bindingResult
      , final RedirectAttributes redirectAttributes
    ) {

    if (bindingResult.hasErrors()) {
      redirectAttributes
        .addFlashAttribute("flash_error", "run_invalid_command_flash_error_message")
        .addFlashAttribute("command", command)
        ;
      return "redirect:/";
    }

    try {
      final var source = command.getSource();
      log.info("CODE SOURCE RECU: <{}>", source);

      minischeme.Evaluator evaluator = new minischeme.Evaluator();
      var env =  minischeme.GlobalEnvironment.build();
      var parser = new minischeme.parser.api.Parser();

      var parsed = (List<Object>) parser.parseString(source);

      var code =  evaluator.eval(parsed, env);

      //String code = "RIP XD";
      final var result = code;
      command.setResult((String) result);

      redirectAttributes
        .addFlashAttribute("flash_success", "run_evaluation_flash_success_message")
        .addFlashAttribute("command", command)
        ;
    } catch (Exception e) {
      redirectAttributes
        .addFlashAttribute("flash_error", "run_evaluation_flash_error_message")
        .addFlashAttribute("command", command)
        ;
    }

    return "redirect:/";
  }
}

@lombok.Data
@lombok.NoArgsConstructor
class RunCommand implements Serializable {

  @NotBlank
  @NotNull
  private String source = "";

  @NotNull
  private String result = "";
}
