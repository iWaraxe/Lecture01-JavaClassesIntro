Since Java 17 LTS, there have been several developments in the field of object-oriented programming (OOP) classes and related features. Let's explore the key updates from Java 17 through Java 22, as well as potential features coming in Java 23.

## Recent Updates (Java 17 - Java 22)

### Java 17 (LTS)

1. **Sealed Classes and Interfaces**
   Sealed classes and interfaces were finalized in Java 17, allowing developers to restrict which other classes or interfaces may extend or implement them[1].

   ```java
   public sealed class Shape 
       permits Circle, Square, Rectangle {
       // ...
   }
   ```

### Java 19

2. **Record Patterns (Preview)**
   Record patterns were introduced as a preview feature, allowing for more concise and robust deconstruction of record types[2].

   ```java
   if (obj instanceof Point(int x, int y)) {
       System.out.println("x = " + x + ", y = " + y);
   }
   ```

### Java 21 (LTS)

3. **Record Patterns (Standard Feature)**
   Record patterns were standardized in Java 21, enabling powerful pattern matching capabilities for records[4].

4. **Pattern Matching for switch**
   This feature was finalized, allowing for more expressive and concise switch expressions and statements[4].

   ```java
   static String formatter(Object obj) {
       return switch (obj) {
           case Integer i -> String.format("int %d", i);
           case Long l    -> String.format("long %d", l);
           case Double d  -> String.format("double %f", d);
           case String s  -> String.format("String %s", s);
           default        -> obj.toString();
       };
   }
   ```

5. **Unnamed Patterns and Variables (Preview)**
   This preview feature allows for ignoring certain parts of patterns or method parameters[4].

   ```java
   if (obj instanceof Point(int x, int _)) {
       // Use x, ignore y
   }
   ```

### Java 22

6. **Unnamed Classes and Instance Main Methods (Preview)**
   This preview feature allows for simpler, more concise code structure for small programs[6].

   ```java
   void main() {
       System.out.println("Hello, World!");
   }
   ```

## Upcoming Features (Java 23 and beyond)

### Java 23 (Planned for September 2024)

7. **Primitive Types in Patterns, instanceof, and switch (Preview)**
   This feature aims to enhance pattern matching by allowing primitive type patterns in all contexts[4].

   ```java
   switch (x.getStatus()) {
       case 0 -> "okay";
       case 1 -> "warning";
       case 2 -> "error";
       case int i -> "unknown status: " + i;
   }
   ```

8. **Unnamed Variables (Preview)**
   Building on the preview from Java 21, this feature allows for ignoring certain values or parameters[4].

   ```java
   var _ = mySet.add(x); // ignore the return value
   ```

9. **String Templates (Preview)**
   This feature introduces a more flexible and safe way to create formatted strings[4].

   ```java
   var name = "Duke";
   var info = STR."My name is \{name}";
   ```

These updates demonstrate Java's ongoing evolution in supporting more expressive, concise, and powerful object-oriented programming constructs. The focus has been on enhancing pattern matching, introducing more flexible class structures, and improving code readability and maintainability.

As an advanced Java course instructor, you can incorporate these new features into your curriculum to keep students updated with the latest Java capabilities. It's important to note that some features are still in preview, so their final form may change in future releases.

Citations:
[1] https://pretius.com/blog/java-17-features/
[2] https://4comprehension.com/busy-developers-guide-to-java-9-10-11-12-13-and-above/
[3] https://www.oracle.com/pl/java/technologies/downloads/
[4] https://symflower.com/en/company/blog/2024/what-to-expect-java-23/
[5] https://www.infoworld.com/article/2336682/jdk-23-the-new-features-in-java-23.html
[6] https://www.geeksforgeeks.org/jdk-23-new-features-of-java-23/
[7] https://advancedweb.hu/a-categorized-list-of-all-java-and-jvm-features-since-jdk-8-to-21/
[8] https://jaxlondon.com/blog/whats-new-in-java-22/