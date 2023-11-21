/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package prob6;
public class Prob6 {
  public static boolean isReminderEqual(int A, int B, int givenReminder) {
        if (B == 0) {
            throw new IllegalArgumentException("Cannot divide by zero (B cannot be zero)");
        }
        return (A % B) == givenReminder;
    }
}
