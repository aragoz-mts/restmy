package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class myrestcontroller {

       @GetMapping("/users")
        String getAll() {
        return "hello epta";
        }

    @GetMapping("/users2")
    employee getAll2() {
        employee Andrey = new employee("Андрей", "Шмаровоз", "Васильевич", "14.03.1980", "Директор по развитию шляпного цеха",
                "224022, Брест, ул.Суворова, д.116, стр.1, 3 этаж, каб.1", "+375297568956", true);
        employee Boris = new employee("Борис", "Ельцин", "Дормидонтович", "14.03.1960", "Уборщик",
                "224022, Брест, ул.Московская, д.116, стр.1, 1 этаж, каб.1", "+375292356888", true);
        return Andrey;
    }
        @GetMapping("/users3")
        List<employee> getAll3() {

            employee Andrey = new employee("Андрей", "Шмаровоз", "Васильевич", "14.03.1980", "Директор по развитию шляпного цеха",
                    "224022, Брест, ул.Суворова, д.116, стр.1, 3 этаж, каб.1", "+375297568956", true);
            employee Boris = new employee("Борис", "Ельцин", "Дормидонтович", "14.03.1960", "Уборщик",
                    "224022, Брест, ул.Московская, д.116, стр.1, 1 этаж, каб.1", "+375292356888", true);

            List<employee> humans = new ArrayList<>();
            humans.add(Andrey);
            humans.add(Boris);
            return humans;
        }


    }





