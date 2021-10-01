package com.launccode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillController {
    @RequestMapping(value="",method= RequestMethod.GET )
    @ResponseBody
    public String listSkills() {
        String html = "<html>" +
                "<head>"+
                "<body>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Php</li>" +
                    "</ol>"+
                "</body>" +
            "</html>";

        return html;
    }
//    @GetMapping(value="form")
//    @ResponseBody
//    public String formSkills() {
//        String html = "<form method='get'>" +
//                "Name:<br>" +
//                "<input type = 'text' name = 'name' />" +
//                "<br>My favorite language:<br>" +
//                "<select name = 'firstChoice'>" +
//                "<option value = 'Java'>Java</option>" +
//                "<option value = 'Javascript'>JavaScript</option>" +
//                "<option value = 'Php'>Php</option>" +
//                "</select>" +
//                "<br>My second favorite language:<br>" +
//                "<select name = 'secondChoice'>" +
//                "<option value = 'Java'>Java</option>" +
//                "<option value = 'Javascript'>JavaScript</option>" +
//                "<option value = 'Php'>Php</option>" +
//                "</select>" +
//                "<br>My third favorite language:<br>" +
//                "<select name = 'thirdChoice'>" +
//                "<option value = 'Java'>Java</option>" +
//                "<option value = 'Javascript'>JavaScript</option>" +
//                "<option value = 'Php'>Php</option>" +
//                "</select><br>" +
//                "<input type = 'submit' value = 'Submit' />" +
//                "</form>";
//
//        return html;
//    }

    @GetMapping(value="form/form2")
    @ResponseBody
    public String formSkillsToo() {
        String html = "<form method='get'>" +
                "Name:<br>" +
                "<input type = 'text' name = 'name' />" +
                "<br>My favorite language:<br>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Php'>Php</option>" +
                "</select>" +
                "<br>My second favorite language:<br>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Php'>Php</option>" +
                "</select>" +
                "<br>My third favorite language:<br>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Javascript'>JavaScript</option>" +
                "<option value = 'Php'>Php</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";

        return html;
    }

    @PostMapping(value="form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
        return html;
    }
}
