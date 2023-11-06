package Animals;

import enums.FurType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Cat {
    private String name;
    private int age;
    private String temperament;
    private FurType fur;
    private String color;
}
