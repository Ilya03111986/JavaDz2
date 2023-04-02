// Task_2

// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

// Sample Input:

// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:

// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

package DZ2;

import java.util.Scanner;

public class DZ2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.nextLine(); 
        String[] book = new String[n]; 
        for (int i = 0; i < n; i++) {
            book[i] = scanner.nextLine(); 
        }
        int m = scanner.nextInt(); 
        scanner.nextLine(); 
        String[] allergens = new String[m]; 
        String[] substitutes = new String[m]; 
        for (int i = 0; i < m; i++) {
            String[] allergenSubstitute = scanner.nextLine().split(" - "); 
            allergens[i] = allergenSubstitute[0];
            substitutes[i] = allergenSubstitute[1];
        }
        scanner.close(); 
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String allergen = allergens[j];
                String substitute = substitutes[j];
                
                book[i] = book[i].replaceAll("(?i)\\b" + allergen + "\\b", substitute);
            }
        }
        
       
        for (String line : book) {
            System.out.println(line);
        }
    }
}
